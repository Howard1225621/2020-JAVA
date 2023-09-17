import javax.swing.JOptionPane;

public class Info {
	
	private String name;
	private String phonenum;
	private String[] gender = {"先生","小姐","不便告知"};
	private int g = 0;
	
	public void addcustomer()
	{
		name = JOptionPane.showInputDialog(null, "為配合政府防疫政策須填寫基本資料\n請問怎麼稱呼?", "基本資料", 3);
		phonenum = JOptionPane.showInputDialog(null, "請填寫電話號碼", "基本資料", 3);
		g = JOptionPane.showOptionDialog(null, "請問如何稱呼","基本資料",0,3, null, gender, gender[0]);
		
		
	}
	
	public String getName() {return this.name;}
	public String getPhonenum() {return this.phonenum;}
	public int getGender() {return this.g;}
	
	
}