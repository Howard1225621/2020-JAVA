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

	public String[] options= {"��","�S��"};
	public String[] options2 = {"����(�p)","����(��)"};
	public String[] options3 = {"�i��(�p)","����(�p)","����"};
	public String[] options4 = {"����(�p)","����(�j)"};
        public String[] drinks = {"�i��(�p)","����(�p)","�ɦ̿@��"};
        public String[] meals = {"����(�p)","����(��)","����","����(�j)"};
	public String[] sets = {"���q�M�\","����M�\","�Y�ܹ��M�\"};
	
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
		choose = JOptionPane.showOptionDialog(null,"�z���\�I��:\n"+meal()+"\n�`���B:\t"+compute()+"\n�аݦ��M�\�ݭn�����ƩάO���\���󴫶�" , null, 0, 0, null, options, options[0]);
		while(choose==0) {
			set = JOptionPane.showOptionDialog(null,"�z���\�I��:\n"+meal()+"�аݬO���ӮM�\�n���󴫩O" , null, 0, 0, null, sets, sets[0]);

				switch(set){
					//���q�M�\
					case 0:
					  if(package1quan>1){
						number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"�z���\�I��:\n"+meal()+"�аݦ��X���n����"));
				     		if(number1>1){
					  		for(i=0;i<number1;i++){
					 			opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options2, options2[0]);
					  			if(opt==0) {total1=set1+changedrink(drinkprice);}
 					  			else if(opt==1) {total1=set1+changemeal(mealprice);}
					  		}
					  	}
					        else if(number1==1){
					 		opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options2, options2[0]);
					  		if(opt==0) {total1=set1+changedrink(drinkprice);}
 					  		else if(opt==1) {total1=set1+changemeal(mealprice);}
					  	}
					  }
					  else if(package1quan==1){
					 	opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options2, options2[0]);
					  	if(opt==0) {total1=set1+changedrink(drinkprice);}
 					  	else if(opt==1) {total1=set1+changemeal(mealprice);}
                                          }
					  break;
					//����
					case 1:
					  if(package2quan>1){
						number2 = Integer.parseInt(JOptionPane.showInputDialog(null,"�z���\�I��:\n"+meal()+"�аݦ��X���n����"));					  
					  	if(number2>1){
					  		for(i=0;i<number2;i++){
					  			opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options3, options3[0]);
					  			if(opt==0) {total2=set2+changedrink(drinkprice);}
 					 			else if(opt==1) {total2=set2+changemeal(mealprice1);}
                                          			else if(opt==2) {total2=set2+changemeal(mealprice2);}
					 	 	}
						}
					        else if(number2==1){
					  		opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options3, options3[0]);
					  		if(opt==0) {total2=set2+changedrink(drinkprice);}
 					 		else if(opt==1) {total2=set2+changemeal(mealprice1);}
                                          		else if(opt==2) {total2=set2+changemeal(mealprice2);}
					  	}
					  }	
					  else if(package2quan==1){
					  	opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options3, options3[0]);
					  	if(opt==0) {total2=set2+changedrink(drinkprice);}
 					 	else if(opt==1) {total2=set2+changemeal(mealprice1);}
                                          	else if(opt==2) {total2=set2+changemeal(mealprice2);}
					  }
					  break;
					//�X�ܹ�
					case 2:
					  if(package3quan>1){
						number3 = Integer.parseInt(JOptionPane.showInputDialog(null,"�z���\�I��:\n"+meal()+"�аݦ��X���n����"));			
					        if(number3>1){					  
				          		for(i=0;i<number3;i++){
	  				  			opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options4, options4[0]);
					  			if(opt==0) {total3=set3+changedrink(drinkprice);}
 					  			else if(opt==1) {total3=set3+changemeal(mealprice3);}
					  		}
					  	}
					        else if(number3==1){
					 		opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options4, options4[0]);
					  		if(opt==0) {total3=set3+changedrink(drinkprice);}
 					  		else if(opt==1) {total3=set3+changemeal(mealprice3);}
					  	}
      					  }
					  else if(package3quan==1){
					 	opt = JOptionPane.showOptionDialog(null,"�аݬO�����\�I�n���󴫩O" , null, 0, 0, null, options4, options4[0]);
					  	if(opt==0) {total3=set3+changedrink(drinkprice);}
 					  	else if(opt==1) {total3=set3+changemeal(mealprice3);}
					  }
					  break;
				}
		choose = JOptionPane.showOptionDialog(null,"���᪺�\�I��:\n"+meal()+"\n�`���B:\t"+compute()+"\n�а��٦��M�\�ݭn�����ƩάO���\���󴫶�" , null, 0, 0, null, options, options[0]);		
		}

	}
	
	
	public void nextcustomer() {
		confirm = JOptionPane.showConfirmDialog(null, "�аݭn�~���I�\��", "�U�@���I�\?", 0);
	}

	public int changedrink(int price) {
		int difference=0;
		opt2 = JOptionPane.showOptionDialog(null,"�аݭn�󴫬�", null, 0, 0, null, drinks, drinks[0]);
        	if (opt2==0){difference=28-price;}
		else if (opt2==1){difference=28-price;}
		else if (opt2==2){difference=40-price;}
		if (difference>0){return difference;}
		else {return 0;}
	}

        public int changemeal(int price) {
		
		opt3 = JOptionPane.showOptionDialog(null,"�аݭn�󴫬�", null, 0, 0, null, meals, meals[0]);
		
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
		if(x!=0){meal+=("�j���J"+x+"��\t"+x*a+"��\n");}
		if(y!=0){meal+=("������"+y+"��\t"+y*b+"��\n");}
		if(z!=0){meal+=("���ֳ�"+z+"��\t"+z*c+"��\n");}
		if(v!=0){meal+=("����(�p)"+v+"��\t"+v*d+"��\n");}
		if(w!=0){meal+=("����(��)"+w+"��\t"+w*e+"��\n");}
		if(u!=0){meal+=("����(�j)"+u+"��\t"+u*f+"��\n");}
		if(p!=0){meal+=("����"+p+"��\t"+p*g+"��\n");}
		if(q!=0){meal+=("�i��(�p)"+q+"��\t"+q*h+"��\n");}
		if(k!=0){meal+=("����(�p)"+k+"��\t"+k*i+"��\n");}
		if(s!=0){meal+=("�ɦ̿@��"+s+"��\t"+s*j+"��\n");}
		if(package1quan!=0){meal+=("���q�M�\"+package1quan+"��\t"+(set1*(package1quan-number1)+total1*number1)+"��\n");}
		if(package2quan!=0){meal+=("����M�\"+package2quan+"��\t"+(set2*(package2quan-number2)+total2*number2)+"��\n");}
		if(package3quan!=0){meal+=("�Y�ܹ��M�\"+package3quan+"��\t"+(set3*(package3quan-number3)+total3*number3)+"��\n");}

		return meal;
	}


	public void details(){
		JOptionPane.showMessageDialog(null,"�z�����\����\n���X:"+(main.numofguest)+"\n�z���\�I:\n"+meal()+"\n�`���B:\t"+compute());
	
	}

}
