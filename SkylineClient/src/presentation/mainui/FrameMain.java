package presentation.mainui;
import java.awt.Frame;
import java.awt.Point;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FrameMain extends JFrame{
	private static JLabel exit=new JLabel(AllImage.exitImg);
	private static JLabel hide=new JLabel(AllImage.smallestImg);
	private static JLabel title=new JLabel(AllImage.edgW);
	private static JPanel panel=new JPanel();
	private static FrameMain frame;
	private static boolean move=false;
	private static Point origin = new Point();
	private static java.awt.Dimension scrSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	private FrameMain(){
	
	}
	
	public static FrameMain getFrame(){
		return frame;
	}
	public static void init(){
		frame.setSize((int)((double)scrSize.getHeight()*3/4/490*724),(int)((double)scrSize.getHeight()*3/4));
		frame.setLocation((int)(scrSize.getWidth()/2-(int)((double)scrSize.getHeight()*3/4/490*724/2))
				,(int)(scrSize.getHeight()/2-(int)((double)scrSize.getHeight()*3/4/2)));
		frame.setUndecorated(true);
		frame.setResizable(false);
		exit.setSize((int)((double)frame.getWidth()*18/490),(int)((double)frame.getHeight()*22/490));
		hide.setSize(30,25);
		title.setSize(frame.getWidth()-(int)((double)frame.getWidth()*18/490)*2,(int)((double)frame.getHeight()*22/490));
		title.setLocation(0,0);
		exit.setLocation(frame.getWidth()-exit.getWidth(),0);
		hide.setLocation(frame.getWidth()-2*hide.getWidth(),0);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.add(exit);
		panel.add(hide);
		panel.add(title);
		frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {  //���£�mousePressed ���ǵ����������걻����û��̧��
            	 if(e.getY()<=(int)((double)frame.getHeight()*22/490)){
            		 move=true;
            	origin.x = e.getX();  //����갴�µ�ʱ���ô��ڵ�ǰ��λ��
                origin.y = e.getY();
            	 }
            }
            public void mouseReleased(MouseEvent e){ 
				   move=false;
			    } 
          
		});
		frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {  //�϶���mouseDragged ָ�Ĳ�������ڴ������ƶ�������������϶���
            	if(move){
                Point p = frame.getLocation();  //������϶�ʱ��ȡ���ڵ�ǰλ��
                //���ô��ڵ�λ��
                //���ڵ�ǰ��λ�� + ��굱ǰ�ڴ��ڵ�λ�� - ��갴�µ�ʱ���ڴ��ڵ�λ��
               
                frame.setLocation(p.x + e.getX() - origin.x, p.y + e.getY() - origin.y);
            	}
            }
		});
		exit.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				System.exit(0);
			}
			
			public void mouseEntered(MouseEvent e){
				exit.setIcon(AllImage.exitEnterImg);
			}
			
			public void mouseExited(MouseEvent e){
				exit.setIcon(AllImage.exitImg);
			}
		});
		hide.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				frame.setExtendedState(Frame.ICONIFIED);
			}
			public void mouseEntered(MouseEvent e){
				hide.setIcon(AllImage.smallestEnterImg);
			}
			
			public void mouseExited(MouseEvent e){
				hide.setIcon(AllImage.smallestImg);
			}
		});
		frame.setVisible(true);
	}
	public static FrameMain createFrame(){
		frame=new FrameMain();
		return frame;
	}
	
	public static JPanel getContentPanel(){
		return panel;
	}
	
		

}
