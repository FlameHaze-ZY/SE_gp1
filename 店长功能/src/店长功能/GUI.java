package 店长功能;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener, ItemListener{	
	//价格总共分五个部分分别是Ramen(soup+noodle+onion),nori,egg,bamboo,chashu
	//分别对应String myMenu.menu[]的前五个元素（需要提前声明menu myMenu =new menu()，包内需要我给你的那个menu.java
	//因为汤那三样是一起算的我不太清楚怎么给你写那几个int变量，你先看下有问题再问我。
	
	
	
	//set the layout components for the 1st	interface
	JPanel jp1 = new JPanel();	JPanel jp2 = new JPanel();	JPanel jp3 = new JPanel();
	JPanel jp4 = new JPanel();	JPanel jp5 = new JPanel();	JPanel jp6 = new JPanel();
	JLabel jl1, jl2a, jl2b, jl2c, jl3, jl4a, jl4b, jl4c, jl5, jl6;					  	
	JRadioButton soup1, soup2, soup3;
	JRadioButton noodles1, noodles2, noodles3;
	JRadioButton sOnion1, sOnion2, sOnion3;
	JRadioButton spiciness0, spiciness1, spiciness2, spiciness3, spiciness4, spiciness5;
	JRadioButton NoriYes, NoriNo, ChashuYes, ChashuNo, bEggYes, bEggNo;
	JCheckBox exNori,  exbEgg, bambShoots, exChashu;
	JButton jb1 = new JButton("Cancel"); 	JButton jb2 = new JButton("Next Dish"); 	JButton jb3 = new JButton("Finish"); 
	
	//2nd interface
	JPanel jp7 = new JPanel();	
	JLabel jl7, jl8;	
	JRadioButton eatIn, takeAway;
	JButton jb4 = new JButton("Back"); 		JButton jb5 = new JButton("Next"); 
	
	//3rd interface
	JPanel jp8 = new JPanel();
	JLabel jl9, jl10, jl11;	
	JTextField jtf1 = new JTextField(10);
	JButton jb6 = new JButton("OK"); 		JButton jb7 = new JButton("Join us"); 	
	JButton jb8 = new JButton("Back"); 	JButton jb9 = new JButton("Skip"); 	
	
	//4th
	JPanel jp9 = new JPanel();
	JLabel jl12, jl13, jl14, jl15, jl16, jl17, jl18, jl19;	
	JTextField jtf2 = new JTextField(10);		JTextField jtf3 = new JTextField(10);
	JTextField jtf4 = new JTextField(10);		JTextField jtf5 = new JTextField(10);
	JButton jb10 = new JButton("Back"); 	JButton jb11 = new JButton("Next"); 
	
	//5th
	JPanel jp10 = new JPanel();
	JLabel jl20, jl21, jl22, jl23;	
	JButton jb12 = new JButton("Back");
	
	//6th
	JPanel jp11 = new JPanel();
	JLabel jl24, jl25, jl26, jl27;	
	JButton jb13 = new JButton("Next");
	
	//7th
	JPanel jp12 = new JPanel();
	JLabel jl28, jl29, jl30, jl31;	
	JButton jb14 = new JButton("Cash");		JButton jb15 = new JButton("Card");
	JButton jb16 = new JButton("Back");		JButton jb17 = new JButton("Dish 1");	
	
	JPanel jp13 = new JPanel();
	JButton jb18 = new JButton("Back");
	
	//8th
	JPanel jp14 = new JPanel();
	JLabel jl32, jl33, jl34, jl35, jl36;	
	JButton jb19 = new JButton("Finish");	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public GUI() {								
		jp1.setBounds(10,5,280,50);		jp1.setBorder(BorderFactory.createEtchedBorder());	jp1.setLayout(null);//panel for fixed dish price
		jp2.setBounds(10,60,280,230);	jp2.setBorder(BorderFactory.createEtchedBorder());	jp2.setLayout(null);//panel for soup, noodles and onion
		jp3.setBounds(10,300,570,30);	jp3.setBorder(BorderFactory.createEtchedBorder());	jp3.setLayout(null);//panel for Nori.etc
		jp4.setBounds(300,5,280,130);	jp4.setBorder(BorderFactory.createEtchedBorder());	jp4.setLayout(null);//panel for add-ons
		jp5.setBounds(300,140,280,150);	jp5.setBorder(BorderFactory.createEtchedBorder());	jp5.setLayout(null);//panel for spiciness
		jp6.setBounds(10,350,570,50);	jp6.setBorder(BorderFactory.createEtchedBorder());	jp6.setLayout(null);//panel for total and buttons			
		//6 panels in the 1st interface
		
		//contents for panel1	
		jl1 = new JLabel("Dish at fixed price £9.9");
		Font f1 = new Font("Times New Roman Italic",Font.PLAIN,20); 
		jl1.setFont(f1);		jl1.setBounds(35,10,200,30);		jp1.add(jl1);					
		
		//contents for panel2	
		jl2a = new JLabel("Soup");
		Font f2 = new Font("Times New Roman Italic",Font.PLAIN,18); 
		jl2a.setFont(f2);		jl2a.setBounds(15,10,80,20);		jp2.add(jl2a);	
		
		soup1 = new JRadioButton("Tonkotsu", true); 		soup1.setBounds(10,35,80,30);			jp2.add(soup1);
		soup2 = new JRadioButton("Shoyu", false); 	 		soup2.setBounds(110,35,80,30);			jp2.add(soup2);
		soup3 = new JRadioButton("Shio", false);    			soup3.setBounds(200,35,70,30);			jp2.add(soup3);	
		ButtonGroup group1 = new ButtonGroup();
		group1.add(soup1); 						group1.add(soup2); 						group1.add(soup3); 
		soup1.addItemListener(this);			soup2.addItemListener(this);			soup3.addItemListener(this);	
		
		jl2b = new JLabel("Noodles");
		jl2b.setFont(f2);		jl2b.setBounds(15,75,82,20);		jp2.add(jl2b);
		
		noodles1 = new JRadioButton("Soft", true); 			noodles1.setBounds(10,108,80,20);		jp2.add(noodles1);	
		noodles2 = new JRadioButton("Medium", false); 	noodles2.setBounds(100,108,80,20);		jp2.add(noodles2);	
		noodles3 = new JRadioButton("Firm", false); 		noodles3.setBounds(200,108,70,20);		jp2.add(noodles3);		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(noodles1); 	group2.add(noodles2); 	group2.add(noodles3); 
		noodles1.addItemListener(this);			noodles2.addItemListener(this);			noodles3.addItemListener(this);	
		
		jl2c = new JLabel("Spring onion");
		jl2c.setFont(f2);		jl2c.setBounds(15,150,100,20);		jp2.add(jl2c);
		
		sOnion1 = new JRadioButton("No please", true); 		sOnion1.setBounds(10,180,90,20);		jp2.add(sOnion1);	
		sOnion2 = new JRadioButton("Just a little", false); 	sOnion2.setBounds(100,180,90,20);	jp2.add(sOnion2);	
		sOnion3 = new JRadioButton("A lot!", false); 			sOnion3.setBounds(200,180,70,20);	jp2.add(sOnion3);
		ButtonGroup group3 = new ButtonGroup();
		group3.add(sOnion1); 	group3.add(sOnion2); 	group3.add(sOnion3); 
		sOnion1.addItemListener(this);			sOnion2.addItemListener(this);			sOnion3.addItemListener(this);	
		
		//contents for panel3	
		jl3 = new JLabel("Spiciness");
		Font f3 = new Font("Times New Roman Italic",Font.PLAIN,18);
		jl3.setFont(f3);		jl3.setBounds(15,3,80,20);		jp3.add(jl3);
		
		spiciness0 = new JRadioButton("0(No)", true);		spiciness0.setBounds(120,3,80,20);			jp3.add(spiciness0);
		spiciness1 = new JRadioButton("1", false);			spiciness1.setBounds(210,3,50,20); 		jp3.add(spiciness1);
		spiciness2 = new JRadioButton("2", false); 			spiciness2.setBounds(270,3,50,20); 		jp3.add(spiciness2);
		spiciness3 = new JRadioButton("3", false); 			spiciness3.setBounds(330,3,50,20);			jp3.add(spiciness3);
		spiciness4 = new JRadioButton("4", false); 			spiciness4.setBounds(390,3,50,20);			jp3.add(spiciness4);
		spiciness5 = new JRadioButton("5(Max)", false);	spiciness5.setBounds(450,3,80,20);			jp3.add(spiciness5);
		ButtonGroup group4 = new ButtonGroup();
		group4.add(spiciness0);								group4.add(spiciness1); 							group4.add(spiciness2); 	
		group4.add(spiciness3); 							group4.add(spiciness4); 							group4.add(spiciness5); 
		spiciness0.addItemListener(this);				spiciness1.addItemListener(this);				spiciness2.addItemListener(this);	
		spiciness3.addItemListener(this);				spiciness4.addItemListener(this);				spiciness5.addItemListener(this);	
		
		//contents for jp4	
		jl4a = new JLabel("Nori");
		Font f4 = new Font("Times New Roman Italic",Font.PLAIN,18); 
		jl4a.setFont(f4);		jl4a.setBounds(30,10,80,30);		jp4.add(jl4a);
		
		jl4b = new JLabel("Chashu");
		jl4b.setFont(f4);		jl4b.setBounds(30,50,80,30);		jp4.add(jl4b);
		
		jl4c = new JLabel("Boiled egg");
		jl4c.setFont(f4);		jl4c.setBounds(30,90,90,30);		jp4.add(jl4c);
		
		NoriYes = new JRadioButton("Yes", false);		NoriYes.setBounds(110,10,50,30);			jp4.add(NoriYes);
		NoriNo = new JRadioButton("No", true);			NoriNo.setBounds(195,10,50,30);			jp4.add(NoriNo);
		ButtonGroup group5 = new ButtonGroup();		group5.add(NoriYes); 	group5.add(NoriNo); 
		NoriYes.addItemListener(this);								NoriNo.addItemListener(this);	
		
		ChashuYes = new JRadioButton("Yes", false);	ChashuYes.setBounds(110,50,50,30);		jp4.add(ChashuYes);
		ChashuNo = new JRadioButton("No", true);		ChashuNo.setBounds(195,50,50,30);		jp4.add(ChashuNo);
		ButtonGroup group6 = new ButtonGroup();		group6.add(ChashuYes); 	group6.add(ChashuNo); 
		ChashuYes.addItemListener(this);						ChashuNo.addItemListener(this);	
		
		bEggYes = new JRadioButton("Yes", false);		bEggYes.setBounds(110,90,50,30);			jp4.add(bEggYes);
		bEggNo = new JRadioButton("No", true);			bEggNo.setBounds(195,90,50,30);			jp4.add(bEggNo);
		ButtonGroup group7 = new ButtonGroup();		group7.add(bEggYes); 	group7.add(bEggNo); 
		bEggYes.addItemListener(this);							bEggNo.addItemListener(this);	
		
		//contents for panel5	
		jl5 = new JLabel("Options for additional cost");
		Font f5 = new Font("Times New Roman Italic",Font.PLAIN,18); 
		jl5.setFont(f5);		jl5.setBounds(30,5,200,20);		jp5.add(jl5);
		
		exNori = new JCheckBox("Extra Nori £1");						exNori.setBounds(60,30,180,20);			jp5.add(exNori);			
		exbEgg = new JCheckBox("Extra bolied egg £1");				exbEgg.setBounds(60,60,180,20);			jp5.add(exbEgg);
		bambShoots = new JCheckBox("Bamboo shoots £1");		bambShoots.setBounds(60,90,180,20);	jp5.add(bambShoots);
		exChashu = new JCheckBox("Extra Chashu £2");				exChashu.setBounds(60,120,180,20);		jp5.add(exChashu);
		exNori.addItemListener(this);		exbEgg.addItemListener(this);		bambShoots.addItemListener(this);		exChashu.addItemListener(this);
		
		//contents of the bottom
		jl6 = new JLabel("Total:");
		Font f6 = new Font("Times New Roman Italic",Font.PLAIN,22);
		jl6.setFont(f6);		jl6.setBounds(15,15,80,20);		jp6.add(jl6);
	    
		jb1.setBounds(270,10,80,30);			jp6.add(jb1);		jb1.addActionListener(this);
		jb2.setBounds(360,10,100,30);		jp6.add(jb2);		jb2.addActionListener(this);
		jb3.setBounds(470,10,80,30);			jp6.add(jb3);		jb3.addActionListener(this);
		
		//2nd interface: eat in or take away?
		jp7.setBounds(0,0,605,450);		jp7.setLayout(null);
		
		jl7 = new JLabel("Your dining option is");
		Font f7 = new Font("Times New Roman Italic",Font.PLAIN,26); 
		jl7.setFont(f7);		jl7.setBounds(190,80,350,30);		jp7.add(jl7);
		
		jl8 = new JLabel("Total price");
		Font f8 = new Font("Times New Roman Italic",Font.PLAIN,20); 
		jl8.setFont(f8);		jl8.setBounds(80,350,300,30);		jp7.add(jl8);	
		
		eatIn = new JRadioButton("Eat in", true);				eatIn.setBounds(180,150,100,60);				jp7.add(eatIn);
		takeAway = new JRadioButton("Take-away");		takeAway.setBounds(320,150,100,60);		jp7.add(takeAway);
		ButtonGroup group8 = new ButtonGroup();			group8.add(eatIn);		group8.add(takeAway); 
		
		jb4.setBounds(320,350,80,30);			jp7.add(jb4);		jb4.addActionListener(this);
		jb5.setBounds(430,350,80,30);			jp7.add(jb5);		jb5.addActionListener(this);
		
		//3rd interface: membership number?
		jp8.setBounds(0,0,605,450);		jp8.setLayout(null);
		
		jl9 = new JLabel("Do you have membership number?");
		Font f9 = new Font("Times New Roman Italic",Font.PLAIN,26); 
		jl9.setFont(f9);		jl9.setBounds(110,70,400,30);		jp8.add(jl9);	
		
		jl10 = new JLabel("Enter it to visualize how many virtual stamps you've received");
		Font f10 = new Font("Times New Roman Italic",Font.PLAIN,16); 
		jl10.setFont(f10);		jl10.setBounds(100,110,500,30);		jp8.add(jl10);
		
		jl11 = new JLabel("or");
		Font f11 = new Font("Times New Roman Italic",Font.PLAIN,20); 
		jl11.setFont(f11);		jl11.setBounds(180,250,50,30);		jp8.add(jl11);
		
		jtf1.setBounds(110,160,300,40); 		jp8.add(jtf1);
		
		jb6.setBounds(430,160,60,40);			jp8.add(jb6);		jb6.addActionListener(this);
		jb7.setBounds(250,250,80,40);			jp8.add(jb7);		jb7.addActionListener(this);
		jb8.setBounds(320,350,80,30);			jp8.add(jb8);		jb8.addActionListener(this);
		jb9.setBounds(430,350,80,30);			jp8.add(jb9);		jb9.addActionListener(this);
		
		//4th interface: fill in the join in information
		jp9.setBounds(0,0,605,450);		jp9.setLayout(null);
		
		jl12 = new JLabel("Join the loyalty scheme");
		Font f12 = new Font("Times New Roman Italic",Font.PLAIN,26); 
		jl12.setFont(f12);		jl12.setBounds(175,30,450,30);			jp9.add(jl12);
		
		jl13 = new JLabel("First name");
		Font f13 = new Font("Times New Roman Italic",Font.PLAIN,20); 
		jl13.setFont(f13);		jl13.setBounds(90,70,100,30);			jp9.add(jl13);
		
		jl14 = new JLabel("Surname");
		jl14.setFont(f13);		jl14.setBounds(320,70,100,30);		jp9.add(jl14);
		
		jl15 = new JLabel("Email address");
		jl15.setFont(f13);		jl15.setBounds(90,150,200,30);			jp9.add(jl15);
		
		jl16 = new JLabel("Mobile number");
		jl16.setFont(f13);		jl16.setBounds(90,235,200,30);		jp9.add(jl16);
		
		Font f17 = new Font("Times New Roman",Font.PLAIN,16); 
		jl17 = new JLabel("*");
		jl17.setFont(f17);		jl17.setBounds(180,70,20,30);		jl17.setForeground(Color.RED);		jp9.add(jl17);
		jl18 = new JLabel("*");
		jl18.setFont(f17);		jl18.setBounds(395,70,20,30);		jl18.setForeground(Color.RED);		jp9.add(jl18);
		
		jl19 = new JLabel("(at least one between email and mobile number)");
		jl19.setFont(f17);		jl19.setBounds(210,300,320,30);		jl19.setForeground(Color.GRAY);		jp9.add(jl19);
		
		jtf2.setBounds(90,100,200,35); 		jp9.add(jtf2);
		jtf3.setBounds(320,100,200,35); 	jp9.add(jtf3);
		jtf4.setBounds(90,185,420,35); 		jp9.add(jtf4);
		jtf5.setBounds(90,270,420,35); 		jp9.add(jtf5);
		
		jb10.setBounds(320,350,80,30);			jp9.add(jb10);		jb10.addActionListener(this);
		jb11.setBounds(430,350,80,30);			jp9.add(jb11);		jb11.addActionListener(this);
		
		//5th interface finish registration
		jp10.setBounds(0,0,605,450);		jp10.setLayout(null);
		
		jl20 = new JLabel("Success!");
		Font f20 = new Font("Times New Roman Italic",Font.PLAIN,26); 
		jl20.setFont(f20);		jl20.setBounds(240,50,300,40);			jp10.add(jl20);
		
		jl21 = new JLabel("Your membership number is: xxxxxxxx");
		Font f21 = new Font("Times New Roman Italic",Font.PLAIN,20); 
		jl21.setFont(f21);		jl21.setBounds(100,130,400,30);			jp10.add(jl21);
		
		jl22 = new JLabel("This has been sent to your email address or SMS.");
		jl22.setFont(f21);		jl22.setBounds(100,170,400,30);			jp10.add(jl22);
		
		jl23 = new JLabel("Registration details have been printed, please check.");
		jl23.setFont(f21);		jl23.setBounds(100,240,480,30);			jp10.add(jl23);
		
		jb12.setBounds(430,350,80,30);			jp10.add(jb12);		jb12.addActionListener(this);
		
		//6th 10 stamps free prompt
		jp11.setBounds(0,0,605,450);		jp11.setLayout(null);
		
		jl24 = new JLabel("Payment Successful"); 
		jl24.setFont(f20);		jl24.setBounds(180,80,350,40);			jp11.add(jl24);
		
		jl25 = new JLabel("You have already accumulated 10 virtual stamps!");
		jl25.setFont(f21);		jl25.setBounds(100,150,450,30);			jp11.add(jl25);
		
		jl26 = new JLabel("This meal will be free.");
		jl26.setFont(f21);		jl26.setBounds(100,190,450,30);			jp11.add(jl26);
		
		jl27 = new JLabel("Your stamps counter will be set back to 0.");
		jl27.setFont(f21);		jl27.setBounds(100,240,450,30);			jp11.add(jl27);
		
		jb13.setBounds(430,350,80,30);			jp11.add(jb13);		jb13.addActionListener(this);
		
		//7th interface: payment without stamps
		jp12.setBounds(0,0,605,450);		jp12.setLayout(null);
		
		jl28 = new JLabel("Is your order correct?"); 
		jl28.setFont(f20);		jl28.setBounds(175,60,350,40);			jp12.add(jl28);
		
		jl29 = new JLabel("Total Price: £ "); 
		jl29.setFont(f21);		jl29.setBounds(370,240,350,40);			jp12.add(jl29);
		
		jl28 = new JLabel("Pay via"); 
		jl28.setFont(f21);		jl28.setBounds(100,280,200,40);			jp12.add(jl28);
		
		jl28 = new JLabel("or"); 
		jl28.setFont(f21);		jl28.setBounds(260,280,200,40);			jp12.add(jl28);
		
		jb14.setBounds(170,280,80,40);			jp12.add(jb14);		jb14.addActionListener(this);
		jb15.setBounds(290,280,80,40);			jp12.add(jb15);		jb15.addActionListener(this);
		jb16.setBounds(430,350,80,30);			jp12.add(jb16);		jb16.addActionListener(this);
		jb17.setBounds(130,120,330,45);		jp12.add(jb17);		jb17.addActionListener(this);
		
		jp13.setBounds(430,350,80,30);		jp13.setLayout(null);
		jb18.setBounds(0,0,80,30);		jp13.add(jb18);		jb18.addActionListener(this);
		
		//8th: Finished
		jp14.setBounds(0,0,605,450);		jp14.setLayout(null);
		
		jl32 = new JLabel("Payment Successful"); 
		jl32.setFont(f20);		jl32.setBounds(195,80,350,40);			jp14.add(jl32);
		
		jl33 = new JLabel("Your order number is: xxxx");
		jl33.setFont(f21);		jl33.setBounds(185,130,400,30);			jp14.add(jl33);
		
		jl34 = new JLabel("If membership: (Optional)");
		jl34.setFont(f21);		jl34.setBounds(80,200,400,30);			jp14.add(jl34);
		
		jl35 = new JLabel("Your will receive one virtual stamp.");
		jl35.setFont(f21);		jl35.setBounds(170,230,400,30);			jp14.add(jl35);
		
		jl36 = new JLabel("An email/SMS will be sent...");
		jl36.setFont(f21);		jl36.setBounds(170,260,400,30);			jp14.add(jl36);
		
		jb19.setBounds(430,350,80,30);			jp14.add(jb19);		jb19.addActionListener(this);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		this.setTitle("title");
		this.setSize(605,450);
		this.setLocation(300,400);
		this.setVisible(true);
		this.setLayout(null); 
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		this.add(jp1);	this.add(jp2);	this.add(jp3);
		this.add(jp4);	this.add(jp5);	this.add(jp6);		//1st interface
		this.add(jp7);		jp7.setVisible(false);				//2nd interface	
		this.add(jp8);		jp8.setVisible(false);				//3rd interface
		this.add(jp9);		jp9.setVisible(false);				//4th interface
		this.add(jp10);	jp10.setVisible(false);			//5th interface
		this.add(jp11);	jp11.setVisible(false);			//6th interface
		this.add(jp12);	jp12.setVisible(false);			//7th interface
		this.add(jp13);	jp13.setVisible(false);			//7th interface
		this.add(jp14);	jp14.setVisible(false);			//7th interface
	}
	
	public void itemStateChanged(ItemEvent e) {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb1) {
			System.exit(0);
		}
		else if(e.getSource() == jb3) {
			jp1.setVisible(false);		jp2.setVisible(false);		jp3.setVisible(false);		jp4.setVisible(false);		jp5.setVisible(false);		jp6.setVisible(false);
			jp7.setVisible(true);
		}
		else if(e.getSource() == jb4) {
			jp1.setVisible(true);		jp2.setVisible(true);		jp3.setVisible(true);		jp4.setVisible(true);		jp5.setVisible(true);		jp6.setVisible(true);
			jp7.setVisible(false);
		}
		else if(e.getSource() == jb5) {
			jp7.setVisible(false);	
			jp8.setVisible(true);
		}
		else if(e.getSource() == jb6) {
			jp8.setVisible(false);	
			jp11.setVisible(true);
		}
		else if(e.getSource() == jb7) {
			jp8.setVisible(false);	
			jp9.setVisible(true);
		}
		else if(e.getSource() == jb8) {
			jp8.setVisible(false);	
			jp7.setVisible(true);
		}
		else if(e.getSource() == jb9) {
			jp8.setVisible(false);	
			jp12.setVisible(true);
		}
		else if(e.getSource() == jb10) {
			jp9.setVisible(false);	
			jp8.setVisible(true);
		}
		else if(e.getSource() == jb11) {
			jp9.setVisible(false);	
			jp10.setVisible(true);
		}
		else if(e.getSource() == jb12) {
			jp10.setVisible(false);	
			jp8.setVisible(true);
		}
		else if(e.getSource() == jb13) {
			jp11.setVisible(false);	
			jp14.setVisible(true);
		}
		else if(e.getSource() == jb14) {
			jp12.setVisible(false);	
			jp14.setVisible(true);
		}
		else if(e.getSource() == jb15) {
			jp12.setVisible(false);	
			jp14.setVisible(true);
		}
		else if(e.getSource() == jb16) {
			jp12.setVisible(false);	
			jp8.setVisible(true);
		}
		else if(e.getSource() == jb17) {
			jp12.setVisible(false);	
			jp1.setVisible(true);		jp2.setVisible(true);		jp3.setVisible(true);		jp4.setVisible(true);		jp5.setVisible(true);
			jp13.setVisible(true);
		}
		else if(e.getSource() == jb18) {
			jp12.setVisible(true);	
			jp1.setVisible(false);		jp2.setVisible(false);		jp3.setVisible(false);		jp4.setVisible(false);		jp5.setVisible(false);
			jp13.setVisible(false);
		}
		else if(e.getSource() == jb19) {
			System.exit(0);
		}
	}
}
