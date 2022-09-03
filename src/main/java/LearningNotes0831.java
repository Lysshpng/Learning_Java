
/** 0831
 * Java的继承以及继承类的构造方法关系
 */


class ClassA {
    ClassA() {
        System.out.println('A');
    }
}

class ClassB extends ClassA {
    ClassB() {
        System.out.println('B');
    }
}

class ClassC extends ClassB {
    ClassC() {
        System.out.println('C');
    }
}


public class LearningNotes0831 {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        // A\nB\nC\n
    }
}
