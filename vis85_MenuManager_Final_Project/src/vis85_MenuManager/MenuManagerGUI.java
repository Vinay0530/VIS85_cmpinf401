package vis85_MenuManager;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MenuManagerGUI
{
	private JFrame frame;
	private JLabel label1, label2, label3,entreelabel,sidelabel,saladlabel,dessertlabel,entreelabel2,sidelabel2,saladlabel2,dessertlabel2,totalCals,totalPrice;
	private JComboBox comboBox1, comboBox2, comboBox3, comboBox4;
	private JTextField txtAmount;
	private JButton createMenu,randomMenu,saveToFile,deleteAll,details;
	private JTextArea txtTextBlob;
	MenuManager menuManager;
	private MenuRandomize menuRandomize;
	private JFrame frmChildWindow;

	private JList<Menu> menuList;


	public static void main(String[] args) {

		MenuManagerGUI window = new  MenuManagerGUI();
		window.frame.setVisible(true);
	}

	public  MenuManagerGUI() 
	{

		menuManager = new MenuManager("data/dishes.txt");


		initialize();


	}

	public Menu randomMenu()
	{

		int randomEntree=(int)(Math.random()*menuManager.getEntrees().size());
		int randomSide=(int)(Math.random()*menuManager.getSides().size());
		int randomSalad=(int)(Math.random()*menuManager.getSalads().size());
		int randomDesert=(int)(Math.random()*menuManager.getDesserts().size());




		Menu menu = new Menu("Random Menu", 
				menuManager.getEntrees().get(randomEntree),
				menuManager.getSides().get(randomSide),
				menuManager.getSalads().get(randomSalad),
				menuManager.getDesserts().get(randomDesert));

		return menu;

	}
	public static void writeMenu( String fileName, ArrayList<Menu> menus )
	{
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < menus.size(); i++) {
				Menu menu=menus.get(i);
				String menuName=menu.getName();
				String entreeName=menu.getEntree().getName();
				String sideName=menu.getSide().getName();
				String saladName=menu.getSalad().getName();
				String dessertName=menu.getDessert().getName();
				String entreeDescription=menu.getEntree().getDescription();
				String sideDescription=menu.getSide().getDescription();
				String saladDescription=menu.getSalad().getDescription();
				String dessertDescription=menu.getDessert().getDescription();
				int entreeCalories = menu.getEntree().getCalories();
				int sideCalories = menu.getSide().getCalories();
				int saladCalories = menu.getSalad().getCalories();
				int dessertCalories = menu.getDessert().getCalories();
				double entreePrice = menu.getEntree().getPrice();
				double sidePrice = menu.getSide().getPrice();
				double saladPrice = menu.getSalad().getPrice();
				double dessertPrice = menu.getDessert().getPrice();
				int totalCals = entreeCalories + sideCalories + saladCalories + dessertCalories;
				double totalPrice = entreePrice + sidePrice + saladPrice + dessertPrice;

				String menuLine1 = "Menu name " + menuName;
				String menuLine2 = "Entree: " + entreeName + " Calories: " + entreeCalories + " Price: " + entreePrice;
				String menuLine3 = "Side: " + sideName + " Calories: " + sideCalories + " Price: " + sidePrice;
				String menuLine4 = "Salad: " + saladName + " Calories: " + saladCalories + " Price: " + saladPrice;
				String menuLine5 = "Dessert: " + dessertName + " Calories: " + dessertCalories + " Price: " + dessertPrice;
				String menuLine6 = "Total Cals: " + totalCals;
				String menuLine7 = "Total Price " + totalPrice;

				bw.write(menuLine1);
				bw.newLine();
				bw.write(menuLine2);
				bw.newLine();
				bw.write(menuLine3);
				bw.newLine();
				bw.write(menuLine4);
				bw.newLine();
				bw.write(menuLine5);
				bw.newLine();
				bw.write(menuLine6);
				bw.newLine();
				bw.write(menuLine7);



			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}


	private void initialize()
	{

		//Main label
		frame = new JFrame("Menu Manager");
		frame.setLayout(null);


		frame.setBounds(20, 20, 750, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Border border = BorderFactory.createLineBorder(Color.black);



		JPanel p1 = new JPanel();
		p1.setBounds(10, 10, 350, 390);
		p1.setBorder(border);
		p1.setLayout(null);
		frame.getContentPane().add(p1);

		//3 category labels
		label1 = new JLabel("Build your own menu:");
		label1.setBounds(10, 10, 150, 30);
		p1.add(label1);

		label2 = new JLabel("or Generate menu: ");
		label2.setBounds(10, 280, 150, 30);
		p1.add(label2);	


		JPanel p2 = new JPanel();
		p2.setBounds(370, 10, 350, 390);
		p2.setBorder(border);
		p2.setLayout(null);
		frame.getContentPane().add(p2);

		label3 = new JLabel("Created Menus:");
		label3.setBounds(10 ,4, 150, 30);
		p2.add(label3);

		//Dish labels
		entreelabel = new JLabel("Entrees:");
		entreelabel.setBounds(50, 45, 150, 30);
		p1.add(entreelabel);

		sidelabel = new JLabel("Sides:");
		sidelabel.setBounds(50, 95, 150, 30);
		p1.add(sidelabel);

		saladlabel = new JLabel("Salads:");
		saladlabel.setBounds(50, 145, 150, 30);
		p1.add(saladlabel);

		dessertlabel = new JLabel("Desserts:");
		dessertlabel.setBounds(45, 195, 150, 30);
		p1.add(dessertlabel);


		//Created Jlist
		DefaultListModel<Menu> menuListData = new DefaultListModel<>();
		menuList = new JList<Menu>(menuListData);
		menuList.setBounds(10, 30, 200, 280);
		p2.add(menuList);

		//Create one Combo box for type of dish
		comboBox1 = new JComboBox(menuManager.getEntrees().toArray());
		comboBox1.setBounds(100, 50, 150, 30);
		p1.add(comboBox1);

		comboBox2 = new JComboBox(menuManager.getSides().toArray());
		comboBox2.setBounds(100, 100, 150, 30);
		p1.add(comboBox2);	

		comboBox3 = new JComboBox(menuManager.getSalads().toArray());
		comboBox3.setBounds(100, 150, 150, 30);
		p1.add(comboBox3);	

		comboBox4 = new JComboBox(menuManager.getDesserts().toArray());
		comboBox4.setBounds(100, 200, 150, 30);
		p1.add(comboBox4);	


		//Create menu Button
		createMenu = new JButton("Create Menu with these dishes");
		createMenu.setBounds(50, 240, 230, 30);
		p1.add(createMenu);	

		//Action for CreateMenu store menus into jlist menulistData
		createMenu.addActionListener( new ActionListener()

		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String menuName;

				menuName= JOptionPane.showInputDialog ("What is the menu name?");
				Entree selctedEntree=(Entree) comboBox1.getSelectedItem();
				Side selectedSide=(Side) comboBox2.getSelectedItem();
				Salad selectedSalad=(Salad) comboBox3.getSelectedItem();
				Dessert selectedDessert=(Dessert) comboBox4.getSelectedItem();

				Menu newmenu=new Menu();
				newmenu.setName(menuName);
				newmenu.setEntree(selctedEntree);
				newmenu.setSide(selectedSide);
				newmenu.setSalad(selectedSalad);
				newmenu.setDessert(selectedDessert);
				menuListData.addElement(newmenu);



			}

		});


		//Create Random Menu button
		randomMenu = new JButton("Create Random Menu");
		randomMenu.setBounds(10, 300, 200, 30);
		p1.add(randomMenu);


		//Action for Random Menu
		randomMenu.addActionListener( new ActionListener()

		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String menuName;

				menuName = JOptionPane.showInputDialog ("What is the menu name?");

				Menu newmenu=randomMenu();

				newmenu.setName(menuName);



				menuListData.addElement(newmenu);



			}


		});







		//To do create secondary window look at last part of bank gui example called a childwindow



		//create save to file button
		saveToFile = new JButton("Save to file ");
		saveToFile.setBounds(0 ,320, 150, 30);
		p2.add(saveToFile);


		//Action for SaveToFile
		saveToFile.addActionListener( new ActionListener()

		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{


				ArrayList<Menu> tempMenuList=new ArrayList<Menu>();
				Enumeration<Menu> items= menuListData.elements();
				while(items.hasMoreElements()) {
					tempMenuList.add(items.nextElement());
				}



				FileManager.writeMenu("data/menus.txt" ,tempMenuList );




			}


		});


		//create delete all button
		deleteAll = new JButton("Delete All ");
		deleteAll.setBounds(140 ,320, 150, 30);
		p2.add(deleteAll);


		//Action for SaveToFile
		deleteAll.addActionListener( new ActionListener()

		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{

				menuListData.removeAllElements();



			}


		});


		//create details button
		details = new JButton("Details ");
		details.setBounds(70 ,350, 150, 30);
		p2.add(details);


		//Action for SaveToFile
		details.addActionListener( new ActionListener()

		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{


				createChildWindow();



			}









		});

	}

	private void createChildWindow() 
	{

		Menu selectedMenu=menuList.getSelectedValue();

		if(selectedMenu==null)
		{
			return;

		}

		//Make it so displays Menu name
		frmChildWindow = new JFrame("Menu: " + selectedMenu.getName());
		frmChildWindow.setLayout(null);
		frmChildWindow.setBounds(20, 20, 750, 700);
		frmChildWindow.setVisible(true);



		Border border = BorderFactory.createLineBorder(Color.black);

		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 750, 680);
		p1.setBorder(border);
		p1.setLayout(null);
		frmChildWindow.getContentPane().add(p1);

		entreelabel2 = new JLabel("Entree:");
		entreelabel2.setBounds(10, 40, 150, 30);
		p1.add(entreelabel2);

		JTextArea entreeTextArea = new JTextArea(selectedMenu.getEntree().getName()+"\n"+selectedMenu.getEntree().getDescription());
		entreeTextArea.setBounds(100, 40, 500, 100);
		entreeTextArea.setLineWrap(true);
		entreeTextArea.setEditable(false);
		p1.add(entreeTextArea);

		sidelabel2 = new JLabel("Side:");
		sidelabel2.setBounds(10, 150, 150, 30);
		p1.add(sidelabel2);

		JTextArea sideTextArea = new JTextArea(selectedMenu.getSide().getName()+"\n"+selectedMenu.getSide().getDescription());
		sideTextArea.setBounds(100, 150, 500, 100);
		sideTextArea.setLineWrap(true);
		sideTextArea.setEditable(false);
		p1.add(sideTextArea);

		saladlabel2 = new JLabel("Salad:");
		saladlabel2.setBounds(10, 260, 150, 30);
		p1.add(saladlabel2);

		JTextArea saladTextArea = new JTextArea(selectedMenu.getSalad().getName()+"\n"+selectedMenu.getSalad().getDescription());
		saladTextArea.setBounds(100, 260, 500, 100);
		saladTextArea.setLineWrap(true);
		saladTextArea.setEditable(false);
		p1.add(saladTextArea);

		dessertlabel2 = new JLabel("Dessert:");
		dessertlabel2.setBounds(10, 370, 150, 30);
		p1.add(dessertlabel2);

		JTextArea dessertTextArea = new JTextArea(selectedMenu.getDessert().getName()+"\n"+selectedMenu.getDessert().getDescription());
		dessertTextArea.setBounds(100, 370, 500, 100);
		dessertTextArea.setLineWrap(true);
		dessertTextArea.setEditable(false);
		p1.add(dessertTextArea);

		totalCals = new JLabel("Total Calories:");
		totalCals.setBounds(10, 480, 150, 30);
		p1.add(totalCals);

		System.out.println("total" + selectedMenu.totalCalories());
		JTextField totalCalField = new JTextField(String.valueOf(selectedMenu.totalCalories())); 
		totalCalField.setBounds(100, 480, 150, 30);
		totalCalField.setEditable(false);
		p1.add(totalCalField);


		totalPrice = new JLabel("Total Price: $");
		totalPrice.setBounds(10, 560, 150, 30);
		p1.add(totalPrice);

		double priceTotal = selectedMenu.getEntree().getPrice()+selectedMenu.getSide().getPrice()+selectedMenu.getSalad().getPrice()+selectedMenu.getDessert().getPrice();

		JTextField totalPriceField = new JTextField(String.valueOf(priceTotal)); 
		totalPriceField.setBounds(100, 560, 150, 30);
		totalPriceField.setEditable(false);
		p1.add(totalPriceField);











	}

}
