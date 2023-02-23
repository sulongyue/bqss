package oop.InnerObject;

/**
 * @Description TODO
 * @Date 2023/2/1 14:59
 * @Created by 18355
 */
public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    public static class Destination {
        private String label;
        public Destination(String label){
            this.label = label;
        }
        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.err.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmanina");
        Parcel1.Contents c = p.contents();
        Parcel1.Destination d = p.to("s");

    }

}
