// The following code is from study.com
// The following code creates a new jframe, jtextarea, and a JFileChooser obj
// with exception handling

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JEditorPane;

public class jfilechooserEx extends JFrame implements ActionListener{
	// implements actionListner means that this class can respond
	// to button clicks and what not
	JMenuBar menubar; // the bar
	JMenu file; // drop down menu
	JMenuItem open; // the Open file option inside the menu
	JTextArea textArea; // multi line textbox to show file contents
	JEditorPane latinPanel;
	// constructor
	jfilechooserEx() {
		// create menu items
		open = new JMenuItem("Open File");
		open.addActionListener(this);

		// build menu hierarchy
		file = new JMenu("File");
		file.add(open);
		
		menubar = new JMenuBar();
		menubar.setBounds(0,0,600,20);
		menubar.add(file);

		// add textArea
		textArea = new JTextArea(600,600);
		textArea.setBounds(0,20,600,600);
		add(menubar);

		//editor pane
		JEditorPane latinPane = new JEditorPane();
		latinPane.setContentType("text/plain");
		add(latinPane);
		add(textArea);
	}

	// method to act when file is opened
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == open){
			// create a JFileChooser instance 
			// will default to home directory
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(this);
			if( i == JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				String filePath = f.getPath();
				
				try{
					BufferedReader br = new BufferedReader(new FileReader(filePath));
					String s1 = "";
					String s2 = "";
					while((s1=br.readLine())!=null){
						s2 += s1 + "\n";
					}
					// save to the textArea
					textArea.setText(s2);
					br.close();
				}
				catch (Exception ex){
					ex.printStackTrace();
				}
			}
		}
	} // end of method
	public static void main(String[] args){
		jfilechooserEx filePicker = new jfilechooserEx();
		filePicker.setSize(600,600);
		filePicker.setLayout(null);
		filePicker.setVisible(true);
		filePicker.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}
} // class
