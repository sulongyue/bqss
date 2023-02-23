package io.example;

import java.io.IOException;
import java.io.StringReader;

/**
 * @Description TODO
 * @Date 2023/2/8 8:44
 * @Created by 18355
 */
public class MemoryInputTest {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader("I will be fine!");
        int c;
        while((c = in.read()) != -1){
            System.err.println((char)c);
        }
    }
}
