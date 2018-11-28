/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-11-28
 * Team: Aayusha Agrawal, Mounika Pailla, Tejal Shroff
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.BehaviorStrategy;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackType;

/**
 * Rubber duck for pond
 */
public class RubberDuck extends Duck {

	/**
	 * Creates a new rubber duck
	 */
	public RubberDuck() {
		super("Rubber Duck",
				"ducky.bmp",
				BehaviorStrategy.getBehaviors(null, "rubber duck floating", QuackType.SQUEAK));
				
	}
}
