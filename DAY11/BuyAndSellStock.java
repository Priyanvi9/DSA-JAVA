public class BuyAndSellStock {
    public static int buyAndSellStocks(int prices[]){
        int cp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0;i<prices.length;i++){
            if(cp<prices[i]){
                int profit =prices[i]-cp; // today's profit
                maxProfit=Math.max(maxProfit,profit); // till today maximum profit
            }
            else{
                cp = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.err.println(buyAndSellStocks(prices));
    }
}
