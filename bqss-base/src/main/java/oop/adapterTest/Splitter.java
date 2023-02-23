package oop.adapterTest;

import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2023/1/31 11:29
 * @Created by 18355
 */
public class Splitter extends StringProcessor{
   public String process(Object input){

        return Arrays.toString(((String)input).split(" "));
    }
}
