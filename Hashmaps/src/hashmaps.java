import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

    class mapusinghash{
    private Entity[] entities;
    public mapusinghash(){
        entities=new Entity[100];

    }
    public void put(String key,String value){
  int hash=Math.abs(key.hashCode()%entities.length);
  entities[hash]=new Entity(key,value);
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
           entities[hash]=null;
        }
      }
    private class Entity{
        String key;
        String value;
        public Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }
}
public class hashmaps {
    //Hashmaps is used to store and retrive the data int the o(1) time complexity.
    //Hashmaps use key value pair to store the data and retrive the data.
    //when we storing the data in the form hashmaps in the array using its key with the help of hashfunctin which modulo the hashvalue and gives the smaller number gets collided and this cause the problem which increase the time complexity of finding the value in the hashmaps
    //To overcome this problem we use the simple technique which is chaining and open addressing
    //chaning uses the linkedlist structure to store the data
    //chaning  consist of many techinque to like division hashing, multiplication hashing and univesal hasing to store the data  in the hashmaps and retrive  the data in the constant amount of time
    // when you double the hashtable the insertion cost of n element the table is O(n).
    // one item cost is O(1) which is called amortized constant time
    // if the number of element in the hashtable is half then the size shrink to half
    //open addressing uses the one item per slot m>=n where the m=size of the hashtable and size of the array
    // Treemaps is used to store the value in the sorted form.
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put("abhinav",88);
        map.put("abhay",99);
        map.put("Aryan",100);
        System.out.println(map.get("Aryan"));
        Map<Integer,Integer> tree=new TreeMap<>();
        tree.put(1,100);
        tree.put(2,200);
        tree.put(3,300);
        System.out.println();
    }
}

