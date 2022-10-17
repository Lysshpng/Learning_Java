import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class LearningNotes1013 {

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {

        // Iterator 学习
        // 创建集合
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("C");
        arr.add("C++");
        arr.add("Python");
        arr.add("Java");
        // 获取集合的迭代器
        Iterator it = arr.iterator();
        // 输出第一个元素
        print(it.next());

        // 遍历
        // 变成从第二位开始的遍历了
        while (it.hasNext()) {
            print(it.next());
        }

        // 删除
        // 因为前面的遍历 it当前位置已经处于集合的最末端 所以没有元素了 所以不会继续进行遍历、判断和删除
        // 重新获取一个迭代器
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (s == "C++") {
                // if (Objects.equals(s, "C++")) {
                iterator.remove();
            }
        }
        print(arr);

        // Exception 异常处理
        try {
            //
        } catch (Exception e) {
            //
        } finally {
            //
        }


    }
}
