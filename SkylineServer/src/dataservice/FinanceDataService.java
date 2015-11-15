package dataservice;


import po.BankAccountPO;
import po.CollectionPO;
import po.CostPO;

import java.util.List;



//�������
public interface FinanceDataService {
	
	//��ȡ�ɱ������
	//�ɱ���ĿΪö������
	//���������Ͳ��������ݿ���ĳɱ�������Ϣ
	public List<CostPO> readCost(String Date);
	
	//���ɱ�����Ϣ�洢�����ݿ�
	public boolean writeCost(CostPO costPO);
	
	//ɾ���ɱ���Ϣ
	public void delCost(CostPO costPO);
	
	//�޸ĳɱ���Ϣ
	public CostPO modifiyCost(CostPO costPO);
	
	//��ȡ������Ϣ
	//������ĿӦ��Ϊö������
	//���������������ݿ����������ľ�����Ϣ
	public List<CollectionPO> readCollection();
	
	public List<CollectionPO> readCollection(String lobbyCode);
	
	public List<CollectionPO> readCollection(String date1,String date2);
	
	//��������Ϣ�洢�����ݿ�
	public void writeCollection(CollectionPO collectionPO);
	
	//ɾ���տ���Ϣ
	//public void delCollection(CollectionPO collectionPO);
	
	//�޸��տ���Ϣ
	
	public CollectionPO modifiyCollection(CollectionPO collectionPO);
	
	//�����ݿ����ȡ�����˻���Ϣ
	//���������˻����˻�����
	public BankAccountPO readBankAccount(String bankAccount);
	
	//д��Ϣ
	public boolean writeBankAccount(BankAccountPO bankAccountPO);
	
	public boolean delBankAccount(BankAccountPO bankAccountPO);
	
}
