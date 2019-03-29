package com.Glimmer.BuildType.SinglePattern;

/**
 * 单例模式——登记式/静态内部类:达到双检锁方式一样的功效,这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 注：遇到序列化对象是，默认的方式运行运行得到的是多例的。
 * 
 * @author Glimmer
 *
 */
public class SinglPattern_DJS {

	// 1.私有化构造方法
	private SinglPattern_DJS() {}

	// 2.静态类初始化实例
	 private static class innerClass{
		 private static SinglPattern_DJS instance = new SinglPattern_DJS();
	}
		
	// 3.对外提供静态方法返回实例,只对需要锁的代码部分加锁，可以提高执行效率。
	public  static  SinglPattern_DJS getInstance() {
		return innerClass.instance;
	}
}
