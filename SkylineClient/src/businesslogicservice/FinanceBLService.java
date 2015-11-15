package businesslogicservice;

import java.util.ArrayList;

import vo.AccountVO;
import vo.CostVO;
import vo.EarnVO;

public interface FinanceBLService {
	//���뿪ʼ���ںͽ������ڣ���ʾ���и������ڵ������տ��Ϣ
	public boolean showStatisticsList(String date1,String date2,ArrayList<EarnVO> earnList);
	
	//�������ڣ��鿴�������е��տ
	public boolean showEarnListDependsOnDay(String date,ArrayList<EarnVO> earnList);
	
	//����Ӫҵ����ţ��鿴��Ӫҵ����ָ�������������е��տ
	public boolean showEarnListDependsOnInstitution(String code,String date1,String data2,ArrayList<EarnVO> earnList);
	
	//�����˻���ţ���ʾ�˻����
	public boolean showBalance(String name,AccountVO account);
	
	//��ʾ���µ�����֧����Ϣ
	public boolean showCostList(ArrayList<CostVO> costList);
	
	//��ʾָ���·ݵ�֧����Ϣ
	public boolean showCostList(String date,ArrayList<CostVO> costList);
	
	//��ת����ҵ��Ա��д�տ��Ϣ��ϵͳ��ʾ�տ
	public boolean writeEarnList(ArrayList<EarnVO> earnList);
}
