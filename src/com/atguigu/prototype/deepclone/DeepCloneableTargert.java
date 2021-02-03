package com.atguigu.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTargert implements Serializable,Cloneable{
	private static final long serialVersionUID=1L;
	private String cloneName;
	private String cloneClass;

	//������
	public DeepCloneableTargert(String cloneName,String cloneClass ) {
		this.cloneName=cloneName;
		this.cloneClass=cloneClass;
	}
	//�������Զ���String���������ʹ��Ĭ�ϵ�clone��ɼ���
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
