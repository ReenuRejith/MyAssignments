package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser obj=new Browser();
		System.out.println(obj.launchBrowser("chrome")+ " browser launched successfully");
		obj.loadUrl();

	}

}
