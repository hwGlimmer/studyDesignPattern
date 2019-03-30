package com.Glimmer.BuildType.PrototypePattern;

/**
 * ProtoType 原型类角色
 * 1.实现Clonable接口
 * 2.重写clone()方法，也可只定义，交给子类去实现
 * @author Glimmer
 *
 */
public abstract class Shape implements Cloneable {

	private int id;
	protected  String type;
	
	// 定义要实现的方法
	public abstract void drawing();
	
	// 实现复制现有类的方法
	@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
