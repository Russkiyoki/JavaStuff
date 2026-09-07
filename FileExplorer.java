import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class FileExplorer extends JPanel {
	// set up a tree and a table
	JTree tree;
	JTable jtable;

	// Scroll panes left hand for folders, right for file list 
	JScrollPane scrollpane;
	JScrollPane jspTable;
	// refresh button
	JButton refresh;

	// set default dir to null
	String currDirectory = null;
	final String[] columns = {"File Name", "Size in Bytes"};
	
	String[][] file data = {
		{"",""}
	};

	// constructor to setup the file explorer

	FileExplorer(String path){
		refresh = new JButton("Refresh View");
		// default file
		File temp = new File(path);
		// tree node
		DefaultMutableTreeNode top = createTree(temp);
		// create JTree
		tree = new JTree(top);
		scrollpane = new JScrollPane(tree);
		final String[] colHeads={"File Name", "SIZE(in bytes)"};
		 

