package DSA.Sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Point1 implements Comparable<Point1>{
    int x;
    int y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point1 p){
        return this.x - p.x;
    }
    @Override
    public String toString() {
        return "Point1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class ComparableS {
    public static void main(String[] args){
        Point1 o1 = new Point1(2,3);
        Point1 o2 = new Point1(3,12);
        Point1 o3 = new Point1(12,4);
        ArrayList<Point1> points = new ArrayList<>();
        points.add(o1);
        points.add(o2);
        points.add(o3);
        Collections.sort(points);

        System.out.println(points);

    }
}
