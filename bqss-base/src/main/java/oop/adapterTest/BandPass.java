package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:13
 * @Created by 18355
 */
public class BandPass extends Filter{
    double lowCutoff, highCutoff;
    public BandPass(double lowCutoff,double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
