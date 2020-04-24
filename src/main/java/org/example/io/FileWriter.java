package org.example.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {

    public static void writeString(Path path, String carString) throws IOException{
        Files.write(path, carString.getBytes());
    }
}
