package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<List<String>> rows = new ArrayList<List<String>>();

    private static List<String> letterColumns = new ArrayList<String>();


    public static void main(String[] args) {

        List<String> elemtos = new ArrayList<String>();
        elemtos.add("S O L");
        elemtos.add("U N O");
        elemtos.add("N U T");
        List<String> words = new ArrayList<String>();
        words.add("SUN");
        words.add("LOT");
        words.add("ONU");
        words.add("RAY");


        //“SUN”, “SOL”, “LOT”, “ONU” y “RAY”
        for(String i : elemtos){
            String[] letter = i.split(" ");
            List<String> letterRows = new ArrayList<String>(letter.length);
            for(int j = 0;  j < letter.length; j++){
                letterRows.add(letter[j]);
            }
            letter = new String[]{" "};
            rows.add(letterRows);
        }
        /*for (int i = 0;  i < rows.size(); i++){
            System.out.println(rows.get(i).toString());
        }
        /*
        for(String i: words){

            System.out.println("Searching " + i);
            System.out.println("Searching " + wordsQuery(i));
        }*/

    }

    public static void wordQuery(String query){
        String[] position = query.split("");
        for(int i = 0; i < rows.size(); i++){
            if(query.length())
        }
        //return position;
    }

    public static String word(Integer length, Integer index){
        String cadena = "";

        for(int i = 0; i < length; i++){
            cadena += rows.get(index).get(i);
        }

        return cadena;
    }


}