package pers.duplicatechecking;

import junit.framework.TestCase;

import java.io.IOException;

public class FileTest extends TestCase {

    public void testReadFile() throws IOException {
        String invalidPath = "non_existent_file.txt";
        File.readFile(invalidPath);
    }

    public void testWriteFile() throws IOException{
        String invalidPath = "non_existent_directory/file.txt";
        File.writeFile(invalidPath, 0.85);
    }
}