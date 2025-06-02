package DSA.Mathematics;

import java.lang.Math;
import java.util.ArrayList;

public class Sqrt {

    public static ArrayList quadratic(int a, int b, int c) {

        ArrayList<Integer> arr = new ArrayList<>();


        // Calculate discriminant
        int discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            ArrayList<String> arr1 = new ArrayList<>();
            arr1.add("Imaginary");
            return arr1;
        }
        // Calculate the two roots
        double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

        // Floor the roots
        int flooredRoot1 = (int) Math.floor(root1);
        int flooredRoot2 = (int) Math.floor(root2);

        int min = Math.min(flooredRoot1, flooredRoot2);
        int max = Math.max(flooredRoot1, flooredRoot2);
        arr.add(flooredRoot1);
        arr.add(flooredRoot2);

        /*double sq = Math.sqrt((b*b) - (4*a*c));
        double x = (-b + sq)/(2*a);
        double y = (-b - sq)/(2*a);
        arr.add((int)x);
        arr.add((int)y);*/
        return arr;

    }
    public static void main(String[] args) {
        System.out.println(quadratic(-264,-750,504));
    }

}
