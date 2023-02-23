package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:04
 * @Created by 18355
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform" + id;
    }

}
