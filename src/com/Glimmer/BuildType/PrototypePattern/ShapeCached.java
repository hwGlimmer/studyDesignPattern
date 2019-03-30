package com.Glimmer.BuildType.PrototypePattern;
import java.util.HashMap;

/**
 * Client 客户端角色： 负责使用复制实例的方法生成新的实例
 * @author Glimmer
 *
 */
public class ShapeCached {

	// 维护注册数据
	public static HashMap<Integer, Shape> shapMap = new HashMap<Integer, Shape>();
	
	// 提供一个获取新实例的方法
	public static Shape getShape(int id) throws CloneNotSupportedException {
		// 提供一个找出正确实例原型的方法
		Shape shape = shapMap.get(id);
		// 委托复制实例的方法生成新实例。
		return (Shape) shape.clone();
	}
	
	public static void Load() {
		Circle circle = new Circle();
		circle.setId(1);
		shapMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId(2);
		shapMap.put(2, rectangle);
		
	}
}
