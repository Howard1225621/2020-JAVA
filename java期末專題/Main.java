// import javax.swing.JOptionPane;

public class Main {
	
	
	static Info information = new Info();
	static Guestinformation[] info = new Guestinformation[100];
	static int numofguest=0;
	
	
	
	public static void main(String[] args) {
		Frame fr = new Frame();
		information.addcustomer();
		Guestinformation guest = new Guestinformation( information.getName(), information.getPhonenum(), information.getGender());
		info[numofguest++]=guest;
		
		fr.frame();
		System.out.println(guest);
	}
	
	public  void  method() {
		Frame fr = new Frame();
		information.addcustomer();
		Guestinformation guest = new Guestinformation( information.getName(), information.getPhonenum(), information.getGender());
		info[numofguest++]=guest;
		
		fr.frame();
	}


}