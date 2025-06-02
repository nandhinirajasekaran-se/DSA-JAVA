package DSA.Recursion;

public class Josephus {

    public static int josephusK(int n,int k) {
        if(n==1){
            return 1;
        }else{
            return (josephusK(n-1,k) + k-1) %n +1;
        }
    }
    public static void main(String[] args){
        System.out.println(josephusK(14,2));
    }
}
