package po;

//��ת���Ľ��յ�
public class CenterReceiveListPO {
	
	private int receiveYear;//�������
	private int receiveMonth;//�����·�
	private int receiveDay;//������
	private int centerNumber;//��ת���ı��
	private String bar;//��ݵĵ���
	
	public CenterReceiveListPO(int receiveYear,int receiveMonth,int receiveDay,int centerNumber,String bar){
		this.receiveYear = receiveYear;
		this.receiveMonth = receiveMonth;
		this.receiveDay = receiveDay;
		this.centerNumber = centerNumber;
		this.bar = bar;
	}

	public int getReceiveYear() {
		return receiveYear;
	}

	public int getReceiveMonth() {
		return receiveMonth;
	}

	public int getReceiveDay() {
		return receiveDay;
	}

	public int getCenterNumber() {
		return centerNumber;
	}

	public String getBar() {
		return bar;
	}

}
