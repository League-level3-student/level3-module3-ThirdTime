package Warmups;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
public class PracticeCodingTest {

	HashMap<String, ArrayList<Integer>> revenue = new HashMap<>();
	RevenueManager revenueManager = new RevenueManager(revenue);
	
	/*
	 * Everyone is hosting bake sales to raise money for a field trip to the moon
	 * Each person's revenue from each of their bake sales is stored in an ArrayList 
	 * A HashMap stores the the revenues every person in the class
	 */
	@Before
	public void setup() {
		ArrayList<Integer> isisBakeSaleRevenues = bakeSaleRevenues(2, 1, 27); // Isis had three bake sales
		ArrayList<Integer> esmeBakeSaleRevenues = bakeSaleRevenues(); // Esmé was busy and didn't have any bake sales
		ArrayList<Integer> johnBakeSaleRevenues = bakeSaleRevenues(100); // John had 1 bake sale
		ArrayList<Integer> davidBakeSaleRevenues = bakeSaleRevenues(25, 19, 2, 2, 2); //David had 5 bake sales
	
		revenue.put("Isis", isisBakeSaleRevenues);
		revenue.put("David", davidBakeSaleRevenues);
		revenue.put("Esmé", esmeBakeSaleRevenues);
		revenue.put("John", johnBakeSaleRevenues);
	}
	
	
	@Test
	public void test_totalRevenue() {
		int totalRevenue = revenueManager.getClassTotal();
		assertEquals(180, totalRevenue);	
	}
	
	
	@Test
	public void test_topFundraiser() {
		// if there's a tie, you can return
		String topFundraiser = revenueManager.getTopFundraiser();
		assertEquals("John", topFundraiser);
	}
	
	// This builds an ArrayList that holds the ints passed in as parameters
	// You can ignore how this method works
	private ArrayList<Integer> bakeSaleRevenues(int...revenues){
		ArrayList<Integer> revenuesArrayList = new ArrayList<>();
		for (int revenue: revenues) {
			revenuesArrayList.add(revenue);
		}
		return revenuesArrayList;
	}
	
}
