package po;

//�����˻���Ϣ
public class BankAccountPO {
	private String account;//�����˻�ID
	private int money;//���
	
	public BankAccountPO(String account,int money){
		this.account = account;
		this.money = money;
	}
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}

}
