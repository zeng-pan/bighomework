package data_stub;

import dataservice.ReceiveDataService;
import po.CenterReceivePO;
import po.DistributePO;
import po.LobbyReceivePO;
import po.OrderPO;
import po.OrderPO.PackageCost;
import po.OrderPO.Size;
import po.Type;


public class ReceiveDataService_Stub implements ReceiveDataService {

	//�洢�µĶ�����Ϣ
	//��������Ϣ�洢�����ݿ�
	public boolean writeOrder(OrderPO orderpo){
		System.out.println("write Succeed!/n");
		return true;
	}
	
	//�鿴������Ϣ
	//orderBarΪ����������
	public OrderPO readOrder(String orderBar){
		OrderPO orderPO = new OrderPO("����","������������","��","64227112","13242199875","����","�Ͼ��к�԰" ,
				"��","62238765","19876244534",PackageCost.paperBox,po.Type.normal,1,14.5,30,"�·�",Size.small,orderBar,8);
		System.out.println("Succeed!/n");
		return orderPO;
	}
	
	//ɾ��������Ϣ
	//orderBar��ʾ����������
	public boolean delOrder(String orderBar){
		System.out.println("delete Succeed!/n");
		return true;
	}
	
	//�޸Ķ�����Ϣ
	//orderBar��ʾ����������
	public OrderPO modifiyOrder(OrderPO orderPO){
		 orderPO = new OrderPO("����","������������","��","64227112","13242199875","����","�Ͼ��к�԰" ,
				"��","62238765","19876244534",PackageCost.paperBox,Type.normal,1,14.5,30,"�·�",Size.small,"0100210001",8);
		System.out.println("Succeed!/n");
		return orderPO;
	}
	
	//�洢�µ���ת���յ�����Ϣ
	//��������Ϣ�洢�����ݿ�
	public boolean writeCenterOrder(CenterReceivePO centerReceivePO){
		System.out.println("write Succeed!/n");
		return true;
	}
	
	//�鿴��ת���յ�����Ϣ
	//orderBarΪ����������
	public CenterReceivePO readCenterOrder(String orderBar){
		CenterReceivePO centerReceivePO = new CenterReceivePO(2, 23, 226, 78, orderBar);
		System.out.println("Succeed!/n");
		return centerReceivePO;
	}
	
	//ɾ����ת���յ�����Ϣ
	//orderBar��ʾ����������
	public boolean delCenterOrder(String orderBar){
		System.out.println("delete Succeed!/n");
		return true;
	}
	
	//�޸���ת���յ�����Ϣ
	//orderBar��ʾ����������
	public CenterReceivePO modifiyCenterOrder(CenterReceivePO centerReceivePO){
		CenterReceivePO centerReceivePO1 = new CenterReceivePO(2, 56, 4656, 2329, null);
		System.out.println("Succeed!/n");
		return centerReceivePO1;
	}
	
	//�洢�µĽ��յ�����Ϣ
	//��������Ϣ�洢�����ݿ�
	public boolean writeLobbyReceiveOrder(LobbyReceivePO lobbyReceivePO){
		System.out.println("write Succeed!/n");
		return true;
	}
	
	//�鿴���յ�����Ϣ
	//orderBarΪ����������
	public LobbyReceivePO readLobbyReceiveOrder(String orderBar){
		LobbyReceivePO lobbyReceivePO = new LobbyReceivePO(5649, 2626, 233,56,"NULL", orderBar);
		System.out.println("Succeed!/n");
		return lobbyReceivePO;
	}
	
	//ɾ�����յ�����Ϣ
	//orderBar��ʾ����������
	public boolean delLobbyReceiveOrder(LobbyReceivePO lobbyReceivePO){
		System.out.println("delete Succeed!/n");
		return true;
	}
	
	//�޸Ľ��յ�����Ϣ
	//orderBar��ʾ����������
	public LobbyReceivePO modifiyLobbyReceiveOrder(LobbyReceivePO lobbyReceivePO){
		LobbyReceivePO lobbyReceivePO1 = new LobbyReceivePO(45, 78, 12, 23,"null", "asdsad");
		System.out.println("Succeed!/n");
		return lobbyReceivePO1;
	}
	
	//�洢�µ����͵���Ϣ
	//��������Ϣ�洢�����ݿ�
	public boolean writeDistributeOrder(DistributePO distributePO){
		System.out.println("write Succeed!/n");
		return true;
	}
	
	//�鿴���͵�����Ϣ
	//orderBarΪ����������
	public DistributePO readDistributeOrder(String orderBar){
		DistributePO distributePO = new DistributePO(orderBar, "sadsad", "sadasd");
		System.out.println("Succeed!/n");
		return distributePO;
	}
	
	//ɾ�����͵�����Ϣ
	//orderBar��ʾ����������
	public boolean delDistributeOrder(String orderBar){
		System.out.println("delete Succeed!/n");
		return true;
	}
	
	//�޸����͵�����Ϣ
	//orderBar��ʾ����������
	public DistributePO modifiyDistributeOrder(DistributePO distributePO){
		DistributePO distributePO1 = new DistributePO("sadasd", "sdsa", "sdas");
		System.out.println("Succeed!/n");
		return distributePO1;
	}
}
