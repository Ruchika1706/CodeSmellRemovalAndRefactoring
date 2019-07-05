/* This is an example of Strategy Design Pattern*/
/* https://www.slideshare.net/DhavalDalal/math-works-kidsgame*/
package org.agileindia.mathworks;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	public static Condition PRIME = new Prime();
	public static Condition ODD = new Odd();

	public static List<Integer> select(List<Integer> numbers, Condition ...conditions) {
		List<Integer> selected = new ArrayList<Integer>();
		final Condition all = new And(conditions);
		for (Integer number : numbers) {
			if(all.isSatisfiedBy(number)) {
				selected.add(number);
			}
		}
		return selected;
	}
}