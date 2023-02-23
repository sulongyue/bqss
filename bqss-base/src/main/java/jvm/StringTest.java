package jvm;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/8/2
 */
public class StringTest {
    String s = "123".intern();

    public static void main(String[] args) {
        String s1 = new String("a") + new String("b");
        s1.intern();
        String s2 = "ab";
        System.err.println(s1 == s2);
    }

}
