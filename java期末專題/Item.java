import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Item extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		protected JLabel explain = new JLabel("(注意!套餐需搭配主餐，且一份主餐限點一套餐)");
		protected JLabel menusub = new JLabel("點心");
		protected JLabel menudrinks = new JLabel("飲料");
	
		//食物的標籤
		protected JLabel food1 = new JLabel("大麥克");
		protected JLabel food2 = new JLabel("麥香雞");
		protected JLabel food3 = new JLabel("滿福堡");
		protected JLabel food4 = new JLabel("薯條(小)");
		protected JLabel food5 = new JLabel("薯條(中)");
		protected JLabel food6 = new JLabel("薯條(大)");
		protected JLabel food7 = new JLabel("薯餅");
		protected JLabel food8 = new JLabel("可樂(小)");
		protected JLabel food9 = new JLabel("雪碧(小)");
		protected JLabel food10 = new JLabel("玉米濃湯");
		
		//組合套餐標籤
		protected JLabel normal = new JLabel("普通套餐");
		protected JLabel normal1 = new JLabel("(內含 薯條(中)、雪碧(小) 可做更換)");
		protected JLabel hashbrowns = new JLabel("薯餅套餐");
		protected JLabel hashbrowns1 = new JLabel("(內含 薯條(小)、薯餅、可樂(小) 可做更換)");
		protected JLabel large = new JLabel("吃很飽套餐");
		protected JLabel large1 = new JLabel("(內含 薯條(大)、雪碧(小) 可做更換)");
		
		//食物的價格
		public int a = 72;
		public int b = 44;
		public int c = 48;
		public int d = 33;
		public int e = 44;
		public int f = 55;
		public int g = 30;
		public int h = 28;
		public int i = 28;
		public int j = 40;
		public int o = 60;
		public int m = 70;
		public int n = 70;
		
		//讓食物跟他們的價錢變成標籤
		protected JLabel price1 = new JLabel(Integer.toString(a));
		protected JLabel price2 = new JLabel(Integer.toString(b));
		protected JLabel price3 = new JLabel(Integer.toString(c));
		protected JLabel price4 = new JLabel(Integer.toString(d));
		protected JLabel price5 = new JLabel(Integer.toString(e));
		protected JLabel price6 = new JLabel(Integer.toString(f));
		protected JLabel price7 = new JLabel(Integer.toString(g));
		protected JLabel price8 = new JLabel(Integer.toString(h));
		protected JLabel price9 = new JLabel(Integer.toString(i));
		protected JLabel price10 = new JLabel(Integer.toString(j));
		protected JLabel price11 = new JLabel(Integer.toString(o));
		protected JLabel price12 = new JLabel(Integer.toString(m));
		protected JLabel price13 = new JLabel(Integer.toString(n));
		
		//目前購物車裡的數量
		protected int x =0;
		protected int y =0;
		protected int z =0;
		protected int v =0;
		protected int w =0;
		protected int u =0;
		protected int p =0;
		protected int q =0;
		protected int k =0;
		protected int s =0;
		protected int package1quan =0;
		protected int package2quan =0;
		protected int package3quan =0;
		
		public int getX() {return this.x;}
		
		//讓購物車裡的數量變成標籤
		protected JLabel quantity1 = new JLabel(Integer.toString(x));
		protected JLabel quantity2 = new JLabel(Integer.toString(y));
		protected JLabel quantity3 = new JLabel(Integer.toString(z));
		protected JLabel quantity4 = new JLabel(Integer.toString(v));
		protected JLabel quantity5 = new JLabel(Integer.toString(w));
		protected JLabel quantity6 = new JLabel(Integer.toString(u));
		protected JLabel quantity7 = new JLabel(Integer.toString(p));
		protected JLabel quantity8 = new JLabel(Integer.toString(q));
		protected JLabel quantity9 = new JLabel(Integer.toString(k));
		protected JLabel quantity10 = new JLabel(Integer.toString(s));
		protected JLabel quantity11 = new JLabel(Integer.toString(package1quan));
		protected JLabel quantity12 = new JLabel(Integer.toString(package2quan));
		protected JLabel quantity13 = new JLabel(Integer.toString(package3quan));
		
		//新增按鈕
		protected JButton button1 = new JButton("+");
		protected JButton button2 = new JButton("-");
		protected JButton button3 = new JButton("+");
		protected JButton button4 = new JButton("-");
		protected JButton button5 = new JButton("+");
		protected JButton button6 = new JButton("-");
		protected JButton button7 = new JButton("+");
		protected JButton button8 = new JButton("-");
		protected JButton button9 = new JButton("+");
		protected JButton button10 = new JButton("-");
		protected JButton button11 = new JButton("+");
		protected JButton button12 = new JButton("-");
		protected JButton button13 = new JButton("+");
		protected JButton button14 = new JButton("-");
		protected JButton button15 = new JButton("+");
		protected JButton button16 = new JButton("-");
		protected JButton button17 = new JButton("+");
		protected JButton button18 = new JButton("-");
		protected JButton button19 = new JButton("+");
		protected JButton button20 = new JButton("-");
		protected JButton button21 = new JButton("+");
		protected JButton button22 = new JButton("-");
		protected JButton button23 = new JButton("+");
		protected JButton button24 = new JButton("-");
		protected JButton button25 = new JButton("+");
		protected JButton button26 = new JButton("-");
		protected JButton ok = new JButton("確認並送出");
}