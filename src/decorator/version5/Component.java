package decorator.version5;

/**
 * 定义一个对象接口,可以给对象动态添加职责(在本仓库下,接口不是指interface,
 * 而是指多态)
 * 
 * 所有的装饰组件和基础组件是组件的子类
 * 根据类图和定义,其它的类就不多加注释了,根据类名就可以看出它的职责
 *
 * @author 黄二狗
 *
 */
public abstract class Component {
   abstract void operation();
}
