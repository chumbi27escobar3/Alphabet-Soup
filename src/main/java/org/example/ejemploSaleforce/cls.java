package org.example.ejemploSaleforce;

import java.util.List;

public class cls {

    //Matrix Alphabet
    List<List<String>> sopaDeLetras = new List<List<String>>();
        sopaDeLetras.add(new List<String>{ 'S', 'O', 'L' });
    	sopaDeLetras.add(new List<String>{ 'U', 'N', 'O' });
        sopaDeLetras.add(new List<String>{ 'N', 'U', 'T' });

    // Print the matrix
        for (int i = 0; i < sopaDeLetras.size(); i++) {
        for (int j = 0; j < sopaDeLetras.get(i).size(); j++) {
            System.out.print(sopaDeLetras[i][j] + ' ');
        }
        System.out.println();
    }

    List<String> wordQuery = new ArrayList<String>();
        wordQuery.add('SUN');
        wordQuery.add('SOL');
        wordQuery.add('LOT'
                wordQuery.add('ONU');
        wordQuery.add('RAY');
        for(String i: wordQuery){
        wordQuery(sopaDeLetras, i);
    }

}

    /*
    Parameter:  Matrix of char (char[][]), word to be searched for(String)
    Description: Allows to search for a word in the implemented alphabet soup.
     */
    private static void wordQuery(char[][] sopaDeLetras, String wordSearch) {

        // Verificamos horizontal
        for (int i = 0; i < sopaDeLetras.length; i++) {
            String filaEnPalabra = '';
            // palabra con cada fila
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                filaEnPalabra += sopaDeLetras[i][j];
            }
            if (filaEnPalabra.contains(wordSearch)) {
                // Imprimo la posicion de cada letra
                int positionInitial = filaEnPalabra.indexOf(wordSearch);
                System.out.println('Searching ' + wordSearch);
                for (int posEnPalabraEncontrada = positionInitial; posEnPalabraEncontrada < sopaDeLetras.length; posEnPalabraEncontrada++) {
                    System.out.println(filaEnPalabra.charAt(posEnPalabraEncontrada) + '[' + i + ', ' + posEnPalabraEncontrada + ']' );
                }
                return;
            }
        }

        // Verificamos vertical
        for (int i = 0; i < sopaDeLetras[0].length; i++) {
            String filaEnPalabra = '';
            for (int j = 0; j < sopaDeLetras.length; j++) {
                filaEnPalabra += sopaDeLetras[j][i];
            }
            if (filaEnPalabra.contains(wordSearch)) {
                // Imprimo la posicion de cada letra
                int positionInitial = filaEnPalabra.indexOf(wordSearch);
                System.out.println('Seaching ' + wordSearch);
                for (int posEnPalabraEncontrada = positionInitial; posEnPalabraEncontrada < sopaDeLetras.length; posEnPalabraEncontrada++) {
                    System.out.println(filaEnPalabra.charAt(posEnPalabraEncontrada) + '[' + posEnPalabraEncontrada + ', ' + i + ']');
                }
                return;
            }
        }

        // Cuando la palabra no se encuentra
        System.out.println(wordSearch + ' Not found');

}
