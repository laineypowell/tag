package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class LongTag implements Tag {
    public final long l;

    private LongTag(long l) {
        this.l = l;
    }

    public static LongTag read(DataInput dataInput) throws IOException {
        return new LongTag(dataInput.readLong());
    }

}
