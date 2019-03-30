package com.Glimmer.BuildType.SimpleFactoryPattern;

/**
 * 简单工厂模式又称静态工厂方法模式：简单工厂模式并不是23种常用的设计模式之一，它只算工厂模式的一个特殊实现。
 *                        简单工厂模式在实际中的应用相对于其他2个工厂模式用的还是相对少得多，因为它只适应很多简单的情况
 * 特点：1个产品抽象类，1个工厂类
 * 
 * @author Glimmer
 *
 */
public class Test {

	public static void main(String[] args) {
		// 获取圆
		// 1.测试利用传值来获取实例
		ShapeFactory factory = new ShapeFactory();
		IShape circle = factory.getShapeByStr("cir");
		circle.drawing();
		
		// 获取矩形
		// 2.利用反射获取实例
		Rectangle rectangle = (Rectangle) factory.getShapeByClass(com.Glimmer.BuildType.SimpleFactoryPattern.Rectangle.class);
		rectangle.drawing();
	}
}
