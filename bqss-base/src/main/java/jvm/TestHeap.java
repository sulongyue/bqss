package jvm;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/24
 *
 * 开发中手动设置 -Xms600m -Xmx600m,一般设置成一样的。避免频繁扩容。
 */
public class TestHeap {

    public static void main(String[] args) {
        //jvm堆内存总量
        long xms = Runtime.getRuntime().totalMemory() / 1024 / 1024;

        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 /1024;
//        try {
//            Thread.sleep(600*1000);
//        }catch (Exception e){
//
//        }

        System.err.println("xms:"+xms); //默认是系统内存的1/64

        System.err.println("xmx:"+maxMemory); //默认是系统内存的1/4


    }
}
