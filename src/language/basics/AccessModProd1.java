package language.basics;

 public class AccessModProd1 {
	
	
	private void openbrowser() {
		System.out.println("open browser and login");
	}
	
	private int trigger = 10;
	
	public int getname() {
		return trigger;
	}
	
	public void getOpenBrowser() {
		System.out.println("open browser");
	}
	

	public static void main(String[] args) {
		
			
		AccessModProd1 acs = new AccessModProd1();
		System.out.println(acs.trigger);
		acs.openbrowser();
	
		
		
	}

}
