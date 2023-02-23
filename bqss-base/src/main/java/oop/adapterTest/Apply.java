package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/1/31 11:30
 * @Created by 18355
 */
public class Apply {
    public static void process(Processor p , Object o){
          System.err.println("Using Processor "+p.name());
          System.err.println(p.process(o));
    }
//    public static void process(Processor p,Object o){
//        System.err.println("Using Processor "+p.name());
//        System.err.println(p.process(o));
//    }
//    public static String s = "Disagreement with beliefs is by definition incorrect";
//
//    public static void main(String[] args) {
//        process(new Upcase(),s);
//        process(new DownCase(),s);
//        process(new Splitter(),s);
//    }
}
