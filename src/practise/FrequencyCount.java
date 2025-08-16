package practise;

public class FrequencyCount {
    public static void main(String[] args){
        String str = "ASWISS";
        int[] counts = new int[26];

        for(char c: str.toCharArray()){
            counts[c-64] +=1;
            //System.out.println(c-64);
        }
        for( char c : str.toCharArray()){
            if(counts[c-64]==1)
                System.out.println(c);

            break;
        }
    }
}
