package collection;


import java.util.*;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/14
 *
 * /---Collection   单列集合
 *      /---List    存储有序的
 *      /---Set
 *      /---Queue
 * /---Map  双列集合
 *
 */
public class TestCollection {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(new Integer[]{1, 2, 3});
        //ints.add(4);// Arrays.asList将数组转为容器，不可以执行修改大小的操作

        List<Integer> list = new ArrayList<>();
        list.addAll(ints);
        list.add(4);
        System.err.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.err.println(iterator.next());
            iterator.remove();
        }
        System.err.println(list);
    }



}
