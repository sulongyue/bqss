package oop;

import java.util.Random;

/**
 * @Description TODO
 * @Date 2023/1/29 8:30
 * @Created by 18355
 */
public class TestOop {

    public static final int DISTANCE = new Random().nextInt();
    public static final int TIME = new Random().nextInt();
    static void change(Latter l){
        l.c = 'z';
    }
    public static void main(String[] args) {
        //System.out.println(new Date());
//        System.getProperties().list(System.out);
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("java.library.path"));
//        TestChar t = new TestChar();
//        System.out.println(t.c);
//        System.out.println(t.i);
//        Latter l = new Latter();
//        l.c = 'a';
//        System.out.println("===>"+l.c);
//        change(l);
//        System.out.println("=====>"+l.c);
//
//        System.out.println(DISTANCE+"==="+TIME);
//        System.out.println(DISTANCE/TIME);

//        for(int i = 1, j = i + 1; i <= 10; i ++){
//            System.out.println("i:"+i);
//            System.out.println("j:"+j);
//            System.out.println("i+j:"+(i+j));
//        }
        int[] arr = {1,2,4,5};
        for(int ii : arr){
            System.out.println(ii);
        }
    }
}
