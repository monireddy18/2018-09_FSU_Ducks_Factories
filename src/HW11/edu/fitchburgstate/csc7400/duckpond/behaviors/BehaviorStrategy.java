/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-11-28
 * Team: Aayusha Agrawal, Mounika Pailla, Tejal Shroff
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackType;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;

public class BehaviorStrategy {
	
	//Instance variables to store the types of behaviors
	public String flyBehavior;
	public QuackType quackBehavior;
	public String swimBehavior;
	/**  
	  * Returns the flying behavior
	  */
	 public FlyingBehavior getFlyBehavior() {
		 return FlyBehaviorFactory.createFlyBehavior(this.flyBehavior);
	 }

	 /**
	  * Returns the quacking behavior
	  */
	 public QuackBehavior getQuackBehavior() {
		 return QuackBehaviorFactory.createQuackBehavior(this.quackBehavior);
	 }

	 /**
	  * Returns the swimming behavior
	  */
	 public SwimBehavior getSwimBehavior() {
		 return SwimBehaviorFactory.createSwimBehavior(this.swimBehavior);
	 }

	 /**
	  * Initializes behavior variables with specific values for a duck
	  * @param flyBehavior text to describe flying behavior 
	  * @param swimBehavior text to describe swimming behavior 
	  * @param quackBehavior QuackType to describe duck sound 
	  * @return s an instance of BehaviorStrategy
	  */
	public static BehaviorStrategy getBehaviors(String flyBehavior, String swimBehavior, QuackType quackBehavior) 
	{
		BehaviorStrategy s = new BehaviorStrategy();
		s.flyBehavior = flyBehavior;
		s.quackBehavior = quackBehavior;
		s.swimBehavior = swimBehavior;
		return s;
	}
}
