/* Assignment One, Matthew Lane (200214586)*/

public class Hero {
	//PRIVATE PROPERTIES ++++++++++++++++++++++++++++++++
	private int strength;
	private int speed;
	private int health;
	//PUBLIC PROPERTIES +++++++++++++++++++++++++++++++++
	public String name;
	
	//CONSTRUCTOR++++++++++++++++++++++++++++++++++++++++
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}
	
	//GETTERS +++++++++++++++++++++++++++++++++++++++++++
	public int getStrength() {
		return strength;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getHealth() {
		return health;
	}
	
	//SETTERS ++++++++++++++++++++++++++++++++++++++++++++
	
	//This method sets the speed of the hero.
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//This method sets the health of the hero.
	public void setHealth(int health) {
		this.health = health;
	}
	
	//PRIVATE METHODS +++++++++++++++++++++++++++++++++
	
	//This method generates the unique abilities for the hero.
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	//PUBLIC METHODS ++++++++++++++++++++++++++++++++++
	
	//This method displays the name and stats of the hero.
	public void show()
	{
		System.out.println("---------------------------------");
		System.out.println("Name:" + this.name);
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("---------------------------------");
	}
	
	//This method is called when a hero is fighting.
	public void fight(){
		System.out.println(this.name + "Is attempting to hit!");
		Boolean hitSuccess = hitAttempt();
		
		if (hitSuccess == true)
			hitDamage();
		
		else
			System.out.println("The hit was unsuccessfull!");
	}
	
	//This method allows the hero to run away.
	public void run(){
		System.out.println(this.name + " is Running");
	}
	
	//The hero has attempted a hit. Decide if it has succeeded.
	public Boolean hitAttempt(){
		int didHit = (int)(Math.random() * 100 + 1);
		Boolean hit = false;
		
		if (didHit <= 20)
			hit = true;
		
		else 
			hit = false;
		
		return hit;
	}
	
	//A hit was successful, how much damage was done?
	public int hitDamage(){
		int damage = (this.strength * (int)(Math.random() * 6 + 1));
		System.out.println(damage + "Damage was done!");
		
		return damage;
	}


	
}
