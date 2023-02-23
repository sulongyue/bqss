package io.example;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @Description TODO
 * @Date 2023/2/8 9:09
 * @Created by 18355
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
//        PrintWriter writer = new PrintWriter(System.out,true); //设置为true 自动清空
//        writer.println("cccc");

        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        writer.println("bbbb");
        writer.close();

    }
}
