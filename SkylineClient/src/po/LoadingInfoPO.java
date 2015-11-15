package po;
import java.io.Serializable;
//����װ������
public class LoadingInfoPO  extends Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String loadingDate;//װ������
	String autoMobileNum;//Ӫҵ�����˱��
	String departure;//������
	String destination;//�����
	String monitor;//��װԱ
	String guard;//Ѻ��Ա
	String shipment;//װ����������
	String freight;//�˷�
	
	public LoadingInfoPO(String a,String b,String c,String d,String e,String f,String g,String h){
		loadingDate=a;
		 autoMobileNum=b;
		departure=c;
		destination=d;
		 monitor=e;
		 guard=f;
		shipment=g;//װ����������
		freight=h;//�˷�
	}

	public String getLoadingDate() {
		return loadingDate;
	}

	public void setLoadingDate(String loadingDate) {
		this.loadingDate = loadingDate;
	}

	public String getAutoMobileNum() {
		return autoMobileNum;
	}

	public void setAutoMobileNum(String autoMobileNum) {
		this.autoMobileNum = autoMobileNum;
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
