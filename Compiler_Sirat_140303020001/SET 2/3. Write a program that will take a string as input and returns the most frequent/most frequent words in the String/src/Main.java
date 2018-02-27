
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sirat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        String words[] = {"nort", "east", "university", "bangladesh", "nort",
            "south", "university", "bangladesh", "university", "of", "engineering"};

        for (String w : words) {
            Integer n = map.get(w);
            n = (n == null) ? 1 : ++n;
            map.put(w, n);
        }

        int maxValueInMap = (Collections.max(map.values()));
        //System.out.println(maxValueInMap);

        for (Object obj : map.entrySet()) {
            Map.Entry<String, Integer> entry = (Map.Entry) obj;
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
    }
    
}
