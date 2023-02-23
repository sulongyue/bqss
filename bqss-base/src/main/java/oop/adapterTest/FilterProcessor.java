package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:40
 * @Created by 18355
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),waveform);
        Apply.process(new FilterAdapter(new HighPass(2.0)),waveform);
        Apply.process(new FilterAdapter(new BandPass(1.0,2.0)),waveform);
    }
}
