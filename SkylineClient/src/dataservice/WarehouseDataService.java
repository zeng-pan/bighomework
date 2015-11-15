package dataservice;

import java.util.ArrayList;

import po.InventoryPO;
import po.WarehouseInPO;
import po.WarehouseOutPO;

//�ֿ�
public interface WarehouseDataService {
	
	//���ʱ��ϵͳ��Ҫ�����Ķ����ű�������Ӧ�ֿ�����ݿ�
	public boolean storage(WarehouseInPO warehouseInPO);
	
	//���� storageOrder��ʾ���Ķ���������warehouseNumber��ʾ�ֿ���
	//�轫�ֿ�����ݿ��еĶ����Ŷ�ȡ������ɾ��
	public boolean outWarehouse(WarehouseOutPO warehouseOutPO);
	
	//����Ӧ�ֿ���Ķ�����ȫ����ȡ���� 
	//warehouseNumber��ʾ�ֿ���
	public boolean readWarehouse(String warehouseNumber,ArrayList<InventoryPO> inventoryPOList);
}
