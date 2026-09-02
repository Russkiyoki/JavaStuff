// straight from study.com
import javax.swing.JEditorPane;

import javax.swing.JFrame;

public class JEditorPaneSample {

 JFrame myFrame = null;

 private void showPane() {

  myFrame = new JFrame("JEditorPane Test");

  myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  myFrame.setSize(500, 225);

  //editor pane

  JEditorPane latinPane = new JEditorPane();

  latinPane.setContentType("text/html");

  latinPane.setText("<h2>Latin Text!</h2>"

    + " <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit."

    + " Maecenas in ultrices neque. Sed ut dui quis felis egestas ultricies. "

    + " Duis rutrum arcu mauris, et vulputate arcu laoreet vitae. </p>");

  //set the content

  myFrame.setContentPane(latinPane);

  myFrame.setVisible(true);

 }

 public static void main(String[] args) {

  (new JEditorPaneSample()).showPane();

 }

}


