package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class IntTag implements Tag {
    public final int i;

    private IntTag(int i) {
        this.i = i;
    }

    public static IntTag read(DataInput dataInput) throws IOException {
        return new IntTag(dataInput.readInt());
    }

}
