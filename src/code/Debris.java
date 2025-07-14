package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Debris {
	
	 // Method to select debris items for cleanup within a specified budget
    public static List<String> getDebrisToCleanUp(Map<String, Integer> debrisCosts, int budget) {
        // Convert the debris cost map to a list of entries for sorting
        List<Map.Entry<String, Integer>> debrisList = new ArrayList<>(debrisCosts.entrySet());

        // Sort debris items by their cost in ascending order
        Collections.sort(debrisList, Comparator.comparingInt(Map.Entry::getValue));

        List<String> selectedDebris = new ArrayList<>();
        int currentBudget = 0;

        // Iterate over sorted debris items and add to selection if within budget
        for (Map.Entry<String, Integer> debris : debrisList) {
            int cost = debris.getValue();
            if (currentBudget + cost <= budget) {
                selectedDebris.add(debris.getKey());
                currentBudget += cost;
            } else {
                break;
            }
        }

        // Check if only one expensive item can be selected
        if (selectedDebris.isEmpty() && !debrisList.isEmpty()) {
            Map.Entry<String, Integer> mostExpensive = debrisList.get(debrisList.size() - 1);
            if (mostExpensive.getValue() <= budget) {
                selectedDebris.add(mostExpensive.getKey());
            }
        }

        return selectedDebris;
    }

	public static void main(String[] args) {
		 Map<String, Integer> debrisCosts = new HashMap<>();
	        debrisCosts.put("SL-12 AUX MOTOR", 1000);
	        debrisCosts.put("SL-12 DEB", 200);
	        debrisCosts.put("BREEZE-M R/B DEB", 50000);

	        System.out.println(getDebrisToCleanUp(debrisCosts, 100));        // Expected output: []
	        System.out.println(getDebrisToCleanUp(debrisCosts, 1500));       // Expected output: ["SL-12 AUX MOTOR", "SL-12 DEB"]
	        System.out.println(getDebrisToCleanUp(debrisCosts, 50000));      // Expected output: ["SL-12 AUX MOTOR", "SL-12 DEB"]
	        System.out.println(getDebrisToCleanUp(debrisCosts, 51000));      // Expected output: ["BREEZE-M R/B DEB"] or ["SL-12 AUX MOTOR", "SL-12 DEB"]  
		
		}

}
