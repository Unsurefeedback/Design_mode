package Observer_test;

/**
 * @author WeiHanQiang
 * @date 2024/09/18 13:53
 **/
public class Investor implements Buyer{
    private String name;

    public Investor(String name) {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void observer(Stock acc) {

    }
}
