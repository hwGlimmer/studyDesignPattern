package com.Glimmer.BuildType.PrototypePattern;

/**
 * 原型模式：使用原型模式来复制一个对象自身，从而克隆出多个与原型对象一模一样的对象。
 * 场景：
 * 1.对象种类繁多，无法将他们整合到一个类的时候；
 * 2. 难以根据类生成实例时；
 * 3. 想解耦框架与生成的实例时。
 * 缺点：
 * 1.需要为每一个类配备一个克隆方法，而且这个克隆方法需要对类的功能进行通盘考虑，这对全新的类来说不是很难，
 *   但对已有的类进行改造时，不一定是件容易的事，必须修改其源代码，违背了“开闭原则”。
 * 2.在实现深克隆时需要编写较为复杂的代码。
 * @author Glimmer
 *
 */
public class Test {

	public static void main(String[] args) {
		ShapeCached.Load();
		
		Shape shape = ShapeCached.getShape(1);
		System.out.println(shape.getType());
		shape.drawing();
	}
}
