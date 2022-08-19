/**
 * @author Lysshpng
 * @description Learning notes
 * @time until 0819
 */

import java.util.*;

/** Notes:
 * 类：类是一个模板，它描述一类对象的行为和状态
 * 对象：对象是类的一个实例，有状态和行为
 * 方法：方法就是行为，一个类可以有很多方法
 * public static void main = 访问修饰符 + 关键字 + 返回类型 + 方法名
 * 访问修饰符 = [public, private, protected, default]
 * static 允许直接通过 classname.x 的方式访问static的变量/方法
 *          从static方法内部 ← 调用 →x 非static方法
 *          static初始化只在必要时启用
 * 输入是Scanner
 * 类的自动初始化，构建器名与类名一致
 * overload: 名字相同，传入参数不同
 * this: 只能在方法内部使用，“这个对象/当前对象”
 * 垃圾收集 ！= 破坏；对象可能不会被当作垃圾收掉； 垃圾收集只跟内存有关；
 */

class AClass{
    AClass(){
        System.out.println("initializing a new AClass object ..");
    }

    public static int i = 3;

    static void method(int i, String s){
        System.out.println("original method");
    }

    static void method(String s, int i){
        System.out.println("overload method");
    }


}

public class LearningNotes0819 {

    public static void if_(int a, int b){
        System.out.println("====================");
        System.out.println("excuting method if_(" + a + ", " + b + ") ..");
        if(a > b){
            System.out.println(a + " > " + b);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        }
        else{
            System.out.println(a + " < " + b);
        }
    }

    public static void switch_(char c){
        System.out.println("====================");
        System.out.println("excuting method switch_(" + c + ") ..");
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(c + " is a vowel");
            case 'y', 'w' -> System.out.println(c + " sometimes a vowel");
            default -> System.out.println(c + " is a consonant");
        }
        /* traditional style
         switch (c) {
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 System.out.println(c + " is a vowel");
                 break;
             case 'y':
             case 'w':
                 System.out.println(c + " sometimes a vowel");
                 break;
             default:
                 System.out.println(c + " is a consonant");
         }
        */
    }

    public static void for_(int n){
        System.out.println("====================");
        System.out.println("excuting method for_(" + n + ") ..");
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0) continue;
            System.out.println(i);
        }
    }

    public static void while_(int start, int end){
        System.out.println("====================");
        System.out.println("excuting method while_(" + start + ", " + end + ") ..");
        while(start <= end){
            System.out.println(start);
            start ++;
        }
    }

    public static void main(String[] args){

        // if-else and while
        int a = 4, b = 13;
        if_(a, b);
        while_(a, b);

        // for
        int n = 10;
        for_(n);

        // switch-case
        char c = (char)(Math.random() * 26 + 'a');
        switch_(c);

        // logical opt
        System.out.println("====================");
        System.out.println((1<2) && (2>3));
        System.out.println((1<2) || (2>3));
        System.out.println(!(1 == 2));

        String s_handle = "handle";   // s是句柄，初始化为handle
        String s_object = new String("object");    // s是一个String对象

        // 输出方法一
        System.out.println("====================");
        System.out.println("output a static value of a class, way 1:");
        AClass aClass = new AClass();
        System.out.println(aClass.i);
        // 输出方法二
        System.out.println("output a static value of a class, way 2:");
        System.out.println(AClass.i);



    }

}
