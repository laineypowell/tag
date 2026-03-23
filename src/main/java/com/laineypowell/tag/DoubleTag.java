package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class DoubleTag implements Tag {
    public final double d;

    private DoubleTag(double d) {
        this.d = d;
    }

    public static DoubleTag read(DataInput dataInput) throws IOException {
        return new DoubleTag(dataInput.readDouble());
    }

}
