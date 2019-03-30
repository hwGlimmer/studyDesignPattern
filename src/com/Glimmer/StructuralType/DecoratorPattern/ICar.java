package com.Glimmer.StructuralType.DecoratorPattern;

/**
 * Component 被装饰类的基类
 * 定义一个对象接口，可以给这些对象动态添加职责。真实对象和装饰者对象有相同的接口，
 * 这样客户端不用知道内部有装饰者对象（Decorator）存在的，还是以之前处理真实对象的相同方式来和装饰者对象交互。
 * @author Glimmer
 *
 */
public interface ICar {

	public void move();
}
