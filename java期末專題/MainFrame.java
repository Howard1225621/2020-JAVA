import javax.swing.JLabel;


import java.awt.Container;
import java.awt.event.*;

public class MainFrame extends Item{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	//客人的標籤
	protected JLabel hello = new JLabel("您好!");
	protected JLabel greetings = new JLabel("請問今天想吃點甚麼?");
	
	//格式標籤
	private JLabel menumain = new JLabel("主餐");
	private JLabel price = new JLabel("價錢");
	private JLabel packageprice = new JLabel("價錢");
	private JLabel quantitynow = new JLabel("當前數量");
	private JLabel quantitynow1 = new JLabel("當前數量");
	private JLabel foodpackage = new JLabel("套餐組合");
	
	
	
	private Container cp;
	
	
	public int getPackage1quan() {return package1quan;}
	
	public MainFrame() {
		init();
		
	}	
	
	private void init() {
		this.setSize(700, 600);
		this.setLocation(100, 150);
		this.setTitle("速食點餐機");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cp = this.getContentPane();
		cp.setLayout(null);
		//label.setLocation(100, 50);
		//label.setSize(120, 25);
		hello.setBounds(250, 20, 60, 20);
		cp.add(hello);
		greetings.setBounds(310, 20, 250, 20);
		cp.add(greetings);
		menumain.setBounds(15, 50, 30, 20);
		cp.add(menumain);
		packageprice.setBounds(450, 50, 30, 20);
		cp.add(packageprice);
		quantitynow1.setBounds(525, 50, 75, 20);
		cp.add(quantitynow1);
		price11.setBounds(455, 90, 30, 40);
		cp.add(price11);
		price12.setBounds(455, 150, 30, 40);
		cp.add(price12);
		price13.setBounds(455, 210, 30, 40);
		cp.add(price13);
		foodpackage.setBounds(350, 50, 100, 20);
		cp.add(foodpackage);
		explain.setBounds(350, 70, 300, 20);
		cp.add(explain);
		normal.setBounds(350, 90, 100, 40);
		cp.add(normal);
		normal1.setBounds(350, 110, 200, 40);
		cp.add(normal1);
		hashbrowns.setBounds(350, 150, 100, 40);
		cp.add(hashbrowns);
		hashbrowns1.setBounds(350, 170, 275, 40);
		cp.add(hashbrowns1);
		large.setBounds(350, 210, 100, 40);
		cp.add(large);
		large1.setBounds(350, 230, 275, 40);
		cp.add(large1);
		food1.setBounds(15, 80, 50, 20);
		cp.add(food1);
		food2.setBounds(15, 120, 50, 20);
		cp.add(food2);
		food3.setBounds(15, 160, 50, 20);
		cp.add(food3);
		menusub.setBounds(15, 200, 50, 20);
		cp.add(menusub);
		food4.setBounds(15, 240, 50, 20);
		cp.add(food4);
		food5.setBounds(15, 280, 50, 20);
		cp.add(food5);
		food6.setBounds(15, 320, 50, 20);
		cp.add(food6);
		food7.setBounds(15, 360, 50, 20);
		cp.add(food7);
		menudrinks.setBounds(15, 400, 50, 20);
		cp.add(menudrinks);
		food8.setBounds(15, 440, 50, 20);
		cp.add(food8);
		food9.setBounds(15, 480, 50, 20);
		cp.add(food9);
		food10.setBounds(15, 520, 80, 20);
		cp.add(food10);
		price.setBounds(90, 50, 30, 20);
		cp.add(price);
		price1.setBounds(100, 70, 60, 40);
		cp.add(price1);
		price2.setBounds(100, 110, 60, 40);
		cp.add(price2);
		price3.setBounds(100, 150, 60, 40);
		cp.add(price3);
		price4.setBounds(100, 230, 60, 40);
		cp.add(price4);
		price5.setBounds(100, 270, 60, 40);
		cp.add(price5);
		price6.setBounds(100, 310, 60, 40);
		cp.add(price6);
		price7.setBounds(100, 350, 60, 40);
		cp.add(price7);
		price8.setBounds(100, 430, 60, 40);
		cp.add(price8);
		price9.setBounds(100, 470, 60, 40);
		cp.add(price9);
		price10.setBounds(100, 510, 60, 40);
		cp.add(price10);
		quantitynow.setBounds(160, 50, 60, 20);
		cp.add(quantitynow);
		quantity1.setBounds(180, 70, 60, 40);
		cp.add(quantity1);
		quantity2.setBounds(180, 110, 60, 40);
		cp.add(quantity2);
		quantity3.setBounds(180, 150, 60, 40);
		cp.add(quantity3);
		quantity4.setBounds(180, 230, 60, 40);
		cp.add(quantity4);
		quantity5.setBounds(180, 270, 60, 40);
		cp.add(quantity5);
		quantity6.setBounds(180, 310, 60, 40);
		cp.add(quantity6);
		quantity7.setBounds(180, 350, 60, 40);
		cp.add(quantity7);
		quantity8.setBounds(180, 430, 60, 40);
		cp.add(quantity8);
		quantity9.setBounds(180, 470, 60, 40);
		cp.add(quantity9);
		quantity10.setBounds(180, 510, 60, 40);
		cp.add(quantity10);
		quantity11.setBounds(540, 90, 60, 40);
		cp.add(quantity11);
		quantity12.setBounds(540, 150, 60, 40);
		cp.add(quantity12);
		quantity13.setBounds(540, 210, 60, 40);
		cp.add(quantity13);
		button1.setBounds(220, 80, 45, 20);
		cp.add(button1);		
		button2.setBounds(260, 80, 45, 20);
		cp.add(button2);
		button3.setBounds(220, 120, 45, 20);
		cp.add(button3);		
		button4.setBounds(260, 120, 45, 20);
		cp.add(button4);
		button5.setBounds(220, 160, 45, 20);
		cp.add(button5);
		button6.setBounds(260, 160, 45, 20);
		cp.add(button6);
		button7.setBounds(220, 240, 45, 20);
		cp.add(button7);
		button8.setBounds(260, 240, 45, 20);
		cp.add(button8);
		button9.setBounds(220, 280, 45, 20);
		cp.add(button9);
		button10.setBounds(260, 280, 45, 20);
		cp.add(button10);
		button11.setBounds(220, 320, 45, 20);
		cp.add(button11);
		button12.setBounds(260, 320, 45, 20);
		cp.add(button12);
		button13.setBounds(220, 360, 45, 20);
		cp.add(button13);
		button14.setBounds(260, 360, 45, 20);
		cp.add(button14);
		button15.setBounds(220, 440, 45, 20);
		cp.add(button15);
		button16.setBounds(260, 440, 45, 20);
		cp.add(button16);
		button17.setBounds(220, 480, 45, 20);
		cp.add(button17);
		button18.setBounds(260, 480, 45, 20);
		cp.add(button18);
		button19.setBounds(220, 520, 45, 20);
		cp.add(button19);
		button20.setBounds(260, 520, 45, 20);
		cp.add(button20);
		button21.setBounds(565, 100, 45, 20);
		cp.add(button21);
		button22.setBounds(605, 100, 45, 20);
		cp.add(button22);
		button23.setBounds(565, 160, 45, 20);
		cp.add(button23);
		button24.setBounds(605, 160, 45, 20);
		cp.add(button24);
		button25.setBounds(565, 220, 45, 20);
		cp.add(button25);
		button26.setBounds(605, 220, 45, 20);
		cp.add(button26);
		ok.setBounds(525, 420, 100, 40);
		cp.add(ok);
		hello.setBounds(212, 20, 135, 20);
		cp.add(hello);
		
		
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				x++;
				quantity1.setText(Integer.toString(x));
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(x>0) {
					x--;
					quantity1.setText(Integer.toString(x));
				}
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				y++;
				quantity2.setText(Integer.toString(y));
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(y>0) {
					y--;
					quantity2.setText(Integer.toString(y));
				}
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				z++;
				quantity3.setText(Integer.toString(z));
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(z>0) {
					z--;
					quantity3.setText(Integer.toString(z));
				}
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				v++;
				quantity4.setText(Integer.toString(v));
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(v>0) {
					v--;
					quantity4.setText(Integer.toString(v));
				}
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				w++;
				quantity5.setText(Integer.toString(w));
			}
		});
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(w>0) {
					w--;
					quantity5.setText(Integer.toString(w));
				}
			}
		});
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
					u++;
					quantity6.setText(Integer.toString(u));
			}
		});
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(u>0) {
					u--;
					quantity6.setText(Integer.toString(u));
				}
			}
		});
		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				p++;
				quantity7.setText(Integer.toString(p));
			}
		});
		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(p>0) {
					p--;
					quantity7.setText(Integer.toString(p));
				}
			}
		});
		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				q++;
				quantity8.setText(Integer.toString(q));
			}
		});
		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(q>0) {
					q--;
					quantity8.setText(Integer.toString(q));
				}
			}
		});
		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				k++;
				quantity9.setText(Integer.toString(k));
			}
		});
		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(k>0) {
					k--;
					quantity9.setText(Integer.toString(k));
				}
			}
		});
		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				s++;
				quantity10.setText(Integer.toString(s));
			}
		});
		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(s>0) {
					s--;
					quantity10.setText(Integer.toString(s));
				}
			}
		});
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(package1quan+package2quan+package3quan<x+y+z){
					package1quan++;
					quantity11.setText(Integer.toString(package1quan));
				}
			}
		});
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(package1quan>0) {
					package1quan--;
					quantity11.setText(Integer.toString(package1quan));
				}
			}
		});
		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(package1quan+package2quan+package3quan<x+y+z){
					package2quan++;
					quantity12.setText(Integer.toString(package2quan));	
				}
			}
		});
		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(package2quan>0) {
					package2quan--;
					quantity12.setText(Integer.toString(package2quan));
				}
			}
		});
		button25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(package1quan+package2quan+package3quan<x+y+z){
					package3quan++;
					quantity13.setText(Integer.toString(package3quan));
				}
			}
		});
		button26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(package3quan>0) {
					package3quan--;
					quantity13.setText(Integer.toString(package3quan));
				}
			}
		});
		
		
	}
}