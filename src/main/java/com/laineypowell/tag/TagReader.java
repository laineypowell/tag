package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;

public interface TagReader<T extends Tag> {

    T read(DataInput dataInput) throws IOException;
}
