package BoraSezgin;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;




public class MyFrame extends JFrame implements ActionListener{
	
	
	
	private ImageIcon img;
	private JButton button;
	private JButton button2;


	private ImageIcon logoleft = new ImageIcon("/Users/borasezgin/eclipse-workspace/bug/src/Dugmeler/right.png");

	private ImageIcon logoright = new ImageIcon("/Users/borasezgin/eclipse-workspace/bug/src/Dugmeler/left.png");


	
	public MyFrame(){
		
		setLayout (new FlowLayout());

		button = new JButton (" ENABLE OTHER",logoleft );
		button.setMnemonic(KeyEvent.VK_D);
		button.setActionCommand("button1");
		button.setToolTipText ("if you click it will enable other one");
		button.addActionListener(this);
		button.setFocusable(false);
        button.setPreferredSize(new Dimension(200, 100));

        
        
		
		button2 = new JButton("ENABLE OTHER",logoright);
		button2.addActionListener(this);
		button2.setMnemonic(KeyEvent.VK_D);
		button2.setActionCommand("button2");
		button2.setToolTipText ("if you click it will enable other one");
		button2.setEnabled (false) ;
        button2.setPreferredSize(new Dimension(200, 100));

		
		
		setTitle("BORA SEZGIN");
		add(button);
		add(button2);
	
		setSize(500,500);
		setVisible(true);
		
		
		
		
	}
			
	public static void main(String[] args) {
		JFrame gui = new MyFrame();
	}
	
			@Override
			public void actionPerformed (ActionEvent e) {
			
				if ("button1".equals (e.getActionCommand())){
					button.setEnabled(false);
					button2.setEnabled(true);
			
					getRootPane().setDefaultButton(button2);
					
				}	else if ("button2" .equals(e.getActionCommand())) {
					
				
					button.setEnabled(true);
					button2.setEnabled(false);
					getRootPane().setDefaultButton(button);
			}
			
	}

}








