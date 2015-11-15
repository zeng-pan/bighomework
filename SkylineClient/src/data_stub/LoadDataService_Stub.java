package data_stub;

import java.util.ArrayList;
import java.util.List;

import dataservice.LoadDataService;
import po.PlaneLoadingPO;
import po.TrainLoadingPO;
import po.VehicleLoadingPO;


public class LoadDataService_Stub implements LoadDataService {
	
	    //��дװ�˱����ݿ�
		//centerNumber��ʾ��������ת����
		@Override
		public boolean writeVehicleLoadBase(List<VehicleLoadingPO> loadList,String centerNumber){
			System.out.println("write Succeed!/n");
			return true;
		}
		
		//�����ݿ��ȡװ����Ϣ  LoadList��װ����Ϣ
		@Override
		public List<VehicleLoadingPO> readVehicleLoadBase(){
			VehicleLoadingPO vehicleLoadingPO = new VehicleLoadingPO("2012/02/23", "01235", "1203", "�Ͼ�", "����", "����", "��С��", "101", "20");
			List<VehicleLoadingPO> vehicleList = new ArrayList<VehicleLoadingPO>();
			vehicleList.clear();
			vehicleList.add(vehicleLoadingPO);
			System.out.println("Succeed!/n");
			return vehicleList;
		}
		
		//ɾ�����ݿ����װ����Ϣ  loadListΪҪɾ����װ����Ϣ
		@Override
		public boolean delVehicleLoadBase(List<VehicleLoadingPO> loadList){
			System.out.println("delete Succeed!/n");
			return true;
		}
		@Override
		public boolean writeTrainLoadBase(List<TrainLoadingPO> loadList,String centerNumber){
			System.out.println("write Succeed!/n");
			return true;
		}
		
		//�����ݿ��ȡװ����Ϣ  LoadList��װ����Ϣ
		@Override
		public List<TrainLoadingPO> readTrainLoadBase(){
			TrainLoadingPO trainLoadingPO = new TrainLoadingPO("2013/08/16", "015", "302", "����", "�Ͼ�", "����", "62", "32", "20");
			List<TrainLoadingPO> trainList = new ArrayList<TrainLoadingPO>();
			System.out.println("Succeed!/n");
			trainList.clear();
			trainList.add(trainLoadingPO);
			return trainList;	
		}
		
		//ɾ�����ݿ����װ����Ϣ  loadListΪҪɾ����װ����Ϣ
		@Override
		public boolean delTrainLoadBase(List<TrainLoadingPO> loadList){
			System.out.println("delete Succeed!/n");
			return true;
		}
		
		@Override
		public boolean writePlaneLoadBase(List<PlaneLoadingPO> loadList,String centerNumber){
			System.out.println("write Succeed!/n");
			return true;	
		}
		
		//�����ݿ��ȡװ����Ϣ  LoadList��װ����Ϣ
		@Override
		public List<PlaneLoadingPO> readPlaneLoadBase(){
			PlaneLoadingPO planeLoadingPO = new PlaneLoadingPO("2013/08/09", "230", "CZ23028", "����", "�Ͼ�", "����", "023", "023", "02");
			List<PlaneLoadingPO> planeList = new ArrayList<PlaneLoadingPO>();
			planeList.clear();
			planeList.add(planeLoadingPO);
			System.out.println("Succeed!/n");
			return planeList;
		}
		
		//ɾ�����ݿ����װ����Ϣ  loadListΪҪɾ����װ����Ϣ
		@Override
		public boolean delPlaneLoadBase(List<PlaneLoadingPO> loadList){
			System.out.println("delete Succeed!/n");
			return true;
		}
}
