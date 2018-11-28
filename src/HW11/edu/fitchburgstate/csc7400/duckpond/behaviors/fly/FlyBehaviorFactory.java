/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 * Team: Aayusha Agrawal, Mounika Pailla, Tejal Shroff
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;

/** 
 *  Class that instantiates Flying Behavior based on duck type
 */
public class FlyBehaviorFactory {

	/**
	 * @return instance of FlyingBehavior
	 * @param type gif filename or text to display while flying
	 */
	public static FlyingBehavior createFlyBehavior (String type) {
		FlyingBehavior fb = null;		
		if(type!=null)
			fb = new SimpleFly(type);	
		else
			fb = new CannotFly();
		return fb;
	}
}
