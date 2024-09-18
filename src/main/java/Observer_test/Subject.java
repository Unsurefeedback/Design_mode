package Observer_test;

import java.util.ArrayList;
import java.util.Observer;

/**
 * @author WeiHanQiang
 * @date 2024/09/18 13:31
 **/
abstract class Subject {
    protected String name; // 股票名称
    protected Integer price; // 股票价格
    protected Integer oldPrice; // 上一次股票价格
    protected ArrayList<Observer> stocks = new ArrayList<Observer>();

    public Integer getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Observer> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Observer> stocks) {
        this.stocks = stocks;
    }

    // 抽象通知方法
    public abstract void notifyObserver();
}
