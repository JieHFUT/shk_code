package javase.forobject.gouzhao;

public class GouZhaoDiaoGouZhao {

    String name;
    int age;


    public GouZhaoDiaoGouZhao() {
        // 不带参数的构造方法
        // 对象创建的时候需要初始化
        System.out.println("初始化");
    }

    /**
     * 带参数的构造器可以通过 this() 方法来调用其他的构造器; this()必须声明在构造器的首行
     * @param name
     */
    public GouZhaoDiaoGouZhao(String name) {
        this();
        this.name = name;
    }
    /**
     * 带参数的构造器可以通过 this( 参数 ) 方法来调用其他的构造器
     * @param name
     * @param age
     */
    public GouZhaoDiaoGouZhao(String name, int age) {
        this(name);
        // this 当前正在创建的对象
        this.age = age;
    }



}
