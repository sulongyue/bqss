package io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * @Description TODO
 * @Date 2023/2/8 9:45
 * @Created by 18355
 */
public class GetChannel {
    private static final int BSIZE = 104;

    public static void main(String[] args) throws Exception{
        FileChannel fc;
        fc = new FileOutputStream("data.txt").getChannel();

        fc.write(ByteBuffer.wrap("song text".getBytes(StandardCharsets.UTF_8)));
        fc.close();

        fc = new RandomAccessFile("data.txt","rw").getChannel();
        fc.position(fc.size());//move
        fc.write(ByteBuffer.wrap("some more".getBytes(StandardCharsets.UTF_8)));
        fc.close();
        //read
        fc = new FileInputStream("data.txt").getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fc.read(byteBuffer);
        byteBuffer.flip();
        while(byteBuffer.hasRemaining())
            System.out.println((char)byteBuffer.get());
    }
}
