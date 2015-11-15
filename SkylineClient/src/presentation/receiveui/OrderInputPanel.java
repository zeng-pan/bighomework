package presentation.receiveui;

import java.awt.Color;

import javax.swing.*;

import presentation.mainui.MainController;

public class OrderInputPanel {
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JPanel senderInfo;
	private JPanel receiverInfo;
	private JPanel cargoInfo;
	private JTextField senderName;
	private JTextField senderPhoneNumber;
	private JTextField senderAdress;
	private JTextField receiverName;
	private JTextField receiverPhoneNumber;
	private JTextField receiverAdress;
	private JCheckBox cheap;
	private JCheckBox normal;
	private JCheckBox fast;
	private JCheckBox paper;
	private JCheckBox wood;
	private JCheckBox plastic;
	private JTextField length;
	private JTextField width;
	private JTextField height;
	private ButtonGroup trans;
	private ButtonGroup packge;
	
	public OrderInputPanel(){
		panel=MainController.getWritepanel();
		panel.setLayout(null);
	}
	
	public void init(){
		tabbedPane=new JTabbedPane(JTabbedPane.TOP);
		senderInfo=new JPanel();
		receiverInfo=new JPanel();
		cargoInfo=new JPanel();
		
		senderInfo.setBackground(Color.red);
		receiverInfo.setBackground(Color.pink);
		cargoInfo.setBackground(Color.orange);
		
		senderInfo.setLayout(null);
		receiverInfo.setLayout(null);
		cargoInfo.setLayout(null);
		
		
		
		tabbedPane.addTab("�ռ�����Ϣ",senderInfo);
		tabbedPane.addTab("�ļ�����Ϣ",receiverInfo);
		tabbedPane.addTab("������Ϣ",cargoInfo);
		
		tabbedPane.setSize(panel.getWidth()/4*3,panel.getHeight()/4*3);
		
		tabbedPane.setLocation(panel.getWidth()/8,panel.getHeight()/8);
		panel.add(tabbedPane);
		senderAddConpo();
		receiverAddConpo();
		cargoAddConpo();
		tabbedPane.repaint();
		panel.repaint();
	}
	
	public void senderAddConpo(){
		senderName=new JTextField("�ļ�������");
		senderPhoneNumber=new JTextField("�ļ����ֻ�����");
		senderAdress=new JTextField("�ļ���סַ");
		
		senderName.setSize(tabbedPane.getWidth()/2,tabbedPane.getHeight()/9);
		senderPhoneNumber.setSize(tabbedPane.getWidth()/2,tabbedPane.getHeight()/9);
		senderAdress.setSize(tabbedPane.getWidth()/2,tabbedPane.getHeight()/9);
		
		senderName.setLocation(tabbedPane.getWidth()/4,tabbedPane.getHeight()/6);
		senderPhoneNumber.setLocation(tabbedPane.getWidth()/4,senderName.getY()+senderName.getHeight()*2);
		senderAdress.setLocation(tabbedPane.getWidth()/4,senderPhoneNumber.getY()+senderPhoneNumber.getHeight()*2);
		
		senderInfo.add(senderName);
		senderInfo.add(senderPhoneNumber);
		senderInfo.add(senderAdress);
	}
	
	public void receiverAddConpo(){
		this.receiverName=new JTextField("�ռ�������");
		this.receiverPhoneNumber=new JTextField("�ռ����ֻ�");
		this.receiverAdress=new JTextField("�ռ���סַ");
		
		receiverName.setSize(tabbedPane.getWidth()/2,tabbedPane.getHeight()/9);
		receiverPhoneNumber.setSize(tabbedPane.getWidth()/2,tabbedPane.getHeight()/9);
		receiverAdress.setSize(tabbedPane.getWidth()/2,tabbedPane.getHeight()/9);
		
		receiverName.setLocation(tabbedPane.getWidth()/4,tabbedPane.getHeight()/6);
		receiverPhoneNumber.setLocation(tabbedPane.getWidth()/4,receiverName.getY()+receiverName.getHeight()*2);
		receiverAdress.setLocation(tabbedPane.getWidth()/4,receiverPhoneNumber.getY()+receiverPhoneNumber.getHeight()*2);
		
		receiverInfo.add(receiverName);
		receiverInfo.add(receiverPhoneNumber);
		receiverInfo.add(receiverAdress);
	}
	
	public void cargoAddConpo(){
		trans=new ButtonGroup();
		packge=new ButtonGroup();
		cheap=new JCheckBox("����");
		normal=new JCheckBox("��ͨ");
		fast=new JCheckBox("����");
		paper=new JCheckBox("ֽ��");
		wood=new JCheckBox("ľ��");
		plastic=new JCheckBox("��ݴ�");
		width=new JTextField("���");
		height=new JTextField("�߶�");
		length=new JTextField("����");
		
		trans.add(cheap);
		trans.add(normal);
		trans.add(fast);
		
		packge.add(paper);
		packge.add(wood);
		packge.add(plastic);
		
		cheap.setBounds(tabbedPane.getWidth()/8,tabbedPane.getHeight()/10
				,tabbedPane.getWidth()/4,tabbedPane.getHeight()/10);
		normal.setBounds(tabbedPane.getWidth()/8,cheap.getY()+cheap.getHeight()*2
				,tabbedPane.getWidth()/4,tabbedPane.getHeight()/10);
		fast.setBounds(tabbedPane.getWidth()/8,normal.getY()+normal.getHeight()*2
				,tabbedPane.getWidth()/4,tabbedPane.getHeight()/10);
		
		cargoInfo.add(cheap);
		cargoInfo.add(normal);
		cargoInfo.add(fast);
		
		paper.setBounds(tabbedPane.getWidth()/8*5,tabbedPane.getHeight()/10
				,tabbedPane.getWidth()/4,tabbedPane.getHeight()/10);
		wood.setBounds(tabbedPane.getWidth()/8*5,paper.getY()+paper.getHeight()*2
				,tabbedPane.getWidth()/4,tabbedPane.getHeight()/10);
		plastic.setBounds(tabbedPane.getWidth()/8*5,wood.getY()+wood.getHeight()*2
				,tabbedPane.getWidth()/4,tabbedPane.getHeight()/10);
		
		cargoInfo.add(paper);
		cargoInfo.add(wood);
		cargoInfo.add(plastic);
		
		length.setBounds(tabbedPane.getWidth()/6,plastic.getY()+plastic.getHeight()*3/2
				,tabbedPane.getWidth()/8,tabbedPane.getHeight()/10);
		width.setBounds(length.getX()+length.getWidth()*2,plastic.getY()+plastic.getHeight()*3/2
				,tabbedPane.getWidth()/8,tabbedPane.getHeight()/10);
		height.setBounds(width.getX()+width.getWidth()*2,plastic.getY()+plastic.getHeight()*3/2
				,tabbedPane.getWidth()/8,tabbedPane.getHeight()/10);
		
		cargoInfo.add(length);
		cargoInfo.add(width);
		cargoInfo.add(height);
		
	}
}
