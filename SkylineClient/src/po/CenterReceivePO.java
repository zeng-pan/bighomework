package po;

//��ת���Ľ��յ�
public class CenterReceivePO extends Message{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int receiveYear;//�������
	private int receiveMonth;//�����·�
	private int receiveDay;//������
	private int centerNumber;//��ת���ı��
	private String bar;//��ݵĵ���
	
	public CenterReceivePO(int receiveYear,int receiveMonth,int receiveDay,int centerNumber,String bar){
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
