import java.io.*;
import java.io.IOException;

public class textFile extends File {
	public static int id = 1;
	public String color = "white";
	public String title;
	private int pId = id++;
	private String dir = "myNotes/note" + pId + ".txt";


	public int getId() {
    	return this.pId;
	}


	private String content;
	private boolean lock = false;


	private FileWriter myWriter;


	public FileWriter getWriter() {
    	return this.myWriter;
	}


	public void setStatus(boolean lock) {
    	if (true) // security check, remember to add
    	{
        	this.lock = lock;
    	}
	}


	public String getContent() {
    	if (this.lock) {
        	return null;
    	}
    	return this.content;
	}


	public void setContent(String text) {
    	this.content = text;
	}


	// The File class does not have a default constructor->need to call inside of
	// the instance class
	// Constructor of temporary file
	public textFile() {
    	// String adress;
    	super("myNotes");
    	this.mkdir();
	}

	// Save the file
	public boolean createNote(String title, String text) {
    	String newName = this.dir;
    	try{
   		/*if(this.myWriter != null){
   			System.out.println("myWriter.close() failed!--------");
   		}*/
    		/*try{
   	 		while(this.myWriter != null) {
       			Thread.sleep(100); // Wait for 100 milliseconds
   		}*/
        	//this.delete();
        	FileWriter myWriter = new FileWriter(newName);
        	this.setContent(text);
        	this.title = title;
        	myWriter.write(text);
        	myWriter.close();
    	} catch (IOException e) {
        	System.out.println("An error occurred.");
        	e.printStackTrace();
    	}
    	return true;
	}
}
