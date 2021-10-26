package com.company;
import java.util.HashSet;
import java.util.TreeSet;

public class SetOperations {
    HashSet<Person> HashSetCollection = new HashSet<Person>();
    TreeSet<Person> TreeSetCollection = new TreeSet<Person>(new Person.NameCompare());


    public void HashSetPrintOperation(){
        System.out.println();
        System.out.println("Hash Set:");
        for(Person i : this.HashSetCollection){
            System.out.println(i.getFirstName() + " " + i.getLastName() + " " + i.getBirthYear());
        }
        System.out.println("");
    }

    public void HashSetAddOperation(Person p){
        this.HashSetCollection.add(p);
        HashSetPrintOperation();
    }

    public void HashSetRemoveOperation(Person p){
        this.HashSetCollection.remove(p);
        HashSetPrintOperation();
    }

    public void TreeSetPrintOperation(){
        System.out.println();
        System.out.println("Tree Set:");
        for(Person i : this.TreeSetCollection){
            System.out.println(i.getFirstName() + " " +i.getLastName() + " " + i.getBirthYear());
        }
        System.out.println("");
    }

    public void TreeSetAddOperation(Person p){
        this.TreeSetCollection.add(p);
        TreeSetPrintOperation();
    }

    public void TreeSetRemoveOperation(Person p){
        this.TreeSetCollection.remove(p);
        TreeSetPrintOperation();
    }


}
