public class Guestinformation {
	private String name;
	private String phonenumber;
	private String[] gender = {"先生","小姐","不便告知"};
	private String Gender;
	private int g = 0;
	
	public Guestinformation(String name,String phonenumber,int g) {
		setName(name);
		setPhonenumber(phonenumber);
		setGender(g);
		
	}
	
	
	public void setName(String name) {this.name = name;}
	public String getName() {return this.name;}
	
	public void setPhonenumber(String phonenumber) {this.phonenumber=phonenumber;}
	public String getPhonenumber() {return this.phonenumber;}
	
	public void setGender(int g) {this.Gender = gender[g];}
	public String getGender() {return this.Gender;}

}