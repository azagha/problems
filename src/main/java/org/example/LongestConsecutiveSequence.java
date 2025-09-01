package org.example;
import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            numsSet.add(nums[i]);
        }

        int longestStreak = 0;

        for(int num : numsSet){
            if(!numsSet.contains(num-1)){
                int curNum = num;
                int curStreak = 1;

                while(numsSet.contains(curNum+1)){
                    curNum++;
                    curStreak++;
                }

                longestStreak = Math.max(longestStreak, curStreak);
            }
        }
        return longestStreak;
    }
}
