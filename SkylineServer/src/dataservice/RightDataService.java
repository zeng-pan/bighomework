package dataservice;

import po.AccountPO;
import State.RightType;

//Ȩ�޹������ݽӿ�
public interface RightDataService {

	//�����ʼ��
	//�����˻��������ݿ��е��˻���������Ϊ��ʼֵ
	public boolean initKeyWord(String account);
	
	//ɾ���˻�
	//�����˻��������ݿ��е��˻�ɾ��
	public boolean delAccount(String account);
	
	//����Ȩ��
	//Ȩ��Ӧ������Ϊö������
	//rightTypeΪ��Ҫ���ӵ�Ȩ��
	public boolean changeRight(AccountPO accpuntPO);
	
	//�����ݿ��ж�ȡ���˻���Ȩ��
	public RightType readRight(String accpunt);
}
