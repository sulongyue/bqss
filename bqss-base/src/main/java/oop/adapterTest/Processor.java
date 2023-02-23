package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:24
 * @Created by 18355
 */
public interface Processor {
    public String name();
    Object process(Object input);
}
