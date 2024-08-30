package javase.forobject.duotai.duotai3;

public class PersonTest {

    public static void main(String[] args) {
        // 向下转型
        Person person = new Man();
        // person.earnMoney();

//        Person person1 = new Women();
//        Man man1 = (Man)person1;  // ClassCastException
//        System.out.println(man1.isSmoking);
        /**
         * 向下转型可能会出现的问题(如上注释问题)
         * 建议在向下转型之前，使用 instanceof 进行判断，避免出现类型转换异常     (a instanceof A)
         * if a instanceof A is true, a instanceof super A
         */
        Man man = (Man) person;
        if (person instanceof Man) {
            man.earnMoney();
            System.out.println(man.isSmoking);
            System.out.println(person == man); // true
        }


        // =========================================




    }
}
