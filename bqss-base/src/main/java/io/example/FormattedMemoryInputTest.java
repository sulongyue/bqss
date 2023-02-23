package io.example;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Description TODO
 * @Date 2023/2/7 15:06
 * @Created by 18355
 */
public class FormattedMemoryInputTest {
    public static void main(String[] args) throws IOException {
        try{
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("i am fine".getBytes(StandardCharsets.UTF_8));
            DataInputStream in  = new DataInputStream(byteArrayInputStream);
//            while(true){
//                System.err.println((char)in.readByte());
//            }
            while(in.available() != 0){
                System.err.println((char)in.readByte());
            }
        }catch (Exception e){
             System.err.println("end of stream");
        }
    }
}
