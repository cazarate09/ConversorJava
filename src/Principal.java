import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Principal extends JFrame
{
	private JLabel mensaje;
	private JButton bAceptar, bSalir;
	private Border border;
	private JComboBox combo;
	
	
	public Principal() {
		// TODO Auto-generated constructor stub
		
		
		super("Conversor");
		
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		
		
		//border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		
		JPanel pNorte = crearPNorte();
		content.add(pNorte, BorderLayout.NORTH);
		
		JPanel pCentro = crearPCentro();
		content.add(pCentro, BorderLayout.CENTER);
		
		JPanel pSur = crearPSur(); 
		content.add(pSur,BorderLayout.SOUTH);
		
		this.setResizable(false);
		setSize(300, 150);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	

	private JPanel crearPNorte() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new FlowLayout());
		
	
		
		mensaje = new JLabel("Seleccione una opción de conversión");
		p.add(mensaje);
		
		return p;
	}
	
	

	private JPanel crearPCentro() {
		// TODO Auto-generated methd stub
		JPanel p = new JPanel(new FlowLayout());
		
		combo = new JComboBox();
		
		p.add(combo);
		
		combo.addItem("Conversor monedas");
		combo.addItem("Conversor superficies");
		
		return p;
	}

	
	

	private JPanel crearPSur()
	{
		
		JPanel p = new JPanel(new FlowLayout());
		
		
		
		bAceptar = new JButton("Aceptar");
		p.add(bAceptar,BorderLayout.EAST);
		FormularioMonedas fm = new FormularioMonedas();
		FormularioSuperficies fs = new FormularioSuperficies();
		
		bAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int opcion = combo.getSelectedIndex();
				
				switch (opcion) {
				
					case 0:	setVisible(false);
							
							dispose();	
						
							fm.setVisible(true);
					
					
							break;
							
					case 1: setVisible(false);
							
							dispose();
							
							
							fs.setVisible(true);
							
							break;

					default: throw new IllegalArgumentException("Unexpected value: " + opcion);
				
				}
				
				
			}
		});
		
		
		bSalir = new JButton("Salir");
		p.add(bSalir,BorderLayout.WEST);
		
		bSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Programa terminado");
				
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
		return p;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal ventana = new Principal();
	}
}
