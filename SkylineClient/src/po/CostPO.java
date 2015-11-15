package po;

import java.util.List;

//�ɱ�����һ��ɱ���Ϣ
public class CostPO extends Message{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String costItem;//�ɱ���Ŀ������𡢹��ʵ�
	private int costYear;//֧�����
	private String costMonth;//֧���·�
	private String costDay;//֧����
	private int money;//֧�����
	private String count;//֧�����˻�
	private String unit;//֧����λ
	private String remark;//֧����ע

	public CostPO(String costItem,int costYear,String costMonth,String costDay,int money,String count,String remark,String unit){
		this.costItem = costItem;
		this.costYear = costYear;
		this.costMonth = costMonth;
		this.costDay = costDay;
		this.money = money;
		this.count = count;
		this.remark = remark;
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCostItem() {
		return costItem;
	}

	public void setCostItem(String costItem) {
		this.costItem = costItem;
	}

	public int getCostYear() {
		return costYear;
	}

	public void setCostYear(int costYear) {
		this.costYear = costYear;
	}

	public String getCostMonth() {
		return costMonth;
	}

	public void setCostMonth(String costMonth) {
		this.costMonth = costMonth;
	}

	public String getCostDay() {
		return costDay;
	}

	public void setCostDay(String costDay) {
		this.costDay = costDay;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
