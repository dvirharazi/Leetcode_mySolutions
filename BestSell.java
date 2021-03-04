//You are given an array prices for which the ith element is the price of a given stock on day i.

//Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

public class BestSell {
    //prices = [7,1,5,3,6,4]
    //prices = [1,2,3,4,5]
    public static int bestProfit(int [] prices){
        if(prices.length == 0 || prices.length==1 )
            return 0 ;
        int sum=0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i]<prices[i+1]){
                sum += prices[i+1]-prices[i];
            }
        }
        return sum;
    }
}
