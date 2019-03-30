package com.Glimmer.StructuralType.AdapterPattern;

/**
 * 建造型模式——适配器模式：将一个类的接口转换成客户希望的另外一个接口。
 *                  Adapter 模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @author Glimmer
 *
 */
public class Test {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		adapter.Request();
	}
}
