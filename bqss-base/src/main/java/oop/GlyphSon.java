package oop;

/**
 * @Description TODO
 * @Date 2023/1/30 15:44
 * @Created by 18355
 */
public class GlyphSon extends Glyph{
    private int radius = 1;
    GlyphSon(int i){
        super();
        radius = i;
        System.out.println("GlyphSon().radius="+radius);
    }

    void draw(){
        System.out.println("GlyphSon.draw().radius="+radius);
        super.draw();
    }
}
