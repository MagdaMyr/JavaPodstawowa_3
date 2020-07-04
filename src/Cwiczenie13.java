/* Palindrom to wyrazenie brzmiace tak samo, kiedy jest czytane zarówno od lewej do prawej, jak i od prawej do lewej
np. "kobyła ma mały bok". Napisz program, ktory sprawdza czy dane zdanie jest palindromem. Przechowaj w postaci tablicy
kilka zdan, w tym palindormow (przykladowe tutaj: -->> wikipedia - palindrom polski), a nastepnie wyswietl dla
kazdego z nich informacje, czy jest palindromem.
 */

public class Cwiczenie13 {

    public static void main(String[] args) {
        String[] sentences = {
                "zdanie ktore jest normalne",
                "a to idiota",
                "inne zdanie ktore nie jest palindromem",
                "ada baluje Jula bada",
                "my to pili po tym",
                "jakies tam inne zdanie",
                "wół utył i ma miły tułów"
        };

        for(String s : sentences) {
            System.out.println(s + " - " + isPalindrome(s));
        }
    }

    public static boolean isPalindrome(String str) {
        //nalezy usunac biale znaki
        str = str.replace(" ", ""); //zamien spacje na brak spacji
        char[] strChars = str.toCharArray();
        char[] strCharsRev = new char[strChars.length];
        //tworzy tablice znakow odwrocona wzgledem orygianalnego
        for(int i = 0; i < strChars.length; i++) {
            strCharsRev[i] = strChars[strChars.length - 1 - i];
        }
        //tulow
        //i = 0 -> 5-1-0=4 => w
        //i = 1 -> 5-1-1=3 => o
        //i = 2 -> 2 => l
        //i = 3 -> 1 => u
        //i = 4 -> 0 => t

        //aby porownac teksty, utworzyc nowy obiekt String na bazie odwroconych tekstow i porownac LOGICZNIE
        //poprzez metode .equals() a nie == (porownuje referencje - miejsce w pamieci)
        String rev = new String(strCharsRev);
        //porownaj, ale olej wielkosc liter
        return rev.equalsIgnoreCase(str); //true jesli takie same znak do znaku => palindrom
    }

}
