package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		//Animal [] farm = {new Sheep(), new Cow(), new Pig(), new Cow(), new Chicken()};
		ArrayList<Animal> farm = new ArrayList<>();
		farm.add(new Cow());
		farm.add(new Pig());
		farm.add(new Chicken());
		
		
		for(int i = 0; i < farm.size(); i++) {
			System.out.println(farm.get(i).makeNoise());
		}
	}
}
