package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public final class ByteTag implements Tag {
    public final byte b;
    
    private ByteTag(byte b) {
        this.b = b;
    }
    
    public static ByteTag read(DataInput dataInput) throws IOException {
        return new ByteTag(dataInput.readByte());
    }
    
}
