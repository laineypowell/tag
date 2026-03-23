package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class FloatTag implements Tag {
    public final float f;

    private FloatTag(float f) {
        this.f = f;
    }

    public static FloatTag read(DataInput dataInput) throws IOException {
        return new FloatTag(dataInput.readFloat());
    }

}
