package rtti;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2023/2/3 11:16
 * @Created by 18355
 */
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElements){
        List<T> result = new ArrayList<>();
        try{
            for(int i = 0; i < nElements; i++){
                result.add(type.newInstance());
            }
        }catch (Exception e){
             throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        FilledList<CounterInteger> f1 = new FilledList<>(CounterInteger.class);
        System.err.println(f1.create(10));

        Class<FancyToy> fancyToyClass = FancyToy.class;

        Class<? super FancyToy> up = fancyToyClass.getSuperclass();
        System.err.println(up.getName());
        Object object = up.newInstance();

    }
}
