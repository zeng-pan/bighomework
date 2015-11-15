package businesslogicservice;

import vo.InventoryVO;
import vo.WarehouseInVO;
import vo.WarehouseOutVO;
import vo.WarehouseOutVO.Type;

public interface WarehouseBLService {
	/*�ֿ������Ա����
	 * ��ݱ�š�������ڡ�Ŀ�ĵء����š��źš��ܺš�λ��
	 * ϵͳ��ʾ��ⵥ
	 */
	public boolean WarehouseIn(WarehouseInVO warehouseInInfo);
	
	/*
	 * �ֿ������Ա����
	 * ��ݱ�š��������ڡ�Ŀ�ĵء�װ����ʽ���𳵡��ɻ�������������ת����Ż������˱��
	 * ϵͳ��ʾ���ⵥ
	 */
	public boolean WarehouseOut(WarehouseOutVO warehouseOutInfo);
	
	/*
	 * ϵͳ��ʾ�����Ϣ
	 */
	//���鿴
	public boolean showInventory(String startdate,String enddate,InventoryVO inventoryInfo);
	
	//����̵�
	public boolean checkInventory(InventoryVO inventoryInfo);
	
}
