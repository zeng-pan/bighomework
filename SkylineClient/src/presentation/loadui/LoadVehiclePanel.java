package presentation.loadui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presentation.mainui.MainController;

public class LoadVehiclePanel {
	private JPanel panel;
	private JComboBox transmitCenterNumber;//��ת���ı��������
	private JLabel  transmitCenterNumberLabel;
    private JLabel  receiptNumberLabel;
    private JTextField receiptNumber;//�������������
    private JLabel receiveDateLabel;
    private JTextField receiveDate;//����ʱ�������
	
	public LoadVehiclePanel(){
		panel=MainController.getWritepanel();
		panel.setLayout(null);
	}
	
	public void init(){
		transmitCenterNumber=new JComboBox();
		
	}
	
}
