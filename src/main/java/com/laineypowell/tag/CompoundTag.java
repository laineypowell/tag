package com.laineypowell.tag;

import java.io.DataInput;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class CompoundTag implements Tag {
    public final Map<String, Tag> map;

    private CompoundTag(Map<String, Tag> map) {
        this.map = map;
    }

    public @SuppressWarnings("unchecked") <T extends Tag> T get(String name) {
        return (T) map.get(name);
    }

    public static CompoundTag read(DataInput dataInput) throws IOException {
        var map = new HashMap<String, Tag>();

        byte b;
        while ((b = dataInput.readByte()) != Tag.END) {
            map.put(dataInput.readUTF(), Tags.TAG_READERS.get(b).read(dataInput));
        }
        return new CompoundTag(Collections.unmodifiableMap(map));
    }

}
