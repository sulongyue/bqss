package oop.adapterTest;

/**
 * @Description TODO
 * @Date 2023/2/1 9:37
 * @Created by 18355
 */
public class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
