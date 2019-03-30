package com.Glimmer.StructuralType.AdapterPattern;

/**
 * Adapter 适配器角色
 * 实现目标接口的方法，调用被适配的对象的方法
 * @author Glimmer
 *
 */
public class Adapter implements Target{

	Adaptee adaptee = new Adaptee(); // 采用组合形式，不采用类继承的方式实现适配器，因为Java单继承。

	public Adapter(Adaptee adaptee) { // 构造器传入被适配的对象
		this.adaptee = adaptee;
	}

	@Override
	public void Request() {
		adaptee.specificRequest(); // 调用被适配器的方法。
	}
	
}
