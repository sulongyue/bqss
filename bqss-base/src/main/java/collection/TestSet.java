package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/14
 *
 *  /---Set 存储无序的，不可重复的数据。
 *      /---HashSet 主要实现类，线程不安全，可以存储null.
 *          /---LinkedHashSet  作为hashSet的子类，使得遍历数据时按照添加的顺序来。
 *      /---TreeSet 使用二叉树（红黑树）。可以按照添加对象的指定属性来排序。
 *
 *  无序性
 *      以HashSet为例，底层还是数组，无序指的是没有按照数组的索引来一次存放put进去的数据。
 *      那么我们如何决定put进去的数据放在数组中的哪个位置呢。由Hashcode值决定。
 *  不可重复性
 *      两个对象equals方法不能为true.
 *
 *  添加数组的过程，以hashSet为例
 *      底层是一个数组，初始大小是16，put一个对象，先计算这个对象的hashcode值，然后根据散列算法得到散列值（数组索引下标），
 *      看这个下标有没有数据，没有，add成功
 *      如果有数据（一条数据，或者多条链表），判断两个对象的hashcode值是否一样，不一样，add成功。
 *          如果hashcode值一样，判断equals是否一样，不一样，add成功。
 *          equals一样，表名两个对象一样，add失败。
 *      同一位置多条数据，以链表的方式存储。
 *  要求，向set中添加的数据，一定要重写equals方法和hashcode方法。
 *      重写的两个方法要保证一致性。equals相等，hashcode一定要相等。
 *      hashcode一样，equals尽可能一样。
 *
 */
public class TestSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("s");
        set.add("a");
        set.add("b");
        System.err.println(set);
    }

}
