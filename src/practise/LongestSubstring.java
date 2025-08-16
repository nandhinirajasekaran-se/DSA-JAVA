package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args){
        String str = "abcabcbb";
        int start =0, maxLen=0;
        ArrayList<Character> seenList = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c) && map.get(c)>= start) {
                start = map.get(c) + 1;
            }
            seenList.add(c);
            map.put(c, i);
            maxLen = Math.max(maxLen, i-start+1);
        }
        System.out.println(maxLen);
    }
}
