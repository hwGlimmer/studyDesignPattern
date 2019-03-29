package com.Glimmer.BuildType.SinglePattern;

/**
 * 单例模式——双重锁（ double-checked locking）
 * 由于JVM底层内部模型原因，偶尔会出问题。不建议使用
 * @author Glimmer
 *
 */
public class SinglPattern_DCL {

	// 1.私有化构造方法
	private SinglPattern_DCL() {}

	// 2.提供静态变量，但不初始化。
	private static SinglPattern_DCL instance;
	
	// 3.对外提供静态方法返回实例,只对需要锁的代码部分加锁，可以提高执行效率。
	public  static  SinglPattern_DCL getInstance() {
		if ( instance == null ) {
			synchronized(SinglPattern_DCL.class) {
				if ( instance == null ) {
					return new SinglPattern_DCL();
				}
			}
			
		}
		return instance;
	}
}
