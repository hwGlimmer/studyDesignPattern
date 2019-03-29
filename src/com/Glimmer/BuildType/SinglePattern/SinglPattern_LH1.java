package com.Glimmer.BuildType.SinglePattern;

/**
 * 单例模式——懒汉模式1：非线程安全，延迟加载。
 * @author Glimmer
 *
 */
public class SinglPattern_LH1 {

	// 1.私有化构造方法
	private SinglPattern_LH1() {}

	// 2.提供静态变量，但不初始化。
	private static SinglPattern_LH1 instance;
	
	// 3.对外提供静态方法返回实例
	public static SinglPattern_LH1 getInstance() {
		if ( instance == null ) {
			return new SinglPattern_LH1();
		}
		return instance;
	}
}
