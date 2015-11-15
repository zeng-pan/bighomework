package businesslogicservice;

import vo.DriverVO;
import vo.InstitutionVO;
import vo.StaffVO;
import vo.VehicleVO;

public interface InfoBLService {
	//�½�һ���������������������ƣ�����λ�ã���ţ�ϵͳ��ʾ�û�����Ϣ
	public boolean createNewInstitution(InstitutionVO institutionInfo);
	
	//ɾ��һ����Ϣ��ϵͳ��ʾɾ���ɹ�
	public boolean deleteInstitution(String insititutionCode);
	
	//��ѯ���������������ţ�ϵͳ��ʾ������Ϣ
	public boolean inquireInstitution(String code,InstitutionVO institutionInfo);
	
	//�޸Ļ�����ϵͳ��ʾ�����޸ĺ����Ϣ
	public boolean modifyInstitution(InstitutionVO institutionInfo);
	
	//�½�ְ������������ְ�����ƣ�ְλ�����ڵ�λ��ְ�������Լ���ţ�ϵͳ��ʾ������ְ����Ϣ
	public boolean createNewStaff(StaffVO staffInfo);
	
	//ɾ��һ��ְ����Ϣ��ϵͳ��ʾɾ���ɹ�
	public boolean deleteStaff(String staffCode);
	
	//��ѯְ��������ְ����ţ�ϵͳ��ʾְ����Ϣ
	public boolean inquireStaff(String staffCode,StaffVO staffInfo);
	
	//�޸�ְ����Ϣ��ϵͳ��ʾ�޸ĺ��ְ����Ϣ
	public boolean modifyStaff(StaffVO staffInfo);
	
	//��������Ϣ�����복�ƺţ�name�����������ţ�code�����Լ�����ʱ��
	public boolean createNewVehicle(VehicleVO vehicleInfo);
	
	//ɾ��������Ϣ��ϵͳ��ʾɾ���ɹ�
	public boolean deleteVehicle(String vehicleCode);
	
	//��ѯ������Ϣ�����복�����ţ�ϵͳ��ʾ������Ϣ
	public boolean inquireVehicle(String code,VehicleVO vehicleInfo);
	
	//�޸ĳ�����Ϣ��ϵͳ��ʾ�޸ĺ�ĳ�����Ϣ
	public boolean modifyVehicle(VehicleVO vehicleInfo);
	
	//�½�һ��˾����Ϣ������˾����š��������������ڡ����֤�š��ֻ� ���Ա���ʻ֤���ޣ�ϵͳ��ʾ˾����Ϣ
	public boolean createNewDriver(DriverVO driverInfo);
	
	//ɾ��˾����Ϣ��ϵͳ��ʾɾ���ɹ�
	public boolean deleteDriver(String driverCode);
	
	//��ѯ˾����Ϣ������˾����ţ�ϵͳ��ʾ˾����Ϣ
	public boolean inquireDriver(String code,DriverVO driverInfo);
	
	//�޸�˾����Ϣ��ϵͳ��ʾ�޸ĺ��˾����Ϣ
	public boolean modifyDriver(DriverVO driverInfo);
}
