package po;

import java.io.Serializable;

public class WorkerPO extends Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String position;
	private String belong;
	private String age;
	private String code;
	
	//-------------------
	//��ȡ���޸�ְ��������
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	//-------------------
	//��ȡ���޸�ְ��������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//------------------
	//��ȡ���޸�ְ����ְλ
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	//-----------------
	//��ȡ���޸�ְ����������λ
	public String getBelong() {
		return belong;
	}
	public void setBelong(String belong) {
		this.belong = belong;
	}
	
	//----------------------
	//���캯��
	public WorkerPO(String na,String po,String be,int ag){
		this.name=na;
		this.position=po;
		this.belong=be;
		this.age=ag;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
