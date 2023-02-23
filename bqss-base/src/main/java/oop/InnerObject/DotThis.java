package oop.InnerObject;

/**
 * @Description TODO
 * @Date 2023/2/1 15:49
 * @Created by 18355
 */
public class DotThis {
    void f(){
        System.err.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        Inner inner = dt.inner();
        inner.outer().f();
        System.err.println(dt == inner.outer());
    }
}
