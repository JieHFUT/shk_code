package javase.shejimoshi;

public class GirlFriendTest {
    public static void main(String[] args) {

        GirlFriend girlFriend = GirlFriend.getInstance();

    }
}


// 懒汉模式
class GirlFriend {

    // 1. 类的构造器私有化
    private GirlFriend() {

    }

    // 2.
    private static GirlFriend instance = null;
    // 3.
    public static GirlFriend getInstance() {
        if (instance == null) {
            instance = new GirlFriend();
        }
        return instance;
    }



}