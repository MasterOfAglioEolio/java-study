package oop_7;
class Outer{
    class Inner{
        int iv=100;
    }
}
public class oop7_6 {
    public static void main(String[] args) {

        Outer o = new Outer();
        Outer.Inner li = o.new Inner();
        System.out.println(li.iv);
    }


}
