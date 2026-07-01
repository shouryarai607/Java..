import java.util.*;

class Hashing{
  public static void main(String[] args){
    HashMap<String,Integer>map = new HashMap<>();

    map.put("indiaa",20);
    map.put("china",150);
    map.put("Australia", 120);

    // System.out.println(map);

    // if(map.containsKey("china")){
    //   System.out.println("Key is present in HashMap");
    // }else System.out.println("Key is not present");

    // if(map.containsKey("Indonasia")){
    //   System.out.println("Key is present in HashMap");
    // }else System.out.println("Key is not present");

    // System.out.println(map.get("china"));
    // System.out.println(map.get("indonasia"));

    for(Map.Entry<String, Integer>e: map.entrySet()){
      System.out.println(e.getKey());
      System.out.println(e.getValue());

    }
    

    



  }


}