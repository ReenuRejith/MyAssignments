package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		return browserName;}
	public void loadUrl() {System.out.println("Application url loaded successfully");}

	public static void main(String[] args) {
		Browser obj=new Browser();
		System.out.println(obj.launchBrowser("chrome")+ " browser launched successfully");
		obj.loadUrl();
		

	}

}
