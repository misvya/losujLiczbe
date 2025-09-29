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

    }

    private static void wypisz(int[] tablica){
        System.out.println("Wypisywanie tablicy");
        for (int elementTablicy:tablica) {
            System.out.println(elementTablicy + ", ");
        }
    }
    private static int[] losujLiczbyDoTblicy(int ileLiczb){
        int[] tablicaLiczbLosowych = new int[ileLiczb];
        Random random =new Random();
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = random.nextInt(20)+1;
        }
        return tablicaLiczbLosowych;
    }
}