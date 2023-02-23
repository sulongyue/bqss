package rtti;

/**
 * @Description TODO
 * @Date 2023/2/3 10:36
 * @Created by 18355
 */
public class ClassTest {

    static void printInfo(Class cc){
        System.err.println("class name:"+cc.getName() +
                            "  is interface?" + cc.isInterface());
        System.err.println("simple name:"+cc.getSimpleName());
        System.err.println("canonical name:"+cc.getCanonicalName());
    }

    public static void main(String[] args) {

        System.err.println(FancyToy.class.getCanonicalName());

        Class clazz = null;
        try{
            clazz = Class.forName("rtti.FancyToy");
        }catch (Exception e){
            e.printStackTrace();
        }
        ClassTest.printInfo(clazz);

        for(Class face : clazz.getInterfaces()){
            printInfo(face);
        }

        Class superclass = clazz.getSuperclass();
        Object obj = null;
        try{
            obj = superclass.newInstance();//必须要用无参构造器
        }catch (Exception e){
            e.printStackTrace();
        }
        printInfo(superclass);
    }
}
