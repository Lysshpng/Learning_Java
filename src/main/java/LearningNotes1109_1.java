// 结构型设计模式代码笔记

// -- Singleton
// LazySingleton
class LazySingleton {
    private static LazySingleton lazySingleton = null;  // 只能存在这一个实例

    private LazySingleton() {
    }   // 避免被外部类随意new对象

    public static LazySingleton getInstance() {
        // 对外提供的获取该唯一实例的方法
        // 第一次访问getInstance方法发现没有实例才实例化
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

// HungrySingleton
class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();  // 只能存在这一个实例, 饿汉式是先实例好

    private HungrySingleton() {
    }   // 避免被外部类随意new对象

    public static HungrySingleton getInstance() {
        // 对外提供的获取该唯一实例的方法
        return hungrySingleton;
    }
}

// Factory Method
abstract class Factory {
    // 抽象工厂类, 具体工厂的父类
    public abstract <T> T createProduct(Class<T> tClass);
}

class CFactory extends Factory {

    @Override
    public <T> T createProduct(Class<T> tClass) {
        Product product = null;
        try {
            // 生产具体产品
            // 通过反射创建实例
            product = (Product) Class.forName(tClass.getName()).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}

abstract class Product {
    // 抽象产品类, 所有具体产品的父类
    public abstract void method();
}

class Product_1 extends Product {

    @Override
    public void method() {
        System.out.println("Producing a product_1.");
    }
}

class Product_2 extends Product {

    @Override
    public void method() {
        System.out.println("Producing a product_2.");
    }
}

// Abstract Factory
interface Farm {
    // 抽象工厂模式的抽象工厂接口
    // 有两个生产产品的方法 代表每个工厂可以生产动物和蔬菜2种产品
    Animal newAnimal();

    Vegetable newVegetable();
}

// 抽象产品类1
interface Animal {
    void create();
}

// 抽象产品类2
interface Vegetable {
    public void create();
}

// 具体工厂1
class Farm_1 implements Farm {

    @Override
    public Animal newAnimal() {
        System.out.println("Farm_1 new Animal_1");
        return new Animal_1();
    }

    @Override
    public Vegetable newVegetable() {
        System.out.println("Farm_1 new Vegetable_1");
        return new Vegetable_1();
    }
}

// 具体工厂1
class Farm_2 implements Farm {

    @Override
    public Animal newAnimal() {
        System.out.println("Farm_2 new Animal_2");
        return new Animal_2();
    }

    @Override
    public Vegetable newVegetable() {
        System.out.println("Farm_2 new Vegetable_2");
        return new Vegetable_2();
    }
}

// 具体产品1
class Animal_1 implements Animal {

    @Override
    public void create() {
        // System.out.println("creating Animal_1.");
    }
}

// 具体产品2
class Animal_2 implements Animal {

    @Override
    public void create() {
        // System.out.println("creating Animal_2.");
    }
}

// 具体产品3
class Vegetable_1 implements Vegetable {

    @Override
    public void create() {
        // System.out.println("creating Vegetable_1.");
    }
}

// 具体产品4
class Vegetable_2 implements Vegetable {

    @Override
    public void create() {
        // System.out.println("creating Vegetable_2.");
    }
}

// Builder
// 产品类
class BProduct {
    private String name;
    private String property_1;
    private String property_2;
    private String property_3;

    void setName(String name) {
        this.name = name;
    }

    void setPro_1(String pro_1) {
        this.property_1 = pro_1;
    }

    void setPro_2(String pro_2) {
        this.property_2 = pro_2;
    }

    void setPro_3(String pro_3) {
        this.property_3 = pro_3;
    }

    public void _toString() {
        String s = "BProduct: " + name + " " + property_1 + " " + property_2 + " " + property_3;
        System.out.println(s);
    }
}

// 抽象Builder
abstract class Builder {
    abstract BProduct build();
}

// 具体Builder
class ConcreteBuilder extends Builder {
    private final BProduct bProduct = new BProduct();

    public ConcreteBuilder setName(String name) {
        bProduct.setName(name);
        return this;
    }

    public ConcreteBuilder setPro_1(String pro_1) {
        bProduct.setPro_1(pro_1);
        return this;
    }

    public ConcreteBuilder setPro_2(String pro_2) {
        bProduct.setPro_2(pro_2);
        return this;
    }

    public ConcreteBuilder setPro_3(String pro_3) {
        bProduct.setPro_3(pro_3);
        return this;
    }

    @Override
    BProduct build() {
        return bProduct;
    }
}

// Prototype
class Prototype implements Cloneable {
    private int id;
    private String name;

    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void _ToString() {
        System.out.println(id + " " + name);
    }
}


public class LearningNotes1109_1 {
    // 结构型设计模式代码笔记
    public static void main(String[] args) {
        // Singleton
        System.out.println("====== Singleton");
        LazySingleton lazySingleton_1 = LazySingleton.getInstance();
        LazySingleton lazySingleton_2 = LazySingleton.getInstance();
        System.out.println(lazySingleton_1 == lazySingleton_2);

        // Factory Method
        System.out.println("====== Factory Method");
        Factory factory = new CFactory();
        // 所以只需要知道要的产品的类即可, 具体地实例化让工厂去生产
        Product product_1 = factory.createProduct(Product_1.class);
        product_1.method();
        Product product_2 = factory.createProduct(Product_2.class);
        product_2.method();

        // Abstract Factory
        System.out.println("====== Abstract Factory");
        Farm farm = new Farm_1();
        Animal animal = farm.newAnimal();
        Farm farm_1 = new Farm_2();
        Vegetable vegetable = farm_1.newVegetable();

        // Builder
        System.out.println("====== Builder");
        Builder builder_1 = new ConcreteBuilder().setName("builder_test_1").setPro_1("pro_1");
        BProduct bProduct_1 = builder_1.build();
        bProduct_1._toString();
        Builder builder_2 = new ConcreteBuilder().setName("builder_test_2").setPro_2("pro_2").setPro_3("pro_3");
        BProduct bProduct_2 = builder_2.build();
        bProduct_2._toString();

        // Prototype
        System.out.println("====== Prototype");
        Prototype prototype = new Prototype();
        prototype.setId(1);
        prototype.setName("prototype");
        Prototype copy = (Prototype) prototype.clone();
        System.out.println("hashCode: " + prototype.hashCode() + " " + copy.hashCode());   // 两者hashcode不一样, 说明是深拷贝
        prototype._ToString();
        copy._ToString();
        System.out.println("-- changing copy");
        copy.setId(3);
        copy.setName("copy");
        prototype._ToString();
        copy._ToString();   // copy的修改不影响prototype, 也说明是深拷贝

    }

}
