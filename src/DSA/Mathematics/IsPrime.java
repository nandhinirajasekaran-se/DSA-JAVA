package DSA.Mathematics;

public class IsPrime {
    public static boolean prime(int a) {
        if (a ==0 || a==1 ) {
            return false;
        }else if(a == 2 || a==3){
            return true;
        }else {
            if(a%2==0 || a%3==0){
                return false;
            }else{
                for(int i=5;i<=Math.sqrt(a);i+=2){
                    if(a%i==0){
                        return false;
                    }
                }
                return true;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Is the number prime number ? "+prime(13));
    }


}