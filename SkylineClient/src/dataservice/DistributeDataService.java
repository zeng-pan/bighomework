package dataservice;

import java.util.List;

import po.OrderPO;
import po.ReceivePO;

//�������
public interface DistributeDataService {
	
    //�洢���Ա������
	//account�ǿ��Ա���˻���list��ʾ�ÿ��Ա����������
	public boolean saveTask(List<OrderPO> orderpo);
	
	//������Ա���˻�
	//���ݿⷵ������Ҫ����Ķ���
	public boolean lookTask(String[] code,List<OrderPO> orderPO);
	
	//�����ռ���Ϣ
	//���ݿⱣ���䶩����Ϣ
	public boolean inputOrder(ReceivePO receivePO);
	
}
