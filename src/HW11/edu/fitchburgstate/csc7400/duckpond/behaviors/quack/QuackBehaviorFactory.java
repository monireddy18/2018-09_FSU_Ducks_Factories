/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 * Team: Aayusha Agrawal, Mounika Pailla, Tejal Shroff
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;

/** 
 *  Class that instantiates Quack Behavior based on duck type
 */
public class QuackBehaviorFactory {

	/**
	 * @return instance of QuackBehavior
	 * @param type which has type of sound of the duck
	 */
	public static QuackBehavior createQuackBehavior (QuackType type) {
		QuackBehavior qb = null;	
		if(type!=null)
		{
		if(type.equals(QuackType.SQUEAK))
		{	
			qb = new Squeak();		
		}
		else if(type.equals(QuackType.QUACK))
			qb = new DuckQuack();
		}
		else {
			qb = new CannotQuack();
		}
		return qb;
	}
}
