package Observer_answer;

/**
 * @author WeiHanQiang
 * @date 2024/09/18 14:23
 **/
// 具体的观察者类，代表股民
class Investor implements StockObserver {
    private String investorName;

    public Investor(String name) {
        this.investorName = name;
    }

    // 当被通知时，调用此方法
    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("通知 " + investorName + ": 股票 " + stockName + " 的价格变为 " + newPrice);
    }
}

