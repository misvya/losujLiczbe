import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //wylosuj 10 liczb z zakresu od 1 do 20
        //tablica musi mięc rozmiar, który nie może byc póżniej zmieniony
        //może zawierać typy proste i złożone
        int [] tablicaLosowych1 = losujLiczbyDoTblicy(10);
        //dry
        wypisz(tablicaLosowych1);
        //wypisz wylosowane liczby na ekranie

        //losowanie 10 liczb bez powtorzen
        ArrayList<Integer> losowe = wylosujLiczbyDoListy(10);
        wypisz(losowe);

    }

    private static ArrayList<Integer> wylosujLiczbyDoListy(int ileLiczb){
        //kolekcje -> Listy, Zbiory, Map
        //List -> ArrayList
        //w każdej kolekcji nie musimy deklarowac romiaru na poczatku pracy z kolekcja
        //rozmiar moze byc zmienieny -> dodawanie  i usuwanie elementow
        //w kolekcji tylko typt zlozone
        int liczba1 = 0; //typ prosty z malej litery nie ma metod
        Integer liczba2 = 0; //typ zlozony ma metody pisany z wielkiej lietry
        Random random = new Random();
        ArrayList<Integer> listaLiczbLosowych = new ArrayList<>();
        for (int i = 0; i < ileLiczb; i++) {
            listaLiczbLosowych.add(random.nextInt(20)+1);
        }
        return listaLiczbLosowych;
    }

    private static void wypisz(ArrayList<Integer> lista){
        System.out.println();
        System.out.println("Lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + ", ");
        }
    }

    private static void wypisz(int[] tablica){
        System.out.println("Wypisywanie tablicy");
        for (int elementTablicy:tablica) {
            System.out.println(elementTablicy + ", ");

        }
    }
    private static int[] losujLiczbyDoTblicy(int ileLiczb){
        int[] tablicaLiczbLosowych = new int[ileLiczb];
        Random random = new Random();
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = random.nextInt(20)+1;
        }
        return tablicaLiczbLosowych;
    }
}