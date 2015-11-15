package businesslogicservice;

import vo.AccountVO;
import vo.RightVO;

public interface RightBLService {
	//�û������˻����ƣ���������¼,ϵͳ���ݷ��ص�Ȩ������תҳ��
	public boolean login(String AccountName,String code,RightVO rightInfo);
	
	//�˻�������Ա�����µ��˻���ϵͳ��ʾ�˻���Ϣ
	public boolean createNewAccount(AccountVO accountInfo);
	
	//��˾ְ���޸��˻����룬������ɵ�������µ�����
	public boolean modifyCode(String oldCode,String newCode);
	
	//������Ա���԰�����˾Ա����ʼ�����룬������ְ���˺�
	public boolean initCode(String ID);
}
