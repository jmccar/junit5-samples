package com.bmuschko.junit5.samples;

import java.io.IOException;
import java.nio.file.Path;

public interface FileReader {

    String readContent(Path path) throws IOException;
}
