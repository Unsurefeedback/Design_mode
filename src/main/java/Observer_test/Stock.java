package Observer_test;

/**
 * @author WeiHanQiang
 * @date 2024/09/18 13:44
 **/
public class Stock extends Subject{
    public Stock(String name) {
        this.name = name;
    }

    @Override
    public void notifyObserver() {
        Integer percent = Math.abs(this.price - this.oldPrice)*100;
        System.out.println("价格变化幅度过大！幅度为: "+percent+"%");
    }
}
