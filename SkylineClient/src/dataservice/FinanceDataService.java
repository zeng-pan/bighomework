package dataservice;

import java.util.List;

import po.BankAccountPO;
import po.CollectionPO;
import po.CostPO;

//�������
public interface FinanceDataService {
	
	//��ȡ�ɱ������
	//�ɱ���ĿΪö������
	//���������Ͳ��������ݿ���ĳɱ�������Ϣ
	public boolean readCost(String Date,List<CostPO> costPOList);
	
	//���ɱ�����Ϣ�洢�����ݿ�
	public boolean writeCost(CostPO costPO);
	
	//ɾ���ɱ���Ϣ
	public boolean delCost(CostPO costPO);
	
	//�޸ĳɱ���Ϣ
	public boolean modifiyCost(CostPO costPO);
	
	//��ȡ������Ϣ
	//������ĿӦ��Ϊö������
	//���������������ݿ����������ľ�����Ϣ
	public boolean readCollection(List<CollectionPO> collectionPOList);
	
	public boolean readCollection(String lobbyCode,List<CollectionPO> collectionPOList);
	
	public boolean readCollection(String date1,String date2,List<CollectionPO> collectionPOList);
	
	//��������Ϣ�洢�����ݿ�
	public boolean writeCollection(CollectionPO collectionPO);
	
	//ɾ���տ���Ϣ
	//public void delCollection(CollectionPO collectionPO);
	
	//�޸��տ���Ϣ
	
	public boolean modifiyCollection(CollectionPO collectionPO);
	
	//�����ݿ����ȡ�����˻���Ϣ
	//���������˻����˻�����
	public boolean readBankAccount(String bankAccount,BankAccountPO bankaccountPO);
	
	//д��Ϣ
	public boolean writeBankAccount(BankAccountPO bankAccountPO);
	
	public boolean delBankAccount(BankAccountPO bankAccountPO);
	
}
