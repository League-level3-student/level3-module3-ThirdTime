package Warmups;
import java.util.HashMap;

public class FishingContest {
    HashMap<String, double[]> thisMap;
    public FishingContest(HashMap<String, double[]> list){
        thisMap = list;
    }

    public double findBiggestFish(String nameOfFisher){
        double biggestFish = 0.0;
        for(double weightOfFish: thisMap.get(nameOfFisher)){
            if(weightOfFish >= biggestFish){
                biggestFish = weightOfFish;
            }
        }
        return biggestFish;
    }

    public String findWinner(){
        double currentMostWeight = 0.0;
        String winner = "";
        for(String nameOfFisher : thisMap.keySet()) {
            double [] weightsOfFisher = thisMap.get(nameOfFisher);
            double fishersTotalWeight = addWeights(weightsOfFisher);
            if (currentMostWeight <= fishersTotalWeight) {
                   currentMostWeight = fishersTotalWeight;
                    winner = nameOfFisher;
            }
        }
        return winner;
    }

    public double addWeights(double[] dub){
        double totalWeight = 0.0;
        for(double d : dub){
            if(d >= 3.0) {
                totalWeight += d;
            }
        }
        return totalWeight;
    }
}
