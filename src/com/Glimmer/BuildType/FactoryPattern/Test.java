package com.Glimmer.BuildType.FactoryPattern;

/**
 * 工厂模式:在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的对象，而是针对不同的对象提供不同的工厂。
 * 也就是说 每个对象都有一个与之对应的工厂，是在工厂模式家族中是用的最多模式，一般项目中存在最多的就是这个模式。
 * 
 * 特点：1个产品抽象类，多个工厂类
 * @author Glimmer
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
			Circle circle = (Circle) Class.forName("com.BuildType.FactoryPattern.CircleFactory").newInstance();
			circle.drawing();
	}
}
