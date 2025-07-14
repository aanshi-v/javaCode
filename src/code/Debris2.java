package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Debris2 {
	
	 // Map containing debris and their respective cleanup costs
    private static final Map<String, Integer> debrisCosts = new HashMap<>();

    static {
        debrisCosts.put("SL-12 AUX MOTOR", 1000);
        debrisCosts.put("SL-12 DEB", 200);
        debrisCosts.put("BREEZE-M R/B DEB", 50000);
    }

    public static List<String> getDebrisToCleanUp(double budget) {
        // Sort debris by cost in ascending order
        List<Map.Entry<String, Integer>> sortedDebris = debrisCosts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        List<String> debrisToClean = new ArrayList<>();
        double totalCost = 0;

        for (Map.Entry<String, Integer> debris : sortedDebris) {
            if (totalCost + debris.getValue() <= budget) {
                debrisToClean.add(debris.getKey());
                totalCost += debris.getValue();
            } else {
                break; // Stop if adding the next debris exceeds the budget
            }
        }

        return debrisToClean;
    }

	public static void main(String[] args) {
		System.out.println(getDebrisToCleanUp(100.00));       // Output: []
        System.out.println(getDebrisToCleanUp(1500.00));      // Output: [SL-12 AUX MOTOR, SL-12 DEB]
        System.out.println(getDebrisToCleanUp(50000.00));     // Output: [SL-12 AUX MOTOR, SL-12 DEB]

	}

}
