SpringCloud升级版（稳定）：

**一、搭建环境框架：Spring Cloud H.SR1 + Spring Cloud Alibaba** 
稳定版本号：
1. spring boot 2.2.2
2. spring cloud H.SR1
3. cloud alibaba 2.1.0
4. java 8
5. maven >3.5（本项目中用的maven 3.6）
6. mysql 5.7/oracle 11g

**二、dependencyManagement与dependency的区别？（面试会考！）**

Maven用的dependencyManagement元素来提供一种依赖管理版本的方式，通常会在一个父工程的POM中会看到dependencyManagement元素，
使用pom.xml中的dependencyManagement元素能让所有在子项目中引用一个依赖而不是版本号。Maven会沿着父子层次往上走，知道找到一个
dependencyManagement元素的项目，然后它会使这个dependencyManagement元素指定版本号。
这样做的好处是：如果有多个子项目都引用同一个依赖，则可以避免在每个使用子项目中声明版本号，这样当想升级或者换另一个版本号的时候，
只需要在顶层父容器中更新，而不需要一个一个的子项目中修改；另外如果某一个子项目想要另一个版本，只需要声明version即可。




