package oop;

/**
 * @Description TODO
 * @Date 2023/1/30 15:42
 * @Created by 18355
 */
public class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
