package javase.forobject.gouzhao;

public class UserTest {
    public static void main(String[] args) {

        User user1 = new User();
        System.out.println(user1.toString());

        User user2 = new User(18,180,"xiaohuihui");
        System.out.println(user2.toString());


    }
}
