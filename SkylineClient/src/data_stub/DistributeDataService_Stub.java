package data_stub;

import java.util.ArrayList;
import java.util.List;

import dataservice.DistributeDataService;
import po.OrderPO;
import po.OrderPO.Size;
import po.ReceivePO;
import po.OrderPO.PackageCost;
import po.Type;

public class DistributeDataService_Stub implements DistributeDataService {
	List<OrderPO> orderlist =new ArrayList<OrderPO>();
	
	//�洢���Ա������
	//account�ǿ��Ա���˻���list��ʾ�ÿ��Ա����������
	public boolean saveTask(List<OrderPO> orderpo) {
		// TODO Auto-generated method stub
		System.out.println("------------------Save Success!------------------");
		return true;
	}
	public List<OrderPO> lookTask(String[] code) {
		// TODO Auto-generated method stub
		OrderPO looktask = new OrderPO("����","������������","��","64227112","13242199875","����","�Ͼ��к�԰" ,
				"��","62238765","19876244534",PackageCost.paperBox,Type.normal,1,14.5,30,"�·�",Size.small,"0100210001",8);
		orderlist.clear();
		orderlist.add(looktask);
		return orderlist;
	}

	
	//�����ռ���Ϣ
	//���ݿⱣ���䶩����Ϣ
	public void inputOrder(ReceivePO receivePO) {
		// TODO Auto-generated method stub
		receivePO=new ReceivePO("301280000001","zahngsan","20070201");
		System.out.println("---------------Add Success!---------------");
		System.out.println("---------------Save Success!----------------");
	}

}
