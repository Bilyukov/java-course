import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;


public class HelloWorldWinwos {

	private JFrame frmMyFirstWindow;
	private JTextField txtHelloSwing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldWinwos window = new HelloWorldWinwos();
					window.frmMyFirstWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorldWinwos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyFirstWindow = new JFrame();
		frmMyFirstWindow.setTitle("My First Window");
		frmMyFirstWindow.setBounds(100, 100, 450, 300);
		frmMyFirstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyFirstWindow.getContentPane().setLayout(new BorderLayout(0, 0));
		
		txtHelloSwing = new JTextField();
		txtHelloSwing.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtHelloSwing.setText("Hello Swing!");
		frmMyFirstWindow.getContentPane().add(txtHelloSwing, BorderLayout.NORTH);
		txtHelloSwing.setColumns(10);
	}

}
