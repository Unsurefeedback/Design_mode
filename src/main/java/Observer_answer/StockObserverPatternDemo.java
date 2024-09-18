package Observer_answer;

/**
 * @author WeiHanQiang
 * @date 2024/09/18 14:34
 **/
// 测试类
public class StockObserverPatternDemo {
    public static void main(String[] args) {
        // 创建一个具体的股票对象
        StockImpl stock = new StockImpl("AAPL", 150.00);

        // 创建几个股民（观察者）
        Investor investor1 = new Investor("张三");
        Investor investor2 = new Investor("李四");

        // 添加观察者
        stock.addObserver(investor1);
        stock.addObserver(investor2);

        // 模拟股票价格变化
        stock.setPrice(165.00);  // 变化幅度大于5%，触发通知
        stock.setPrice(150.00);  // 变化幅度大于5%，触发通知

    }
}
