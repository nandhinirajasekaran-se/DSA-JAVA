package DSA.Arrays.Exercise;

public class BetBalance {

    static int betBalance(String res){
        int out = 4;
        int bet=1;
        char[] arr = res.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(out<0)
                return -1;

            if(arr[i]=='W') {
                out += bet;
                bet = 1;
            } else if(arr[i]=='L') {
                out -= bet;
                bet *=2;
                if(out<bet  && !(out==0))
                    return -1;
            }
        }
        return out;
    }

    public static void main(String[] args){
      //  System.out.println(betBalance("WL"));
        //System.out.println(betBalance("WLWLLLWWLW"));
        //System.out.println(betBalance("WLWLLWLLWWLWWW"));
        System.out.println(betBalance("WWLWLLL"));
    }
}
