package Observer_answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author WeiHanQiang
 * @date 2024/09/18 14:22
 **/
// 具体的股票类，实现了Stock接口
class StockImpl implements Stock {
    private String stockName;
    private double price;
    private double previousPrice;
    private List<StockObserver> observers;

    public StockImpl(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.previousPrice = price;
        this.observers = new ArrayList<>();
    }

    // 添加观察者
    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    // 移除观察者
    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    // 通知所有观察者
    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockName, price);
        }
    }

    // 当股票价格发生变化时调用此方法
    public void setPrice(double newPrice) {
        previousPrice = this.price;
        this.price = newPrice;
        double priceChange = Math.abs((newPrice - previousPrice) / previousPrice) * 100;

        // 如果价格变化幅度超过5%，则通知所有观察者
        if (priceChange >= 5.0) {
            notifyObservers();
        }
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }
}

