package org.example;
import java.util.*;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int l = 0, r = 0;
        int minBuy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]-minBuy > profit){
                profit = prices[i] - minBuy;
            }else if(prices[i] < minBuy){
                minBuy = prices[i];
            }
        }

        return profit;

    }
}
