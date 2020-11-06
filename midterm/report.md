# 报告和答辩

[TOC]



## 前期的资料调研：Blockly和相关的平台 （张丰泽、王中亮）

### Blockly简介 & Blockly特点特性

Blockly是为网络和移动应用程序添加可视代码编辑器的应用。 Blockly编辑器使用互锁的图形块来表示代码概念，如变量，逻辑表达式，循环等。它使得用户可以不必关注语法细节就能直接按照编程原则进行编程。



在Blockly丰富的功能中，我们列举以下几个突出的优势：

- **可导出代码**。用户可以将基于块编写的程序转换成通用编程语言，并平滑过渡到基于文本的编程。
- **开源**。关于Blockly的一切都是开放的：您可以用您自己的方式修改它，并在您自己的网站中使用它。
- **精简**。 Blockly不仅仅是玩具，您可以用它实现复杂的编程任务，例如在单个块中计算标准偏差。
- **国际化**。 Blockly已被翻译成40多种语言，包括阿拉伯语和希伯来语的从右到左阅读的版本。



Sample：

​		以下是一块自定义块：

![text-length](image/text-length.png)

​		

​		这个块由以下JavaScript语言定义：

```
Blockly.Blocks['string_length'] = {
  init: function() {
    this.appendValueInput('VALUE')
        .setCheck('String')
        .appendField('length of');
    this.setOutput(true, 'Number');
    this.setColour(160);
    this.setTooltip('Returns number of letters in the provided text.');
    this.setHelpUrl('http://www.w3schools.com/jsref/jsref_length_string.asp');
  }
};
```

​		或者是以下Json语句：

```
Blockly.Blocks['string_length'] = {
  init: function() {
    this.jsonInit({
      "message0": 'length of %1',
      "args0": [
        {
          "type": "input_value",
          "name": "VALUE",
          "check": "String"
        }
      ],
      "output": "Number",
      "colour": 160,
      "tooltip": "Returns number of letters in the provided text.",
      "helpUrl": "http://www.w3schools.com/jsref/jsref_length_string.asp"
    });
  }
};
```



```
https://developers.google.com/blockly/guides/overview
1. 将页面的重要内容概括和摘要整理到这里
2. 配有相应的图片和解释（block/workspace/js generator等重要元素）
```

### 基于Blockly的平台 

* App Inventor

  App Inventor 原是Google实验室（Google Lab）的一个子计划，由一群Google工程师和勇于挑战的Google使用者共同参与设计完成；现在以完全移交MIT，由其运营。 App Inventor是一个完全基于云端的在线开发Android编程环境，抛弃复杂的程式代码而使用积木式的堆叠法来完成Android程式，使得所有人，包括孩子们，都可以在浏览器上构造具有全部功能的手机、平板app。

  这款软件基于Blockly开发，实现了对安卓移动端应用的自定义块，同时作为一款程序设计教育app，其搭建的界面也更加符合儿童趣味。

  

* Scratch Game

  Scratch是麻省理工学院开发的一款简易图形化编程工具。几乎所有的孩子都会一眼喜欢上这个软件。建立起做编程的欲望。建立程序的过程，用到涂鸦，录音，找图片这些有趣的过程。孩子的成品可以通过软件直接发布到官方网站上。官方网站给每个注册用户开通了一个个人空间，放置发布的程序。用户发布后的程序，在官网可以找到。制作中的程序只能在软件环境下运行，发布后的程序则是在网页内运行的。就是说，孩子们的作品可以通过网络被无数人看到。官方网站具有交友和评论的功能。国内亦有类似官网发布程序后在网页内运行的网站，方便国内爱好者和孩子们对作品进行交流。

  

* Blockly Game

  Blockly Game是一系列用Blockly搭建的有助于编程教学的教育游戏。它专为那些之前没有接触过计算机编程孩子们设计， 以利用积木式编程来解决趣味问题的形式帮助训练学生们的计算机科学认知和能力。

  ![blockly_game.png](image/blockly_game.png)

  当完成了这些形式多样而由浅入深的游戏，玩家就做好了开始传统文本式编程的准备。

  可以说，Blockly Game就是专门设计的Blockly 实例。

  

```
查看相应的网站
每个平台的内容应该包含以下部分
1. 平台的简单介绍 （是什么，提供了什么新的功能）
2. 平台和Blockly之间的关系（如何基于Blockly，和Blockly有什么不同）
```

### 相关的论文

- #### Ten Things We’ve Learned from Blockly        

  在过去对的四年里，Blockly的团队已经在积木式编程的领域学到了很多教训，所以总结了十点Bockly团队或者别的开发者都共同犯过的错误，以供后面的开发者在实践前有所注意。

  

- #### Tips for Creating a Block Language with Blockly

  Blockly是一个开源库，使得用户和开发者可以很容易地在一个app里实现添加积木的视觉式编程。它被设计得非常灵活，并且支持很多不同的性质。它在动画编程、故事脚本创作、机器人操控，甚至是生成合法文档等领域都大展身手。但是Blockly它自己并不是一种语言，开发者们只是用Blockly来创造自己的语言。所以当开发者们用Blockly制作app时，应该十分仔细地考虑块的样式，要用哪些块，以及对他们用户来说合适的API和语言特色。本文即是对此过程提供建议。

  

- #### 基于blockly的机器学习   

  随着网络技术的发展和计算机设备在家庭、学校的普及，编程的门槛越来越低，因此许多对象为未接触过编程的初学者的软件技术出现，其中，可视化编程是编程入门的得力工具，Blockly就是其中之一。Blockly可以以块状图形堆叠来创建程序。每个块状图形都是程序的一部分，可以组合它们以建立简单的功能，然后结合一个个简单的功能来编写程序。只需要拖动鼠标来将不同的代码块组合起来，不需要敲击键盘便可以得到合适的代码。机器学习的概念或许很陌生，但是人工智能在许多领域打败传统人类的事件所有人应该都听说过。机器学习便是人工智能的核心，他通过专门研究计算机如何通过大量训练来模拟或实现人类的学习行为，掌握新的知识或技术，重构已经有的知识结构，持续提高自己的性能。使用Blockly进行机器学习研究，使非本专业或对机器学习感兴趣的入门者可以进行研究和使用。很多人认为机器学习需要复杂而繁琐的程序，使用Blockly，即使没有碰过代码的人也可以在拖动块中轻松进行机器学习。目前，Blockly经常用于中小学信息技术课程的编程学习，由于代码程序打包，图形编程工具的优势越来越大。Blockly是基于web平台的图形编程工具，可以在任何系统平台上进行在线和离线版本操作的编程，并可以在教室主机现场构建服务器平台、web界面实时编程、测试编程结果。还可以用于中小学信息技术课程中对机器学习感兴趣的学生练习简单的机器学习。本文探讨了如何将Blockly与机器学习相结合。

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

### 时代的趋势：编程的通用型提高，门槛降低

在二十一世纪的信息化时代，编程的重要性毋庸置疑。但是更加重要的是，编程任务在走出传统的生产环境，融入到各行各业当中。

```
1. Blockly的应用领域比较狭窄：教育领域
2. 希望拓展Blockly到具有生产能力和解决问题能力的场景中来
3. 拓展到Java语言（支持强类型语言，OOP和现有的库函数）
4. 平台化和易扩展的的定制化
```



## 项目的分析和总体介绍（宋子阳，俞哲轩）

### 使用场景

在许多任务驱动型的项目中，往往会要求工作人员进行一定量的技术性工作，以完成某些目标。但是这些技术性的工作，往往都是功能性的、且对于非专业人士来说，具有一定的上手难度——譬如编写一个网页爬虫脚本、搭建一个轻量级神经网络、制作一个简易的网页小游戏等。

我们期望将这些技术性工作“抽象化”、“模块化”、“Blockly化”，将程序复杂的代码实现，浓缩于一个个小巧精美的blockly积木中，允许我们的用户在没有太多编程基础的前提下，只要对于自己的任务有清晰的认识，即可用积木“搭建”出他需要的程序，并且成功运行、取得他所希望的结果。

让我们亲自来搭建一个**卷积神经网络**，看看用代码一步步实现对比用积木一块块搭建的区别：

对于一个标准化的CNN，通常需要`“Convolution - ReLU - Pooling - Affine - ReLU - Affine - Softmax”`一共七层，为了描述的简单化，我们采用如下五层结构`“Convolution - ReLU - Pooling - Affine - Softmax”`来构建我们的`“SimpleConvNet”`

如果用Python代码构建框架，其大致结构如下：

```python
class SimpleConvNet:
    def __init__(self, input_dim=(1, 28, 28),
                 conv_param={'filter_num':30, 'filter_size':5,
                             'pad':0, 'stride':1},
                 hidden_size=100, output_size=10, weight_init_std=0.01):
      
        # get initial parameter from conv_param
        filter_num = conv_param['filter_num']
        filter_size = conv_param['filter_size']
        filter_pad = conv_param['pad']
        filter_stride = conv_param['stride']
        input_size = input_dim[1]
        conv_output_size = (input_size - filter_size + 2*filter_pad) / \
                            filter_stride + 1
        pool_output_size = int(filter_num * (conv_output_size/2) *
                               (conv_output_size/2))
        
        # initialize weights and biases
        self.params = {}
				self.params['W1'] = weight_init_std * \
                    np.random.randn(filter_num, input_dim[0],
                                    filter_size, filter_size)
				self.params['b1'] = np.zeros(filter_num)
				self.params['W2'] = weight_init_std * \
                    np.random.randn(pool_output_size,
                                    hidden_size)
				self.params['b2'] = np.zeros(hidden_size)
        
        # build layers of the neural network
        self.layers = OrderedDict()
				self.layers['Conv1'] = Convolution(self.params['W1'],
                                   self.params['b1'],
                                   conv_param['stride'],
                                   conv_param['pad'])

				self.layers['Relu1'] = Relu()
				self.layers['Pool1'] = Pooling(pool_h=2, pool_w=2, stride=2)
				self.layers['Affine1'] = Affine(self.params['W2'],
                              self.params['b2'])
				self.last_layer = softmaxwithloss()
```

而如果我们采用Blockly搭建我们的神经网络，其大致结构如下：

<img src="image/CNN-1.jpeg" alt="CNN-1" style="zoom: 67%;" />

也就是说，只需要我们的使用者，清楚一个卷积神经网络需要哪些层来构成，然后依次拖动我们的积木块拼接起来，输入各种块预先定义好，由使用者自行设定的参数（例如`input size`、`padding`、`stride`等），就可以成功搭建一个神经网络——而且，“Blockly神经网络“也足够强大，能够完成大部分“代码神经网络”需要完成的任务，因为，每一块Blockly的背后也是代码。

我们会为我们的项目，搭建一个**公共平台（Public Workspace）**，允许使用者自由地使用已经封装好的各种积木，去实现他们所需要完成的任务。我们也会为各种特定任务，建立各类**“Blockly仓库”**，里面**专门**存放完成这项任务，可能会需要的各种积木块。让我们继续以搭建卷积神经网络为例：

<img src="image/CNN-2.jpeg" alt="CNN-2" style="zoom:67%;" />

我们会在**Workspace**中，专门开辟一个**Neural Network Category**，将所有用来搭建神经网络的块放在其中，如`Affine`、`ReLU`、`Convolutional`、`Max Pooling`、`Softmax`、`Sigmoid`、`Tanh`等——只要你可能会使用到的，我们都会提供。而使用者，只需要拖动积木块，拼接在一起，输入必须的参数，就完成了搭建一个性能优越的神经网络。

### 目标用户

至此，你可能不禁会产生这样的疑问：“那这些预先定义好的积木块是哪里来的呢？难道全部都是我们项目组自行定义的吗？那维护成本不会很高吗？”

我们项目组确实会预先定义一些常用的功能块，但是这显然会被局限在一个较小的范围内，也无法为更多特定功能提供预定义好的积木块。而如果采取不断更新补充的方式的话，又会使工作量大大增加，且效率不高。

因而，我们会提供一个**公共开发平台（Public Block Factory）**，允许既熟悉代码语法，又对Blockly开发有简单了解、或是乐意花简短的时间做了解的开发者，设计并上传自己定义的积木块。在我们项目组进行测试和审核之后，会加入相关任务的**Category**或者新建全新的**Category**用于添加这些新加入的积木块进入**Public Workspace**。

#### 开发者

开发者该如何自定义一个代码块呢？让我们以卷积神经网络中的**Softmax Layer**为例：

<img src="image/CNN-3.jpeg" alt="CNN-3" style="zoom: 50%;" />

1. 开发者先用程序语言定义底层的代码和结构（目前支持`Java`），包括类的字段、构造方法以及其它方法；
2. 构建完以`Java`为基础的代码之后，通过**配置文件**转化成Blockly积木块
3. 我们把***Java Code***转化为***Json***对象，通过***Json***对象再重构出***Blockly***

（实现细节请参见：下一部分—一个Java转Block的代码示例）

#### 使用者

对于使用者来说，使用Blockly积木块开发应用程序非常简单，只需要在我们提供的**公共平台（Public Workspace）**上找到自己任务相关的积木块，根据程序逻辑逐块搭建，输入要求的相关参数，即可实现相应的应用程序。

构建完成的**组合Blockly**本身，即是一个可运行程序，可以完成相关任务；同时，我们也会提供**组合Blockly**对应的程序代码，使用者将代码转移至与程序语言对应的文件中，亦可以运行程序，完成相关任务。

## 项目的实现和进展

###垂直领域的定义：爬虫

我们利用已有的Blockly的平台内容，搭建了一个简单的基于python的爬虫模块。

我们实现了以下的函数并且创建了相应的block:

*getPage(url):向url发送请求，获取页面和相应
*getHtml(page):解析获取page的html
*getElement(page,elementName):获取page html中的所有elementName元素，作为列表返回。

```javascript
Blockly.Blocks['web_init'] = {
    init: function() {
        this.appendDummyInput()
            .appendField("init");
        this.setNextStatement(true, null);
        this.setColour(230);
        this.setTooltip("");
        this.setHelpUrl("");
    }
};
Blockly.Blocks['web_getPage'] = {
    init: function() {
        this.appendValueInput("url")
            .setCheck("String")
            .appendField("getPage")
            .appendField("url");
        this.setOutput(true, null);
        this.setColour(230);
        this.setTooltip("");
        this.setHelpUrl("");
    }
};
Blockly.Blocks['web_getHtml'] = {
    init: function() {
        this.appendValueInput("page")
            .appendField("getHtml")
            .appendField("page");
        this.setOutput(true, null);
        this.setColour(230);
        this.setTooltip("");
        this.setHelpUrl("");
    }
};
Blockly.Blocks['web_getElement'] = {
    init: function() {
        this.appendValueInput("page")
            .setCheck(null)
            .appendField("page");
        this.appendValueInput("element")
            .setCheck(null)
            .appendField("element");
        this.setInputsInline(true);
        this.setOutput(true, null);
        this.setColour(230);
        this.setTooltip("");
        this.setHelpUrl("");
    }
};
```

下面是本例的一个简单应用

<img src="image/webdemo.jpg" alt="webdemo" style="zoom: 50%;" />

运行生成的代码，能够成功读取网页信息

<img src="image/weboutput.jpg" alt="weboutput" style="zoom: 50%;" />

###一个简单的XML2Java的demo （潘星宇、俞哲轩）

**问题描述：**

Blockly 使用者通过拖动 ToolBar 中各种不同的 Block 进行组合，形成一段代码块。Blockly 提供了将这些组合起来的 Block 转为 XML 的工具，通过组合模式将使用者搭建的积木转换为一段 XML，需要完成的工作则是将这一段 XML 转换为 Java 代码。
$$
XML —(program)—> JavaCode
$$
如<img src="./image/Block1+2.png" alt="image-20201105201539612" style="zoom: 50%;" />这一积木块的组合对应的 XML 如下：

```xml
<xml xmlns="https://developers.google.com/blockly/xml">
    <block type="math_arithmetic" id="kEM-l?saK!c*to)OC25D" x="65" y="260">
        <field name="OP">ADD</field>
        <value name="A">
            <block type="math_number" id="c5R{{/S]E5[2z[vEe79f">
                <field name="NUM">1</field>
            </block>
        </value>
        <value name="B">
            <block type="math_number" id="~R11dx!*0INIHuy)=YJV">
                <field name="NUM">2</field>
            </block>
        </value>
    </block>
</xml>
```

\<block> 标签中 id, x, y 三个属性被前端用于展示（id 用于唯一标识一个block；x,y用于表示block在页面中的位置），与输出的 java code 无关。

程序的目标就是通过解析这个 XML 文件，生成与之对应的 java code，如上述 XML 的目标代码为：

```java
1 + 2
```

如 <img src="./image/recursive-print.png" alt="image-20201105202741919" style="zoom:50%;" />对应的 XML 如下：(block 的 id,x,y 属性已省略)

```xml
<xml xmlns="https://developers.google.com/blockly/xml">
    <block type="text_print">
        <value name="TEXT">
            <block type="logic_compare">
                <field name="OP">EQ</field>
                <value name="A">
                    <block type="math_arithmetic">
                        <field name="OP">ADD</field>
                        <value name="A">
                            <block type="math_number">
                                <field name="NUM">1</field>
                            </block>
                        </value>
                        <value name="B">
                            <block type="math_number">
                                <field name="NUM">2</field>
                            </block>
                        </value>
                    </block>
                </value>
                <value name="B">
                    <block type="math_number">
                        <field name="NUM">3</field>
                    </block>
                </value>
            </block>
        </value>
    </block>
</xml>
```

对应的 java code 为：

```java
System.out.println(1 + 2 == 3);
```



**支持子集：**  

我们共支持五种Block和java代码之间的转换。将五种Block分为三类，第一类是value类型，包括number block和text block；第二类是binary operator类型，包括math arithmetic block和logic ocmpare block；第三类是statement类型，包括print block，该block是唯一能够构成一条完整语句的block。

1. Number block：  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/number_block_123.png" width="10%" height="10%">  

   在number block中输入123就会在java中转成123。  

2. Text block：  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/text_block_hello.png" width="20%" height="20%">  

   在text block中输入hello world，就会在java中转成"hello world"。  

3. Math arithmatic block：  
   math arithmetic block支持+、-、×、÷、^五种运算，该block左右两边可以插入number block或math arithmetic block。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/math_arithmetic_block1.png" width="20%" height="20%">   

   若在block中输入123+123，这实际上是在math arithmetic block中生成了两个number block，并对其数值进行+运算，在Java中就会被转换为算式(123 + 123)。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/math_arithmetic_block2.png" width="20%" height="20%">     

   特别地，若在block中输入2^16，在Java中就会被转换为Math.pow(2,16)。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/math_arithmetic_block3.png" width="30%" height="30%">   

   若一个block应用+运算，在其左边输入123，在右边拖入一个新的arithmetic block，应用×运算，并输入345和678，实际上是在一个math arithmetic block中内嵌了一个number block、另一个math arithmetic block及其内嵌的两个number block，在Java中就会被转换为算式(123 + (345 * 678))。 

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/math_arithmetic_block4.png" width="40%" height="40%">  

   若一个block应用+运算，在其左边拖入一个新的math arithmetic block，应用×运算，输入12、13，右边也拖入一个新的math arithmatic block,应用÷运算，输入14、15，实际上是在一个math arithmetic block中内嵌了两个arithmetic block和四个number block，在Java中就会被转换为算式((12 * 13) +(14 / 15))。  

   以此类推，我们可以对更多的number block和math arithmetic block的进行组合，实现更复杂算式。  

4. Logic compare block：  
   logic compare block支持＝、≠、＜、≤、＞、≥六种运算，该block左右两边可以插入（number block，number block），（number block，math arithmetic block），（math arithmetic block，math arithmetic block），（text block，text block）四种组合。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/logic_compare_block1.png" width="20%" height="20%">   

   若一个block应用=运算，左边输入123，右边输入123，在Java中就会被转换为(123 == 123)。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/logic_compare_block2.png" width="30%" height="30%">   

   若一个block应用>运算，左边输入123，右边拖入一个应用+运算的math arithmetic block并输入23和45，在Java中就会被转换为(123 > (23 + 45))。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/logic_compare_block3.png" width="40%" height="40%">   

   若一个block应用≤运算，在左边拖入一个应用+运算的math arithmetic block并输入12和34，在右边拖入一个应用×运算的math arithmetic block并输入12和34，在Java中就会被转换为((12 + 34) <= (12 * 34))。  

   特别地，当block的左右两边是text block时，会进行字符串比较。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/logic_compare_block4.png" width="30%" height="30%">  

   若对block应用=运算，并在其左右拖入两个text block并输入123，在Java中就会被转换为("123".eqauls("123"))。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/logic_compare_block5.png" width="30%" height="30%">  

   若对block应用＞运算，并在其左右拖入两个text block并输入123，在Java中就会被转换为("123".compareTo("123") > 0)。  

5. Print block：  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/print1.png" width="15%" height="15%">   

   print block 可以和其他四种block组合，在Java中会被转换为System.out.print()语句。  

   <img src="/Users/william/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/9dd8e9d6daca5c75244bf9702910287c/Message/MessageTemp/264e9c5f7750189694a288a926026afc/File/midterm/image/print2.png" width="20%" height="20%">   

   另外，print block也可以和自己拼接，组合成多条打印语句。  

   

**实现架构：**

**（1）**```class Parser```

程序的核心函数 ```parseXMLtoJavaCode(String xmlFilePath)```位于类 ```Parser```中。

```java
public class Parser {
    public static List<String> parseXMLtoJavaCode(String xmlFilePath){...}

    public static Block_node parseNodeToBlockNode(Node node, 
                                           Set<String> validTypeSet){...}
    private static Node getXMLRootNode(String xmlFilePath){...}
}
```

**①** ```getXMLRootNode(String xmlFilePath){...}``` 利用已有库解析目标XML文件，并返回根节点。

**②** ```parseNodeToBlockNode(Node node, Set<String> validTypeSet){...}``` 接受一个 XML 中 Node，并返回与之对应的 Block_node 。这个方法将被递归调用。

**③** ```parseXMLtoJavaCode(String xmlFilePath){...}``` 先调用 ```getXMLRootNode``` 得到 XML 根节点，再从根节点开始递归解析。

<u>注：XML中可能包含不止一个代码块，因此方法的返回值为 ```List<String>``` ，如：</u>

<img src="/image/two-part-blocks.png" alt="image-20201105204914244" style="zoom:50%;" />

对应 XML 解析后返回一个 ```List res```，则 ```res``` 包含两个字符串：

```java
(1 + 2) == 3
```

```java
System.out.println("Hello world");\nSystem.out.println(10);\n
```



**(2)** ```interface Block_node``` 

此接口将被不同类型的具体 node 实现。其中包含两个方法：

```java
    String toJavaCode();
    String toXML();
```

由于对于一个运算而言，运算的左值与右值本身也有可能是一个运算。使用接口就可以有效解决这个问题。



**(3)** **specific classes** that implements ```Block_node```

共有五个类实现了接口，分别对应支持的五种 block ，包括 ```Math_number_node```, ```Math_arithmetic_node```, ```Logic_compare_node```, ```Text_node```, ```Text_print_node```。每一个具体类型都实现了各自具体的 ```toJavaCode()``` 与 ```toXML()``` 方法。







实现细节：  
以math arithmetic block为例：  
1. 构造函数：共有三个成员变量，分别代表该block的左右子节点及其运算符。
	```java
	private Math_arithmetic_node(Block_node val_A, Block_node val_B, String op) {
		this.val_A = val_A;
		this.val_B = val_B;
		this.op = op;
	}
	```
2. 静态工厂方法：  
	在该方法中传入待解析的block node，获得它的所有子节点列表nodeList，再通过node.getTextContent的方法获得待解析运算符。通过nodeList的长度，判断该block有几个操作数，调用构造函数创建其对应的Math_arithmetic_node实例并返回。
	```java
	String op = nodeList.item(1).getTextContent(); // 待解析运算符
	if (nodeNum == 2) { // 只有运算符
    	return new Math_arithmetic_node(null, null, op);
	} else if (nodeNum == 4) { // 有一个操作数
        Node currChild = nodeList.item(3);
        String type = currChild.getAttributes().getNamedItem("name").getTextContent();
        if (type.equals("A")) { // 左操作数
            return new Math_arithmetic_node(Parser.parseNodeToBlockNode(currChild.getChildNodes().item(1), validTypeSet), null, op);
        } else { // 右操作数
            return new Math_arithmetic_node(null, Parser.parseNodeToBlockNode(currChild.getChildNodes().item(1), validTypeSet), op);
        }
    } else { // 两个操作数
        Node val_A = nodeList.item(3).getChildNodes().item(1);
        Node val_B = nodeList.item(5).getChildNodes().item(1);
        return new Math_arithmetic_node(Parser.parseNodeToBlockNode(val_A, validTypeSet), Parser.parseNodeToBlockNode(val_B, validTypeSet), op);
    }
	```
3. toJavaCode():  
   在该方法中生成block对应的Java代码。如果block的左右子节点不为空，就递归地调用它们的toJavaCode方法，获取子节点对应的Java代码。再根据运算符对其进行拼接，拼接好的字符串即是该block对应的Java代码。
	```java
	public String toJavaCode() {
        String opToJava = "";
        String a = "";
        String b = "";

        if (val_A != null) {
            a = val_A.toJavaCode();
        }
        if (val_B != null) {
            b = val_B.toJavaCode();
        }

        switch (op) {
            case "ADD":
                opToJava = "(" + a + " + " + b + ")";
                break;
            case "MINUS":
                opToJava = "(" + a + " - " + b + ")";
                break;
            case "MULTIPLY":
                opToJava = "(" + a + " * " + b + ")";
                break;
            case "DIVIDE":
                opToJava = "(" + a + " / " + b + ")";
                break;
            case "POWER":
                opToJava = "Math.pow(" + a + ", " + b + ")";
                break;
        }
        return opToJava;
    }
	```
4. toXML():  
   在该方法中将Math_arithmetic_node实例重新转为xml。通过调用其左右子节点的toXML方法获取子节点的xml字符串，并对其进行拼接，即可获得该node对应的xml字符串。
	```java
	public String toXML() {
        String a = val_A.toXML();
        String b = val_B.toXML();
        return "<block type=\"math_arithmetic\" id=\"\" x=\"\" y=\"\">" +
                "<field name=\"OP\">" + op + "</field>" +
                "<value name=\"A\">" + a + "</value>" +
                "<value name=\"B\">" + b + "</value>" +
                "</block>";
    }
	```

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



####（一）实现Java Method和Blockly Block的一一对应

首先，我们将Method（Java）和Block（Blockly）作了一一映射。

在Java中，一个Method由以下三部分组成。

1. 方法签名 (signature) （包括方法的名称和方法的参数类型列表）
2. 返回类型 （方法返回的参数类型）
3. 方法主体 （方法的主代码块）

在Blockly中，一个Block由以下的部分组成

1. Block Type （Block的类型）
2. Block Message （描述Block的功能，也可以看作Block的Name）
3. args （Block在建立的时候所需要的参数，包含参数类型和参数名称）
4. Output（Block输出的类型）
5. 其他辅助功能（Tips/ manual）



因此， Java的Method和Blockly的Block有天然的对应关系。我们将使用以下的对应关系。

| Java                 | Blockly           |
| -------------------- | ----------------- |
| Method Name          | Block Message     |
| Method Return Type   | Block Output Type |
| Method Argument List | Block args        |
| Method Body          | 新增Code Body     |

在实现上，我们通过实现了Java Annotaion Blockly对Java的Method进行标注。Annotation如下

```java
public @interface Blockly {
    String returnType() default "";
    String methodName() default "";
    String methodBody() default "";
    String[] argType();
}
```

对应的Method标注例子如下

```java
@Blockly(returnType = "Integer", methodName = "calcArea@I_String", argType = {"Integer", "String"})
public int calcArea(int deprecatedI, String deprecatedS){
  return this.width * this.height;
}
```

之后，再通过Java Annotaion提供的反射机制和Java Back Engine的preprocessor程序，将每一个Annotated的Method转成一个Block的定义文件JSON

**注意** 由于Blockly中并没有类方法和的概念，所有的Block都可以被看作是global的一个Method，因此我们默认Block的第一个参数默认传入的是Class Instance。在这一点上，这和Python的self参数非常相似。一个Method的Block定义如下

```javascript
Blockly.defineBlocksWithJsonArray([{
  "type": "getArea",
  "message0": "get area of %1",
  "args0": [
    {
      "type": "input_value",
      "name": "rectangle_instance",  //注意到，第一个参数是rectangle_instance, 也就是self
      "check": ["Variable", "rectangle_instance"],
    },
    {... //Other Arguments}
  ],
  "output": "Number"
}])
```





#### （二）在Method和Block对应的基础上，实现Java Field和Block的对应

Java Field主要包含两种变量，一种是Private变量，一种是Public的变量。经过讨论分析，我们认为private的变量是 ***开发者*** 在定制工具箱的过程中会使用到的内部变量，通过Private的方式进行模块化隐藏内部实现，因此没有必要在前端Block中进行展示和使用。因此，对于Private变量，后端的Java Engine会直接在生成Block过程中忽略。对于Public的变量，由于Block中没有类变量这样的概念，因此我们采取这样的对应方式：

对于每一个Public变量，我们自动生成变量的getter和setter的方法，同时改变变量的可见性从Public成为Private。也就是说，对于每一个public变量，我们都生成两个Java Method，对应的功能就是getter和setter。我们将这两个Method方法通过（一）中描述的方式转换成对应的Block。

| Java          | Blockly                       |
| ------------- | ----------------------------- |
| Private Field | (concealed)                   |
| Public Field  | Getter/Setter Method, Ref(一) |

到此为止，我们已经实现了Java Class中Member Method和Field和前端Block对应的关系。





####（三）在Member Method和Field和Block对应的基础上，实现特殊的Class成员对应关系

我们还需要解决的对应是Constructor和Static Methods和Static Fields和Blockly的关系

* Constructor

  我们最终决定将Constructor实现成一个普通的Initialization Member Method。由于Blockly不存在“当一个对象生成的时候进行空间分配并且调用Constructor进行初始化”的相关概念和能力，因此我们决定将采用古老的C Style初始化方式。也就是说，将Constructor映射成以NewInstance开头的一个普通Method成员，并且要求用户在使用Class的时候通过这个方式进行对象的初始化。

* Static Fields

  我们将Static Field实现成一个Global Variable。通过在取名的时候在之前加上类似__${_CLASS_NAME}__的标注符号来指明这个变量是属于这个Class的。这一点上也非常的C Style。但是由于这个过程是我们的Java Engine和前端Parser自动加上和移除前缀的，因此能够保证不出现namespace violation的情况出现。

* Static Methods

  由于Static Methods基本上都会和Static Fields变量进行绑定，因此我们同样采取，将Static Method实现成一个通用的Method，并且将Static Field作为Argument进行传入的方式来对其进行对应。

| Java           | Blockly                               |
| -------------- | ------------------------------------- |
| Constructor    | Positive Called Initialization Method |
| Static Fields  | Global Variable with prefix           |
| Static Methods | Method with Static Fields as Args     |

#### 例子

一个Java Class，为Rectangle类定义如下

```java
/* Class Rectangle包括三个fields, 一个constructor和一个method*/
public class Rectangle {
    public int width;
    public int height;
    public String color;

    @Blockly(returnType = "Integer", methodName = "_rect_calcarea@integer_string", argType = {})
    public int calcArea(){
        return width * height;
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
}
```

对应的前端Block（第一个是构造函数，第二个是width的getter，第三个是一个member method）

![custom_blocks](./image/custom_blocks.png)

对应的usage

![custom_blocks_usage](./image/custom_blocks_usage.png)

这一段对应代码

```java
Rectangle rect = new Rectangle(123, 10+23, "red");
System.out.println(rect.getWidth());
System.out.println(rect.getArea());
```

