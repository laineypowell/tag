package com.laineypowell.tag;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

public final class TagTest {

    public @Test void tagTest() throws IOException {
        var path = Paths.get("build/level.dat");
        var tag = Tags.read(path);

        var name = tag.<CompoundTag>get("Data").<StringTag>get("LevelName").s;
        System.out.println(name);
    }
}
