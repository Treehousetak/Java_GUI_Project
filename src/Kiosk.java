import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class Kiosk extends JFrame {
	

	private JPanel contentPane;
	
	Snacks snackM = new Snacks();
	Sundries sundryM = new Sundries();
	Health healthM = new Health();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kiosk frame = new Kiosk();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kiosk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Kiosk Info");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
				KioskInfo info = new KioskInfo();
				info.main(null);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("About");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String mymessage = "Hello! Welcome to my Kiosk. This Kiosk has three different paths."
						+ "\n They lead to either snacks, health related items, and sundires"
						+ "\n You can also view the Kiosk's stock and revenue in the \"Kiosk Info\" section but it requires a password only the Client knows."
						+ "\n CREATED BY: Kemelbek Tashkulov, an ITM student studying at Illinois Institute of Technology.";
				JOptionPane.showMessageDialog(null, mymessage, 
						   "About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("SNACKS");
		btnNewButton.setBounds(5, 5, 257, 467);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				snackM.setVisible(true);
				
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("HEALTH");
		btnNewButton_1.setBounds(262, 5, 257, 467);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				healthM.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SUNDRIES");
		btnNewButton_2.setBounds(519, 5, 263, 400);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				sundryM.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(btnNewButton_2);
		
		JButton btnDone = new JButton("DONE");
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Payment payM = new Payment();
				payM.setVisible(true);
			}
		});
		btnDone.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnDone.setBounds(519, 405, 263, 67);
		contentPane.add(btnDone);
	}
}
