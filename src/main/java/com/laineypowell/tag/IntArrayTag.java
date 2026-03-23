package com.laineypowell.tag;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;

import java.io.DataInput;
import java.io.IOException;

public final class IntArrayTag implements Tag {
    public final IntList ints;

    private IntArrayTag(IntList ints) {
        this.ints = ints;
    }

    public static IntArrayTag read(DataInput dataInput) throws IOException {
        var size = dataInput.readInt();
        var ints = new IntArrayList(size);
        for (var i = 0; i < size; i++) {
            ints.add(dataInput.readInt());
        }
        return new IntArrayTag(IntLists.unmodifiable(ints));
    }

}
