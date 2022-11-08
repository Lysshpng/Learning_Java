// 结构型设计模式代码笔记

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Adapter
// 类适配器模式
// 栗子: 充电头 将220V转成5.2V
// 目标 Target
interface Target {
    int output5V();
}

// 适配者 Adaptee
class Adaptee {
    private int output = 220;

    public int output220V() {
        return output;
    }
}

// 适配器 Adapter
class Adapter extends Adaptee implements Target {

    @Override
    public int output5V() {
        // 获取需要处理的输入
        int input = output220V();
        // 适配处理
        int output = input / 44;
        // 得到适配后的输出
        System.out.println("in: " + input + " out: " + output);
        return output;
    }
}

// Adapter
// 对象适配器模式
// 栗子: 充电转换头 将220V/480V 转成 5V
interface Target_O {
    int output5V();
}

interface InAdaptee {
    int output();
}

// 适配者 Adaptee
class Adaptee_220 implements InAdaptee {
    private int output = 220;

    @Override
    public int output() {
        return output;
    }
}

class Adaptee_480 implements InAdaptee {
    private int output = 480;

    @Override
    public int output() {
        return output;
    }
}

// 适配器 Adapter
class Adapter_ implements Target {
    private InAdaptee inAadaptee;

    public Adapter_(InAdaptee inAadaptee) {
        this.inAadaptee = inAadaptee;
    }

    @Override
    public int output5V() {
        // 获取需要处理的输入
        int input = inAadaptee.output();
        int output = 0;
        // 适配处理
        if (input == 220) {
            output = input / 44;
        } else if (input == 480) {
            output = input / 96;
        }
        // 得到适配后的输出
        System.out.println("in: " + input + " out: " + output);
        return output;
    }
}

// Bridge
// 将形状和颜色分离开
// 形状
abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;     // 桥接
    }

    abstract void getShape();
}

// 具体形状
class Circle extends Shape {

    @Override
    void getShape() {
        this.color.setColor("Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void getShape() {
        this.color.setColor("Rectangle");
    }
}

// 颜色
interface Color {
    void setColor(String shape);
}

// 具体颜色
class Red implements Color {

    @Override
    public void setColor(String shape) {
        System.out.println(shape + ", setting color: Red");
    }
}

class Blue implements Color {

    @Override
    public void setColor(String shape) {
        System.out.println(shape + ", setting color: Blue");
    }
}

// Composite
// 透明方式
interface Component {
    // 声明了所有的方法
    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    void operation();
}

// 叶子
class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        // 叶子不需要这个操作
    }

    @Override
    public void remove(Component c) {
        // 叶子不需要这个操作
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("叶子" + name + "被访问");
    }
}

// 树枝
class Composite implements Component {
    // 存储和管理子对象
    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}

// Composite
// 安全方式
interface Component_safe {
    // 只声明一个通用方法
    void operation();
}

// 叶子
class Leaf_safe implements Component_safe {
    private String name;

    public Leaf_safe(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("叶子" + name + "被访问");
    }
}

// 树枝
class Composite_safe implements Component_safe {
    // 存储和管理子对象
    private ArrayList<Component_safe> children = new ArrayList<Component_safe>();

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component_safe) obj).operation();
        }
    }

    // 以下是树枝才需要的管理方法
    public void add(Component_safe c) {
        children.add(c);
    }

    public void remove(Component_safe c) {
        children.remove(c);
    }

    public Component_safe getChild(int i) {
        return children.get(i);
    }
}

// Decorator
// 手抓饼本饼4块, 多种配料用装饰模式加到饼上
abstract class Pancake {
    abstract int cost();
}

// 饼皮
class Pan extends Pancake {

    @Override
    int cost() {
        return 4;
    }
}

// 配料表 即装饰器
class Table extends Pancake {
    private Pancake pancake;

    Table(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    int cost() {
        return pancake.cost();
    }
}

// 具体的配料
class Egg extends Table {
    Egg(Pancake pancake) {
        super(pancake);
    }

    int cost() {
        // 加鸡蛋2块
        return super.cost() + 2;
    }
}

class Ham extends Table {
    Ham(Pancake pancake) {
        super(pancake);
    }

    int cost() {
        // 加火腿4块
        return super.cost() + 4;
    }
}

// Proxy
// 租房抽象接口
interface RentHouse {
    void rentHouse();
}

// 房东
class Owner implements RentHouse {

    @Override
    public void rentHouse() {
        System.out.println("房东将房出租");
    }
}

// 中介
class Proxy implements RentHouse {
    private RentHouse rentHouse;

    public Proxy(RentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }

    @Override
    public void rentHouse() {
        System.out.println("中介代租");
        rentHouse.rentHouse();
    }
}

// Flyweight
// 抽象享元
interface IFlyweight {
    void operation(String id);
}

// 具体享元
class ConcreteFlyweight implements IFlyweight {
    private String id;

    public ConcreteFlyweight(String id) {
        this.id = id;
    }

    @Override
    public void operation(String id) {

    }
}

// Flyweight Factory
class FlyweightFactory {
    private static Map<String, IFlyweight> factory = new HashMap<String, IFlyweight>();

    public static IFlyweight getFlyweight(String id) {
        if (!factory.containsKey(id)) {
            IFlyweight flyweight = new ConcreteFlyweight(id);
            factory.put(id, flyweight);
        }
        return factory.get(id);
    }
}

// Facade
// 有很多个小系统subSystem, 用一个外观类封装起来
class SubSystem_1 {
    void doSth() {
        System.out.println("subSystem_1");
    }
}

class SubSystem_2 {
    void doSth() {
        System.out.println("subSystem_2");
    }
}

class SubSystem_3 {
    void doSth() {
        System.out.println("subSystem_3");
    }
}

// 外观类
class Facade {
    SubSystem_1 subSystem_1 = new SubSystem_1();
    SubSystem_2 subSystem_2 = new SubSystem_2();
    SubSystem_3 subSystem_3 = new SubSystem_3();

    void facade() {
        subSystem_1.doSth();
        subSystem_2.doSth();
        subSystem_3.doSth();
    }
}

public class LearningNotes1109_2 {
    public static void main(String[] args) {
        // 结构型设计模式代码笔记

        // Adapter
        // 类适配器
        System.out.println("====== Adapter");
        Target target = new Adapter();
        target.output5V();
        // 对象适配器
        InAdaptee adaptee_220 = new Adaptee_220();
        Target target1 = new Adapter_(adaptee_220);
        target1.output5V();
        InAdaptee adaptee_480 = new Adaptee_480();
        target1 = new Adapter_(adaptee_480);
        target1.output5V();

        // Bridge
        System.out.println("====== Bridge");
        Shape shape = new Circle();
        Color color = new Red();
        shape.setColor(color);
        shape.getShape();

        // Composite
        System.out.println("====== Composite");
        // 透明方式
        Component root = new Composite();
        Component right = new Composite();
        Leaf leaf_1 = new Leaf("1");
        Leaf leaf_2 = new Leaf("2");
        Leaf leaf_3 = new Leaf("3");
        root.add(leaf_1);
        root.add(right);
        right.add(leaf_2);
        right.add(leaf_3);
        root.operation();
        right.operation();
        right.getChild(1);
        // 安全方式 需要区分树枝和叶子
        Composite_safe root_safe = new Composite_safe();
        Composite_safe left_safe = new Composite_safe();
        Leaf_safe leaf_safe_1 = new Leaf_safe("1");
        Leaf_safe leaf_safe_2 = new Leaf_safe("2");
        Leaf_safe leaf_safe_3 = new Leaf_safe("3");
        root_safe.add(left_safe);
        root_safe.add(leaf_safe_1);
        left_safe.add(leaf_safe_2);
        left_safe.add(leaf_safe_3);
        root_safe.operation();
        left_safe.operation();
        root_safe.remove(leaf_safe_1);
        root_safe.operation();

        // Decorator
        System.out.println("====== Decorator");
        Pancake pancake = new Pan();
        Egg egg = new Egg(pancake);
        System.out.println("加蛋多少钱？！ " + egg.cost());
        Ham ham = new Ham(egg);
        System.out.println("加蛋加火腿多少钱？！" + ham.cost());
        // 还可以继续加蛋/培根/其他配料

        // Proxy
        System.out.println("====== Proxy");
        // 定义租房, 房子是房东的
        RentHouse rentHouse = new Owner();
        // 找中介
        Proxy proxy = new Proxy(rentHouse);
        // 由中介代租
        proxy.rentHouse();

        // Flyweight
        System.out.println("====== Flyweight");
        IFlyweight flyweight_1 = FlyweightFactory.getFlyweight("1");
        IFlyweight flyweight_2 = FlyweightFactory.getFlyweight("2");
        IFlyweight flyweight_3 = FlyweightFactory.getFlyweight("1");
        System.out.println(flyweight_2.hashCode() + " " + flyweight_1.hashCode() + " " + flyweight_3.hashCode());
        // 1和3的hashCode相同，说明是同一个

        // Facade
        System.out.println("====== Facade");
        Facade facade = new Facade();
        facade.facade();

    }
}
