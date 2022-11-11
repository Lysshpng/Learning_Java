// 行为型设计模式代码笔记

import java.security.Principal;
import java.util.*;
import java.util.stream.StreamSupport;

// Visitor
// 两个农场主合伙经营一个综合农场, 农场有动物和蔬菜两种产品, 农场主A只关注产品的数量, B则关注产品的质量
// Visitor
interface Farmer {
    void visit(Cow cow);

    void visit(Pig pig);
}

// 具体访问 农场主A
class Farmer_A implements Farmer {
    // 农场主A只关注产品的数量
    @Override
    public void visit(Cow cow) {
        System.out.println("Farmer_A visits number: " + cow.getNum());
    }

    @Override
    public void visit(Pig pig) {
        System.out.println("Farmer_A visits number: " + pig.getNum());
    }
}

// 具体访问 农场主B
class Farmer_B implements Farmer {
    // 农场主B关注产品的质量
    @Override
    public void visit(Cow cow) {
        System.out.println("Farmer_B visits quality: " + cow.getQuality());
    }

    @Override
    public void visit(Pig pig) {
        System.out.println("Farmer_B visits quality: " + pig.getQuality());
    }
}

// 抽象元素
interface VAnimal {
    void accept(Farmer farmer);
}

// 具体元素 牛
class Cow implements VAnimal {

    private String quality = "Good";
    private int num = 10;

    @Override
    public void accept(Farmer farmer) {
        farmer.visit(this);
    }

    String getQuality() {
        return "Cows -- " + this.quality;
    }

    String getNum() {
        return "Cows -- " + this.num;
    }

}

// 具体元素 猪
class Pig implements VAnimal {

    private String quality = "Best";
    private int num = 20;

    @Override
    public void accept(Farmer farmer) {
        farmer.visit(this);
    }

    String getQuality() {
        return "Pigs -- " + this.quality;
    }

    String getNum() {
        return "Pigs -- " + this.num;
    }
}

// 对象结构类
// 维护一份具体元素集合, 提供一个添加元素和一个访问全部具体元素的方法
class VAnimalManager {
    List<VAnimal> list = new ArrayList<>();

    // 增加元素
    VAnimalManager add(VAnimal vAnimal) {
        list.add(vAnimal);
        return this;
    }

    // 访问全部元素
    void visitAll(Farmer farmer) {
        list.forEach(vAnimal -> {
            vAnimal.accept(farmer);
        });
    }
}

// Template
// 抽象父类
abstract class Game {
    abstract void initialize();

    abstract void start();

    abstract void end();

    // 模板 为防止恶意操作, 一般模板方法都加上final关键词
    public final void playGame() {
        initialize();
        start();
        end();
    }
}

class Game_1 extends Game {

    @Override
    void initialize() {
        System.out.println("initialize Game_1");
    }

    @Override
    void start() {
        System.out.println("start play Game_1");
    }

    @Override
    void end() {
        System.out.println("end play Game_1");
    }
}

class Game_2 extends Game {

    @Override
    void initialize() {
        System.out.println("initialize Game_2");
    }

    @Override
    void start() {
        System.out.println("start play Game_2");
    }

    @Override
    void end() {
        System.out.println("end play Game_2");
    }
}

// Strategy
// 将各种运算符的计算都归并到对应具体策略, 根据具体的运算要求选择对应的计算策略
// 抽象策略
interface Calculate {
    int cal(int a, int b);
}

// 具体策略
class Add implements Calculate {

    @Override
    public int cal(int a, int b) {
        return a + b;
    }
}

class Sub implements Calculate {

    @Override
    public int cal(int a, int b) {
        return a - b;
    }
}

class Mul implements Calculate {

    @Override
    public int cal(int a, int b) {
        return a * b;
    }
}

// 上下文
class Context {
    private Calculate calculate;

    // 接受一个策略选择
    public Context(Calculate calculate) {
        this.calculate = calculate;
    }

    // 交由具体策略实现
    public int cal(int a, int b) {
        return this.calculate.cal(a, b);
    }
}

// State
// 计算 a + b - c - d 的式子, 根据不同的符号(状态)的操作是不同的
// 抽象状态
interface Symbol {
    int calculate(int a, int b);
}

// Context
class SymbolManager {
    private Symbol symbol;

    void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    int calculate(int a, int b) {
        return symbol.calculate(a, b);
    }
}

// 具体状态
class Add_s implements Symbol {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Sub_s implements Symbol {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

// Observer
// 观察者是天气软件, 被观察者是天气情况, 天气情况变化 -- 天气软件的信息也要自动变化
// 抽象主题
interface Weather {
    // 管理观察者
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    // 通知观察者
    void notifyObserver();
}

class ConcreteWeather implements Weather {
    // 维护一组观察自己的观察者
    private List<Observer> observers = new ArrayList<>();

    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        // 通知更新
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> {
            observer.update(this.temperature);
        });
    }
}

// 抽象观察者
interface Observer {
    // 收到天气情况变化的通知时更新自己的信息
    void update(float temperature);
}

// 百度
class Baidu implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        System.out.println("Baidu -- " + this.temperature);
    }
}

// 新浪
class Sina implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        System.out.println("Sina -- " + this.temperature);
    }
}

// Memento
// 备忘录 Memento
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

// 发起人
class Originator {
    // 内部状态
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    // 创建一个备忘录 记录当前状态
    public Memento newMemento() {
        return new Memento(this.state);
    }

    // 从备忘录恢复
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}

// 负责人
class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void storeMemento(Memento memento) {
        this.memento = memento;
    }
}

// Mediator
// 一个聊天软件实现了许多用户的互相通信(这里的例子是多个对象之间的中介者模式)
// 抽象中介
interface Mediator {
    void sendMsg(User user, String user_name, String msg);
}

// 具体中介
class APP implements Mediator {

    // 中介需要管理所有的用户
    private User_A user_1;
    private User_A user_2;
    private User_B user_3;

    public void setUser_1(User_A user_1) {
        this.user_1 = user_1;
    }

    public void setUser_2(User_A user_2) {
        this.user_2 = user_2;
    }

    public void setUser_3(User_B user_3) {
        this.user_3 = user_3;
    }

    @Override
    public void sendMsg(User user, String user_name, String msg) {
        if (user_1.getName() == user_name) {
            user_1.getMsg(user, msg);
        } else {
            user_2.getMsg(user, msg);
        }
    }
}

// 抽象同事
abstract class User {
    protected String name;
    protected Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }
}

// 具体同事
class User_A extends User {

    public User_A(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void sendMsg(String name, String msg) {
        mediator.sendMsg(this, name, msg);
    }

    public void getMsg(User user, String msg) {
        System.out.println(this.getName() + ": " + user.getName() + " send me a msg: " + msg);
    }
}

class User_B extends User {

    public User_B(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void sendMsg(String name, String msg) {
        mediator.sendMsg(this, name, msg);
    }

    public void getMsg(User user, String msg) {
        System.out.println(this.getName() + ": " + user.getName() + " send me a msg: " + msg);
    }
}

// Interpreter
// 解析数学计算式
// 抽象表达式
interface Expression {
    // 表达式表示为 a + b - c + d 的形式, map中的String就是abcd, int就是具体数字
    int interpreter(Map<String, Integer> map);
}

// 具体表达式 -- 变量解析器
class ValueExpression implements Expression {

    private String key;

    public ValueExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return map.get(key);
    }
}

// 具体表达式 -- 运算符解析器 这里只写加减做示例
class SymbolExpression implements Expression {
    // 运算符的解析就是左边的表达式与右边的表达式运算
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        // 这里不实现这个方法是因为应该由具体的运算符去操作
        return 0;
    }
}

// 加法
class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        // 左右两边分别解析
        return left.interpreter(map) + right.interpreter(map);
    }
}

// 减法
class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        // 左右两边分别解析
        return left.interpreter(map) - right.interpreter(map);
    }
}

// Context
class Calculator {
    private Expression expression;
    public Calculator(String expression) {
        // 将表达式已经解析完成了
        char[] charArr = expression.toCharArray();
        Stack<Expression> stack = new Stack<>();
        Expression left;
        Expression right;
        // 开始解析
        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case '+' -> {
                    left = stack.pop();
                    right = new ValueExpression(String.valueOf(charArr[++i]));
                    stack.push(new AddExpression(left, right));
                }
                case '-' -> {
                    left = stack.pop();
                    right = new ValueExpression(String.valueOf(charArr[++i]));
                    stack.push(new SubExpression(left, right));
                }
                default -> stack.push(new ValueExpression(String.valueOf(charArr[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int calculate(Map<String, Integer> map) {
        return this.expression.interpreter(map);
    }
}

// Command
// 遥控器控制电视 有开、换台、关的命令/请求
// 抽象命令
interface Command{
    void execute();
}

// 具体命令
class Open implements Command{

    private TV tv = new TV();
    @Override
    public void execute() {
        tv.open();
    }
}

class Change implements Command{

    private TV tv = new TV();
    @Override
    public void execute() {
        tv.change();
    }
}

class Close implements Command{

    private TV tv = new TV();
    @Override
    public void execute() {
        tv.close();
    }
}

// 接收者
class TV{
    void open(){
        System.out.println("TV is opening.");
    }

    void change(){
        System.out.println("TV is changing.");
    }

    void close(){
        System.out.println("TV is closing.");
    }
}

// 请求者 遥控器 因为是遥控器发出的命令
class Controller{
    // 可以持有很多个命令
    public List<Command> commands = new ArrayList<>();

    public Controller(Command command){
        this.commands.add(command);
    }

    public Controller(List<Command> commands){
        this.commands.addAll(commands);
    }

    public void executeCommands(){
        commands.forEach(e -> e.execute());
    }
}

// Chain of Responsibility
abstract class Handler{
    private Handler next;
    public void setNext(Handler next){
        this.next = next;
    }
    public Handler getNext(){
        return this.next;
    }
    abstract void handleRequest(String request);
}

class Handler_1 extends Handler{
    @Override
    void handleRequest(String request) {
        if(request.equals("1")){
            System.out.println("handler 1 handling.");
        }else{
            // 给下一个处理
            if(getNext() != null){
                getNext().handleRequest(request);
            }else{
                System.out.println("no one can handle.");
            }
        }
    }
}

class Handler_2 extends Handler{

    @Override
    void handleRequest(String request) {
        if(request.equals("2")){
            System.out.println("handler 2 handling.");
        }else{
            // 给下一个处理
            if(getNext() != null){
                getNext().handleRequest(request);
            }else{
                System.out.println("no one can handle.");
            }
        }
    }
}




public class LearningNotes1109_3 {
    public static void main(String[] args) {
        // 行为型设计模式代码笔记

        // Visitor
        System.out.println("====== Visitor");
        VAnimal cow = new Cow();
        VAnimal pig = new Pig();
        cow.accept(new Farmer_A());
        cow.accept(new Farmer_B());
        System.out.println("--");
        // 使用对象结构管理
        VAnimalManager vAnimalManager = new VAnimalManager();
        vAnimalManager.add(cow).add(pig);
        vAnimalManager.visitAll(new Farmer_A());
        System.out.println("--");
        vAnimalManager.visitAll(new Farmer_B());

        // Template
        System.out.println("====== Template");
        Game game = new Game_1();
        game.playGame();

        // Strategy
        System.out.println("====== Strategy");
        Calculate calculate = new Sub();
        Context context = new Context(calculate);
        System.out.println(context.cal(5, 2));

        // State
        System.out.println("====== State");
        SymbolManager symbolManager = new SymbolManager();
        // 4 + 7 - 6 - 8
        Symbol add = new Add_s();
        symbolManager.setSymbol(add);
        int result = symbolManager.calculate(4, 7);
        System.out.println(result);
        Symbol sub = new Sub_s();
        symbolManager.setSymbol(sub);
        result = symbolManager.calculate(result, 6);
        System.out.println(result);
        result = symbolManager.calculate(result, 8);
        System.out.println(result);

        // Observer
        System.out.println("====== Observer");
        ConcreteWeather weather = new ConcreteWeather();
        Observer baidu = new Baidu();
        Observer sina = new Sina();
        weather.addObserver(baidu);
        weather.addObserver(sina);
        weather.setTemperature((float) 29.7);
        weather.setTemperature((float) 27.5);

        // Memento
        System.out.println("====== Memento");
        Originator originator = new Originator();
        originator.setState("State 1");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.storeMemento(originator.newMemento());
        originator.setState("State 2");
        System.out.println(originator.getState());
        originator.restoreFromMemento(caretaker.getMemento());
        System.out.println(originator.getState());

        // Mediator
        System.out.println("====== Mediator");
        APP app = new APP();
        User_A user_1 = new User_A("user_1", app);
        User_A user_2 = new User_A("user_2", app);
        User_B user_3 = new User_B("user_3", app);
        app.setUser_1(user_1);
        app.setUser_2(user_2);
        user_2.sendMsg("user_1", "Hello, Can you receive my msg?!");
        user_1.sendMsg("user_2", "Yes, I can.");
        user_3.sendMsg("user_2", "Hey, I am online, too.");

        // Iterator
        // System.out.println("====== Iterator");
        // 不是很想写 就是手动实现遍历 关键点在于next的函数

        // Interpreter
        System.out.println("====== Interpreter");
        String expression = "a+b-c-d";
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 8);
        map.put("c", 4);
        map.put("d", 3);
        Calculator calculator = new Calculator(expression);
        System.out.println(calculator.calculate(map));

        // Command
        System.out.println("====== Command");
        Command open = new Open();
        Command change = new Change();
        Command close = new Close();
        List list = new ArrayList<>();
        list.add(open);
        list.add(change);
        list.add(close);
        Controller controller = new Controller(list);
        controller.executeCommands();

        // Chain of Responsibility
        System.out.println("====== Chain of Responsibility");
        Handler handler_1 = new Handler_1();
        Handler handler_2 = new Handler_2();
        handler_1.setNext(handler_2);
        handler_1.handleRequest("2");
        handler_1.handleRequest("3");

    }
}
