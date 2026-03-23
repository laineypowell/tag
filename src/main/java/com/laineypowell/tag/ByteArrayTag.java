package com.laineypowell.tag;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.bytes.ByteLists;

import java.io.DataInput;
import java.io.IOException;

public final class ByteArrayTag implements Tag {
    public final ByteList bytes;

    private ByteArrayTag(ByteList bytes) {
        this.bytes = bytes;
    }

    public static ByteArrayTag read(DataInput dataInput) throws IOException {
        var size = dataInput.readInt();
        var bytes = new byte[size];
        dataInput.readFully(bytes);
        return new ByteArrayTag(ByteLists.unmodifiable(new ByteArrayList(bytes)));
    }

}
