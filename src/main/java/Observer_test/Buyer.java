package Observer_test;


/**
 * @author weihanqiang
 * @date 2024/9/18
 */
interface Buyer {
    public String getName();
    public void setName(String name);
    public void observer(Stock acc); //观察股票
}
