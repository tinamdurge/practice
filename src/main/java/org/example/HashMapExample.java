package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample<K,V> {
    public Map<K,V> map;

    public HashMapExample() {
        this.map = new HashMap<>();
    }

    public void add(K key, V value){
        map.put(key,value);
    }

    public V get(K key){
        return map.get(key);
    }

    public boolean find(K key){
        return map.containsKey(key);
    }

    public void remove(K key){
        if(find(key)){
            map.remove(key);
        } else{
            System.out.println("Key not present");
        }

    }
    public void display(){
        for(Map.Entry<K,V> entry : map.entrySet()){
            System.out.println("Key: " +entry.getKey()+ " Value: " +entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapExample<String,Integer> obj = new HashMapExample<>();
        obj.add("Test",23);
        obj.add("Sample",20);
        obj.add("Example",25);
        obj.display();

        System.out.println("The Value of Key Test: " +obj.get("Test1"));
        System.out.println("Key Present: " +obj.find("Sample"));

        obj.remove("Example1");
        obj.display();
    }
}

