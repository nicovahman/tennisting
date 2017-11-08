//package Translator;
//hej
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//
//public class Spillere extends JFrame{
//
//	
//	public static void Spillere() {
//		
//
//		
//		switch (uname) {
//		
//		case "Roger" :
//		uname.equals("Roger"); 
//	
//	JFrame vindue1 = new JFrame("Java Vindue");
//	vindue1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	vindue1.setLocationRelativeTo(null);
//	vindue1.setLayout(new BorderLayout());
//	vindue1.setSize(400, 280);
//	vindue1.setVisible(true);
//	vindue1.setLayout(new FlowLayout());
//
//	String nico;
//
//	nico = "<html> Dette er Roger Federer. <br>" + "Han er en af verdens bedste tennisspillere. Fra Schweiz</html>";
//
//	JLabel bes1 = new JLabel(nico);
//	vindue1.add(bes1);
//
//	JButton vis = new JButton("Vis billede");
//	vis.setSize(new Dimension(50, 50));
//	vis.setLocation(500, 350);
//	vindue1.add(vis);
//	vis.addActionListener(new ActionListener() {
//
//		public void actionPerformed(ActionEvent e) {
//
//			ImageIcon spiller2 = new ImageIcon("Roger.jpg");
//			JOptionPane.showMessageDialog(null, " ", "Systemmeddelse", JOptionPane.INFORMATION_MESSAGE,
//					spiller2);
//		}
//	});					
//
//break;
//		case "Andy" : 
//			uname.equals("Andy");
//			
//			JFrame vindue2 = new JFrame("Java Vindue");
//			vindue2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			vindue2.setLocationRelativeTo(null);
//			vindue2.setLayout(new BorderLayout());
//			vindue2.setSize(400, 280);
//			vindue2.setVisible(true);
//			vindue2.setLayout(new FlowLayout());
//
//			String nico1;				
//			nico1 = "<html> Dette er Andy Murray. <br>" + "Han er Englands bedste mandlige tennisspiller</html>";
//
//			JLabel bes2 = new JLabel(nico1);
//			vindue2.add(bes2);
//
//			JButton vis1 = new JButton("Vis billede");
//			vis1.setSize(new Dimension(50, 50));
//			vis1.setLocation(500, 350);
//			vindue2.add(vis1);
//			vis1.addActionListener(new ActionListener() {
//
//				public void actionPerformed(ActionEvent e) {
//
//					ImageIcon spiller3 = new ImageIcon("Andy.jpg");
//					JOptionPane.showMessageDialog(null, " ", "Systemmeddelse", JOptionPane.INFORMATION_MESSAGE,
//							spiller3);
//				}
//
//			});
//			break;
//		}
//		
//		
//		
//	}
//	
//	
//	
//}
