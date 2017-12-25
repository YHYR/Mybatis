# 概述

*当初学习mybatis时，踩过不少坑；在这分别就基于Spring Boot下mybatis的简单实现、多数据源实现和动态数据源加载三种模式做一整理。*

*网上有很多把多数据源和动态数据源混为一谈，在这里说明一下，该项目中**多数据源**指的是：一个项目中需要用到不止一个数据库的信息；**动态数据源加载**指的是：在一个项目中，无法在项目初始化之前获取数据库的连接信息，只能在代码的运行过程中，才可得知 (可类比Hadoop中的NameNode和DataNode的关系)*



## mybatis 简单实现 - spring-boot-mybatis-demo 

该项目在基于网上看过的很多实现方法后，所整理出的一种版本，目前也是自己在实际项目中用到过的一个。因为过于简单，在这里不做赘述，可以直接看代码。

## mybatis 多数据源实现 - spring-boot-multi-mybatis-demo

这里提供了一种最简单的一种多数据源实现的方式：

​	在项目启动前，一次性加载多个数据源，这样就可以保证在实际实现的过程中，根据不同的mapper映射找到对应的mybatis实例。

具体实现原理详见[博客](http://blog.csdn.net/YHYR_YCY/article/details/78894940)

## mybatis 动态数据源加载 - spring-boot-dynamic-mybatis-demo 

通过另外一种多数据源切换实现思路的同时，实现真正意义的在程序运行的过程加载一个新的数据源

业务场景如下：

​	现在有两个数据源：default和master；default数据源用于一种常规的业务逻辑；master数据源内只有slave数据库的相关信息(dbName, dbUrl, dbUser, dbPasswd)，而真正所需要获取的数据只能从slave中获取(这里假设slave的所有库中的表结构完全一致)。所以必须在项目初始化时加载到default和master这两个数据源，并根据业务需求，从master中获取对应的数据库信息，再通过动态加载的办法实现与之建立连接；*同时还要实现不同数据源之间的动态、灵活切换*。

具体实现原理详见[博客](http://blog.csdn.net/YHYR_YCY/article/details/78894940)

