# Learning_Java
Write down by Lysshpng.



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
> (3) 编码实现 **TODO**

6. 搭建一个springmvc工程
> SpringMVC是Spring生态圈中的WEB-MVC框架;  
> **TODO**

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
> [安装参考教程](https://blog.csdn.net/weixin_45729500/article/details/110509807?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-110509807-blog-121886511.pc_relevant_multi_platform_whitelistv3&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-110509807-blog-121886511.pc_relevant_multi_platform_whitelistv3&utm_relevant_index=1)

缺了tools.jar & dt.jar: 
> 忽略，好像是新的一些版本都抛弃了？！

“java不是..”：
> [解决方法](https://blog.csdn.net/qq_40645764/article/details/108561684?spm=1001.2101.3001.6650.17&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-17-108561684-blog-90906516.pc_relevant_multi_platform_whitelistv3&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-17-108561684-blog-90906516.pc_relevant_multi_platform_whitelistv3) 环境变量路径问题（相对 / 绝对）

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



