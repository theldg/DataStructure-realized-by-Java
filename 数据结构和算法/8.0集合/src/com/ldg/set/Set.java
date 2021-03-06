package com.ldg.set;

public interface Set<T> {
	// 集合的大小
	int size();

	// 是不是空集合
	boolean isEmpty();

	// 清空集合
	void clear();

	// 是否包含某元素
	boolean contains(T element);

	// 添加元素
	void add(T element);

	// 移除元素
	void remove(T element) throws Exception;

	// 遍历集合
	void traversal(Vistor<T> vistor);

	// 提供外界自定义遍历结果如何显示接口
	public static abstract class Vistor<T> {
		// 是否停止标志
		boolean flag = false;

		// 具体怎么操作元素
		public abstract boolean visit(T element);

	}

}
