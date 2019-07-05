package org.agileindia.mathworks;

public class And implements Condition{

	private Condition[] conditions;
	public And(Condition... conditions) {
		// TODO Auto-generated constructor stub
		this.conditions = conditions;
	}

	@Override
	public boolean isSatisfiedBy(int number) {
		boolean canSelect = true;
		for(Condition condition: conditions) {
			canSelect &= condition.isSatisfiedBy(number);
		}
		return canSelect;
		
	}
	
}
