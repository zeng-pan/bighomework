package data_stub;

import dataservice.WarehouseDataService;
import po.InventoryPO;
import po.WarehouseInPO;
import po.WarehouseOutPO;


public class WarehouseDataService_Stub implements WarehouseDataService{
	
	//���ʱ��ϵͳ��Ҫ�����Ķ����ű�������Ӧ�ֿ�����ݿ�
	public boolean storage(WarehouseInPO warehouseInPO){
		System.out.println("write Succeed!/n");
		return true;
	}
	
	//���� storageOrder��ʾ���Ķ���������warehouseNumber��ʾ�ֿ���
	//�轫�ֿ�����ݿ��еĶ����Ŷ�ȡ������ɾ��
	public boolean outWarehouse(WarehouseOutPO warehouseOutPO){
		System.out.println("out Succeed!/n");
		return true;
	}
	
	//����Ӧ�ֿ���Ķ�����ȫ����ȡ���� 
	//warehouseNumber��ʾ�ֿ���
	public InventoryPO readWarehouse(String warehouseNumber){
		InventoryPO inventoryPO = new InventoryPO(10, 5, "6767676767", "��˺����޳�֮ͽ", 'A',10, 5, 6, warehouseNumber, warehouseNumber);
		System.out.println("Succeed!/n");
		return inventoryPO;
		
	}
}
