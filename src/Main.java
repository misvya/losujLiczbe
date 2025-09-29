import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //wylosuj 10 liczb z zakresu od 1 do 20
        //tablica musi mięc rozmiar, który nie może byc póżniej zmieniony
        //może zawierać typy proste i złożone

        int[] tablicaLiczbLosowych = new int[10];
        Random random =new Random();
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = random.nextInt(20)+1;
        }


        //wypisz wylosowane liczby na ekranie
        System.out.println("Wypisywanie tablicy");
        for (int elementTablicy:tablicaLiczbLosowych) {
            System.out.println(elementTablicy + ", ");
        }
    }
}