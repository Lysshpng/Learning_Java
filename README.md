# Learning_Java
Write down by Lysshpng.

## ~22.08.27
[代码笔记](src/main/java/LearningNotes0827.java)  

Q: Java创建对象的方式有哪些?!
> Java创建对象的四种方式：[Reference 1](https://www.cnblogs.com/yanchuanbin/p/14742892.html), [Reference 2](https://blog.csdn.net/weixin_48882711/article/details/124072469)  
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



