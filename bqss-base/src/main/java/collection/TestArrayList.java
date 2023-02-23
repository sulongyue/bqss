package collection;

import java.util.*;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/12
 *
 * /---List 存储有序的可重复的数据。动态的数组。
 *       /---ArrayList   适合查找。底层是Object[]
 *       /---LinkedList  适合频繁插入.底层是双向循环链表。
 *       /---Vector      线程安全，效率低。底层是Object[]
 */
public class TestArrayList {
    public static void main(String[] args) {
        List list1 = new ArrayList(); //创建一个空数组,add的时候，初始化数组，长度是10，如果长度不够就扩容，扩容1.5倍。然后Arrays.copyof 复制到新数组中。
        //如果知道长度，建议创建对象的时候给参数。

        List list2 = new LinkedList();

        List list3 = new Vector();

        List list4 = new Stack(); //extends Vector，内部也是一个Object数组。只是先进后出。

    }

}
