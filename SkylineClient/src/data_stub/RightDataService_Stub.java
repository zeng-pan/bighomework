package data_stub;

import dataservice.RightDataService;
import po.AccountPO;
import State.RightType;

public class RightDataService_Stub implements RightDataService {
	

	//�����ʼ��
	//�����˻��������ݿ��е��˻���������Ϊ��ʼֵ
	public boolean initKeyWord(String account){
		System.out.println("init Succeed!/n");
		return true;
	}
	
	//ɾ���˻�
	//�����˻��������ݿ��е��˻�ɾ��
	public boolean delAccount(String account){
		System.out.println("delete Succeed!/n");
		return true;
	}
	
	//����Ȩ��
	//Ȩ��Ӧ������Ϊö������
	//rightTypeΪ��Ҫ���ӵ�Ȩ��
	public boolean changeRight(AccountPO accountPO){
		System.out.println("change Succeed!/n");
		return true;
	}
	
	//�����ݿ��ж�ȡ���˻���Ȩ��
	public RightType readRight(String accpunt){
		System.out.println("Succeed!/n");
		return RightType.LOOKTASK;
	}

}
