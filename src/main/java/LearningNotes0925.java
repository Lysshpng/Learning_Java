import java.util.*;

public class LearningNotes0925 {
    public static void print(Object o) {
        System.out.println(o);
    }

    public static void usingCollection() {
        // Collection的使用
        // 1. 创建
        Collection collection = new ArrayList<>();  // 这里的<>的作用是什么 没有它也能运行

        // 2. 基本操作
        // 添加元素
        collection.add(8);
        collection.add(5);
        collection.add(3);
        collection.add(6);
        // 大小
        print(collection.size());
        // 是否存在某个元素
        print(collection.contains(9));
        // 是否为空
        print(collection.isEmpty());
        // 删除元素
        collection.remove(8);
        collection.remove(9);   // 不会报错

        // 3. 遍历
        for (Object o : collection) {
            print(o);
        }
    }

    public static void usingList() {
        // List的使用
        // 1. 创建
        List list = new ArrayList();

        // 2. 基本操作
        // 添加元素
        list.add("h");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");
        // 大小
        print(list.size());
        // 是否存在某个元素
        print(list.contains(9));
        // 是否为空
        print(list.isEmpty());
        // 删除元素 这里的传入参数是index
        list.remove(2);
        // list.remove(9);   // 超过list长度， 抛出异常
        // 切片 与python类似
        print(list.subList(1, 4));

        // 3. 遍历
        // 3.1
        for (int i = 0; i < list.size(); i++) {
            print(list.get(i)); // 也是index
        }
        // 3.2
        for (Object o : list) {
            print(o);
        }
    }

    public static void usingArrayList() {
        // ArrayList的使用
        // 1. 创建
        ArrayList list = new ArrayList<>();

        // 2. 基本操作

        // 3. 遍历

        // 均与usingList中类似
    }

    public static void usingLinkedList() {
        // LinkedList的使用
        // 1. 创建
        LinkedList list = new LinkedList<>();

        // 2. 基本操作

        // 3. 遍历

        // 均与usingList中类似
    }

    public static void usingHashMap() {
        // HashMap的使用
        // 1. 创建
        HashMap<Integer, String> hashMap = new HashMap<>();

        // 2. 基本操作
        // 添加元素
        hashMap.put(2, "b");
        hashMap.put(1, "a");
        hashMap.put(4, "d");
        hashMap.put(3, "c");
        // 大小
        print(hashMap.size());
        print(hashMap.toString());  // 发现自带了key排序
        // 覆盖
        hashMap.put(4, "f");
        print(hashMap.toString());
        // 删除元素 传入参数为key / key & value
        hashMap.remove(2);
        print(hashMap.toString());
        hashMap.remove(3, "c");
        print(hashMap.toString());
        hashMap.remove(5);  // 不会报错
        // 是否存在
        print(hashMap.containsKey(2));
        print(hashMap.containsValue(2));
        // 是否为空
        print(hashMap.isEmpty());
        // 获取keys / values
        print(hashMap.keySet().toString());
        print(hashMap.values().toString());

        // 3. 遍历
        for (Object key : hashMap.keySet()) {
            print(key + hashMap.get(key));
        }
    }

    public static void main(String[] args) {
        // usingCollection();
        // usingList();
        usingHashMap();
    }
}
