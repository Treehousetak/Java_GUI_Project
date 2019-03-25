import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Sundries extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static JLabel lblNewLabel_1 = new JLabel();
	
	static String Sundriess[] = { "Sewing Kit($1) ", "Nail Kit($2) ", "Facial Tissues($1) ", "Toilet Tissue($1) ",
	"Hand Cream($1) ", "Body Lotion($1) ", "Deodorant($2) ", "Anti-Perspirant($1.5) ", 
	"School Tee Shirt($3) ","Sweat Pants($4) ", "Pencil Pen Stationary Kit($2) ", "Handy Wipes($1) "
	};
		private double total2 = 0;
		private int Sitems2 = 0;
		static String itemsOrdered = "";
		static Payment pay = new Payment();
		static KioskInfo info = new KioskInfo();
		static int stock = 120;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sundries dialog = new Sundries();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the dialog.
	 */
	public Sundries() {
		setBounds(100, 100, 970, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{42, 143, 143, 152, 180, 0};
		gbl_contentPanel.rowHeights = new int[]{58, 62, 68, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JButton btnNewButton = new JButton(Sundriess[0]);
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					total2 += 1;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[0];
				}
			});
			btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 1;
			gbc_btnNewButton.gridy = 0;
			contentPanel.add(btnNewButton, gbc_btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton(Sundriess[1]);
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 2;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[1];
					
				}
			});
			btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton_1.gridx = 2;
			gbc_btnNewButton_1.gridy = 0;
			contentPanel.add(btnNewButton_1, gbc_btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton(Sundriess[2]);
			btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 18));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					total2 += 1;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[2];
				}
			});
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton_2.gridx = 3;
			gbc_btnNewButton_2.gridy = 0;
			contentPanel.add(btnNewButton_2, gbc_btnNewButton_2);
		}
		{
			JButton button = new JButton(Sundriess[3]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 1;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[3];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 4;
			gbc_button.gridy = 0;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Sundriess[4]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 1;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[4];
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
			JButton button = new JButton(Sundriess[5]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 1;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[5];
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
			JButton button = new JButton(Sundriess[6]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 1;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[6];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = 3;
			gbc_button.gridy = 1;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Sundriess[7]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 1.5;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[7];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 5, 0);
			gbc_button.gridx = 4;
			gbc_button.gridy = 1;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Sundriess[8]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 3;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[8];
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
			JButton button = new JButton(Sundriess[9]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 4;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[9];
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
			JButton button = new JButton(Sundriess[10]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 2;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[10];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.insets = new Insets(0, 0, 0, 5);
			gbc_button.gridx = 3;
			gbc_button.gridy = 2;
			contentPanel.add(button, gbc_button);
		}
		{
			JButton button = new JButton(Sundriess[11]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total2 += 1;
					lblNewLabel_1.setText("$" + total2);
					Sitems2 += 1;
					stock -= 1;
					itemsOrdered += Sundriess[11];
				}
			});
			button.setFont(new Font("Verdana", Font.PLAIN, 18));
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.gridx = 4;
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
				lblNewLabel_1.setText("$" + total2);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
				buttonPane.add(lblNewLabel_1);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
						pay.WORKK(total2);
						pay.items2(Sitems2);
						pay.itemorder(itemsOrdered);
						info.stocks2(stock);
						itemsOrdered = "";
						total2 = 0;
						Sitems2 = 0;
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
						total2 = 0;
						Sitems2 = 0;
						itemsOrdered = "";
						dispose();
						Kiosk back = new Kiosk();
						back.setVisible(true);
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void setTotal(double total2) {
		this.total2 = total2;
		pay.totalCost += total2;
	}
	public void setTotal(int Sitems2) {
		Sitems2 = Sitems2;
		pay.totalItems += Sitems2;
	}
	public void setTotal1(int sstocks) {
		stock = stock;
		info.Sstock += stock;
	}
	public void setTotal2(String SitemsOrdered) {
		itemsOrdered += itemsOrdered;
		pay.itemsOrderTotal += itemsOrdered;
	}
	public double gettotal2() {
		return total2;
	}
}