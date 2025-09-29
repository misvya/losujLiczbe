import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

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

        HashSet<Integer> wylosowanyZbior = wylosujLiczbyDoZbioru(15);
        wypisz(wylosowanyZbior);

        ArrayList<Integer> wczytaneLiczby = wczytajZKlawiatury(5);
        System.out.println(wczytaneLiczby);

    }

    private static ArrayList<Integer> wczytajZKlawiatury(int ileLiczb){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wczytaneLivzby = new ArrayList<>();
        for (int i = 0; i < ileLiczb; i++) {
            System.out.println("Podaj liczbę ");
            wczytaneLivzby.add(scanner.nextInt());
        }
        return wczytaneLivzby;
    }

    private static HashSet<Integer> wylosujLiczbyDoZbioru(int ileLiczb){
        HashSet<Integer> zbiorLosowych = new HashSet<>();
        //elementy w zbiorze sa unikatowe nieindeksowane
        Random random = new Random();
        while (zbiorLosowych.size()<ileLiczb){
            zbiorLosowych.add(random.nextInt(20)+1);
        }
        return zbiorLosowych;
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
            int liczba = random.nextInt(20)+1;
            while (listaLiczbLosowych.contains(liczba)){
                liczba = random.nextInt(20)+1;
            }
            listaLiczbLosowych.add(liczba);
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

    private static void wypisz(HashSet<Integer> zbior){
        System.out.println();
        System.out.println("Wypisywanie zbioru");
        for (int elementZbioru : zbior) {
            System.out.println(elementZbioru + ", ");
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