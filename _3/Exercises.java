package javaadvanced._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        System.out.println("\nExercise 1");

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        System.out.println("\nExercise 2");

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        toSet(list);
        toSet(set);

        System.out.println(toSet(list));
        System.out.println(toSet(set));
    }

    // Write your method for exercise 2 here
    private static Set<String> toSet(Collection <String> collection){
        Set<String> conversione = new HashSet<>(collection);
        return conversione;
    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        System.out.println("\nExercise 3");

        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        System.out.println(wordCount);
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: List, così posso sapere chi è arrivato prima e chi dopo;
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: Map, perchè mi immagino un registro cartaceo/digitale in cui ad ogni studente corrisponde un voto così questo aiuta nella classificazione;
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: List, perchè così posso indicizzare l'invecchiamento dei paesi nel mondo;
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: Map, in modo tale che se voglio conoscere il prezzo o valore di un articolo posso risalire alla sua chiave;
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: Set, e in particolar modo un LinkedSet per trovare il dipendente nell'ordine in cui l'ho inserito;
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: Map, così posso mappare la popolazione totale corrispondente alla città;
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: List, è importante che una biblioteca sia organizzata efficientemente per trovare rapidamente in ordine autori e date;
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: Map, in modo che mettendomi nei panni di uno studente che sia interessato ad un corso possa trovare il corrispondente prof di quel corso e magari contattarlo;
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: List, così come la biblioteca anche in un negozio in cui si possono noleggiare film, è importante avere un catalogo organizzato;
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: Set, spesso facendo riferimento allo schermo su cui vediamo i voli non c'è un vero e proprio ordine tranne magari per gli orari;
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: List, perchè è importante soprattutto durante la ricerca, ordinare almeno per data quelli più recenti e viceversa;
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: List, così come il negozio di prima e la biblioteca, anche in questo caso è importante avere un'organizzazione;
     */

}
