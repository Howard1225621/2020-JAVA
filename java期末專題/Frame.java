import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Frame extends MainFrame{
	
	public int confirm =0;
	public int choose =0;
	public int opt = 0;
        public int opt2 = 0;
        public int opt3 = 0;
        public int set = 0;
	public int packagetotal=package1quan+package2quan+package3quan;
	public int number1 = 0;
	public int number2 = 0;
	public int number3 = 0;
	public int total1 = 0;
	public int total2 = 0;
	public int total3 = 0;
	int set1=60;
	int set2=70;
	int set3=70;
	int drinkprice=28;
	int mealprice=44;
	int mealprice1=33;
	int mealprice2=30;
	int mealprice3=55;

	public String[] options= {"有","沒有"};
	public String[] options2 = {"雪碧(小)","薯條(中)"};
	public String[] options3 = {"可樂(小)","薯條(小)","薯餅"};
	public String[] options4 = {"雪碧(小)","薯條(大)"};
        public String[] drinks = {"可樂(小)","雪碧(小)","玉米濃湯"};
        public String[] meals = {"薯條(小)","薯條(中)","薯餅","薯條(大)"};
	public String[] sets = {"普通套餐","薯餅套餐","吃很飽套餐"};
	
	static Main main = new Main();
	
	
	
	
	public void frame() {
		
		
		
		setVisible(true);
		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				setVisible(false);
				
				change();
				details();
				
				nextcustomer();
				if(confirm==0) {
					
					main.method();
				}		
			
			}
		});
				
	}

	
	public void change() {
		choose = JOptionPane.showOptionDialog(null,"您的餐點為:\n"+meal()+"\n總金額:\t"+compute()+"\n請問有套餐需要做飲料或是附餐的更換嗎" , null, 0, 0, null, options, options[0]);
		while(choose==0) {
			set = JOptionPane.showOptionDialog(null,"您的餐點為:\n"+meal()+"請問是哪個套餐要做更換呢" , null, 0, 0, null, sets, sets[0]);

				switch(set){
					//普通套餐
					case 0:
					  if(package1quan>1){
						number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"您的餐點為:\n"+meal()+"請問有幾份要做更換"));
				     		if(number1>1){
					  		for(i=0;i<number1;i++){
					 			opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options2, options2[0]);
					  			if(opt==0) {total1=set1+changedrink(drinkprice);}
 					  			else if(opt==1) {total1=set1+changemeal(mealprice);}
					  		}
					  	}
					        else if(number1==1){
					 		opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options2, options2[0]);
					  		if(opt==0) {total1=set1+changedrink(drinkprice);}
 					  		else if(opt==1) {total1=set1+changemeal(mealprice);}
					  	}
					  }
					  else if(package1quan==1){
					 	opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options2, options2[0]);
					  	if(opt==0) {total1=set1+changedrink(drinkprice);}
 					  	else if(opt==1) {total1=set1+changemeal(mealprice);}
                                          }
					  break;
					//薯餅
					case 1:
					  if(package2quan>1){
						number2 = Integer.parseInt(JOptionPane.showInputDialog(null,"您的餐點為:\n"+meal()+"請問有幾份要做更換"));					  
					  	if(number2>1){
					  		for(i=0;i<number2;i++){
					  			opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options3, options3[0]);
					  			if(opt==0) {total2=set2+changedrink(drinkprice);}
 					 			else if(opt==1) {total2=set2+changemeal(mealprice1);}
                                          			else if(opt==2) {total2=set2+changemeal(mealprice2);}
					 	 	}
						}
					        else if(number2==1){
					  		opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options3, options3[0]);
					  		if(opt==0) {total2=set2+changedrink(drinkprice);}
 					 		else if(opt==1) {total2=set2+changemeal(mealprice1);}
                                          		else if(opt==2) {total2=set2+changemeal(mealprice2);}
					  	}
					  }	
					  else if(package2quan==1){
					  	opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options3, options3[0]);
					  	if(opt==0) {total2=set2+changedrink(drinkprice);}
 					 	else if(opt==1) {total2=set2+changemeal(mealprice1);}
                                          	else if(opt==2) {total2=set2+changemeal(mealprice2);}
					  }
					  break;
					//出很飽
					case 2:
					  if(package3quan>1){
						number3 = Integer.parseInt(JOptionPane.showInputDialog(null,"您的餐點為:\n"+meal()+"請問有幾份要做更換"));			
					        if(number3>1){					  
				          		for(i=0;i<number3;i++){
	  				  			opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options4, options4[0]);
					  			if(opt==0) {total3=set3+changedrink(drinkprice);}
 					  			else if(opt==1) {total3=set3+changemeal(mealprice3);}
					  		}
					  	}
					        else if(number3==1){
					 		opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options4, options4[0]);
					  		if(opt==0) {total3=set3+changedrink(drinkprice);}
 					  		else if(opt==1) {total3=set3+changemeal(mealprice3);}
					  	}
      					  }
					  else if(package3quan==1){
					 	opt = JOptionPane.showOptionDialog(null,"請問是哪個餐點要做更換呢" , null, 0, 0, null, options4, options4[0]);
					  	if(opt==0) {total3=set3+changedrink(drinkprice);}
 					  	else if(opt==1) {total3=set3+changemeal(mealprice3);}
					  }
					  break;
				}
		choose = JOptionPane.showOptionDialog(null,"更改後的餐點為:\n"+meal()+"\n總金額:\t"+compute()+"\n請問還有套餐需要做飲料或是附餐的更換嗎" , null, 0, 0, null, options, options[0]);		
		}

	}
	
	
	public void nextcustomer() {
		confirm = JOptionPane.showConfirmDialog(null, "請問要繼續點餐嗎", "下一位點餐?", 0);
	}

	public int changedrink(int price) {
		int difference=0;
		opt2 = JOptionPane.showOptionDialog(null,"請問要更換為", null, 0, 0, null, drinks, drinks[0]);
        	if (opt2==0){difference=28-price;}
		else if (opt2==1){difference=28-price;}
		else if (opt2==2){difference=40-price;}
		if (difference>0){return difference;}
		else {return 0;}
	}

        public int changemeal(int price) {
		
		opt3 = JOptionPane.showOptionDialog(null,"請問要更換為", null, 0, 0, null, meals, meals[0]);
		
		int difference=0;
		
		if (opt3==0){difference=33-price;}
		else if (opt3==1){difference=44-price;}
		else if (opt3==2){difference=30-price;}
		else if (opt3==3){difference=55-price;}
		if (difference>0){return difference;}
		else {return 0;}
	}

	public int compute(){
		int total=0;

		if(x!=0){total+=x*a;}
		if(y!=0){total+=y*b;}
		if(z!=0){total+=z*c;}
		if(v!=0){total+=v*d;}
		if(w!=0){total+=w*e;}
		if(u!=0){total+=u*f;}
		if(p!=0){total+=p*g;}
		if(q!=0){total+=q*h;}
		if(k!=0){total+=k*i;}
		if(s!=0){total+=s*j;}
		if(package1quan!=0){total=total+set1*(package1quan-number1)+total1*number1;}
		if(package2quan!=0){total=total+set2*(package2quan-number2)+total2*number2;}
		if(package3quan!=0){total=total+set3*(package3quan-number3)+total3*number3;}

		return total;
	}
        
	public String meal(){
		String meal="";
		if(x!=0){meal+=("大麥克"+x+"份\t"+x*a+"元\n");}
		if(y!=0){meal+=("麥香雞"+y+"份\t"+y*b+"元\n");}
		if(z!=0){meal+=("滿福堡"+z+"份\t"+z*c+"元\n");}
		if(v!=0){meal+=("薯條(小)"+v+"份\t"+v*d+"元\n");}
		if(w!=0){meal+=("薯條(中)"+w+"份\t"+w*e+"元\n");}
		if(u!=0){meal+=("薯條(大)"+u+"份\t"+u*f+"元\n");}
		if(p!=0){meal+=("薯餅"+p+"份\t"+p*g+"元\n");}
		if(q!=0){meal+=("可樂(小)"+q+"份\t"+q*h+"元\n");}
		if(k!=0){meal+=("雪碧(小)"+k+"份\t"+k*i+"元\n");}
		if(s!=0){meal+=("玉米濃湯"+s+"份\t"+s*j+"元\n");}
		if(package1quan!=0){meal+=("普通套餐"+package1quan+"份\t"+(set1*(package1quan-number1)+total1*number1)+"元\n");}
		if(package2quan!=0){meal+=("薯餅套餐"+package2quan+"份\t"+(set2*(package2quan-number2)+total2*number2)+"元\n");}
		if(package3quan!=0){meal+=("吃很飽套餐"+package3quan+"份\t"+(set3*(package3quan-number3)+total3*number3)+"元\n");}

		return meal;
	}


	public void details(){
		JOptionPane.showMessageDialog(null,"您的取餐明細\n號碼:"+(main.numofguest)+"\n您的餐點:\n"+meal()+"\n總金額:\t"+compute());
	
	}

}
