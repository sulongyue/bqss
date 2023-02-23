package io.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Description TODO
 * @Date 2023/2/7 14:44
 * @Created by 18355
 */
public class BufferedInputFileTest {
    public static String read(String fileName) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String s ;
        StringBuilder sb = new StringBuilder();
        while((s = bufferedReader.readLine()) != null){
            sb.append(s + "\n"); //这里要添加换行符，因为readLine()已经把他去掉。
        }
        bufferedReader.close();
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        System.err.println(read("test1.txt"));
    }
}
