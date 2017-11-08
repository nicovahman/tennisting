package Translator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Vindue {

	private static JLabel besked1;
	private static String nicolas;
	private static ImageIcon image1;
	private static JLabel label3;

	public static void Vindue() throws IOException {

		JFrame vindue = new JFrame("Java Vindue");
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vindue.setLocationRelativeTo(null);
		vindue.setLayout(new BorderLayout());
		
		vindue.setVisible(true);
		vindue.setLayout(new FlowLayout());

		nicolas = "<html> Søg efter en tennisspiller</html>";
		besked1 = new JLabel(nicolas);

		vindue.add(besked1);
		
		
		
		vindue.setSize(320, 280);

		
		
		
		
		JTextField brugernavnsfelt = new JTextField(20);
		brugernavnsfelt.setBounds(80, 10, 160, 25);
		vindue.add(brugernavnsfelt);
		vindue.setVisible(true);
		
		JButton helt = new JButton("Hjælp");
		vindue.add(helt);
		vindue.setVisible(true);
		
		helt.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, " Søg efter en tennisspiller. Fx Roger...", "Systemmeddelelse", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		brugernavnsfelt.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent evt) {

				String uname = brugernavnsfelt.getText();

				if (uname.equals("Roger") || uname.equals("roger")) {

					JFrame vindue1 = new JFrame("Java Vindue");
					vindue1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					vindue1.setLocationRelativeTo(null);
					vindue1.setLayout(new BorderLayout());
					vindue1.setSize(400, 280);
					vindue1.setVisible(true);
					vindue1.setLayout(new FlowLayout());

					String nico;

					nico = "<html> Dette er Roger Federer. <br>"
							+ "Han er en af verdens bedste tennisspillere. Fra Schweiz</html>";

					JLabel bes1 = new JLabel(nico);
					vindue1.add(bes1);

					JButton vis = new JButton("Vis billede");
					vis.setSize(new Dimension(50, 50));
					vis.setLocation(500, 350);
					vindue1.add(vis);
					vis.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {

							ImageIcon spiller2 = new ImageIcon("Roger.jpg");
							JOptionPane.showMessageDialog(null, " ", "Systemmeddelse", JOptionPane.INFORMATION_MESSAGE,
									spiller2);
						}
					});
				}
				if (uname.equals("Andy") || uname.equals("andy")) {
					JFrame vindue2 = new JFrame("Tennis bibliotek");
					vindue2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					vindue2.setLocationRelativeTo(null);
					vindue2.setLayout(new BorderLayout());
					vindue2.setSize(400, 280);
					vindue2.setVisible(true);
					vindue2.setLayout(new FlowLayout());

					String nico1;
					nico1 = "<html> Dette er Andy Murray. <br>"
							+ "Han er Englands bedste mandlige tennisspiller</html>";

					JLabel bes2 = new JLabel(nico1);
					vindue2.add(bes2);

					JButton vis1 = new JButton("Vis billede");
					vis1.setSize(new Dimension(50, 50));
					vis1.setLocation(500, 350);
					vindue2.add(vis1);
					vis1.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {

							ImageIcon spiller3 = new ImageIcon("Andy.jpg");
							JOptionPane.showMessageDialog(null, " ", "Systemmeddelse", JOptionPane.INFORMATION_MESSAGE,
									spiller3);
						}

					});

				}

			}

		});

	}
}
