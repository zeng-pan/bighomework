package po;
import java.io.Serializable;
public class VehicleLoadingPO  implements Serializable{
	String loadingDate;//װ������
	String carNum;//��ת�������˱��
	String carTourNum;//���κ�
	String departure;//������
	String destination;//�����
	String monitor;//��װԱ
	String guard;//Ѻ��Ա
	String shipment;//װ����������
	String freight;//�˷�
	
	public VehicleLoadingPO(String a,String b,String c,String d,String e,String f,String g,String h,String i){
		loadingDate=a;
		carNum=b;
		carTourNum=c;
		departure=d;
		destination=e;
		monitor=f;
		guard=g;
		shipment=h;
		freight=i;
	}

	public String getLoadingDate() {
		return loadingDate;
	}

	public void setLoadingDate(String loadingDate) {
		this.loadingDate = loadingDate;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getCarTourNum() {
		return carTourNum;
	}

	public void setCarTourNum(String carTourNum) {
		this.carTourNum = carTourNum;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getGuard() {
		return guard;
	}

	public void setGuard(String guard) {
		this.guard = guard;
	}

	public String getShipment() {
		return shipment;
	}

	public void setShipment(String shipment) {
		this.shipment = shipment;
	}

	public String getFreight() {
		return freight;
	}

	public void setFreight(String freight) {
		this.freight = freight;
	}
}
