package com.company;
import java.util.HashMap;
import java.util.TreeMap;


public class MapOperations {
    HashMap<Person, Person> HashMapCollection = new HashMap<Person, Person>();
    TreeMap<Person, Person> TreeMapCollection = new TreeMap<Person, Person>(new Person.NameCompare());

    public void HashMapPrintOperation(){
        System.out.println("\n\n");
        System.out.println("Hash Map:");
        for(Person i : this.HashMapCollection.keySet()){
            System.out.println(i + " " + this.HashMapCollection.get(i).getLastName() + " " + this.HashMapCollection.get(i).getBirthYear());
        }
        System.out.println("");
    }

    public void HashMapAddOperation(Person p){
        this.HashMapCollection.put(p,p);
        HashMapPrintOperation();
    }

    public void HashMapRemoveOperation(Person p){
        this.HashMapCollection.remove(p);
        HashMapPrintOperation();
    }

    public void TreeMapPrintOperation(){
        System.out.println("Tree Map:");
        for(Person i : this.TreeMapCollection.keySet()){
            System.out.println(i + " " + this.TreeMapCollection.get(i).getLastName() + " " + this.TreeMapCollection.get(i).getBirthYear());
        }

        System.out.println("");
    }

    public void TreeMapAddOperation(Person p){
        this.TreeMapCollection.put(p,p);
        TreeMapPrintOperation();
    }

    public void TreeMapRemoveOperation(Person p){
        this.TreeMapCollection.remove(p);
    }
}
