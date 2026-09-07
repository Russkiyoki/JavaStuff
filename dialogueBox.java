import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dialogueBox {
	private static JDialog d;
	dialogueBox() {
		// create a new frame
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// create the JDIalog, adding to the frame and a title bar
		d = new JDialog(f, "New Dialog Box", true);
		d.setLayout(new FlowLayout());
		JButton b = new JButton("OK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// hide dialog when user clicks ok
				dialogueBox.d.setVisible(false);
			}
		});
		d.add(new JLabel("Click OK to agree."));
		d.add(b);
		d.setSize(250,250);
		d.setVisible(true);
	}

	public static void main(String args[]){
		new dialogueBox();
	}
}
