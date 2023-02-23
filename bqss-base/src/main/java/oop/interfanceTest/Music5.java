package oop.interfanceTest;

/**
 * @Description TODO
 * @Date 2023/1/31 11:19
 * @Created by 18355
 */
public class Music5 {
    static void tune(Instrument i){
        i.play(new Note(3));
    }

    static void tuneAll(Instrument[] arr){
        for(Instrument i : arr){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] arrs = {
                new Woodwind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(arrs);
    }
}
