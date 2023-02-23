package io.example;

import java.io.*;

/**
 * @Description 标准IO重定向
 * @Date 2023/2/8 9:14
 * @Created by 18355
 */
public class LogTest {
    public static void main(String[] args) throws Exception {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("test3.txt"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("log.txt")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close();
        System.setOut(console);
    }
}
