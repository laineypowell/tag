package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class EndTag implements Tag {
    public static final EndTag END_TAG = new EndTag();

    private EndTag() {

    }

    public static EndTag read(DataInput dataInput) throws IOException {
        return END_TAG;
    }

}
