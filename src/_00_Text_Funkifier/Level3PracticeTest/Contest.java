package _00_Text_Funkifier.Level3PracticeTest;

import java.util.HashMap;

public class Contest {
    BerryHaul[] contest;

    public Contest(BerryHaul[] contest) {
        this.contest = contest;
    }

    public String findWinner() {
        int highestNumBerries = 0;
        String winner = "";

        HashMap<String, Integer> winnerMap = new HashMap<>();

        String currentName = "";
        int currentNum = 0;
        for (int berryHaulIndex = 0; berryHaulIndex < contest.length; berryHaulIndex++) {

            currentName = contest[berryHaulIndex].getName().toLowerCase();
            currentNum = contest[berryHaulIndex].getNumBerries();

            if (winnerMap.containsKey(currentName.toLowerCase())) {
                int currentValue = winnerMap.get(currentName.toLowerCase());

                winnerMap.put(currentName, currentValue + currentNum);
            } else {
                winnerMap.put(currentName.toLowerCase(), currentNum);
            }
        }

        for(String name : winnerMap.keySet()){
            if(winnerMap.get(name) >= highestNumBerries){
                highestNumBerries = winnerMap.get(name);
                winner = name;
            }
        }

    return winner;
    }

    public int countBerries() {
        int totalNumBerries = 0;

        for (int contestIndex = 0; contestIndex < contest.length; contestIndex++) {
            totalNumBerries = totalNumBerries + contest[contestIndex].getNumBerries();
        }
        return totalNumBerries;
    }

}
