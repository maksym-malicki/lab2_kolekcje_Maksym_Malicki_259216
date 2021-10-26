package com.company;
import java.util.LinkedList;
import java.util.ArrayList;



public class ListOperations {
    LinkedList<Person> LinkedListCollection = new LinkedList<Person>();
    ArrayList<Person> ArrayListCollection = new ArrayList<Person>();

    public void ArrayListPrintOperation(){
        System.out.println();
        System.out.println("Array List:");
        for (Person person : this.ArrayListCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear());
        }
        System.out.println("");
    }

    public void ArrayListRemoveOperation(int index){
        this.ArrayListCollection.remove(index);
        ArrayListPrintOperation();
    }

    public void ArrayListAddOperation(Person p){
        this.ArrayListCollection.add(p);
        ArrayListPrintOperation();
    }

    public void LinkedListPrintOperation(){
        System.out.println();
        System.out.println("Linked list:");
        for (Person person : this.LinkedListCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear());
        }
        System.out.println("");
    }

    public void LinkedListAddOperation(int index, Person p){
        this.LinkedListCollection.add(index, p);
        LinkedListPrintOperation();
    }

    public void LinkedListRemoveOperation(int index){
        this.LinkedListCollection.remove(index);
        LinkedListPrintOperation();
    }


}