package OOPsAbstract;

public class LoginPage extends Page {

	@Override
	public void getTitle() {
		System.out.println("Get title");
		
	}

	@Override
	public void getURL() {
		System.out.println("Get URL");
		
		
	}
	
	
	public void sendKey(String un , String pwd) {
		System.out.println("Login with " +un + pwd);
	}
	
	public void click() {
		System.out.println("Click on login button");
	}
	
	
}
