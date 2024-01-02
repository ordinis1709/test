import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class myWindow extends JFrame{
	myWindow(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// The default is HIDE_ON_CLOSE
		this.setSize(1600,900);
		this.setTitle("Note-taking App");
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("icon.jpeg"); // create an ImageIcon
		this.setIconImage(image.getImage()); // Change the icon of the frame
		this.getContentPane().setBackground(new Color(45,45,48)); // Change color of the background

		JLabel head = new JLabel("Your notes");
		head.setText("Your notes");
		head.setForeground(Color.yellow);
		head.setFont(new Font("MV Boli", Font.BOLD, 20));
		// head.setIcon(image);
		head.setHorizontalTextPosition(JLabel.CENTER); // set text at LEFT, RIGHT, CENTER of imageicon
		head.setVerticalTextPosition(JLabel.TOP);
		this.add(head);

		JTextField t = new JTextField("This is JTextField");
		t.setFont(new Font("MV Boli", Font.ITALIC, 20));
		// t.setForeground(Color.white);
		t.setSize(200, 200);
		
		JPanel p = new JPanel();
		p.add(head);
		p.add(t);
		p.setBackground(Color.darkGray);
		this.add(p);

		JLabel label1 = new JLabel(t.getText());
		label1.setForeground(Color.green);
		p.add(label1);
	}
}
