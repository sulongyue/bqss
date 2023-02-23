package io.example;

import java.io.*;

/**
 * @Description TODO
 * @Date 2023/2/8 8:50
 * @Created by 18355
 */
public class BasicFileOutputTest {
    static String file = "test2.txt";

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new StringReader("abc cba"));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        //这里提供了快捷创建writer对象的方法，不需要这么多装饰器。new PrintWriter(file).系统会为你缓冲
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null){
            writer.println(lineCount++ + ":" +s);
        }
        writer.close();
        System.err.println(BufferedInputFileTest.read(file));
    }
}
