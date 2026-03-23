package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ListTag implements Tag {
    public final List<Tag> list;

    private ListTag(List<Tag> list) {
        this.list = list;
    }

    public static ListTag read(DataInput dataInput) throws IOException {
        var reader = Tags.TAG_READERS.get(dataInput.readByte());
        var size = dataInput.readInt();

        var list = new ArrayList<Tag>(size);
        for (var i = 0; i < size; i++) {
            list.add(reader.read(dataInput));
        }
        return new ListTag(Collections.unmodifiableList(list));
    }

}
