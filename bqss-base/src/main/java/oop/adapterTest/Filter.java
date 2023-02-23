package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:06
 * @Created by 18355
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){
        return input;
    }
}
