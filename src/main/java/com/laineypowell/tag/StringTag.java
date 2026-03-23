package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class StringTag implements Tag {
    public final String s;

    private StringTag(String s) {
        this.s = s;
    }

    public static StringTag read(DataInput dataInput) throws IOException {
        return new StringTag(dataInput.readUTF());
    }

}
