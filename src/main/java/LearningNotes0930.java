import static java.lang.String.valueOf;

public class LearningNotes0930 {

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        // e.g. Integer类
        Integer x = 5;
        x = x + 10;
        print(x);

        // e.g. Boolean类
        Boolean bool = true;
        boolean b = (x == 5);
        print(bool);
        print(b);

        // Math类
        print(Math.PI);
        print(Math.sin(Math.PI / 2));

        // Number & Math 类方法
        print(Math.max(1, 8));
        print(Math.log10(100));
        // floor - 下取整, round - 四舍五入, ceil - 上取整
        print(Math.floor(1.4));
        print(Math.round(1.4));
        print(Math.ceil(1.4));

        print(Math.floor(1.5));
        print(Math.round(1.5));
        print(Math.ceil(1.5));

        print(valueOf("123q"));
        Integer a = 5;  // int 不行
        print(a.compareTo(3));
        print(a.toString());
        print(a.equals(3));

        Integer c = Integer.valueOf("123");
        Integer d = Integer.valueOf("123", 16);
        Float e = Float.valueOf("123");
        Double f = Double.valueOf("123");

        // String 类
        String s = "hello";
        String s2 = new String("HellO");
        print(s.isEmpty());
        print(s.length());
        print(s2.length());

        print(s.charAt(2));
        // print(s.charAt(6));  // 会报错

        print(s.compareTo(s2));
        print(s.compareToIgnoreCase(s2));

        print(s.endsWith("123"));
        print(s2.endsWith("lO"));

        print(s.indexOf('l'));
        print(s.indexOf('l', 3));

        print(s.concat(s2));

        print(s2.toLowerCase());
        print(s2.contains("p"));
        print(s2.replace('l', 'p'));

    }
}
