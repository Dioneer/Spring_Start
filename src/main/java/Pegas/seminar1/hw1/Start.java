package Pegas.seminar1;

import Pegas.seminar1.hw1.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Start {
    public static void main(String[] args) {
        Person person = new Person("Killy", "Dwarf", 130);
        /**
         * gson
         */
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(person);
        System.out.println(json);
        /**
         * lang3
         */
        System.out.println(person);
    }
}
