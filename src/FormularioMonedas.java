import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class FormularioMonedas extends JFrame
{
	protected JLabel mensaje;
	protected JButton bConvertir, bRegresar;
	protected Border border;
	protected JComboBox combo;
	protected JTextField area;
	
	
	public FormularioMonedas() {
		// TODO Auto-generated constructor stub
		
		
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		
		
		//border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		
		JPanel pNorte = crearPNorte();
		content.add(pNorte, BorderLayout.NORTH);
		
		JPanel pCentro = crearPCentro();
		content.add(pCentro, BorderLayout.CENTER);
		
		JPanel pSur = crearSur(); 
		content.add(pSur,BorderLayout.SOUTH);
		
		
		setSize(300, 150);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	

	private JPanel crearPNorte() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());
		
		Font fuente = new Font("Arial", 3, 20);
		
		mensaje = new JLabel("Ingrese cantidad:  ");
		p.add(mensaje, BorderLayout.WEST);
		
		area = new JTextField(10);
		area.setFont(fuente);
		
		p.add(area, BorderLayout.EAST);
		
		return p;
	}
	
	

	private JPanel crearPCentro() {
		// TODO Auto-generated methd stub
		JPanel p = new JPanel(new FlowLayout());
		
		combo = new JComboBox();
		
		p.add(combo);
		
		
		combo.addItem("Convertir de COP a USD");
		combo.addItem("Convertir de COP a EUR");
		combo.addItem("Convertir de COP a GBP");
		combo.addItem("Convertir de COP a JPY");
		combo.addItem("Convertir de COP a KRW");
		combo.addItem("Convertir de USD a COP");
		combo.addItem("Convertir de EUR a COP");
		combo.addItem("Convertir de GBP a COP");
		combo.addItem("Convertir de JPY a COP");
		combo.addItem("Convertir de KRW a COP");  
		
		return p;
	}


	private JPanel crearSur()
	{
		
		JPanel p = new JPanel(new FlowLayout());
		
		
		bConvertir = new JButton("Calcular");
		p.add(bConvertir,BorderLayout.EAST);
		
		bRegresar = new JButton("Regresar");
		p.add(bRegresar,BorderLayout.WEST);
		
		
		bConvertir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try 
				{
						int opcion = combo.getSelectedIndex();
						
						float valor = Float.valueOf( area.getText());
						
						
						switch (opcion)
						{
							case 0:		JOptionPane.showMessageDialog(null, "El valor " + valor + " COP equivale a "
										+ valor / 3798 + " USD" );
								
										break;
							
							case 1:		JOptionPane.showMessageDialog(null, "El valor " + valor + " COP equivale a "
										+ valor / 4072 + " EUR" );
							
										break;
										
							case 2:		JOptionPane.showMessageDialog(null, "El valor " + valor + " COP equivale a "
										+ valor / 4761 + " GBP" );
						
										break;
										
							case 3:		JOptionPane.showMessageDialog(null, "El valor " + valor + " COP equivale a "
										+ valor / 28.3 + " JPY" );
					
										break;
									
							case 4:		JOptionPane.showMessageDialog(null, "El valor " + valor + " COP equivale a "
										+ valor / 3.02 + " KRW" );
					
										break;
							
										
							case 5:		JOptionPane.showMessageDialog(null, "El valor " + valor + " USD equivale a "
										+ valor * 3798 + " COP" );
								
										break;
						
							case 6:		JOptionPane.showMessageDialog(null, "El valor " + valor + " EUR equivale a "
										+ valor * 4072 + " COP" );
							
										break;
										
							case 7:		JOptionPane.showMessageDialog(null, "El valor " + valor + " GBP equivale a "
										+ valor * 4761 + " COP" );
						
										break;
										
							case 8:		JOptionPane.showMessageDialog(null, "El valor " + valor + " JPY equivale a "
										+ valor * 28.3 + " COP" );
					
										break;
									
							case 9:		JOptionPane.showMessageDialog(null, "El valor " + valor + " KRW equivale a "
										+ valor * 3.02 + " COP" );
					
										break;
							
							default:	throw new IllegalArgumentException("Unexpected value: " + opcion);
						}
						
						
				} 
				
				
				catch (Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Debe ingresar valor válido" );

				}
				
				
				
			}
		});
		
	    bRegresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				Principal v = new Principal();
				
			}
		});
		
		return p;
	}
	
	
	
}
