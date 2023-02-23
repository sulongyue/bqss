package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:25
 * @Created by 18355
 */
public abstract class StringProcessor implements Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract Object process(Object input);

    public static String s = "If she weighs the same as";

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new DownCase(),s);
        Apply.process(new Splitter(),s);

    }
}
