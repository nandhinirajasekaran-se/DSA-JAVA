package DSA.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class PointSort implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return o1.x - o2.x;
    }
}
public class compartorS {
    public static void main(String[] args){
        Point o1 = new Point(2,3);
        Point o2 = new Point(3,12);
        Point o3 = new Point(1,4);
        ArrayList<Point> points = new ArrayList<>();
        points.add(o1);
        points.add(o2);
        points.add(o3);
        Collections.sort(points, new PointSort());

        System.out.println(points);

    }
}
