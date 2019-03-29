package com.Glimmer.BuildType.SinglePattern;

/**
 * 单例模式——懒汉模式2：线程安全，延迟加载，效率低。
 * @author Glimmer
 *
 */
public class SinglPattern_LH2 {

	// 1.私有化构造方法
	private SinglPattern_LH2() {}

	// 2.提供静态变量，但不初始化。
	private static SinglPattern_LH2 instance;
	
	// 3.对外提供静态方法返回实例,避免多线程调用该方法new多个实例，加同步synchronized，效率低。
	public synchronized static  SinglPattern_LH2 getInstance() {
		if ( instance == null ) {
			return new SinglPattern_LH2();
		}
		return instance;
	}
}
