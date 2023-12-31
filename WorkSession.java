// import java.util.Scanner;//user input


public class WorkSession {
	public static String id;
	public static String color;
	public static String text;
	public static String dir;


	public static void main(String[] args) {
    	// Create note1.txt
    	text = "new bitch";
    	textFile note1 = new textFile();
    	//try {
        	if (note1.createNote("My Title", text)) {
            	System.out.println("Note1 is created successfully!");
        	} else {
            	System.out.println("Failed!");
        	}
        	/*note1.getWriter().close();
        	if(note1.getWriter() != null){
   			System.out.println("Closing note1 failed!--------");
   		}*/
    	//} catch (IOException e) {
        //	System.out.println("There's an error!");
        //	e.printStackTrace();
    	//}


    	// String yourName;
    	// Scanner myScanner = new Scanner(System.in);
    	// System.out.println("Enter username");
    	// yourName = myScanner.nextLine();
    	// System.out.println("Your name is "+ yourName);


    	System.out.println("The id of note1 is: " + note1.getId());


    	// Create note2.txt
    	text = "Hello, this is new note2!";
    	textFile note2 = new textFile();
    	//try {
   	 if(note2.createNote("Note2 title", text)){
            	System.out.println("Note2 is created successfully!");
        	} else {
            	System.out.println("Failed!");
        	}
        	//note2.getWriter().close();
    	//} catch (IOException e) {
        //	System.out.println("There's an error!");
        //	e.printStackTrace();
    	//}
    	System.out.println("The id of note2 is: " + note2.getId());
	}
}
