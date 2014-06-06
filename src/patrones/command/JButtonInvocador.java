package patrones.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JButtonInvocador extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Orden orden;

	public JButtonInvocador(Orden orden) {
		super(orden.toString());
		this.orden = orden;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.orden.ejecutar();
	}
}