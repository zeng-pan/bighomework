package data_stub;

import dataservice.InfoDataService;
import po.DriverInfoPO;
import po.InstitutionPO;
import po.VehicleInfoPO;
import po.WorkerPO;


public class InfoDataService_Stub implements InfoDataService{
	//--------------��������--------------------
	
		//�����ݿ������ȡĳ���Ļ�����Ϣ
		//category Ϊ���������
		public InstitutionPO readInstitution(String code) {
			System.out.println("read Succeed!\n");
			InstitutionPO institutionPO = new InstitutionPO("123", "�����Ԫ˧", "Ҷ����", code);
			return institutionPO;
		}
		
		//����ĳ���Ļ���
		//�½�һ���������������������ƣ�����λ�ã����
		//���ݿ�洢�û�����Ϣ
		public boolean addInstitution(InstitutionPO institutionPO) {
			System.out.println("add Succeed!\n");
			return true;
		}
		
		//ɾ��ĳ����
		//��������ı��룬���ݿ⽫ɾ���û���
		public boolean delInstitution(String code) {
			System.out.println("delete Succeed!\n");
			return true;
		}
		
		//�޸�ĳ��������Ϣ����������Ϊ�����޸Ļ����ĵȼ��������ܽ�Ӫҵ����Ϊ��ת���ģ�������Ϣ���޸ģ�
		//String name,String position,String code��ʾҪ�޸ĵĲ��֣�������޸ģ����֮ǰ����Ϣһ��
		public InstitutionPO modifyInstitution(InstitutionPO institutionPO) {
			System.out.println("modify Succeed!\n");
			return institutionPO;
		}
		
		//�½�ְ������������ְ�����ƣ�ְλ�����ڵ�λ��ְ�������Լ����
		//���ݿ⽫�����Ա����Ϣ
		public boolean createNewStaff(WorkerPO workerPO) {
			System.out.println("creat Succeed!\n");
			return true;
		}
			
		//���ݿ�ɾ����Ա����Ϣ
		//accountΪԱ�����˻�
		public boolean deleteStaff(String account) {
			System.out.println("delete Succeed!\n");
			return true;		
		}
			
		//���ݿⷵ�ظ��˻�����Ϣ
		//accountΪ��Ա�����˻�
		public WorkerPO inquireStaff(String account) {
			System.out.println("Succeed!\n");
			WorkerPO workerPO = new WorkerPO("������", "�����Ԫ˧", "123", 18);
			return workerPO;
		}
			
		//�޸�ְ����Ϣ
		//accountΪ��Ա�����˻���account�����Ա��޸�
		//String modifyName,String modifyJob,String modifyUnit,String modifyWorkage��ʾҪ�޸ĵ�����
		public WorkerPO modifyStaff(WorkerPO workerPO) {
			System.out.println("modify Succeed!\n");
			return workerPO;
			
		}
			
		//������ĳ�����Ϣ���������ݿ⣬���복�ƺţ�name�����������ţ�code�����Լ�����ʱ��
		public boolean createNewVehicle(VehicleInfoPO vehicleInfoPO) {
			System.out.println("add Succeed!\n");
			return true;	
		}
			
		//ɾ��������Ϣ
		//code��ʾ��������
		public boolean deleteVehicle(String code) {
			System.out.println("delete Succeed!\n");
			return true;
		}
			
		//��ѯ������Ϣ�����복������ ���ݿ��в�ѯ�ô��ŵĳ�����Ϣ
		public VehicleInfoPO readVehicle(String code) {
			System.out.println("read Succeed!\n");
			VehicleInfoPO vehicleInfoPO = new VehicleInfoPO(0, 0, 0, 0, code, 0);
			return vehicleInfoPO;
		}
		
		//�޸ĳ�����Ϣ
		public VehicleInfoPO modifyVehicle(VehicleInfoPO vehicleInfoPO) {
			System.out.println("modify Succeed!/n");
			return vehicleInfoPO;
		}
			
		//�½�һ��˾����Ϣ������˾����š��������������ڡ����֤�š��ֻ� ���Ա���ʻ֤����
		public boolean createNewDriver(DriverInfoPO driveInfoPO) {
			System.out.println("creat Succeed!\n");
			return true;	
		}
			
		//ɾ��˾����Ϣ
		public void deleteDriver(){
			System.out.println("ɾ�����ճɹ�!\n");
		}
			
		//��ѯ˾����Ϣ������˾�����
		public DriverInfoPO inquireDriver(String code) {
			System.out.println("inquire Succeed!\n");
			DriverInfoPO driverInfoPO = new DriverInfoPO(0, "����", "1986-04-16", "43023222266666666", "13813813813", "�Ͼ���ѧ", "��", "2012-12-12");
			return driverInfoPO;
		}
			
		//�޸�˾����Ϣ
		public DriverInfoPO modifyDriver(DriverInfoPO driveInfoPO) {
			System.out.println("modify Succeed!\n");
			DriverInfoPO driverInfoPO = new DriverInfoPO(0, "����", "1986-04-16", "43023222266666666", "13813813813", "�Ͼ���ѧ", "��", "2012-12-12");
			return driverInfoPO;
		}
}
