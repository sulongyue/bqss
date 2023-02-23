package oop.interfanceTest;

/**
 * @Description TODO
 * @Date 2023/1/31 11:04
 * @Created by 18355
 */
public class Note {
    private Integer value;

    public Note(Integer value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Note{" +
                "value=" + value +
                '}';
    }
}
