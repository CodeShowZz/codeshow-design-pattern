# TalkIsCheapInDesignPattern
## Talk is cheap,show me the code.

## 为什么建这个仓库
 看过大话设计模式,看过Head First设计模式,也有一本GOF.但是对我来说我看不下去Head First设计模式和大话设计模式了,可能由于大脑抗拒吧,而且GOF对我来说也可能有点深奥了,给出一些源码例子和一个基本的定义能让我迅速知道某个设计模式的最终意思。所以我决定从代码层面上学习设计模式。

## 代码表达不出模式吗？
其实很多模式就是前人写的各种重复的代码中提取的经典用法,所以假如你没听过XX模式,那么先去查一查资料,这模式是干嘛的,等你知道为什么要使用该模式了,认真研究代码自然一目了然。思考代码为什么这么写,为什么某些地方要把变量提取出来,举个例子:比如为什么装饰模式中装饰类要有一个指向Component对象的引用。

## 个人观点
GOF这本书被誉为设计模式的鼻祖,但很多人看来这本书有点难以理解,其实这本书中带有很强的主观感受,比如作者举的一些例子,我们没有见过就感觉陌生,加上作者以一种非常高层次的行文风格,导致这本书确实很难理解。但是模式何止23种呢,模式的起源不就是很多人写的代码中的优秀套路集锦吗？个人认为设计模式在关注它的高层定义的同时,应该深入到具体的例子当中,比如书中说代理模式的应用十分广泛,说了一大堆,但是不给你一个比较直接的代码实例,你可能就不知道怎么用了。说白了,学设计模式是为了更好的写代码。如果有人反驳说代码没那么重要,还是研究类与类之间的关系,把定义背的滚瓜烂熟了,就能很好的运用了,那就是个人的口味问题了。觉得Git创始人Linux说的那句话挺对的(毕竟我写的东西是靠它上传的):**Talk is cheap,Show me the code.**。 举个例子来说吧,假如我要学代理模式,我应该从"代理"这两个字出发,先想想代理大致是什么意思.很简单吧.当然这样还不足以知道这个设计模式的真实意思,这个时候可以去找一些关于将"代理"的代码看一看,我想如果能理解优秀的例子了,这个时候让你向别人解释代理是什么意思时你就很自信了,而且你都会写代码了,类图肯定也能画得出来,反而有可能是一开始给你一个类图和一串定义让你觉得这东西太难。

## 模式并非标准
模式只是一些前辈们使用得很多的套路,并不是一个标准,没有人让我们写代码的时候处处见模式,而是当我们觉得我们的代码太冗余,太恶心的时候.恰当的使用几个模式进去。

## 模式详情(按照个人觉得简单到难的顺序排列,如果不熟悉的话,结合代码才能理解）
 - TOP1 单例模式
 ### 标准定义
 > 保证一个类只有一个实例,并且提供一个访问它的全局访问点.
 ### 模式关键点
 - 私有化构造器
 - 定义一个静态的方法来实例化对象,但必须判断是否之前存在该对象,并且类中的引用也只能是静态的
 - 有预先生成实例或者延迟生成实例两种方式
 - 在多线程环境如果不加以控制,可能会出现多实例问题.
 
### 仓库中的代码
代码会以非常直观明了的方式来给出一个模式,当然这和个人的经验有关,当我发现某个著名的框架用到了某个模式,我将毫不犹豫的写到这个仓库中来.

### DEBUG
有的设计模式比较简单,很容易理解.有的设计模式就比较独特,一时间难以捕捉其奥妙,所以需要DEBUG跟踪一下到底如何变化的,可以加深印象。

### 更多的模式
这本书提供的源码已经算不错了,但未能包括经典的23种模式源码,但模式远远不止23种,所以在未来希望提供更多的"模式"代码,但我想"模式"也不能全信,让时间去验证代码是否成功才是硬道理吧。

### 简单粗暴的参考资料

## http://sourcemaking.com 
## 维基百科  https://en.m.wikipedia.org/wiki/Software_design_pattern

### 自勉
与其陷入各种模式的禁锢之中,不如随机应变.
