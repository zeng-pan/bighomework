package businesslogicservice;

import java.util.ArrayList;

import vo.ReceiptVO;

public interface ReceiptBLService {
	//ϵͳ��ʾδ�����ĵ����б�
	public boolean showReceiptList(ArrayList<ReceiptVO> receiptList);
	
	//���������ĵ��ݣ��ύ��ϵͳ��ʾ�����ɹ���δ�ɹ������ܾ����޸ĺ��ٱ�ǣ�
	public boolean ApprovalReceipt(ArrayList<ReceiptVO> marked);
	
	//��˾ְ���鿴�����б�
	//���ݱ��Ϊ ְ���˺�+��������+���ݴ�������
	public boolean inquireReceiptList(ArrayList<ReceiptVO> receiptList);
	
	//��˾ְ���޸ĵ���
	//ϵͳ��ʾ���浥��
	public boolean modifyReceipt(ReceiptVO receipt);
	
	//��˾ְ���ύ����
	public boolean submitReceipt(String receiptCode);
	
	public boolean save(String receiptCode);
}
