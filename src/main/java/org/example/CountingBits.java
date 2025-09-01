package org.example;
import java.util.*;

public class CountingBits {
    public int[] countBits(int n) {
        int[] sol = new int[n+1];
        for(int i=1; i<=n; i++){
            int num = i;
            while(num != 0){
                sol[i]++;
                num&= num-1;
            }
        }
        return sol;
    }
}
