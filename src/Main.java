import java.util.*;

public class Main {
    public static void main(String[] args) {

        //initialising hashMap
        HashMap<String, Integer> gameMap = new HashMap<String, Integer>();
        gameMap.put("Divinity 2: Original Sin", 2017);
        gameMap.put("Destiny", 2014);
        gameMap.put("TitanFall 2", 2016);
        gameMap.put("Baldur's Gate 3", 2023);
        gameMap.put("Boltgun", 2023);

        //creating array list
        List<Integer> gameMapValue = new ArrayList<Integer>(gameMap.values());

        //sorting
        Collections.sort(gameMapValue);

        //print
        System.out.println(gameMapValue);
    }
}
