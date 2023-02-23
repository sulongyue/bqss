package io;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2023/2/7 8:43
 * @Created by 18355
 */
public class FileTest {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        list = path.list();
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list){
            System.err.println(dirItem);
        }
    }
}
