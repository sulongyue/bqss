package jvm;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/15
 */
public class TestStack {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int s = test1(i,j);
        System.err.println(s);
    }

    public static int test1(int i,int j){
        int sum = i+j;
        return sum;
    }

    public void add (int c){
        return;
    }

}
