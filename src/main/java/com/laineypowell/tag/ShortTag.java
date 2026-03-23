package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class ShortTag implements Tag {
    public final short s;

    private ShortTag(short s) {
        this.s = s;
    }

    public static ShortTag read(DataInput dataInput) throws IOException {
        return new ShortTag(dataInput.readShort());
    }

}
