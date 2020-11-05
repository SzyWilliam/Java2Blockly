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

从上述的分析中我们发现，Blockly虽然有着轻量级、可定制等诸多优点，但是其实际应用范围和应用领域非常狭窄。在第一部分文献调研中，基于Blockly的三个平台APP Inventor/Blockly Games/Scratch都是偏向于编程教育的平台，目标群体用户是编程领域的初学者或者是少儿编程的参加者。例如Scratch和Blockly Games更多被用在少儿编程培训上，而APP Inventor面向的更多是非专业的安卓程序开发者，或者说是手机编程开发初学者。真正实际的安卓程序开发肯定是用专业的Java/Kotlin。

总的来说，Blockly平台较难被用在实际的生产开发中来，解决现实中的实际问题。这样的发现驱动着我们进行本项目Blockly2Java的研究。我们最初是希望能够保留Blockly的轻量级、可视化积木编程的搭建和易于使用的特性，进一步拓展其表达能力和解决问题的能力，使得使用者能够真正的用这个平台解决生产生活中遇到的问题。

在具体的实现层面上，由于Blockly只支持简单的脚本语言，因此要实现在生产生活中的运用，首当其冲的就是要扩展Blockly支持的语言，使得其支持实际的生产语言。因此我们选择了Java语言作为我们的基础语言，打算将Blockly扩展支持Java语言的读写和转换，从而将Java语言的灵活性、通用性和强大的语言表现能力迁移到Blockly平台上来。

此外，我们希望进一步拓展这个平台，通过模块组织和层级分化的方式，从高到低提升Blockly的表现能力。在低的层面上，能够支持用户直接修改Block背后的代码，通过给最原生的Access来获得最灵活的定制能力。在高的层面上，能够支持用户通过拖拽和组合Block来模块化定制功能，从而实现强封装和易于使用的功能。

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

实现的功能描述XML 2 JAVA子集的一个，目的是为了XXX。这个子集包括了XXX

具体的实现架构：

Input/Output

代码的组织架构（interface是怎么样的）

最后再来一些实现细节（Math

###一个Java转Block的代码示例 （宋子阳）



我们实现了一个java Class向一个Blockly WorkSpace互转的功能。



在Java中，一个简单的Class Definition可能包含以下的部分

* Class Definition
  * Static Methods
  * Static Fields
  * Constructor
* Class Instance
  * Member Functions
  * Private Fields
  * Public Fields

我们的通过设计，进行了如下对应

在Instance层面，认为private的变量是开发者在实现工具箱过程中实现的，在使用者使用工具箱的期间，这一部分的private变量不会暴露给使用者。因此，在向Block转换的时候，这一部分的内容将被忽略。



