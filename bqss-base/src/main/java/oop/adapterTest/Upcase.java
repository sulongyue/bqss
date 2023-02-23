package oop.adapterTest;

import java.util.Locale;

/**
 * @Description TODO
 * @Date 2023/1/31 11:27
 * @Created by 18355
 */
public class Upcase extends StringProcessor{
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
