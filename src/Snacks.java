import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dialog;

import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Snacks extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static JLabel lblNewLabel_1 = new JLabel();
	
	static String Snacks[] = { "Potato Chips($1.50)", "Popcorn($1)","Crackers($1)", "Chip Mix($1)", 
			"Peanuts($1)", "Chocolate Bar($1.25)", "Mixed Nuts($1)", "Health Bar($2)", 
			"Raisins($1)", "Cookies($1)", "Fig Bars($1.50)", "Pretzels($1.25)"};
	
	private double total = 0;
	private int Sitems = 0;
	static String itemsOrdered = "";
	static Payment pay = new Payment();
	static KioskInfo info = new KioskInfo();
	static int stock = 120;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			Snacks dialog = new Snacks();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Create the dialog.
	 */
	public Snacks() {
		setBounds(100, 100, 853, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{143, 143, 152, 180, 0};
		gbl_contentPanel.rowHeights = new int[]{58, 62, 68, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JButton btnNewButton = new JButton(Snacks[0]);
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1.50;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[0];
				}
			});
			btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 0;
			contentPanel.add(btnNewButton, gbc_btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton(Snacks[1]);
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[1];
				}
			});
			btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton_1.gridx = 1;
			gbc_btnNewButton_1.gridy = 0;
			contentPanel.add(btnNewButton_1, gbc_btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton(Snacks[2]);
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[2];
				}
			});
			btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 18));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton_2.gridx = 2;
			gbc_btnNewButton_2.gridy = 0;
			contentPanel.add(btnNewButton_2, gbc_btnNewButton_2);
		}
		{
			JButton button = new JButton(Snacks[3]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[3];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 3;
			gbc_button.gridy = 0;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[4]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[4];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 0;
			gbc_button.gridy = 1;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[5]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1.25;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[5];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 1;
			gbc_button.gridy = 1;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[6]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[6];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 2;
			gbc_button.gridy = 1;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[7]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 2;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[7];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 3;
			gbc_button.gridy = 1;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[8]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[8];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 0, 5);
			gbc_button.gridx = 0;
			gbc_button.gridy = 2;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[9]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[9];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 0, 5);
			gbc_button.gridx = 1;
			gbc_button.gridy = 2;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[10]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total += 1.50;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[10];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 0, 5);
			gbc_button.gridx = 2;
			gbc_button.gridy = 2;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Snacks[11]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					total += 1.25;
					lblNewLabel_1.setText("$" + total);
					Sitems += 1;
					stock -= 1;
					itemsOrdered += Snacks[11];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.gridx = 3;
			gbc_button.gridy = 2;
			contentPanel.add(button, gbc_button);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblNewLabel = new JLabel("COST:");
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
				buttonPane.add(lblNewLabel);
			}
			{
				lblNewLabel_1.setText("$" + this.total);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
				buttonPane.add(lblNewLabel_1);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
						pay.WORKK(total);
						pay.items3(Sitems);
						pay.itemorder(itemsOrdered);
						info.stocks(stock);
						itemsOrdered = "";
						total = 0;
						Sitems = 0;
						Kiosk back = new Kiosk();
						
						back.setVisible(true);
						
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
						total = 0;
						lblNewLabel_1.setText("$" + total);
						Sitems = 0;
						itemsOrdered = "";
						Kiosk back = new Kiosk();
						back.setVisible(true);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void setTotal(double total) {
		this.total = total;
		pay.totalCost += total;
	}
	public void setTotal(int Sitems) {
		Sitems = Sitems;
		pay.totalItems += Sitems;
	}
	public void setTotal1(int sstocks) {
		stock = stock;
		info.sstock += stock;
	}
	public void setTotal2(String SitemsOrdered) {
		itemsOrdered += itemsOrdered;
		pay.itemsOrderTotal += itemsOrdered;
	}
	public double getTotal() {
		return total;
	}
	
	public int getSitems() {
		return this.Sitems;
	}
	
}
