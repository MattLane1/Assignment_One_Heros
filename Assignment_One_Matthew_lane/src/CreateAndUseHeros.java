/**
 * @author Matthew Lane (200214586)
 * @date 01/25/2015
 * @description Assignment 1, Hero project, COMP1011
 * @version 4
 */
public class CreateAndUseHeros {

	//The main method for the assignment
	public static void main(String[] args) {
		//Hooooooogan! ... Create the hero.
		Hero hero = new Hero("Col. Clink");
		//Display the heros abilities.
		hero.show();
		//Make the hero fight for our amusement. 
		hero.fight();
	}
}
