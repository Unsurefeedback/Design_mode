package Observer_answer;

import java.util.Observer;

/**
 * @author weihanqiang
 * @date 2024/9/18
 */
// 定义一个被观察者接口，股票将实现该接口
// 定义一个被观察者接口，股票将实现该接口
interface Stock {
    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers();
}