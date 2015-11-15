package po;

import java.io.Serializable;
import java.util.List;

import State.expressType;

//Ӫҵ���յ���ݺ�������һ���ռ�����Ϣ
public class LobbyReceivePO extends Message implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int receiveYear;//Ӫҵ������ʱ�� 
	private int receiveMonth;//Ӫҵ������ʱ�� 
	private int receiveDay;//Ӫҵ������ʱ�� 
	private int lobbyNumber;//Ӫҵ�����
	private String expressBar;//expressBar��ʾ����
	
	public LobbyReceivePO(int receiveYear,int receiveMonth,int receiveDay,int lobbyNumber,String expressBar){
		this.receiveYear = receiveYear;
		this.receiveMonth = receiveMonth;
		this.receiveDay = receiveDay;
		this.lobbyNumber = lobbyNumber;
		this.expressBar = expressBar;
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
		return lobbyNumber;
	}

	public String getExpressBar() {
		return expressBar;
	}
	
}
