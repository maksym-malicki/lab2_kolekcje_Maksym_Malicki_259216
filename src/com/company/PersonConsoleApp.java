package com.company;

import java.util.*;

public class PersonConsoleApp {

    private static final String GREETING_MESSAGE =
            "";

    private static final String MENU =
            "    M E N U   G Ł Ó W N E  \n" +
                    "1 - Menu SET \n" +
                    "2 - Menu LIST        \n" +
                    "3 - Menu MAP   \n" +
                    "0 - Zakończ program        \n";
    private static final String SetMENU =
            "    M E N U   S E T  \n" +
                    "1 - Dodaj osobę do HashSet \n" +
                    "2 - Usuń osobę z HashSet       \n" +
                    "3 - Wyświetl HashSet   \n" +
                    "4 - Dodaj osobę do TreeSet   \n" +
                    "5 - Usuń osobę z TreeSet   \n" +
                    "6 - Wyświetl TreeSet   \n" +
                    "0 - Zakończ program        \n";
    private static final String ListMENU =
            "    M E N U   L I S T  \n" +
                    "1 - Dodaj osobę do ArrayList \n" +
                    "2 - Usuń osobę z ArrayList       \n" +
                    "3 - Wyświetl ArrayList   \n" +
                    "4 - Dodaj osobę do LinkedList   \n" +
                    "5 - Usuń osobę z LinkedList   \n" +
                    "6 - Wyświetl LinkedList   \n" +
                    "0 - Zakończ program        \n";
    private static final String MapMENU =
            "    M E N U   M A P  \n" +
                    "1 - Dodaj osobę do HashMap \n" +
                    "2 - Usuń osobę z HashMap       \n" +
                    "3 - Wyświetl HashMap   \n" +
                    "4 - Dodaj osobę do TreeMap   \n" +
                    "5 - Usuń osobę z TreeMap   \n" +
                    "6 - Wyświetl TreeMap   \n" +
                    "0 - Zakończ program        \n";


    private static final ConsoleUserDialog UI = new ConsoleUserDialog();

    private Person currentPerson = null;

    public void runMainLoop() throws PersonException {
        UI.printMessage(GREETING_MESSAGE);
        SetOperations o1 = new SetOperations();
        ListOperations o2 = new ListOperations();
        MapOperations o3 = new MapOperations();

        while (true) {
            UI.clearConsole();

            switch (UI.enterInt(MENU + "==>> ")) {
                case 1:
                    switch (UI.enterInt(SetMENU + "Operacja na SET ==>> ")) {
                        case 1 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("Gdy funkcja equals() nie jest włączona, do HashSet można dodać taki sam element!");
                            o1.HashSetAddOperation(currentPerson);
                        }
                        case 2 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("Gdy funkcja equals() nie jest włączona, z HashSet nie da się usunąć elementu, gdyż usuwanie odbywa się przez porównanie!");
                            o1.HashSetRemoveOperation(currentPerson);
                        }
                        case 3 -> o1.HashSetPrintOperation();
                        case 4 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("Funkcja equals() nie wpływa na proces usuwania!");
                            o1.TreeSetAddOperation(currentPerson);
                        }
                        case 5 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("Występowanie lub brak funkcji equals() nie wpływa na usuwanie, ponieważ TreeSet używa Comparator'a do zdeterminowania unikalnego obiektu!");
                            o1.TreeSetRemoveOperation(currentPerson);
                        }
                        case 6 -> o1.TreeSetPrintOperation();
                        case 0 -> {
                            UI.printInfoMessage("\nProgram zakończył działanie!");
                            System.exit(0);
                        }
                    }
                    break;
                case 2:
                    switch (UI.enterInt(ListMENU + "Operacja na LIST ==>> ")) {
                        case 1 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("Do ArrayList mogą być dodawane duplikaty, więc equals() nie wpływa na wynik dodawania!");
                            o2.ArrayListAddOperation(currentPerson);
                        }
                        case 2 -> {
                            int indexArray = UI.enterInt("Podaj pozycję ==>> ");
                            System.out.println("\n\n");
                            System.out.println("Funkcja equals() nie wpływa na usuwanie w ArrayList, ponieważ odbywa się ono przez podanie indeksu!");
                            o2.ArrayListRemoveOperation(indexArray);
                        }
                        case 3 -> o2.ArrayListPrintOperation();
                        case 4 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            System.out.println("\n\n");
                            currentPerson = createNewPerson(flag);
                            int indexLinked = UI.enterInt("Podaj pozycję ==>> ");
                            System.out.println("Do LinkedList mogą być dodawane duplikaty, więc equals() nie wpływa na wynik dodawania!");
                            o2.LinkedListAddOperation(indexLinked, currentPerson);
                        }
                        case 5 -> {
                            int indexLinkedRm = UI.enterInt("Podaj pozycję ==>> ");
                            System.out.println("\n\n");
                            System.out.println("Funkcja equals() nie wpływa na usuwanie w LinkedList, ponieważ odbywa się ono przez podanie indeksu!");
                            o2.LinkedListRemoveOperation(indexLinkedRm);
                        }
                        case 6 -> o2.LinkedListPrintOperation();
                        case 0 -> {
                            UI.printInfoMessage("\nProgram zakończył działanie!");
                            System.exit(0);
                        }
                    }
                    break;
                case 3:
                    switch (UI.enterInt(MapMENU + "Operacja na MAP ==>> ")) {
                        case 1 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("W przypadku HashMap funkcja equals() ma znaczenie! Gdy jest ona dostępna, wtedy do mapy nie można dodawać duplikatów!");
                            o3.HashMapAddOperation(currentPerson);
                        }
                        case 2 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("Funkcja equals() ma znaczenie przy usuwaniu elementów z HashMap, gdyż usunięcie odbywa się dopiero w momencie znalezienia pasującego klucza (obiekty muszą być prównane");
                            o3.HashMapRemoveOperation(currentPerson);
                        }
                        case 3 -> o3.HashMapPrintOperation();
                        case 4 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("W przypadku dodawania do TreeMap funkcja equals() nie ma znaczenia, gdyż TreeMap stwierdza unikalność obiektów na podstawie Comparable!");
                            System.out.println("\n\n");
                            o3.TreeMapAddOperation(currentPerson);
                        }
                        case 5 -> {
                            int flag = UI.enterInt("Z equals() (wpisz 1) / bez equals() (wpisz 0)==>> ");
                            currentPerson = createNewPerson(flag);
                            System.out.println("\n\n");
                            System.out.println("W przypadku usuwania z TreeMap funkcja equals() nie ma znaczenia, gdyż TreeMap stwierdza unikalność obiektów na podstawie Comparable!");
                            System.out.println();
                            o3.TreeMapRemoveOperation(currentPerson);
                        }
                        case 6 -> o3.TreeMapPrintOperation();
                        case 0 -> {
                            UI.printInfoMessage("\nProgram zakończył działanie!");
                            System.exit(0);
                        }
                    }
                    break;
                case 0:
                    UI.printInfoMessage("\nProgram zakończył działanie!");
                    System.exit(0);
            }
        }
    }

    static Person createNewPerson(int flag){
        String first_name = UI.enterString("Podaj imię: ");
        String last_name = UI.enterString("Podaj nazwisko: ");
        String birth_year = UI.enterString("Podaj rok ur.: ");
        Person person;
        try {
            person = new Person(first_name, last_name, flag);
            person.setBirthYear(birth_year);
        } catch (PersonException e) {
            UI.printErrorMessage(e.getMessage());
            return null;
        }
        return person;
    }
}
