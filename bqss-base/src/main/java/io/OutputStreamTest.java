package io;

import java.io.*;

/**
 * @Description
 * 该类决定输出要去的地方 字节数组 文件 或管道
 * 共有3种
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        ByteArrayOutputStream baos; //再内存种创建缓冲区，数据写到内存中（缓冲区）
        FileOutputStream fos;   //将数据写到文件
        PipedOutputStream pos; //多线程数据的目的地

        FilterOutputStream filterOutputStream;
        DataOutputStream dos;
        BufferedOutputStream bos;
        PrintStream ps;
    }
}
