package po;

//һ��������տPO
public class CollectionPO {
	
	private int collectionYear;//�������
	private String collectionMonth;//�����·�
	private String collectionDay;//������
	private String unit;//�տλ�������
	private String account;//�տ����˻�
	private int money;//�տ���
	private String remark;//��ע
	
	public CollectionPO(int collectionYear,String collectionMonth,String collectionDay,String unit,String account,int money,String remark){
		this.collectionYear = collectionYear;
		this.collectionMonth = collectionMonth;
		this.collectionDay = collectionDay;
		this.unit = unit;
		this.account = account;
		this.money = money;
		this.remark = remark;
	}

	public int getCollectionYear() {
		return collectionYear;
	}

	public String getCollectionMonth() {
		return collectionMonth;
	}

	public String getCollectionDay() {
		return collectionDay;
	}

	public String getUnit() {
		return unit;
	}

	public String getAccount() {
		return account;
	}

	public int getMoney() {
		return money;
	}

	public String getRemark() {
		return remark;
	}
	
}
