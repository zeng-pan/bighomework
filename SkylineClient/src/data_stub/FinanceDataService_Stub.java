package data_stub;

import java.util.ArrayList;
import java.util.List;

import dataservice.FinanceDataService;
import po.BankAccountPO;
import po.CollectionPO;
import po.CostPO;

public class FinanceDataService_Stub implements FinanceDataService{
	List<CostPO> costlist =new ArrayList<CostPO>();
	CostPO readCost;
	List<CollectionPO> Collectionlist = new ArrayList<CollectionPO>();
	CollectionPO collectionPO;
	BankAccountPO bankAccountPO;
	
	@Override
	//��ȡ�ɱ������
	//�ɱ���ĿΪö������
	//���������Ͳ��������ݿ���ĳɱ�������Ϣ
	public List<CostPO> readCost(String Date) {
		// TODO Auto-generated method stub
		readCost = new CostPO("����",2007,"10",Date,60000,"6172271990182736654","01","��");
		costlist.clear();
		costlist.add(readCost);
		return null;
	}

	@Override
	//���ɱ�����Ϣ�洢�����ݿ�
	public boolean writeCost(CostPO costPO) {
		// TODO Auto-generated method stub
		System.out.println("-----------------Save in database Success!-----------------");
		return true;
	}

	@Override
	//ɾ���ɱ���Ϣ
	public void delCost(CostPO costPO) {
		// TODO Auto-generated method stub
		System.out.println("-----------------Delect Success!-----------------");
	}

	@Override
	//�޸ĳɱ���Ϣ
	public CostPO modifiyCost(CostPO costPO) {
		// TODO Auto-generated method stub
		costPO = new CostPO("����",2007,"10","24",60000,"6172271990182736654","B��˾","��");
		return costPO;
	}

	@Override
	//��ȡ������Ϣ
	//������ĿӦ��Ϊö������
	//���������������ݿ����������ľ�����Ϣ
	public List<CollectionPO> readCollection() {
		// TODO Auto-generated method stub
		collectionPO = new CollectionPO(2006,"12","09","01","6154434569087098711",91000,"��");
		Collectionlist.clear();
		Collectionlist.add(collectionPO);
		return Collectionlist;
	}

	@Override
	public List<CollectionPO> readCollection(String lobbyCode) {
		// TODO Auto-generated method stub
		collectionPO = new CollectionPO(2007,"12","09",lobbyCode,"6154434569087098711",91000,"��");	
		Collectionlist.clear();
		Collectionlist.add(collectionPO);
		return Collectionlist;
	}

	@Override
	public List<CollectionPO> readCollection(String date1, String date2) {
		// TODO Auto-generated method stub
	    collectionPO = new CollectionPO(2008,"12","09","01","6154434569087098711",91000,"��");
		Collectionlist.clear();
		Collectionlist.add(collectionPO);
		return Collectionlist;
	}

	@Override
	//��������Ϣ�洢�����ݿ�
	public void writeCollection(CollectionPO collectionPO) {
		// TODO Auto-generated method stub
		System.out.println("---------------Write in database Success!---------------");
	}

	@Override
	//�޸��տ���Ϣ
	public CollectionPO modifiyCollection(CollectionPO collectionPO) {
		// TODO Auto-generated method stub
		collectionPO = new CollectionPO(2006,"12","09","01","6154434569087098711",10000,"��");
		return collectionPO;
	}

	@Override
	//�����ݿ����ȡ�����˻���Ϣ
	//���������˻����˻�����
	public BankAccountPO readBankAccount(String bankAccount) {
		// TODO Auto-generated method stub
	    bankAccountPO=new BankAccountPO(bankAccount,10000000);
		return bankAccountPO;
	}

	@Override
	//д��Ϣ
	public boolean writeBankAccount(BankAccountPO bankAccountPO) {
		// TODO Auto-generated method stub
		System.out.println("-----------------Write Success!-----------------");
		return false;
	}

	@Override
	public boolean delBankAccount(BankAccountPO bankAccountPO) {
		// TODO Auto-generated method stub
		System.out.println("-----------------Delect Scuccess!-----------------");
		return false;
	}

}
