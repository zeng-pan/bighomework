package businesslogicservice;

import vo.LobbyReceptionVO;
import vo.OrderVO;
import vo.TransitReceptionVO;

public interface ReceiveBLService {
	/*���Ա����
	 �ļ���������סַ����λ���绰���ֻ���
	 �ռ���������סַ����λ���绰���ֻ���
	 ���˻�����Ϣ��ԭ������ʵ��������������ڼ�Ʒ��(û�еĻ���null)���ߴ磩��
	 ���ÿ�ݣ���׼��ݣ��ؿ�ר�ݣ�
	 ��װ�ѣ�ֽ�䣨5Ԫ����ľ�䣨10Ԫ������ݴ���1Ԫ)
	 ϵͳ��ʾ�ύ�󶩵�
	 */
	public boolean createNewOrder(OrderVO orderInfo);
	
	/*��ת����ҵ��Ա����
	 * ��ת���ı�ţ�025���б���+0Ӫҵ��+00��¥��ת���ģ�
	 * ���������ڡ���ת����š������ء����ﵽ��״̬���𻵡���������ʧ��
	 * ϵͳ��ʾ��������ת���ﵥ
	 */
	
	public boolean createNewTransitReception(TransitReceptionVO transitReceptionInfo);
	
	/*Ӫҵ��ҵ��Ա����
	 * �������ڣ������ţ������أ����ﵽ��״̬���𻵣���������ʧ��
	 * ϵͳ��ʾ������Ӫҵ�����ﵥ
	 */
	
	public boolean createNewLobbyReception(LobbyReceptionVO lobbyReceptionInfo);
}
