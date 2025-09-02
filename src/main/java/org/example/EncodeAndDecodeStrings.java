package org.example;
import java.util.*;

public class EncodeAndDecodeStrings {
    public String encode(List<String> strs) {

        StringBuilder sol = new StringBuilder();
        for(String s : strs){
            sol.append(s.length()).append('@').append(s);
        }
        return sol.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i =0;
        while (i < str.length()) {
            int j = i;
            while(str.charAt(j) != '@'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j +1;
            j = i +length;
            res.add(str.substring(i,j));
            i = j;
        }
        return res;
    }
}
