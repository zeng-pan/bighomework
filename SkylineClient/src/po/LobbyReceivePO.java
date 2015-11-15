package po;

import java.io.Serializable;

//Ӫҵ���յ���ݺ�������һ���ռ�����Ϣ
public class LobbyReceivePO extends Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int receiveYear;//Ӫҵ������ʱ�� 
	private int receiveMonth;//Ӫҵ������ʱ�� 
	private int receiveDay;//Ӫҵ������ʱ�� 
	private int condition;//���ﵽ��״̬
	private String expressBar;//expressBar��ʾ����
	private String receiptCode;
	
	
	public LobbyReceivePO(int receiveYear,int receiveMonth,int receiveDay,int co,String expressBar,String receiptC){
		this.receiveYear = receiveYear;
		this.receiveMonth = receiveMonth;
		this.receiveDay = receiveDay;
		this.condition = co;
		this.expressBar = expressBar;
		this.receiptCode=receiptC;
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

	public int getLobbyNumber() {
		return condition;
	}

	public String getExpressBar() {
		return expressBar;
	}

	public String getReceiptCode() {
		return receiptCode;
	}

	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}
	
}
