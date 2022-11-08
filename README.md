# Learning_Java
Write down by Lysshpng.

## 持续学习更新中..

[//]: # (TODO List)

[//]: # (- [ ] 编写servlet, filter)

[//]: # (https://www.runoob.com/servlet/servlet-environment-setup.html)

[//]: # (- [ ] 搭建一个springmvc工程)

[//]: # (https://blog.csdn.net/wodeID123/article/details/124910315)
[//]: # (https://www.cnblogs.com/cfas/p/16168634.html)
[//]: # (https://blog.csdn.net/friggly/article/details/123888590)

# (TODO List)
- [ ] 红黑树
- [ ] 配置xml

## ~22.11.09 设计模式、设计原则、UML图
1. 设计模式 [Ref 1](https://blog.csdn.net/wt5264/article/details/114024599), [Ref 2](https://blog.csdn.net/qq_52211542/article/details/125648622)
> (1) 采用设计模式是为了更简单方便地对成果的设计和代码体系结构进行复用; 共有23类, 可以分为三种类型:  
> (2) 创建型模式, 指的是用于创建对象的模式, 解耦对象实例化的过程, 为创建类和对象提供指南, 包括: 单例模式、工厂方法'、抽象工厂'、建造者'和原型模式;  
> (2) 结构型模式, 处理类和对象的组合问题, 为让类和对象形成更大的体系结构提供知道, 包括: 适配器模式、桥接'、组合'、装饰'、外观'、享元'以及代理模式;  
> (3) 行为型模式, 描述类或对象的交互以及职责分配的问题, 包括: 访问者模式、模板'、策略'、状态'、观察者'、备忘录'、中介者'、迭代器'、解释器'、命令'以及责任链模式。

2. 六大设计原则 
[Ref 1](https://blog.csdn.net/ttxs99989/article/details/81844135), 
[Ref 2](https://blog.csdn.net/weixin_46053707/article/details/121923552), 
[Ref 3](https://zhuanlan.zhihu.com/p/110130347),
[Ref 4(系列漫画)](https://mp.weixin.qq.com/s/yDiIZW3TQENLOFmzYH7NOw)
> (1) **单一职责原则**(Single Responsibility Principle, SRP)是实现高内聚低耦合的指导方针, 简单来说就是一个类只做一件事, 对这个类来说应该只有一个能引起它变化的原因;  
> (2) **开闭原则**(Open Closed Principle, OCP)指的是对拓展开放、对修改关闭, 关键是需要对系统进行抽象化设计;  
> (3) **里氏替换原则**(Liskov Substitution Principle, LSP), 所有引用父类的地方必须能透明地使用其子类的对象, 子类必须完全实现父类的方法, 子类可以有自己的属性和方法(举个栗子, 我喜欢动物, 那我一定也喜欢猫, 但反过来不成立);  
> &emsp;&emsp;里氏替换原则是实现开闭原则的重要方式之一, 要求在程序中尽量使用父类对对象进行定义, 而在运行时再确定其子类类型,用子类对象替换父类对象;  
> (4) **迪米特法则**(Law of Demeter, LoD), 也叫最少知识原则(Least Knowledge Principle, LKP), Only talk to your immediate friends;  
> &emsp;&emsp;对象之间应该使用尽可能少的方法关联, 一个类只需要知道另一个要耦合和调用的类的尽可能少的public的方法, 不需要知道其内部如何复杂;  
> (5) **接口隔离原则**(Interface Segregation Principle, ISP), 使用多个专门的接口比使用一个复杂的总接口好, 每个接口承担一种相对独立的角色/职责(SRP), 接口的使用方仅需要知道其功能和这个功能的方法即可;  
> (6) **依赖倒置原则**(Dependence Inversion Principle, DIP), 高层模块不依赖低层', 高低层模块都应该又依赖于抽象, 抽象(抽象类/接口)不依赖细节(实现类)而细节依赖于抽象, 总结成一句话就是"面向接口编程";  
> (7) 六大原则的首字母联合起来是SOLID, 代表着将这六大原则使用好可以建立稳定、鲁棒的设计。

3. UML图 [Reference](https://blog.csdn.net/qq_35423190/article/details/125069834)
> 泛化(继承)、实现(接口和类)、关联、聚合(部分可以离开整体单独存在)、组合(部分不能离开整体单独存在)、依赖;  
> 类名、类属性、类操作(方法)、<\<interface>>;  
> public - +, private - -, protected - #;

4. [创建型模式代码笔记](src/main/java/LearningNotes1109_1.java)  
创建型模式_单例模式 [Reference](https://blog.csdn.net/GJ_007/article/details/123874405)
> (1) Singleton, 一个类只能有一个实例并且由单例类自行创建, 提供一个全局的访问点;  
> (2) 一般地, 普通类的构造方法是public, 所以外部类可以new多个实例; 为了实现唯一实例, 单例类将构造方法设为private, 在类内定义一个private static的实例, 并向外提供一个public static的方法获取该实例;  
> (3) 懒汉式: 只有在第一次调用getInstance方法时才创建单例; 饿汉式: 在类创建的同时就实例化共系统使用。

创建型模式_工厂方法 [Ref 1](https://baijiahao.baidu.com/s?id=1730951464404518976&wfr=spider&for=pc), [Ref 2](https://blog.csdn.net/threelifeadv/article/details/107736738)
> (1) Factory Method, 定义一个创建对象的接口，让子类决定实例化哪个类;  
> (2) 工厂模式一般包含四个角色: 抽象工厂类, 一个具体工厂类(生产多种具体产品), 抽象产品类(所有具体工厂的具体产品的父类), 具体产品类。

创建型模式_抽象工厂 [Reference](https://zhuanlan.zhihu.com/p/443482691)
> (1) Abstract Factory, "工厂的工厂", 提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类; 
> (2) 也是由抽象工厂、具体工厂、抽象产品和具体产品等4个要素构成; 但是抽象工厂中有多个createProduct方法用于对应具体工厂生产的具体产品, 每个具体工厂可以产生多种综合产品, 每个具体工厂生产的具体产品可以划分为同等级;  
> (3) 思考：那这样是不是要每个工厂都能生产等数量种产品才行？！而且如果想加一个种类的具体产品, 所有的具体工厂都要生产它？！

创建型模式_建造者模式 [Ref 1](https://zhuanlan.zhihu.com/p/371248124), [Ref 2](https://blog.csdn.net/Liuxiangming1314/article/details/124339614)
> (1) Builder, 将一个复杂对象的构建过程与它的实现表示分离, 使得同样的构建过程可以创建不同的表示; 适用于创建对象需要很多步骤, 但是步骤的顺序不一定固定的场景;  
> (2) 有4个角色: Product产品类, 即多个模块组成的复杂对象, 由具体Builder创建各个模块; 抽象Builder类, 规范化各个模板的建造; 具体Builder类, 根据不同的需求完成具体产品各个模块的创建; Director调用类, 确定具体产品需要有哪些模块, 一般可以不用;  
> (3) 思考：如果一个产品突然想加一个模块, 那么产品类和对应的具体Builder类都要修改了。

创建型模式_原型模式 [Ref 1](https://baijiahao.baidu.com/s?id=1730786729971289111), [Ref 2](https://zhuanlan.zhihu.com/p/361427058), [Ref 3](https://blog.csdn.net/weixin_56219549/article/details/122743954)
> (1) Prototype, 直接通过复制现有的实例、再修改为生产需要的实例来创建新的实例;  
> (2) 两个角色: 抽象原型类, 声明了clone方法; 具体原型类, 实现或重写clone方法; 一般来说Object类是所有类的父类且Object类里就有clone方法, 所以具体的原型类可以直接实现Cloneable接口来达到目的;  
> (3) 原型模式有两种实现方式: 浅拷贝 -- 两个对象的引用类型的变量都指向同一个地址, 你变我也变, 实现方式: 默认的clone方法; 深拷贝 -- 完全复制到新对象, 引用类型的变量就重新申请空间, 两个对象互不影响, 实现方式: 重写clone方法实现或继承Cloneable接口并实现clone方法(推荐);

5. [结构型模式代码笔记](src/main/java/LearningNotes1109_2.java)  
结构型模式_适配器模式 [Ref 1](https://www.cnblogs.com/mingmingcome/p/9810731.html), [Ref 2](https://blog.csdn.net/qq_38785977/article/details/125581096)
> (1) Adapter, 将一个类的接口转换成客户希望的另外一个接口, 使原本由于接口不兼容而不能一起工作的类可以一起工作;  
> (2) 三个角色：客户端需要一个target(目标)接口, 但是不能直接重用已经存在的adaptee(适配者)类, 因为它的接口和target接口不一致, 所以需要adapter(适配器)将adaptee转换为target接口; 前提是target接口和已存在的适配者adaptee类所做的事情是相同或相似, 只是接口不同且都不易修改;  
> (3) 适配器模式有三类: 类适配器, 在编译时实现target接口及继承Adaptee类; 对象适配器, 将多个Adaptee抽象成一个通用Adaptee然后再只用一个Adapter适配, 而不是每个Adaptee都要写一个Adapter; 缺省适配器(默认适配器/接口适配器), 。

结构型模式_桥接模式 [Reference](https://www.cnblogs.com/WindSun/p/10260547.html)
> (1) Bridge, 将抽象部分与其实现部分分离, 使它们都可以独立地变化; 举个栗子: 分为形状和颜色两个维度独立变化;  
> (2) 用组合关系代替继承关系来实现, 使一个类不必拥有所有的状态和行为; 将多个会变化的维度拆分开独立变化, 避免类的爆炸增长, 将m*n个实现类转换为m+n个实现类;  
> (3) 涉及到的角色: 抽象类(形状) -- 内部持有一个实现类对象, 扩充抽象类(具体形状), 实现类接口(颜色), 具体实现类(具体颜色); 又叫“柄体”模式或接口模式。

结构型模式_组合模式 [Reference](https://zhuanlan.zhihu.com/p/444784138)
> (1) Composite, 将对象组合成树形结构以表示“部分-整体“的层次结构, 树里面包含了组合以及个别的对象; 能把相同的操作应用在组合和个别对象上, 即可以忽略对象组合和个别对象之问的差别;  
> (2) 三部分组成: Component, 抽象类Leaf, 树枝Composite;  
> (3) 组合模式有两种方式: 透明方式 -- Component声明了所有子类的全部方法, Client无需区分叶子和树枝对象, 因而树对Client是透明的; 安全方式 -- 只在树枝中有对子对象的管理; 

结构型模式_装饰模式 [Reference](https://blog.csdn.net/lena7/article/details/116354866)
> (1) Decorator, 动态地为一个对象增加新的功能, 而不是创建一个继承子类;  
> (2) 角色: Component, 具体对象ConcreteComponent, 装饰器Decorator -- 内部持有一个Component对象, 具体装饰器ConcreteDecorator -- 具体的要给对象添加的功能;

结构型模式_代理模式 [Ref 1](https://blog.csdn.net/weixin_43953283/article/details/125783249), [Ref 2](https://zhuanlan.zhihu.com/p/102420731)
> (1) Proxy, 为其他对象提供一个代理以控制对这个对象的访问(举个栗子: 房屋中介内部持有一个房源并代出租);  
> (2) 与适配器的区别: 适配器是要修改所考虑对象的接口, 代理模式不能改变; 与装饰模式的区别: 装饰器是为了增加功能, 代理是为了对现有功能加以控制;  
> (3) 代理模式有动态代理(反射机制)和静态代理两种。

结构型模式_享元模式 [Reference](https://blog.csdn.net/Liuxiangming1314/article/details/124424100)
> (1) Flyweight, 运用共享技术有效地支持大量细粒度的相似的对象, 提供了减少对象数量(重用)从而改善应用所需的对象结构的方式;  
> (2) 角色: 抽象享元, 具体享元, 非享元, 享元工厂 -- 负责创建和管理享元角色。

结构型模式_外观模式 [Reference](https://zhuanlan.zhihu.com/p/421998619)
> (1) Facade, 为子系统中的一组接口提供一个一致的界面, Facade模式定义了一个高层接口, 这个接口使得子系统更加容易使用;  
> (2) 有三部分: 一个繁杂的子系统, 一个外观模式, 一个客户。

6. 行为型模式代码笔记
行为型模式_

行为型模式_

行为型模式_

行为型模式_

行为型模式_

行为型模式_

行为型模式_

行为型模式_

行为型模式_

行为型模式_

行为型模式_


## ～22.10.23 线程相关
[代码笔记](src/main/java/LearningNotes1030.java)
1. 进程与线程的区别?!  
> (1) 进程(Process) 是一个程序的运行活动,由程序、数据和进程控制块PCB三部分组成, 有唯一的进程编号PID, 进程是操作系统**资源分配和调度**的基本单元;  
> (2) 线程(Thread) 是进程中的实际运作单位, 是操作系统进行**程序执行和任务调度**的最小单位; 线程没有独立的资源，与其他线程共享进程内的资源;  
> (3) 进程具有独立性(唯一的PID)、并发性、异步性和动态性的特点; 进程有五态：创建、就绪、运行、阻塞、退出, 其中阻塞态的进程不能直接切换到运行态的;  
> (4) 线程比进程更轻量, 优点是线程的创建开销更少、更易于调度。

2. 线程的创建方式有哪些?![Ref 1](https://blog.csdn.net/weixin_43954951/article/details/126396865) [Ref 2](https://www.cnblogs.com/xujf/p/14574185.html)
> (1) 继承Thread类, 重写Thread的run方法;  
> (2) 实现Runnable接口, 实现Runnable的抽象run方法; 这个方法可以用一个Runnable对象创建多个线程(即多线程共享这个对象、数据);  
> (3) 实现Callable接口, 实现Callable的抽象call方法; Callable的call方法可以有返回值, 可以抛出异常, 支持泛型;  
> (4) 使用线程池, 线程池是一种线程使用模式, 因为线程过多会带来调度开销, 进而影响缓存局部性和整体性能; 而线程池维护着多个线程, 对线程统一管理, 达到复用的效果;  
> (5) JDK自带四种基本线程池: 可缓存线程池newCachedThreadPool, 定长线程池newFixedThreadPool, 定时及周期性执行的定长线程池newScheduledThreadPool和单线程化的线程池newSingleThreadPool;  
> (6) 线程的创建看起来有四种方式，但本质上只有new Thread对象一种。

3. ThreadLocal的理解作用应用场景(空间换时间) [Reference](https://blog.csdn.net/u010445301/article/details/111322569)
> (1) ThreadLocal, 线程变量, 指ThreadLocal中填充的变量属于当前线程, 对其他线程来说是隔离的, 用于解决多线程并发时访问共享变量的问题;  
> (2) ThreadLocal用于修饰共享变量, 使每个线程单独拥有一份共享变量, 实现同时访问而互不干扰; 当线程修改了共享变量后由JMM管理控制写回主存;  
> (3) ThreadLocal适用于两种场景: 每个线程要求有自己单独的实例, 类似于线程内的全局变量(避免了传参)。

4. Lock, synchronized, JUC [Reference](https://blog.csdn.net/beginnerdzz/article/details/127076748)
> (1) JUC指的是java.util.concurrent包; Lock锁是java.util.concurrent.lock类;  
> (2) Lock是一个类(无参构造非公平锁, 有参是公平锁), Lock.lock()上锁, Lock.unlock()解锁, 两行代码之间是加锁的内容;  
> (3) synchronized是方法修饰关键字, 表示对该方法上synchronized锁(即方法内的数据均上了同步锁); 
> (4) synchronized会自动释放锁, Lock必须要手动加锁和手动释放锁!!可能会导致死锁!!  
> (4) Lock(适合锁大量的同步)和synchronized(适合锁少量的代码同步)都是解决数据同步的问题, 而ThreadLocal是实现多线程之间的数据隔离。

5. Thread.sleep和object.wait有啥区别?!
> (1) Thread.sleep()是线程休眠, 是当前线程调用此方法, 但不释放对象锁, sleep结束后线程自动苏醒并进入就绪态;  
> (2) object.wait(), 由当前线程调用对象的wait方法, 线程则释放对象锁进入等待队列, 需要notify()/notifyAll()或timeout唤醒。

## ～22.10.13
[代码笔记](src/main/java/LearningNotes1013.java)
1. Iterator
> (1) Iterator, 迭代器, 是一种用于访问集合的方法, 可用于迭代ArrayList, HashSet等集合;  
> (2) it的基本操作有it.next(), it.hasNext()和it.remove();  
> (3) it的操作是全局的, 每次需要从头开始的操作时要重新获取一个it。

2. Exception
> (1) 异常是程序中的一些错误, 但并不是所有的错误都是异常, 并且错误有时候是可以避免的;  
> (2) 异常发生的原因通常有几类: 用户输入非法数据, 文件不存在, 网络通信问题; 有的是用户错误引起, 有的是程序错误引起, 还有因为物理错误引起的;  
> (3) 异常的类型: 检查性异常, 运行时异常, 错误(错误不是异常, 是脱离了程序员控制的问题);  
> (4) 使用try/catch可以捕获异常, try/catch里的代码为保护代码; 一个try后面跟多个catch的为多重捕获;  
> (5) throws关键字用来声明一个异常, 放在方法签名的尾部; 也可以在方法内部使用throw抛出异常;  
> (6) finally用来创建在try后面执行的代码, 无论是否发生异常，finally的代码总会被执行, 因此可以运行清理类型等收尾善后性质的语句。

## ~22.09.30
[代码笔记](src/main/java/LearningNotes0930.java)
1. Number
> (1) 一般地, 在编程中通常使用内置的数据类型, 如: byte, int, long, double等;  
> (2) 当需要使用对象时, Java为每一个内置数据类型提供了对应的包装类, 有: Boolean, Byte, Short, Integer, Long, Character, Float, Double;;  
> (3) 都是抽象类Number类的子类, Number类属于java.lang包。

2. Math
> (1) Math类包含了用于执行基本数学运算的属性和方法, 方法都被定义为static形式, 通过Math类可以在主函数里直接调用;  
> (2) Number & Math 类方法, 如: compareTo(), equals(), toString(), min(), max(), random()等。

3. Character
> (1) Character类用于对单个字符进行操作;  
> (2) 常用方法有: isLetter(), isDigit(), isWhitespace(), isLowerCase(), toLowerCase()等。 

4. String
> 提供字符串操作方法, 如: compareTo(IgnoreCase), concat, contentEquals, indexOf, length等。

## ~22.09.25
[代码笔记](src/main/java/LearningNotes0925.java)
1. Collection [Reference](https://blog.csdn.net/qq_42404261/article/details/104863292)
> (1) java.util.Collection是一个集合接口, 提供了对集合对象进行基本操作的通用接口方法;  
> (2) 直接继承接口为List和Set:  
> &emsp;&emsp;a) List, 有序可重复, 维护特定的顺序, 能够精确的控制每个元素插入的位置, 可使用索引访问List中的元素; 常用实现类有**ArrayList，LinkedList，Vector**;  
> &emsp;&emsp;b) Set, 无序不可重复, 只能通过游标来取值; 常用有实现类**HashSet**和子接口**SortedSet**。

1.1 ArrayList vs LinkedList vs Vector
> (1) ArrayList底层是数组; 适合查询(O(1))，不适合频繁的随机增删元素; 非线程安全;  
> (2) LinkedList底层数据结构是双向链表, 适合频繁的增删元素, 不适合查询(O(n)); 非线程安全;  
> (3) Vector底层是数组; Stack类继承自Vector类, 线程安全。

1.2 HashSet和SortedSet
> (1) 为快速查找设计的Set; HashSet底层是HashMap, HashMap底层采用哈希表数据结构;  
> (2) SortedSet存入的元素可以按照元素大小顺序自动排列。

2. Map [Reference](https://www.cnblogs.com/htyj/p/7723887.html)
> (1) Map提供一个更通用的元素存储方法, 用于存储元素对(key-value), 即key到value的映射, 通过key查找value;  
> (2) 存放值的时候通过put存放，如果key值相等的话会把之前存放的值覆盖;  
> (3) 实现类主要包括：**HashMap,TreeMap,Hashtable**等。

2.1 HashMap vs TreeMap vs Hashtable
> (1) HashMap, 根据key的HashCode值存储数据, 根据key可直接获取Value, 具有很快的访问速度; HashMap最多只允许一条记录的key值为Null(多条会覆盖) & 允许多条记录的Value为 Null;  
> (2) TreeMap, 把保存的记录根据key排序(默认升序); 当用Iterator遍历TreeMap, 得到的记录是排过序的; TreeMap不允许key的值为null;  
> (3) Hashtable, 与HashMap类似, 但key和value均不允许为Null; 支持线程的同步，即任一时刻只有一个线程能写Hashtable, 因此也导致Hashtable在写入时会比较慢。

## ~22.09.18
1. IOC [Reference](https://blog.csdn.net/ivan820819/article/details/79744797)
> (1) IOC(Inversion of Control, 控制反转), 借助于"第三方"(IOC容器)实现具有依赖关系的对象之间的解耦;  
> (2) 原本对象A想要操作对象B是要自己创建B, 现在是由IOC容器在A需要的时候给个B它; 所以原本A要主动创建B, 现在变成被动得到一个B, so控制反转了;  
> (3) 所有对象的控制权全部上交给IOC容器, IOC容器成为系统的核心; IOC中最基本的技术就是“反射(Reflection)”编程;  
> (4) IOC vs DI(Dependency Injection, 依赖注入), 由IOC容器在运行期间动态地将某种依赖关系注入到对象之中, 是另一个角度的IOC。

2. Spring IOC  [Ref 1](https://blog.csdn.net/q982151756/article/details/80291998), [Ref 2](https://blog.csdn.net/weixin_51738541/article/details/120607811)
> (1) Spring IOC是Spring框架中的IOC容器;  
> (2) Spring的IoC容器在实现IOC和DI的过程中,可以划分为两个阶段: 容器启动阶段和Bean实例化阶段;  
> (3) 在IoC模式中，被注入对象可以通过三种方式来通知IoC容器为其提供适当服务: 构造方法注入, setter方法注入, 接口注入(几乎退役);  
> (4) Spring中提供了两种IoC容器: BeanFactory, ApplicationContext; 其中BeanFactory是ApplicationContext的父类, 因此ApplicationContext的功能更强大;  
> (5) 需要通过某种方法告诉IOC容器关于对象依赖的信息, 容器才能合理的创造出对象, 有四种方式: 文本文件, XML文件, 代码, 注解。

## ~22.09.11
1. Spring AOP [Reference](https://blog.csdn.net/q982151756/article/details/80513340)
> (1) AOP(Aspect Oriented Programming), 面向切面编程;  
> (2) 编程中, 对象与对象之间, 方法与方法之间, 模块与模块之间都是一个个切面;  
> (3) 让接口只需要关心具体的业务，而不需要关注其他非该接口关注的逻辑或处理;  
> (4) 参考Ref中的理解概念: **Aspect**(切面), **Joint point**(连接点), **Pointcut**(切点), **Advice**(增强), **Target**(目标对象), **WeavingWeaving**(织入);  
> (5) AOP中的Joint point有多种类型: 构造方法调用、字段的设置和获取、方法的调用、方法的执行、异常的处理执行、类的初始化, 但在**Spring中只支持方法执行类型的Joint point**, 通过**动态代理和动态字节码技术**来实现了AOP。

2. 动态代理 [Reference](https://blog.csdn.net/q982151756/article/details/80586894)
> (1) 动态代理其实是Java中的一个方法, 这个方法可以实现: 动态创建一组指定的接口的实现对象(在运行时，创建实现了指定的一组接口的对象);  
> (2) 动态代理(Proxy)类中创建代理对象的方法的三个参数:  
> &emsp;&emsp;ClassLoader loader: 方法需要动态生成一个类, 这个类实现了A和B两个接口; 这个类也需要加载到方法区中, 所以我们需要一个ClassLoader来加载该类;  
> &emsp; &emsp;Class<?>[] interfaces: 需要代理对象实现的数组;  
> &emsp;&emsp;InvocationHandler h: 调用处理器; 代理对象实现的所有接口中的方法, 内容都是调用InvocationHandler中的invoke()方法, 代理对象方法的返回值其实就是invoke方法的返回值;  
> (3) 示例代码阅读。

## ~22.09.03
1. Java的继承以及继承类的构造方法关系 [代码笔记](src/main/java/LearningNotes0831.java)

2. Java的三大特性：[Reference](https://blog.csdn.net/slw213106/article/details/121696908)
> **封装、继承、多态** 

3. Spring入门
> (1) Spring是一个JavaEE轻量级的一站式的免费开源开发框架 --  
> &emsp;&emsp;JavaEE： 就是用于开发企业级（B/S）应用的技术;  
> &emsp;&emsp;轻量级：使用最少代码启动框架，然后根据需求选择需要使用的模块;   
> &emsp;&emsp;一站式：提供了表示层，服务层，持久层的所有支持。  
> (2) Spring 的核心功能: [Ref1](https://zhuanlan.zhihu.com/p/98967126),
>                       [Ref2](https://www.cnblogs.com/lx-meteor/p/16503544.html), 
>                       [Ref3](https://blog.csdn.net/a321123b/article/details/123591796)    
> &emsp;&emsp;**IOC** (Inversion of Control, 控制反转)  
> &emsp;&emsp;&emsp;&emsp;简单理解为一种设计模式, 将实例化对象的控制权由手动的new变成了Spring框架通过反射机制实现实例化;  
> &emsp;&emsp;&emsp;&emsp;Spring实现了不用new、使用类或接口就可以获得对象，以实现可插拔程序;  
> &emsp;&emsp;**DI** (Dependency Injection, 依赖注入)  
> &emsp;&emsp;&emsp;&emsp;程序运行的需要可以称之为依赖, 给对象的属性赋值即为依赖注入;  
> &emsp;&emsp;&emsp;&emsp;Spring通过反射技术实例化了对象，属性无需手动赋值，通过spring的配置文件或Spring提供的注解可以实现直接注入属性;  
> &emsp;&emsp;**AOP** (Aspect Oriented Programming, 面向切面编程)  
> &emsp;&emsp;&emsp;&emsp;在Spring中, 切面编程指的就是在程序运行某个方法的时候, 不修改原始执行代码逻辑, 由程序动态地执行某些额外的功能, 对原有的方法做增强, 这就叫做面向切面编程。  
> &emsp;&emsp;&emsp;&emsp;那个被监测的执行方法, 称呼为切入点。  
> (3) Spring的优势:  
> &emsp;&emsp; 轻量化, 简化项目开发, 面向切面编程, 面向接口编程, 测试方便, 方便集成第三方框架。

4. 什么是Java Web ?! [Reference](https://www.cnblogs.com/kingwz/p/16372485.html#javaweb%E6%A6%82%E5%BF%B5)
> (1) Java Web是用Java技术来解决相关Web互联网领域的技术栈, 是通过Java语言编写的、可以通过浏览器访问的、基于B/S结构的程序的总称;  
> (2) Web包括：Web服务端和Web客户端两部分; Java在客户端的应用有Java Applet; 在服务器端的应用有Servlet、JSP、第三方框架等等;  
> (3) Web资源, 指放在Internet网上供外界访问的文件或程序; 根据呈现的效果不同，Web资源可分为静态和动态两种:   
> &emsp;静态Web资源: 内容是静态的，不同的人在不同的时间来访问时都是相同的内容;  
> &emsp;动态Web资源: 内容是由程序生成的、动态变化的, 不同的人在不同的时间访问的内容很可能是不同的。

5. 编写servlet, filter, 理解作用以及看到什么效果
> (1) Servlet [Reference](https://www.runoob.com/servlet/servlet-intro.html)  
> &emsp;Java Servlet是运行在Web服务器或应用服务器上的程序, 是作为来自Web浏览器或其他HTTP客户端的请求和HTTP服务器上的数据库或应用程序之间的中间层;  
> &emsp;Servlet执行的主要任务：读取客户端(浏览器)发送的显式数据 → 读取客户端(浏览器)发送的隐式HTTP请求数据 → 
>                               处理数据并生成结果 → 发送显式的数据(即文档)到客户端(浏览器) → 发送隐式的HTTP响应到客户端(浏览器);  
> (2) Filter [Reference](https://blog.csdn.net/m0_62430017/article/details/124427188)  
> &emsp;Filter过滤器是实现了javax.servlet.Filter接口的类, 它的基本功能是对Servlet容器调用Servlet的过程进行拦截,
>       对Servlet容器传给Web资源的request对象和response对象进行检查和修改;  
> &emsp;Filter的生命周期分为3个阶段: 初始化阶段, 拦截和过滤阶段和销毁阶段,
>       分别对应了由Servlet容器来管理的init(), doFilter()以及destroy()三个方法;  
> (3) 编码实现 --**TODO**--

6. 搭建一个springmvc工程
> SpringMVC是Spring生态圈中的WEB-MVC框架;  
> 搭建 --**TODO**--

7. 了解springboot的概念 [Reference](https://blog.csdn.net/friggly/article/details/123888590)
> (1) SpringBoot提供了一种快速使用Spring的方式, 目的是为了简化Spring项目的搭设和开发过程、提高开发效率, 本质是Spring + 其他框架;  
> (2) 四大特性: 自动配置、起步依赖、Actuator、命令行界面。

## ~22.08.27
[代码笔记](src/main/java/LearningNotes0827.java)  

Q: Java创建对象的方式有哪些?!
> Java创建对象的四种方式：[Ref1](https://www.cnblogs.com/yanchuanbin/p/14742892.html),
>                       [Ref2](https://blog.csdn.net/weixin_48882711/article/details/124072469)  
> &emsp;(1) new创建新对象：通过new对应的类的构造器来创建，这种方式是Java中最通用的;  
> &emsp;(2) 通过反射机制;  
> &emsp;(3) 采用clone机制：必须提前实现cloneable接口并实现clone方法;  
> &emsp;(4) 反序列化：对Class必须要实现Serializable接口;  
> &emsp;其中clone和反序列化方法是没有调用构造方法的。

Q: 什么是构造方法(耦合)?!
> 构造方法也叫做构造器，是一种特殊的方法，用于创建实例（即对象）时进行初始化操作。  
> 在没有手动定义构造方法的时候，系统会为操作类提供的一个无参数的默认的构造方法。

Q: 怎么统一在调用对象的方法之前、之后做一些自定义的事，比如日志打印、事务管理(aop,动态代理)?!
> (1) 定义一个方法/框架，将需要统一在调用方法之前和之后执行的自定义的内容定义好，中间的部分可以动态地调整为调用的方法。  
> (2) 使用装饰模式：[Reference](https://baike.baidu.com/item/%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8F/10158540)  
> &emsp;(a) 装饰模式是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能;  
> &emsp;(b) 装饰对象包含一个真实对象的引用(reference);   
> &emsp;(c) 装饰对象可以在转发这些请求以前或以后增加一些附加功能。  
> &emsp;这样就确保了在运行时，不用修改给定对象的结构就可以在外部增加附加的功能。

## 22.08.20 小任务
Task: 写一个方法，入参数有两个，一个是数字最大值，一个是操作类型(如5，\*)，返回值要是5\*4\*3\*2\*1，操作类型这个参数可以为[\+, \-, \*, \/]  
已完成，详见[代码文件](src/main/java/LearningNotes0820.java)

## ~22.08.19 学习《Java编程思想》
> [学习笔记](src/main/java/LearningNotes0819.java)
> 1. ~《Java编程思想》第4章
> 2. 网上的java基础教程
> 3. if-else, switch-case, for, while, logical operation

## 22.08.15 git相关知识
README.md文件的格式规范 [Reference](https://blog.csdn.net/qq_37493425/article/details/102556009)

.gitignore文件
> 用于指明忽略一些没必要的文件(夹)
> [Reference](https://blog.csdn.net/nyist_zxp/article/details/119887324)  
> [gitignore文件不起效](https://www.jianshu.com/p/23920337b6da) 

git commit规范 [Reference](https://www.jianshu.com/p/851ec9cd1709)  
|   value       |   desp    |
|   :-          |   :-      |
|   feat        |   新功能 |
|   fix         |   修复bug   |
|   docs        |   仅修改文档 |
|   style       |   仅修改格式，不改变代码逻辑   |
|   refactor    |   代码重构    |
|   test        |   增加测试用例  |
|   chore       |   构建过程或辅助工具的变动    |
|   revert      |   回滚到上个版本 |

## 22.08.12 1st Java program
"Hello World!" - done

Push to GitHub - done

## 22.08.11 环境配置
JDK:
> [安装参考教程](https://blog.csdn.net/dkm123456/article/details/121172392)

jre:
> [安装参考教程](https://blog.csdn.net/weixin_45729500/article/details/110509807)

缺了tools.jar & dt.jar: 
> 忽略，好像是新的一些版本都抛弃了？！

“java不是..”：
> [解决方法](https://blog.csdn.net/qq_40645764/article/details/108561684) 环境变量路径问题（相对 / 绝对）

Maven：
> [安装 Ref1](https://blog.csdn.net/weixin_46078600/article/details/124918297)  
> [安装 Ref2](https://blog.csdn.net/weixin_45745854/article/details/119462894)

Mysql:
> [安装](https://zhuanlan.zhihu.com/p/37152572) 
> [连接](https://blog.csdn.net/iwanttostudyc/article/details/125141926)

Git:
> [安装](https://blog.csdn.net/weixin_47638941/article/details/120632890)  
> [在idea中登录GitHub](https://www.cnblogs.com/all-rounded/p/14792109.html)  
> [简单操作](http://t.zoukankan.com/jimlau-p-11949661.html)



