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
	
	// 提供方法获取实例
	public static Shape getShape(int id) {
		// 提供正确的方法获取实例
		Shape shape = shapMap.get(id);
		return shape;
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
