package dataservice;

import po.DriverInfoPO;
import po.InstitutionPO;
import po.VehicleInfoPO;
import po.WorkerPO;

	//��������
	//��Ա����
	//������Ϣ����
	//��ʻԱ��Ϣ����
public interface InfoDataService {

	//--------------��������--------------------
	
	//�����ݿ������ȡĳ���Ļ�����Ϣ
	//category Ϊ���������
	public InstitutionPO readInstitution(String code);
	
	//����ĳ���Ļ���
	//�½�һ���������������������ƣ�����λ�ã����
	//���ݿ�洢�û�����Ϣ
	public boolean addInstitution(InstitutionPO institutionPO);
	
	//ɾ��ĳ����
	//��������ı��룬���ݿ⽫ɾ���û���
	public boolean delInstitution(String code);
	
	//�޸�ĳ��������Ϣ����������Ϊ�����޸Ļ����ĵȼ��������ܽ�Ӫҵ����Ϊ��ת���ģ�������Ϣ���޸ģ�
	//String name,String position,String code��ʾҪ�޸ĵĲ��֣�������޸ģ����֮ǰ����Ϣһ��
	public InstitutionPO modifyInstitution(InstitutionPO institutionPO);
	
	//�½�ְ������������ְ�����ƣ�ְλ�����ڵ�λ��ְ�������Լ����
	//���ݿ⽫�����Ա����Ϣ
	public boolean createNewStaff(WorkerPO workerPO);
		
	//���ݿ�ɾ����Ա����Ϣ
	//accountΪԱ�����˻�
	public boolean deleteStaff(String account);
		
	//���ݿⷵ�ظ��˻�����Ϣ
	//accountΪ��Ա�����˻�
	public WorkerPO inquireStaff(String account);
		
	//�޸�ְ����Ϣ
	//accountΪ��Ա�����˻���account�����Ա��޸�
	//String modifyName,String modifyJob,String modifyUnit,String modifyWorkage��ʾҪ�޸ĵ�����
	public WorkerPO modifyStaff(WorkerPO workerPO);
		
	//������ĳ�����Ϣ���������ݿ⣬���복�ƺţ�name�����������ţ�code�����Լ�����ʱ��
	public boolean createNewVehicle(VehicleInfoPO vehicleInfoPO);
		
	//ɾ��������Ϣ
	//code��ʾ��������
	public boolean deleteVehicle(String code);
		
	//��ѯ������Ϣ�����복������ ���ݿ��в�ѯ�ô��ŵĳ�����Ϣ
	public VehicleInfoPO readVehicle(String code);
	
	//�޸ĳ�����Ϣ
	public VehicleInfoPO modifyVehicle(VehicleInfoPO vehicleInfoPO);
		
	//�½�һ��˾����Ϣ������˾����š��������������ڡ����֤�š��ֻ� ���Ա���ʻ֤����
	public boolean createNewDriver(DriverInfoPO driveInfoPO);
		
	//ɾ��˾����Ϣ
	public void deleteDriver();
		
	//��ѯ˾����Ϣ������˾�����
	public DriverInfoPO inquireDriver(String code);
		
	//�޸�˾����Ϣ
	public DriverInfoPO modifyDriver(DriverInfoPO driveInfoPO);
}
