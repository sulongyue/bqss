package rtti;

/**
 * @Description TODO
 * @Date 2023/2/3 11:14
 * @Created by 18355
 */
public class CounterInteger {
    private static long counter; //属于这个类的，所有对象共有,但可以被修改
    private final long id = counter++; //属于当前对象的，但不可以修改（id怎么能改呢）
    public String toString(){
        return Long.toString(id);
    }

}
