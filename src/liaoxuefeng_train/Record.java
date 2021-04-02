package liaoxuefeng_train;

import java.awt.*;



public class Record{
    public static void main(String[] args) {
        Point p = new Point(123, 456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);

        var z=Point.of();
        var s=Point.of(123,456);

        System.out.println(z);
        System.out.println(s);
    }
}

record Point(int x, int y) {
    public static Point of(){
        return new Point(1,1);
    }

    public static Point of(int x,int y){
        return new Point(x,y);
    }
}