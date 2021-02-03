package com.atguigu.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTargert implements Serializable,Cloneable{
	private static final long serialVersionUID=1L;
	private String cloneName;
	private String cloneClass;

	//构造器
	public DeepCloneableTargert(String cloneName,String cloneClass ) {
		this.cloneName=cloneName;
		this.cloneClass=cloneClass;
	}
	//该类属性都是String，因此我们使用默认的clone完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
