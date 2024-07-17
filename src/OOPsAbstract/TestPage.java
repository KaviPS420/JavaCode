package OOPsAbstract;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage ();
		lp.getTitle();
		lp.getURL();
		lp.sendKey("Kavi@gmail.com", "kavi123");
		lp.click();

	}

}
