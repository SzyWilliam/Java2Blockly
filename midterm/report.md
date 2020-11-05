# 报告和答辩

[TOC]



## 前期的资料调研：Blockly和相关的平台 （张丰泽、王中亮）

### Blockly简介 & Blockly特点特性

```
https://developers.google.com/blockly/guides/overview
1. 将页面的重要内容概括和摘要整理到这里
2. 配有相应的图片和解释（block/workspace/js generator等重要元素）
```

### 基于Blockly的平台 

* App Inventor
* Scratch Game
* Blockly Game

```
查看相应的网站
每个平台的内容应该包含以下部分
1. 平台的简单介绍 （是什么，提供了什么新的功能）
2. 平台和Blockly之间的关系（如何基于Blockly，和Blockly有什么不同）
```

### 相关的论文

```
三篇论文
概括每篇论文讲了什么（从摘要里面概括即可）
```



## 从Blockly拓展到Blockly2Java（宋子阳）

### 渴望解决的问题

```
1. Blockly的应用领域比较狭窄：教育领域
2. 希望拓展Blockly到具有生产能力和解决问题能力的场景中来
3. 拓展到Java语言（支持强类型语言，OOP和现有的库函数）
4. 平台化和易扩展的的定制化
```



## 项目的分析和总体介绍（潘星宇，朱晓萱，宋子阳）

### 使用场景

```
通过一个例子来阐述（神经网络的搭建） 这一部分通过P图完成
1. 用Blockly Factory建立 Affine ReLU Convolutional SoftMax的网络，输入输出可以自己定义，要求
		网络可以拼在一起
		网络的接受参数要合理（例如接受Input size和Output size）
2. 建立一个workspace， 将上述的网络Block放在ToolBox的同一个Category上
3. 使用这些Block在workspace里搭建一个神经网络架构
4. 描述上述过程并且配图
```



### 目标用户

#### 开发者

```
开发者将如何定义一个Affine网络？
通过Java代码先定义底层的代码和结构？
在Java上写完了代码之后怎么变成Blockly？我们的转换器：配置文件
```

#### 使用者

```
使用者的相关内容较为简单，和使用场景大部分相同
```





## 项目的实现和进展

###垂直领域的定义：爬虫 （孙颢、王中亮）

```
利用已有的Blockly的平台内容，搭建一个简单的垂直领域例子
爬虫模块（Python）
实现了三个函数，三个函数的内容是什么，完成的功能是什么，是怎么定制成block的
```

###一个简单的XML2Java的demo （潘星宇、俞哲轩）

###一个Java转Block的代码示例 （宋子阳）



