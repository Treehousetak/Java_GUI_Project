import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Health extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static JLabel lblNewLabel_1 = new JLabel();
	
	static String Healths[] = { "Aspirin($2) ", "Acetominophen($2) ", "Vitamin C ($2) ", "Vitamin B Complex($2) ",
	"Bandaids($1) ", "Antibiotic Ointment($2) ", "Anti-Itch Ointment($2) ", "Gauze Pad($1) ", 
	"Tootpaste($1) ","Toothbrush($1) ", "Dental Floss($1) ", "Adhesive Tape($1) "
	};
		private double total1 = 0;
		private int Sitems1 = 0;
		static String itemsOrdered = "";
		static Payment pay = new Payment();
		static KioskInfo info = new KioskInfo();
		static int stock = 120;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Health dialog = new Health();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the dialog.
	 */
	public Health() {
		setBounds(100, 100, 970, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{42, 143, 143, 152, 180, 0};
		gbl_contentPanel.rowHeights = new int[]{58, 62, 68, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JButton btnNewButton = new JButton(Healths[0]);
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					total1 += 2;
					lblNewLabel_1.setText("$" + total1 );
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[0];
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
			JButton btnNewButton_1 = new JButton(Healths[1]);
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 2;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[1];
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
			JButton btnNewButton_2 = new JButton(Healths[2]);
			btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 18));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					total1 += 2;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[2];
				}
			});
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton_2.gridx = 3;
			gbc_btnNewButton_2.gridy = 0;
			contentPanel.add(btnNewButton_2, gbc_btnNewButton_2);
		}
		{
			JButton button = new JButton(Healths[3]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 2;
					lblNewLabel_1.setText("$" + total1 + " " + itemsOrdered);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[3];
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
			JButton button = new JButton(Healths[4]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 1;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[4];
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
			JButton button = new JButton(Healths[5]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 2;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[5];
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
			JButton button = new JButton(Healths[6]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 2;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[6];
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
			JButton button = new JButton(Healths[7]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 1;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[7];
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
			JButton button = new JButton(Healths[8]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 1;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[8];
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
			JButton button = new JButton(Healths[9]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 1;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[9];
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
			JButton button = new JButton(Healths[10]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 1;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[10];
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
			JButton button = new JButton(Healths[11]);
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					total1 += 1;
					lblNewLabel_1.setText("$" + total1);
					Sitems1 += 1;
					stock -= 1;
					itemsOrdered += Healths[11];
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
				lblNewLabel_1.setText("$" + total1);
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
				buttonPane.add(lblNewLabel_1);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
						pay.WORKK(total1);
						pay.items(Sitems1);
						pay.itemorder(itemsOrdered);
						info.stocks1(stock);
						itemsOrdered = "";
						total1 = 0;
						Sitems1 = 0;
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
						total1 = 0;
						Sitems1 = 0;
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
	public void setTotal(double total1) {
		this.total1 = total1;
		pay.totalCost += total1;
	}
	public void setTotal(int Sitems1) {
		Sitems1 = Sitems1;
		pay.totalItems += Sitems1;
	}
	public void setTotal1(int sstocks) {
		stock = stock;
		info.hstock += stock;
	}
	public void setTotal2(String SitemsOrdered) {
		itemsOrdered += itemsOrdered;
		pay.itemsOrderTotal += itemsOrdered;
	}
	public double getTotal1() {
		return total1;
	}
}