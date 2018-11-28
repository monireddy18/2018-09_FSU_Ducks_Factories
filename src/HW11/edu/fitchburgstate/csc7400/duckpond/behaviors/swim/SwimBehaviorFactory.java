/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 * Team: Aayusha Agrawal, Mounika Pailla, Tejal Shroff
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim;

/** 
 *  Class that instantiates Swimming Behavior
 */
public class SwimBehaviorFactory {

	/**
	 * @return instance of SwimBehavior
	 * @param gif filename or text to display while swimming
	 */
	public static SwimBehavior createSwimBehavior (String behavior) {
		return new SimpleSwim(behavior);
	}
}
