package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:11
 * @Created by 18355
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
