package com.atguigu.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepPrototype implements Serializable,Cloneable{
	public String name; //String ����
	public DeepCloneableTargert deepCloneableTargert;//��������
	
	public DeepPrototype() {
		super();
	}
	//������-��ʽ1 ʹ��clone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep=null;
		//������ɻ�����������(����)��string�Ŀ�¡
		deep=super.clone();
		//���������͵����ԣ����е�������
		DeepPrototype deepPrototype=(DeepPrototype)deep;
		deepPrototype.deepCloneableTargert=(DeepCloneableTargert) deepCloneableTargert.clone();
		// TODO Auto-generated method stub
		return deepPrototype;
	}
	//���-��ʽ2 ͨ����������л�ʵ��(�Ƽ�)
	public Object deepClone() {
		//����������
		ByteArrayOutputStream bos =null;
		ObjectOutputStream oos=null;
		ByteArrayInputStream bis=null;
		ObjectInputStream ois=null;
		try {
			//���л�
			bos=new ByteArrayOutputStream();
			oos=new ObjectOutputStream(bos);
			oos.writeObject(this);//��ǰ�����Զ������ķ�ʽ���
			//�����л�
			bis=new ByteArrayInputStream(bos.toByteArray());
			ois=new ObjectInputStream(bis);
			DeepPrototype copyObj =(DeepPrototype)ois.readObject();
			return copyObj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
	}
}
