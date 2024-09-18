package Observer_test;


/**
 * @author WeiHanQiang
 * @date 2024/09/18 13:54
 **/
public class Client {
    public static void main(String[] args) {
        //定义观察目标对象
        Subject acc;
        acc = new Stock("金庸群侠");

        //定义四个观察者对象
        Buyer player1,player2,player3,player4;

        player1 = new Investor("杨过");
 /*        acc.join(player1);

        player2 = new Player("令狐冲");
        acc.join(player2);

        player3 = new Player("张无忌");
        acc.join(player3);

        player4 = new Player("段誉");
        acc.join(player4);

        //某成员遭受攻击
        player1.beAttacked(acc); */
    }
}
