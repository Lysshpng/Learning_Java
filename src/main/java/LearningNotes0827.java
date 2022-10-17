import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ~0827
 * 1. Java创建对象的4种方式：create1() ~ create5()
 * 2. 类的嵌套构建
 */

class BClass {

}

class CClass implements Cloneable, Serializable {
    CClass(int n) {
        System.out.println("Initializing a new CClass object with input_arg is " + n);
    }

    @Override
    public CClass clone() throws CloneNotSupportedException {
        return (CClass) super.clone();
    }
}

class Tag {
    Tag(int marker) {
        System.out.println("Tag(" + marker + ")");
    }
}

class Card {
    // t1, t2, t3属于变量，是都会先完成初始化的，然后才是构造方法Card()
    // 而f()是方法，只有调用才跑
    Tag t1 = new Tag(1);

    Card() {
        System.out.println("Card()");
        Tag t3 = new Tag(33);
    }

    Tag t2 = new Tag(2);

    void f() {
        System.out.println("f()");
    }

    Tag t3 = new Tag(3);
}

public class LearningNotes0827 {

    // 用new创建新对象
    static void create1() {
        BClass bClass = new BClass(); // 默认的无参构造
        CClass cClass = new CClass(5);  // 自定义的有参构造
    }

    // 通过反射创建对象
    // 1. 通过Class.newInstance: 先获取其Class对象，再调用newInstance方法
    static void create2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class obj = CClass.class;
        CClass cClass = (CClass) obj.newInstance();
        // newInstance()方法不建议使用导致idea自动画了条删除横线
    }

    // 2. 通过调用构造器再去创建对象Constructor.newInstance:
    //      通过Class拿到指定的构造方法，再调用构造方法的newInstance方法创建对象
    static void create3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<CClass> constructor = CClass.class.getConstructor();
        CClass cClass = constructor.newInstance();
    }

    // 3. Clone: 通过clone方法创建对象，本质是通过对象内存的复制实现
    //          首先必须在实体类中先实现Cloneable接口并复写Object的clone方法(见CClass)
    //          (因为Object的这个方法是protected的，若不复写，外部调用不了)
    static void create4() throws CloneNotSupportedException {
        CClass cClass = new CClass(3);
        CClass clone = cClass.clone();
    }

    // 反序列化：指把字节序列恢复为 Java 对象的过程；
    //      首先实现序列化：指把 Java 对象转换为字节序列的过程；对Class必须要实现Serializable接口；
    static void create5() throws IOException, ClassNotFoundException {
        CClass cClass1 = new CClass(2);
        // 序列化
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.obj"));
        objectOutputStream.writeObject(cClass1);
        objectOutputStream.close();
        // 反序列化
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.obj"));
        CClass cClass2 = (CClass) in.readObject();
        in.close();
    }

    public static void main(String[] args) {
        Card t = new Card();
        t.f();
        // 输出是 Tag(1)\nTag(2)\nTag(3)\nCard()\nTag(33)\nf()\n
    }

}
