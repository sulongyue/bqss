package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/12
 *
 * /---Map  双列数据
 *      /---HashMap 主要实现类，线程不安全。无序的。可以加null.
 *          /---LinkedHashMap   可以保证安装添加的顺序遍历。在原有HashMap的基础上，添加了一队指针，指向前一个后一个记录。
 *                          对于频繁的遍历操作，效率高于HashMap
 *      /---TreeMap 按照添加的顺序遍历（按照key来排）。可以按照key的指定字段来排。
 *      /---Hashtable   古老的实现类，类似vactor.线程安全，效率低。不能放null.
 *          /---Properties 常用来处理配置文件，key和value都是String类型。
 * HashMap在jdk7之前用的 数组+链表。jdk8之后做了优化，数组+链表+红黑树。
 *      map中的key是无序的不可重复的，可以用set来存。value也是无序的，但可以重复，使用collection来存储。（key,value）构成一个entry.
 *
 *
 *
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put(null,null); //可以放null
        map.put("abc","abc");
        System.err.println(map);


        /**
         * new HashMap，创建一个长度是16的Entry[]数组，
         * map.put(key1,value1);调用key1类的hashcode()方法得到hashcode值，经过散列算法，计算出再Entry[]中的下标。
         * 此时如果下标位置是空，则add进去。如果不为空，比较key1的hashcode值
         *      如果key1的hashcode值与已经存在的数据的hashcode值都不相同，则add成功。
         *      如果key1的hashcode值与已经存在的数据的hashcode值相同，则调用key1所在类的equals方法。
         *          如果equals为true，则使用新的value替换原来的value。相当于修改
         *          如果equals为false，则add成功。
         * 随着不断添加，当数组使用达到0.75，会扩容，扩容为原理的2倍。
         *
         * jdk8中，new hashMap不会立即创建数组。put第一条数据的时候创建一个长度为16的node[]
         * 当素组上一个索引上的链表数据超过8且数组长度超过64，则会将链表该为红黑树。
         */
    }
}
