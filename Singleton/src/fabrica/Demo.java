package fabrica;


public class Demo {
	  private static Dialog dialog;
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		configure();
        runBusinessLogic();
	}

	static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
        
	}
	static void runBusinessLogic() {
        dialog.renderWindow();
        
	}
}
