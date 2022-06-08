import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SplashFrame extends JFrame {
	private JPanel contentPane;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					SplashFrame sp=new SplashFrame();
					sp.setVisible(true);
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
			
		});
	}
	public SplashFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 500, 500);
		this.contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		this.setContentPane(contentPane);
		
	}

}
