package com.laineypowell.tag;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.longs.LongLists;

import java.io.DataInput;
import java.io.IOException;

public final class LongArrayTag implements Tag {
    public final LongList longs;

    private LongArrayTag(LongList longs) {
        this.longs = longs;
    }

    public static LongArrayTag read(DataInput dataInput) throws IOException {
        var size = dataInput.readInt();
        var longs = new LongArrayList(size);
        for (var i = 0; i < size; i++) {
            longs.add(dataInput.readLong());
        }
        return new LongArrayTag(LongLists.unmodifiable(longs));
    }

}
