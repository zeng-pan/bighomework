package dataservice;

import java.util.List;

import po.OrderPO;
import po.ReceivePO;

//�������
public interface DistriuteDataService {
	
    //�洢���Ա������
	//account�ǿ��Ա���˻���list��ʾ�ÿ��Ա����������
	public boolean saveTask(List<OrderPO> orderpo);
	
	//������Ա���˻�
	//���ݿⷵ������Ҫ����Ķ���
	public List<OrderPO> lookTask(String[] code);
	
	//�����ռ���Ϣ
	//���ݿⱣ���䶩����Ϣ
	public void inputOrder(ReceivePO receivePO);
	
}
