package practise;

class StringManipulation {
    public static void main(String[] args) {
        String str = "hello world";
        String[] strArr = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=strArr.length-1;i>=0;i--){
            stringBuffer.append(strArr[i]).append(" ");
        }

        System.out.println(
                stringBuffer.toString()
        );
    }
}
