import javax.swing.JOptionPane;

public class Info {
	
	private String name;
	private String phonenum;
	private String[] gender = {"����","�p�j","���K�i��"};
	private int g = 0;
	
	public void addcustomer()
	{
		name = JOptionPane.showInputDialog(null, "���t�X�F�����̬F������g�򥻸��\n�аݫ��٩I?", "�򥻸��", 3);
		phonenum = JOptionPane.showInputDialog(null, "�ж�g�q�ܸ��X", "�򥻸��", 3);
		g = JOptionPane.showOptionDialog(null, "�аݦp��٩I","�򥻸��",0,3, null, gender, gender[0]);
		
		
	}
	
	public String getName() {return this.name;}
	public String getPhonenum() {return this.phonenum;}
	public int getGender() {return this.g;}
	
	
}