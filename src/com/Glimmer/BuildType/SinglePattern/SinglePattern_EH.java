package com.Glimmer.BuildType.SinglePattern;

/**
 * 单例模式——饿汉式： 线程安全，执行效率高，无延迟加载效果。
 * 类一加载就new一个静态实例。
 * 
 * @author Glimmer
 *
 */
public class SinglePattern_EH {

	// 1.私有化构造方法，阻止外界直接new实例
	private SinglePattern_EH() {}

	// 2.类一加载就new实例，所以没有延迟加载效果。
	private static SinglePattern_EH instance = new SinglePattern_EH();
	
	// 3.给外界提供一个静态方法获取实例，简单工厂模式也称静态工厂方法（不通过new而通过静态方法返回实例）。
	public static SinglePattern_EH getInstance() {
		
		return instance;
	}
	
}
