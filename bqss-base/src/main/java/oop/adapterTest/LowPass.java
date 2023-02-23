package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:08
 * @Created by 18355
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
