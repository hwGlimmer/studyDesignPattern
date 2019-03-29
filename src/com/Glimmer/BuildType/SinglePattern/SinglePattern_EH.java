package com.Glimmer.BuildType.SinglePattern;

/**
 * 单例模式——饿汉式，加载就初始化。
 * 
 * @author Glimmer
 *
 */
public class SinglePattern_EH {

	// 私有化构造方法，阻止外界直接new实例
	private SinglePattern_EH() {}

	// 静态变量，初始化实例
	private static SinglePattern_EH instance = new SinglePattern_EH();
	
	// 给外界提供一个接口返回自身实例
	public SinglePattern_EH getInstance() {
		
		return instance;
	}
	
}
