package com.qad.render;

/**
 * 
 * 渲染类别。
 * @author 13leaf
 *
 */
public enum RenderType {
	/**
	 * 根据设置的字段类型自动填充
	 */
	auto,
	/**
	 * 不填充
	 */
	none,
	/**
	 * 映射一个图片
	 */
	image,
	/**
	 * 映射一个文本的text
	 */
	text,
	/**
	 * 映射一个进度条的Progress
	 */
	progress,
	/**
	 * 映射一个复选框
	 */
	check,
	
	/*不常用的映射*/
	/**
	 * 映射一个暗示信息，常用于EditText类型
	 */
	hint,
	/**
	 * 映射二等进度条
	 */
	secondaryProgress,
	/**
	 * 映射RatingBar的星星数量
	 */
	numStar,
	/**
	 * 使用自定义类型
	 */
	custom
}
