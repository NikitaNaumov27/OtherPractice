package PeteTheBaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> cakes = new ArrayList<Integer>();
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            if (available.containsKey(entry.getKey())) {
                cakes.add(available.get(entry.getKey()) / entry.getValue());
            } else cakes.add(0);
        }
        return cakes.stream().min(Integer::compareTo).orElse(0);
    }
}