public class ArraysDemo {

    public static void main(String[] args) {
        //1. deklaracja tablicy
        int[] intArr;
        //2. inicjalizacja tablicy - odwolujemy sie do zmiennej tablicowej
        intArr = new int[10];
        //3. deklaracja + inicjalizacja
        int[] biggerIntArr = new int[20];

        //4. wyswietl elementy tablicy - enhanced for loop, inaczej for-each
        System.out.println("Wyswietlam kolejne elementy tablicy 'intArr': ");
        for(int arrEl : intArr) {
            System.out.println(arrEl);
        }
        System.out.println("Koniec elementow tablicy 'intArr'");

        //5. przypisanie wartosci do tablicy
        //a. korzystajac z petli, np. stale, wartosci losowe, wartosci policzone wg wzoru
        //tab.length - pozwala odczytac wielkosc tablicy
        for(int i = 0; i < intArr.length; i++) {
            //intArr[i] = 7; //wartosc stala
            //intArr[i] = (int)(Math.random() * 100); //Math.random() zwraca double od 0.0 do 1.0; teraz bedzie int od 0 do 100
            intArr[i] = 3*i*i + 5*i - 60;   //wg wzoru rownania kwadratowego
        }
        //tablica zmienila wartosci elementow:
        System.out.println("Wyswietlam kolejne elementy tablicy 'intArr': ");
        for(int arrEl : intArr) {
            System.out.println(arrEl);
        }
        System.out.println("Koniec elementow tablicy 'intArr'");
        //b. statyczna inicjalizacja
        int[] myFavNums = {7, 3, 90, 14};
        System.out.println("Wyswietlam kolejne elementy tablicy 'myFavNums': ");
        for(int arrEl : myFavNums) {
            System.out.println(arrEl);
        }
        System.out.println("Koniec elementow tablicy 'myFavNums'");

        //zmien wartosc okreslonego elementu tablicy
        //np. 3ciego el tablicy myFavNums
        myFavNums[2] = 11;
        System.out.println("Wyswietlam kolejne elementy tablicy 'myFavNums': ");
        for(int arrEl : myFavNums) {
            System.out.println(arrEl);
        }
        System.out.println("Koniec elementow tablicy 'myFavNums'");

        //zamienic ostatnie el tablicy intArr na el znajdujace sie w tablicy myFavNums
        intArr[9] = myFavNums[3];
        intArr[8] = myFavNums[2];
        intArr[7] = myFavNums[1];
        intArr[6] = myFavNums[0];
        System.out.println("Wyswietlam kolejne elementy tablicy 'intArr': ");
        for(int arrEl : intArr) {
            System.out.println(arrEl);
        }
        System.out.println("Koniec elementow tablicy 'intArr'");
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = 0;
        }
        //zamieniajac to na petle; 10 - 4 = 6
        for(int i = intArr.length - myFavNums.length, k = 0; //dwa iteratory/warunki poczatkowe
            i < intArr.length;
            i++, k++) {
            intArr[i] = myFavNums[k];
        }
        System.out.println("Wyswietlam kolejne elementy tablicy 'intArr': ");
        for(int arrEl : intArr) {
            System.out.println(arrEl);
        }
        System.out.println("Koniec elementow tablicy 'intArr'");
    }

}