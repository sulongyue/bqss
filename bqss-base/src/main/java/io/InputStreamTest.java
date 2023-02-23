package io;

import java.io.*;

/**
 * @Description
 *  InputStream 表示从不同数据源产生输入的类。可以产生字节序列
 *  下面列举了有哪些类型的InputStream.共有5种。他们都可以作为数据源。
 *  FilterInputStream是InputStream的装饰器类，一般用这5种作为数据源，然后与
 *  FilterInputStream相连以提供有用接口
 *
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream in;
        ByteArrayInputStream bais; //从字节数组中读数据。也就是从内存。
        StringBufferInputStream ss; //将String作为数据源
        FileInputStream fis; //将文件作为数据源
        PipedInputStream pis; //作为多线程数据源
        SequenceInputStream sis; //两个或多个InputStream转成一个InputStream
        FilterInputStream filterInputStream;

        //下面为具体的FilterInputStream
        DataInputStream dis;
        BufferedInputStream bis;
        //另外两个不常用
    }
}
