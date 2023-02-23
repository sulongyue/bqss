package oop.interfanceTest;

/**
 * @Description TODO
 * @Date 2023/1/31 11:14
 * @Created by 18355
 */
public class Stringed implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this+".play()"+n);
    }

    @Override
    public void adjust() {
        System.out.println(this+".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}
