# Learning_Java
Write down by Lysshpng.

**TODO List**
- [ ] 编写servlet, filter

[//]: # (https://www.runoob.com/servlet/servlet-environment-setup.html)

- [ ] 搭建一个springmvc工程

[//]: # (https://blog.csdn.net/wodeID123/article/details/124910315)
[//]: # (https://www.cnblogs.com/cfas/p/16168634.html)
[//]: # (https://blog.csdn.net/friggly/article/details/123888590)

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
> &emsp; &emsp; a) List, 有序可重复, 维护特定的顺序, 能够精确的控制每个元素插入的位置, 可使用索引访问List中的元素; 常用实现类有**ArrayList，LinkedList，Vector**;  
> &emsp; &emsp; b) Set, 无序不可重复, 只能通过游标来取值; 常用有实现类**HashSet**和子接口**SortedSet**。

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
> &emsp; &emsp; ClassLoader loader: 方法需要动态生成一个类, 这个类实现了A和B两个接口; 这个类也需要加载到方法区中, 所以我们需要一个ClassLoader来加载该类;  
> &emsp; &emsp; Class<?>[] interfaces: 需要代理对象实现的数组;  
> &emsp; &emsp; InvocationHandler h: 调用处理器; 代理对象实现的所有接口中的方法, 内容都是调用InvocationHandler中的invoke()方法, 代理对象方法的返回值其实就是invoke方法的返回值;  
> (3) 示例代码阅读。

## ~22.09.03
1. Java的继承以及继承类的构造方法关系 [代码笔记](src/main/java/LearningNotes0831.java)

2. Java的三大特性：[Reference](https://blog.csdn.net/slw213106/article/details/121696908)
> **封装、继承、多态** 

3. Spring入门
> (1) Spring是一个JavaEE轻量级的一站式的免费开源开发框架 --  
> &emsp;&emsp; JavaEE： 就是用于开发企业级（B/S）应用的技术;  
> &emsp;&emsp; 轻量级：使用最少代码启动框架，然后根据需求选择需要使用的模块;   
> &emsp;&emsp; 一站式：提供了表示层，服务层，持久层的所有支持。  
> (2) Spring 的核心功能: [Ref1](https://zhuanlan.zhihu.com/p/98967126),
>                       [Ref2](https://www.cnblogs.com/lx-meteor/p/16503544.html), 
>                       [Ref3](https://blog.csdn.net/a321123b/article/details/123591796)    
> &emsp;&emsp; **IOC** (Inversion of Control, 控制反转)  
> &emsp;&emsp;&emsp;&emsp; 简单理解为一种设计模式, 将实例化对象的控制权由手动的new变成了Spring框架通过反射机制实现实例化;  
> &emsp;&emsp;&emsp;&emsp; Spring实现了不用new、使用类或接口就可以获得对象，以实现可插拔程序;  
> &emsp;&emsp; **DI** (Dependency Injection, 依赖注入)  
> &emsp;&emsp;&emsp;&emsp; 程序运行的需要可以称之为依赖, 给对象的属性赋值即为依赖注入;  
> &emsp;&emsp;&emsp;&emsp; Spring通过反射技术实例化了对象，属性无需手动赋值，通过spring的配置文件或Spring提供的注解可以实现直接注入属性;  
> &emsp;&emsp; **AOP** (Aspect Oriented Programming, 面向切面编程)  
> &emsp;&emsp;&emsp;&emsp; 在Spring中, 切面编程指的就是在程序运行某个方法的时候, 不修改原始执行代码逻辑, 由程序动态地执行某些额外的功能, 对原有的方法做增强, 这就叫做面向切面编程。  
> &emsp;&emsp;&emsp;&emsp; 那个被监测的执行方法, 称呼为切入点。  
> (3) Spring的优势:  
> &emsp;&emsp; 轻量化, 简化项目开发, 面向切面编程, 面向接口编程, 测试方便, 方便集成第三方框架。

4. 什么是Java Web ?! [Reference](https://www.cnblogs.com/kingwz/p/16372485.html#javaweb%E6%A6%82%E5%BF%B5)
> (1) Java Web是用Java技术来解决相关Web互联网领域的技术栈, 是通过Java语言编写的、可以通过浏览器访问的、基于B/S结构的程序的总称;  
> (2) Web包括：Web服务端和Web客户端两部分; Java在客户端的应用有Java Applet; 在服务器端的应用有Servlet、JSP、第三方框架等等;  
> (3) Web资源, 指放在Internet网上供外界访问的文件或程序; 根据呈现的效果不同，Web资源可分为静态和动态两种:   
> &emsp; 静态Web资源: 内容是静态的，不同的人在不同的时间来访问时都是相同的内容;  
> &emsp; 动态Web资源: 内容是由程序生成的、动态变化的, 不同的人在不同的时间访问的内容很可能是不同的。

5. 编写servlet, filter, 理解作用以及看到什么效果
> (1) Servlet [Reference](https://www.runoob.com/servlet/servlet-intro.html)  
> &emsp; Java Servlet是运行在Web服务器或应用服务器上的程序, 是作为来自Web浏览器或其他HTTP客户端的请求和HTTP服务器上的数据库或应用程序之间的中间层;  
> &emsp; Servlet执行的主要任务：读取客户端(浏览器)发送的显式数据 → 读取客户端(浏览器)发送的隐式HTTP请求数据 → 
>                               处理数据并生成结果 → 发送显式的数据(即文档)到客户端(浏览器) → 发送隐式的HTTP响应到客户端(浏览器);  
> (2) Filter [Reference](https://blog.csdn.net/m0_62430017/article/details/124427188)  
> &emsp; Filter过滤器是实现了javax.servlet.Filter接口的类, 它的基本功能是对Servlet容器调用Servlet的过程进行拦截,
>       对Servlet容器传给Web资源的request对象和response对象进行检查和修改;  
> &emsp; Filter的生命周期分为3个阶段: 初始化阶段, 拦截和过滤阶段和销毁阶段,
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
> &emsp; (1) new创建新对象：通过new对应的类的构造器来创建，这种方式是Java中最通用的;  
> &emsp; (2) 通过反射机制;  
> &emsp; (3) 采用clone机制：必须提前实现cloneable接口并实现clone方法;  
> &emsp; (4) 反序列化：对Class必须要实现Serializable接口;  
> &emsp; 其中clone和反序列化方法是没有调用构造方法的。

Q: 什么是构造方法(耦合)?!
> 构造方法也叫做构造器，是一种特殊的方法，用于创建实例（即对象）时进行初始化操作。  
> 在没有手动定义构造方法的时候，系统会为操作类提供的一个无参数的默认的构造方法。

Q: 怎么统一在调用对象的方法之前、之后做一些自定义的事，比如日志打印、事务管理(aop,动态代理)?!
> (1) 定义一个方法/框架，将需要统一在调用方法之前和之后执行的自定义的内容定义好，中间的部分可以动态地调整为调用的方法。  
> (2) 使用装饰模式：[Reference](https://baike.baidu.com/item/%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8F/10158540)  
> &emsp; (a) 装饰模式是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能;  
> &emsp; (b) 装饰对象包含一个真实对象的引用(reference);   
> &emsp; (c) 装饰对象可以在转发这些请求以前或以后增加一些附加功能。  
> &emsp; 这样就确保了在运行时，不用修改给定对象的结构就可以在外部增加附加的功能。

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



