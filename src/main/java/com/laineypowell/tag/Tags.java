package com.laineypowell.tag;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.GZIPInputStream;

public final class Tags {
    public static final List<TagReader<?>> TAG_READERS = List.of(
            EndTag::read,
            ByteTag::read,
            ShortTag::read,
            IntTag::read,
            LongTag::read,
            FloatTag::read,
            DoubleTag::read,
            ByteArrayTag::read,
            StringTag::read,
            ListTag::read,
            CompoundTag::read,
            IntArrayTag::read,
            LongArrayTag::read
    );

    public static CompoundTag read(Path path) throws IOException {
        try (var dataInputStream = new DataInputStream(new GZIPInputStream(Files.newInputStream(path)))) {
            dataInputStream.readByte();
            dataInputStream.readUTF();
            return CompoundTag.read(dataInputStream);
        }
    }

}
