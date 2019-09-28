package Warmups;

import java.util.ArrayList;
import java.util.HashMap;

public class RevenueManager {
	HashMap<String, ArrayList<Integer>> revenue;

	public RevenueManager(HashMap<String, ArrayList<Integer>> revenue) {
		this.revenue = revenue;
	}

	public String getTopFundraiser() {
		String topFundraiser = null;
		int topMoneyRaised = 0;
		int currentMoney;
		for (String name : revenue.keySet()) {
			ArrayList<Integer> currentSales = revenue.get(name);
			currentMoney = this.addTotal(currentSales);
			if(currentMoney > topMoneyRaised) {
				topMoneyRaised = currentMoney;
				topFundraiser = name;
			}
		}
		return topFundraiser;

	}

	public int getClassTotal() {
		int classTotal = 0;
		for (ArrayList<Integer> value : revenue.values()) {
			ArrayList<Integer> currentTotal = value;
			classTotal = classTotal + this.addTotal(currentTotal);
		}
		return classTotal;
	}

	public int addTotal(ArrayList <Integer> arr) {
		int total = 0;
		for (int i = 0; i < arr.size(); i++) {
			total = total + arr.get(i);
		}
		return total;
	}
}
