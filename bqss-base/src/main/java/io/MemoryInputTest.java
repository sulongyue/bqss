package io;

import io.example.BufferedInputFileTest;

import java.io.StringReader;

/**
 * @Description TODO
 * @Date 2023/2/7 15:00
 * @Created by 18355
 */
public class MemoryInputTest {
    public static void main(String[] args) throws Exception {
        StringReader in = new StringReader(BufferedInputFileTest.read("test1.txt"));
        int c;
        while((c = in.read()) != -1){
            System.err.println((char)c);
        }
    }
}
