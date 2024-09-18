package Observer_answer;

/**
 * @author weihanqiang
 * @date 2024/9/18
 */
// 定义一个观察者接口，股民将实现该接口
public interface StockObserver{
    void update(String stockName, double newPrice);
}
