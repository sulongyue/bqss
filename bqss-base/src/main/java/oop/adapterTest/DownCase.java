package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/1/31 11:28
 * @Created by 18355
 */
public class DownCase extends StringProcessor{
   public String process(Object input){
        return ((String)input).toLowerCase();
    }
}
