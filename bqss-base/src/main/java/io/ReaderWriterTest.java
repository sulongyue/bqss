package io;

import java.io.*;

/**
 * @Description 几乎所有的原始字节流都有对应的字符流
 * @Date 2023/2/7 10:02
 * @Created by 18355
 */
public class ReaderWriterTest {
    public static void main(String[] args) {
        Reader reader;
        InputStreamReader isr;

        OutputStream os;
        OutputStreamWriter osw;

        FileInputStream fis;
        FileReader fileReader;

        FileOutputStream fos;
        FileWriter fw;

        StringBufferInputStream stringBufferInputStream;//弃用
        StringReader stringReader;
        StringWriter sw; //没有对应的字节流类

        ByteArrayInputStream byteArrayInputStream;
        CharArrayReader charArrayReader;

        ByteArrayOutputStream byteArrayOutputStream;
        CharArrayWriter charArrayWriter;

        PipedInputStream pipedInputStream;
        PipedReader pipedReader;

        PipedOutputStream pipedOutputStream;
        PipedWriter pipedWriter;

        //下面是reader writer的过滤器类
    }
}
