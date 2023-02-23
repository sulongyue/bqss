package oop;

import oop.InnerObject.Parcel1;

/**
 * @Description 构造器内部的多态
 * @Date 2023/1/30 15:47
 * @Created by 18355
 */
public class TestGlyph {
    public static void main(String[] args) {
        Parcel1.Destination d = new Parcel1.Destination("s");
        new GlyphSon(5);
    }
}
