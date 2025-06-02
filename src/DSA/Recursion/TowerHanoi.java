package DSA.Recursion;

public class TowerHanoi {

    public static void towerHanoi(int n, String from, String aux, String to) {
        if(n==1){
            System.out.println("Move from disc " + n + " from " + from + " to " + to);
            return;
        }
        towerHanoi(n-1, from, to, aux);
        System.out.println("Move from disc " + n + " from " + from + " to " + to);
        towerHanoi(n-1, aux, from, to);

    }
    public static void main(String[] args) {
        int N=3;
        towerHanoi(N, "A", "B", "C");
    }

}
