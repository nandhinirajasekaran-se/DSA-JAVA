package practise;

public class MaskValidateCardNumber {
    static boolean isValidFormat(String s){
        for( char c: s.toCharArray()){
            if( !Character.isDigit(c) && c!=' ' && c!='-')
                return false;
        }
        return true;
    }

    static boolean luhnValid(String s){
        int sum=0, parity=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!Character.isDigit(c))
                continue;
            int d = c-'0';
            if(parity %2 ==1) {
                d *= 2;
                if(d>9)
                    d-=9;
            }
            sum +=d;
            parity++;
        }
        System.out.println("parity:"+parity);
        System.out.println("sum:"+sum);
        return  parity>=12 && parity<=19 && sum %10==0;
    }

    static String maskInput(String s){
        StringBuilder sb = new StringBuilder();
        int digits = 0;
        for(int i=s.length()-1;i>=0;i--){

            if(Character.isDigit(s.charAt(i))) {
                if (digits < 4)
                    sb.append(s.charAt(i));
                else
                    sb.append("*");

                digits++;
            }else if(s.charAt(i)==' '){
                sb.append(s.charAt(i));
            }

        }
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(isValidFormat("79927398713")  && luhnValid("79927398713"));

        System.out.println(isValidFormat("4539 1488 0343 6467")  || luhnValid("4539 1488 0343 6467"));

        System.out.println(maskInput("4539 1488 0343 6467"));
    }
}
