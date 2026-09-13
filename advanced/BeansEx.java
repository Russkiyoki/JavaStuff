// BeansEx.java

public class BeansEx{
	private int authorID;
	private String authorName;

	//getter for author id
	public int getAuthorID(){
		return authorID;
	}
	private void setAuthorID(int authorID){
		this.authorID = authorID;
	}

	//getter author name
	public String getAuthorName(){
		return authorName;
	}
}

// the code below is for creating the Author (BeansEx) class on a jsp page
// <jsp:useBean class="com.beans.BeansEx" id="author" scope="page"/>

// class attribute specifies the location of the javabean class
// id attribute names the javabean object
// scope attribute defines the cope of use of the javabean class

// following scopes are available in JSP
	// page : the javabean class can only be used within current jsp page
	// request: the JB class can be used only within the current HTTP request
	// session: the JB class can be used within the current http session
	// application: ` ` ` ` ` ` throughout current web application

// code below is for using the setter and getter methods on the jsp page
// <jsp:setProperty name="author" property="authorName" value"Michelle">
// <jsp:getProperty name="author" property="authorName"> 
