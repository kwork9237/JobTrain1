package _Report.END;

import java.util.*;

public class Report_250806 {
	public static void main(String[] args) {
		List<Integer> randomValues = new ArrayList<Integer>();
		int randVal;

		while(true) {
			randVal = Math.toIntExact(Math.round(Math.random() * 100));

			if(randomValues.size() == 6)
				break;
			
			if(!randomValues.contains(randVal) && (randVal <= 45 && randVal >= 1)) {
				randomValues.add(randVal);
			}
		}
		
		randomValues.sort(null);
		
		for(int i : randomValues) {
			System.out.println(i);
		}
	}
}
