package step6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

import common.IP;

public class ChattingGUIClient {

 private JFrame frame;
 private JTextArea textArea;
 private JPanel panel;
 private JTextField textField;
 private JButton button;
 /*
  * ��Ʈ��ũ ����� ���� ������ ���� 
  */
 private Socket socket;
 private BufferedReader br;
 private PrintWriter pw;
 /*
  *  ��Ʈ���� ������ �ݴ� �޼��带 �����Ѵ� 
  */
 public void closeAll() throws IOException {
	 if(br!=null)
		 br.close();
	 if(pw!=null)
		 pw.close();
	 if(socket!=null)
		 socket.close();
 }

 public void startUI() {
  frame = new JFrame("kostatok");
  frame.addWindowListener(new WindowAdapter() {
   @Override
   public void windowClosing(WindowEvent e) {
    /*
     * ServerWorker Thread���� �����Ұ����� �˸��� 
     */
	  // System.out.println("�����ư");
	   pw.println("����");
	   try {
		closeAll();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
       System.exit(0);//�ý��� ����
   }
  });
  textArea = new JTextArea();
  textArea.setBackground(Color.YELLOW);
  frame.add(textArea, BorderLayout.CENTER);
  
  // ��ũ�ѹ� - ������Ʈ
    DefaultCaret caret = (DefaultCaret) textArea.getCaret();
    caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    JScrollPane sp = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    frame.add(sp, BorderLayout.CENTER);// ��ũ������ JTextArea ����
  
  
  // textField�� button �� ������ �� panel�� �� ��Ҹ� �߰��ϰ�
  // �� panel�� frame�� south ��ġ�� �߰��Ѵ�
  textField = new JTextField(25);
  textField.addKeyListener(new KeyHandler());
  button = new JButton("����");
  button.addActionListener(new ButtonHandler());
  panel = new JPanel();
  panel.add(textField);
  panel.add(button);
  frame.add(panel, BorderLayout.SOUTH);
  frame.setSize(400, 400);
  frame.setLocation(500, 200);
  frame.setVisible(true);
  // textField�� ��Ŀ���� �ش�
  textField.requestFocus();
 }

 public class ButtonHandler implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
   	  /*  ģ���鿡�� ���� �޼��� �� ������  textField �� getText() �� 
	   *  �̿��� �����ͼ� ������ ����Ѵ� 
	   *  ��� �� setText("") �� requestFocus()�� ȣ���� 
	   *  �Է¶��� ����ְ� Ŀ���� �ش�
	   *  �̷��� �۾��� �Ʒ� ������ �޼���sendMessage���� �۾��ؼ� 
	   *  ����Ű �̺�Ʈ�ÿ��� ������ �� �ֵ��� �Ѵ� 
	   */	 
	  sendMessage();
  }
 }
	public void sendMessage() {
		pw.println(textField.getText());//������ ��� 
		textField.setText("");
		textField.requestFocus();
	}

 public class KeyHandler extends KeyAdapter {
  @Override
  public void keyPressed(KeyEvent e) {
   // Enter key �� ������ �� �̺�Ʈ ó��
   if (e.getKeyCode() == KeyEvent.VK_ENTER) {
    /*  ������ ����ϴ� sendMessage() �� ȣ���Ѵ� 
     *  
     */
	  sendMessage();
   }
  }
 }

 public void go() throws UnknownHostException, IOException {
	 /* GUI�� ȭ�鿡 ���̱� ���� ��ſ� �ʿ��� 
	  * ���ϰ� ��,��� ��Ʈ���� �����Ѵ� 
	  * ���� ���������� ģ������ �޼����� �Է¹��� 
	  * ReceiverWorker Thread �� �����ϰ� start ��Ų��
	  * (start ��Ű�� ���� ���󽺷���� �����Ѵ�)
	  *  
	  */	 
	 socket=new Socket(IP.INST,5432);
	 br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
	 pw=new PrintWriter(socket.getOutputStream(),true);//true autoflush
	 ReceiverWorker worker=new ReceiverWorker();
	 Thread thread=new Thread(worker);
	 thread.setDaemon(true);
	 startUI();//ȭ���� �����ϴ� �޼��� 
	 thread.start();//�����带 ���డ�ɻ��·� ���� jvm�� ���� �����ϰ� �Ѵ� 
 }

 class ReceiverWorker implements Runnable {
  @Override
  public void run() {
   /* �������� ���� ģ������ �޼����� �Է¹޾� 
    * ȭ�� ��� TextArea�� ����Ѵ� 
    * textArea.append(message+"\n");
    */
	  try {
		  while(true) {
			  String message=br.readLine();
			  if(message==null)
				  break;
			  textArea.append(message+"\n");
		  }
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }//run
 }//ReceiverWorker

 public static void main(String[] args) {
  ChattingGUIClient client = new ChattingGUIClient();
  try {
   client.go();
  } catch (IOException e) {
   e.printStackTrace();
  }//catch
 }//main
}//class
