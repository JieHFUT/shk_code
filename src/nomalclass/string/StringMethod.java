package nomalclass.string;
import org.junit.Test;

public class StringMethod {

    @Test
    public void test1(){
        String str1 = new String();
        String str2 = new String("");

        String str3 = new String(new char[]{'a','b','c'});
        System.out.println(str3);
    }

    @Test
    public void test2(){
        /**
         * string 与常见的其他结构之间的转化
         */
        String str1 = String.valueOf(37564);
        int num1 = Integer.parseInt(str1);



        // char[]
        String str2 = "you never know";
        char[] chars = str2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();

        String str3 = String.valueOf(chars);
        //new String(str3);
        System.out.println(str3);


        // byte[]
        String str4 = String.valueOf("ba ga ya lu");
        byte[] bytes = str4.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");  // 98 97 32 103 97 32 121 97 32 108 117
        }
        String str5 = String.valueOf(bytes);
        System.out.println(str5); // [B@6093dd95
        String str6 = new String(bytes);
        System.out.println(str6); // ba ga ya lu


    }



}
