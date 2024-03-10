public class stock_buy_sell {
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        int i,sellday=0,buyday=0,sellprice=0;
        int least=prices[0];
        for(i=0;i<prices.length;i++){
        if(prices[i]<least){
            least=prices[i];
            buyday=i+1;
        }
        }
        for(i=buyday;i<prices.length;i++){
            if(prices[i]-least>sellprice){
                sellprice=prices[i]-least;
                sellday=i+1;
            }
            
        }
        if(sellprice==0){
            System.out.println("No transsactions made");
        }
        System.out.println("Buy stock on day "+buyday);
        System.out.println("Sell stock on day "+sellday);
        System.out.println("Profit earned " +sellprice);
        
    }
}
