package rtti;

import java.util.Random;

/**
 * @Description TODO
 * @Date 2023/2/3 11:02
 * @Created by 18355
 */
public class Initable {
    public static final int i = 10;
    public static final int j = new Random(10).nextInt();
    static {
        System.err.println("init Initable");
    }
}
