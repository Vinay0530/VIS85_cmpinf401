package vis85_MenuManager;

public class Menu
{
	/**
	 * Class Menu
	 * author: Vinay Sriharish
	 * created: 10/08/2022
	 */
	
	
	//Declaring namme entree dessert salad side
	private String name;
	private Entree entree;
	private Dessert dessert;
	private Salad salad;
	private Side side;
	
	public Menu ()
	{
		
	}
	
	
	//Getters and setters for name entree dessert salad side
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Entree getEntree() {
		return entree;
	}



	public void setEntree(Entree entree) {
		this.entree = entree;
	}



	public Dessert getDessert() {
		return dessert;
	}



	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}



	public Salad getSalad() {
		return salad;
	}



	public void setSalad(Salad salad) {
		this.salad = salad;
	}



	public Side getSide() {
		return side;
	}



	public void setSide(Side side) {
		this.side = side;
	}


     //menu with just containing name
	public Menu (String name)
	{
		this.name=name;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}
	//menu containing just name entree side
	public Menu (String name, Entree entree, Side side)
	{
		this.name=name;
		this.entree=entree;
		this.side=side;
		salad = null;
		dessert = null;
	}
	//menu containing just name entree side salad dessert
	public Menu (String name, Entree entree, Side side,Salad salad, Dessert dessert )
	{
		this.name=name;
		this.entree=entree;
		this.side=side;
		this.salad=salad;
		this.dessert=dessert;
		
		
	}
	
	//method for calculating total calories of each menu 
	public int totalCalories ()
	{
		return (entree==null? 0: entree.getCalories()) 
				+ (side==null? 0: side.getCalories()) 
				+ (salad==null? 0: salad.getCalories()) + (dessert==null? 0: dessert.getCalories());
				
				
				
	}
	//method for showing descriptions on menus
	public String description ()
	{
		
		String description="Menu: " + this.name + "\n" +  "Total Calories: " + totalCalories() + "\n" ;
		if(entree!=null) 
			description = description + "Entree: "  + entree.getName() + entree.getDescription() + "\n";
		else 
			description += " Entree: N/A \n";
		
		if(side!=null) 
			description = description + "Side: "  + side.getName() + side.getDescription() + "\n";
		else 
			description += "Side: N/A \n";
		
		if(salad!=null) 
			description = description + "Salad: "  + salad.getName() + salad.getDescription() + "\n";
		else 
			description += "Salad: N/A \n";
		
		if(dessert!=null) 
			description = description + "Dessert: "  + dessert.getName() + dessert.getDescription() + "\n";
		else 
			description += "Dessert: N/A \n";

		
		
		
		
		
		
		
		return description;
	}
	
	

	

	
	

}
