package step2.review;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TestVoidAndReturnUI {
	private JFrame f;
	private JButton btn1,btn2;
	private JPanel panel;
	private JTextField tf;
	public void go() {
		f=new JFrame("������ ���");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container contentPane = f.getContentPane();	   	
		
		btn1=new JButton("return���� �ִ� �޼���");
		btn1.addActionListener(new ButtonHandler());
		btn2=new JButton("void�� ��õ� �޼���");
		btn2.addActionListener(new ButtonHandler());
		panel=new JPanel();
		panel.add(btn1);  
		panel.add(btn2);

		f.add(panel,BorderLayout.CENTER);
		tf=new JTextField();
		
		contentPane.add(tf, BorderLayout.SOUTH);
		f.pack();
		f.setLocation(500, 200);
		f.setVisible(true);
	}
	class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			GoogleService service=new GoogleService();
			tf.setText("");
			if(e.getSource()==btn1) {		
				//test1()�� ���ϰ��� ������ �������� 
				//��ȯ�޾� �� UI ȭ�鿡 ǥ���� �� �ִ� 
				String result=service.test1();
				System.out.println(result);
				tf.setText("���:"+result);
			}else if(e.getSource()==btn2) {		
				//test2() �� void �� ���ϰ��� �����Ƿ�
				//ȣ���Ͽ� �����Ű�� �͸� ����! 
				//String result=service.test2(); // error 
				service.test2();
			}
		}		
	}	
	public static void main(String[] args) {
		TestVoidAndReturnUI t=new TestVoidAndReturnUI();
		t.go();
	}
}










