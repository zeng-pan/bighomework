package po;

import java.io.Serializable;

public class DriverInfoPO  implements Serializable{
	int driverID;//˾�����
	String name;//����
	String birthDay;//��������
	String idCard;//���֤��
	String phoneNum;//�绰����
	String firm;//��λ
	String sex;//�Ա�
	String dueDate;//��ʻ֤����
	
	public DriverInfoPO(int i,String j,String k,String m,String n,String o,String p,String q){
		driverID=i;
		name=j;
		birthDay=k;
		idCard=m;
		phoneNum=n;
		firm=o;
		sex=p;
		dueDate=q;
	}

	public int getDriverID() {
		return driverID;
	}

	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
}
