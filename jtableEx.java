import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.awt.*;

public class jtableEx {
	public static void main(String[] args){
		JFrame f = new JFrame("JTable Example");
		JPanel panel = new JPanel();
		// the data is stored as a 2-dim array
		String data[][]={
			{"1101","Los Angeles","6700"},
			{"1102","Chicago","830000"},
			{"1104","New York", "92500"}
		};
		// the column array is used to store the headings of the data
		String column[] = {"Person ID","Location","Balance"};
		JTable jt = new JTable(data, column);
		// scrolling pane
		JScrollPane pane = new JScrollPane(jt);
		panel.add(pane);
		f.add(panel);
		// add table to frame
		f.add(jt);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

