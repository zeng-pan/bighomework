package dataservice;

import po.CenterReceivePO;
import po.DistributePO;
import po.LobbyReceivePO;
import po.OrderPO;

//�������
//��ת���յ� CenterReceivePO
public interface ReceiveDataService {
	
	//�洢�µĶ�����Ϣ
	//��������Ϣ�洢�����ݿ�
	public void writeOrder(OrderPO orderpo);
	
	//�鿴������Ϣ
	//orderBarΪ����������
	public OrderPO readOrder(String orderBar);
	
	//ɾ��������Ϣ
	//orderBar��ʾ����������
	public boolean delOrder(String orderBar);
	
	//�޸Ķ�����Ϣ
	//orderBar��ʾ����������
	public OrderPO modifiyOrder(OrderPO orderpo);
	
	//�洢�µ���ת���յ�����Ϣ
	//��������Ϣ�洢�����ݿ�
	public boolean writeCenterOrder(CenterReceivePO centerReceivePO);
	
	//�鿴��ת���յ�����Ϣ
	//orderBarΪ����������
	public CenterReceivePO readCenterOrder(String orderBar);
	
	//ɾ����ת���յ�����Ϣ
	//orderBar��ʾ����������
	public boolean delCenterOrder(String orderBar);
	
	//�޸���ת���յ�����Ϣ
	//orderBar��ʾ����������
	public CenterReceivePO modifiyCenterOrder(CenterReceivePO centerReceivePO);
	
	//�洢�µĽ��յ�����Ϣ
	//��������Ϣ�洢�����ݿ�
	public boolean writeLobbyReceiveOrder(LobbyReceivePO lobbyReceivePO);
	
	//�鿴���յ�����Ϣ
	//orderBarΪ����������
	public LobbyReceivePO readLobbyReceiveOrder(String orderBar);
	
	//ɾ�����յ�����Ϣ
	//orderBar��ʾ����������
	public boolean delLobbyReceiveOrder(LobbyReceivePO lobbyReceivePO);
	
	//�޸Ľ��յ�����Ϣ
	//orderBar��ʾ����������
	public LobbyReceivePO modifiyLobbyReceiveOrder(LobbyReceivePO lobbyReceivePO);
	
	//�洢�µ����͵���Ϣ
	//��������Ϣ�洢�����ݿ�
	public boolean writeDistributeOrder(DistributePO distributePO);
	
	//�鿴���͵�����Ϣ
	//orderBarΪ����������
	public DistributePO readDistributeOrder(String orderBar);
	
	//ɾ�����͵�����Ϣ
	//orderBar��ʾ����������
	public boolean delDistributeOrder(String orderBar);
	
	//�޸����͵�����Ϣ
	//orderBar��ʾ����������
	public DistributePO modifiyDistributeOrder(DistributePO distributePO);
	
}
