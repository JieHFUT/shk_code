package nomalclass.string;

import org.junit.Test;

public class StringTest {
    @Test
    public void test1(){
        // 字符串常量池不允许存放两个相同的 常量
        String str1 = "Hello World";
        String str2 = "Hello World";

        System.out.println(str1); // Hello World
        System.out.println(str1 == str2);// true 指向同一个字符串常量池地址
    }

    @Test
    public void test2(){
        String str1 = "Hello World";
        String str2 = "Hello World";

        str2 = "New World"; // 重新赋值或者拼接操作的时候，相当于在常量池创建了一个新的对象，重新指向
        System.out.println(str1); // Hello World
        System.out.println(str2 == str1); // false
    }

    @Test
    public void test3(){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = str2.replace('l','o');

        System.out.println(str1); // hello
        System.out.println(str2); // hello
        System.out.println(str3); // heooo
    }


    @Test
    public void test4(){
        String str1 = "hello";
        String str2 = new String();
        str2 = "hello";
        System.out.println(str1 == str2); // true
    }

    @Test
    public void test5(){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1 == str2); // true
        System.out.println(str3 == str4); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // false
    }

    @Test
    public void test6(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world"; //通过查看字节码文件发现调用了StringBuilder的toString()---> new String()
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println();

        String s8 = s5.intern(); //intern():返回的是字符串常量池中字面量的地址
        System.out.println(s3 == s8);//true

    }

    @Test
    public void test7(){
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true
        System.out.println(s3 == s7);//true
    }


    @Test
    public void test8(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false
    }


}
