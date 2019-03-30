package com.Glimmer.BuildType.SimpleFactoryPattern;

/**
 * Factory 工厂角色
 * 
 * @author Glimmer
 *
 */
public class ShapeFactory {

	// 1.根据传入的值决定返回哪一个实例,没增加一个类型需改动这里的判断代码，违反“开闭原则”。
	public IShape getShapeByStr(String type) {
		if (type == null) {
			return null;
		} else if(type.equalsIgnoreCase("cir")){
			return new Circle();
		} else if(type.equalsIgnoreCase("rec")){
			return new Rectangle();
		}
		return null;
	}
	
	// 2.利用反射改善简单工厂
	public Object getShapeByClass(Class< ? extends IShape > clazz ) {
		Object object = null;
		try {
			 object = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
