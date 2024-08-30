package javase.shejimoshi;

public class BankTest {

    // 饿汉式
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();

    }
}





class Bank {
    private Bank() {
    }
    // 类的内部创建当前类的实例
    private static Bank instance = new Bank();

    // 提供外部调用的方法
    public static Bank getInstance() {
        return instance;
    }
}