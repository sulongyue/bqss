package oop.InnerObject;

/**
 * @Description TODO
 * @Date 2023/2/1 15:47
 * @Created by 18355
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner inner = dn.new Inner();
    }
}
