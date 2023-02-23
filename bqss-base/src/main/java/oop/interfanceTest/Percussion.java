package oop.interfanceTest;

/**
 * @Description TODO
 * @Date 2023/1/31 11:12
 * @Created by 18355
 */
public class Percussion implements Instrument{
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
        return "percussion";
    }
}
