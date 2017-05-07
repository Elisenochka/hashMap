import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mega-Raid-2 on 06.05.2017.
 */
public class Main {

    /*public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Ricky", new Date("NOVEMBER 1 1999"));
        map.put("Jacky", new Date("DECEMBER 5 1977"));
        map.put("Deny", new Date("JULY 6 1945"));
        map.put("Zak", new Date("APRIL 30 2006"));
        map.put("Gorge", new Date("AUGUST 23 2006"));
        map.put("Nikita", new Date("NOVEMBER 21 1998"));
        map.put("Konstantin", new Date("JUNE 3 2000"));
        map.put("Alexandra", new Date("NOVEMBER 10 1999"));
        map.put("Ivan", new Date("MAY 20 1997"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String> removeList = new ArrayList<String>();
        for (HashMap.Entry<String, Date> pair : map.entrySet()) {
            if (pair.getValue().getMonth() > 4 & pair.getValue().getMonth() < 8)
                removeList.add(pair.getKey());
        }
        for(String key : removeList)
            map.remove(key);//напишите тут ваш код
    }*/

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i =0; i<10;i++){
            map.put("lastName"+i,"name"+i);
        }//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> removeList = new ArrayList<String>();
        HashMap map2 = (HashMap)map.clone();
        for(HashMap.Entry pair : map.entrySet()){
            map2.remove(pair.getKey());
            if(map2.containsValue(pair.getValue()))
                removeList.add((String)pair.getValue());
        }
        for(String s : removeList)
            removeItemFromMapByValue(map, s);//напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
