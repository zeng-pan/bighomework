package vo;

import businesslogic.infobl.Vehicle;

public class VehicleVO {
	private int carID;//��������
	private int engineID;//���̴���
	private int carNum;//������
	private int underpanID;//���̺�
	private String boughtTime;//����ʱ��
	private int usedTime;//����ʱ��

	public VehicleVO(int i,int j,int k,int m,String n,int p){
		carID=i;
		engineID=j;
		carNum=k;
		underpanID=m;
		boughtTime=n;
		usedTime=p;
	}
	
	public boolean writeVehicleInfo(Vehicle ve){
		this.carID=ve.getCarID();
		this.carNum=ve.getCarNum();
		this.engineID=ve.getEngineID();
		this.underpanID=ve.getUnderpanID();
		this.usedTime=ve.getUsedTime();
		this.boughtTime=ve.getBoughtTime();
		return true;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public int getEngineID() {
		return engineID;
	}

	public void setEngineID(int engineID) {
		this.engineID = engineID;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getUnderpanID() {
		return underpanID;
	}

	public void setUnderpanID(int underpanID) {
		this.underpanID = underpanID;
	}

	public String getBoughtTime() {
		return boughtTime;
	}

	public void setBoughtTime(String boughtTime) {
		this.boughtTime = boughtTime;
	}

	public int getUsedTime() {
		return usedTime;
	}

	public void setUsedTime(int usedTime) {
		this.usedTime = usedTime;
	}
}
