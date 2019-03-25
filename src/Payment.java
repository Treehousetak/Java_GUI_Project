import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payment extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static JRadioButton debit;
	static JRadioButton credit;
	static JRadioButton tech;
	static ButtonGroup group;
	static double totalCost, revenue;
	static int totalItems;
	static String payment="", itemsOrderTotal = "";
	static JLabel lblNewLabel_1 = new JLabel();
	
	
	KioskInfo info = new KioskInfo();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Snacks snack = new Snacks();
		snack.getTotal();
		
		try {
			Payment dialog = new Payment();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void WORKK(double totals) {
	
		totalCost += totals;
		lblNewLabel_1.setText("$" + totalCost);
		lblNewLabel_1.setText("$" + totalCost);
		}
	public static void items(int itemtotals) {
		
		totalItems += itemtotals;
		
		}
public static void items2(int itemtotals) {
		totalItems += itemtotals;
		}
public static void items3(int itemtotals) {
	totalItems += itemtotals;
	}
public static void itemorder(String itemordertotal) {
	itemsOrderTotal += itemordertotal;
	}
	/**
	 * Create the dialog.
	 */
	public Payment() {
		setBounds(100, 100, 497, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		group = new ButtonGroup();
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		{
			debit = new JRadioButton("Debit Card", true);
			debit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(debit.isSelected() == true){
						payment = "Debit Card"; 
					}
				}
			});
			debit.setFont(new Font("Times New Roman", Font.BOLD, 24));
			contentPanel.add(debit);
			group.add(debit);
			
			
		}
		{
			credit = new JRadioButton("Credit Card", false);
			credit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(credit.isSelected() == true){
						payment = "Credit Card"; 
					}
				}
			});
			credit.setFont(new Font("Times New Roman", Font.BOLD, 24));
			contentPanel.add(credit);
			group.add(credit);
		}
		{
			tech = new JRadioButton("Techcash", false);
			tech.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(tech.isSelected() == true){
						payment = "Techcash"; 
					}
				}
			});
			tech.setFont(new Font("Times New Roman", Font.BOLD, 24));
			contentPanel.add(tech);
			group.add(tech);
		}
		
		{
			JLabel lblNewLabel = new JLabel("Total Cost:");
			lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 28));
			contentPanel.add(lblNewLabel);
		}
		{
			
			
			lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 28));
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Yes");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
						JOptionPane.showMessageDialog(null, "Cost: $" + totalCost +
								"\n Total Items Purchased: " + totalItems
								+ "\nItems Purchased: "+ itemsOrderTotal +
								"\n Payment: " + payment, 
								  "Receipt", JOptionPane.PLAIN_MESSAGE);
						Kiosk back = new Kiosk();
						back.setVisible(true);
						revenue += totalCost;
						info.Revenue(totalCost);
						itemsOrderTotal = "";
						totalCost = 0;
						totalItems = 0;
						
					}
				});
				{
					JLabel lblNewLabel_2 = new JLabel("Would You Like a Receipt?");
					lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
					buttonPane.add(lblNewLabel_2);
				}
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("No");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
						Kiosk back = new Kiosk();
						back.setVisible(true);
						revenue += totalCost;
						info.Revenue(totalCost);
						totalCost = 0;
						totalItems = 0;
					
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void setTotal(double Revenue) {
		Revenue = revenue; 
		info.Revenues += Revenue;
	}

}
