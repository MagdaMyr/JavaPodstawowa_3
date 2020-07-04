package pl.sda.javawwa30;

import java.util.Scanner;

public class StworzenieMetody {

    public static void main(String[] args) {
        printRandomNumForUserInput();
    }

    //metoda ktora losuje liczbe z podanego zakresu
    // /** + ENTER daje szablon dokumentacji
    /**
     * Gets random number of type int for given scope.
     *
     * @param min - min number to be generated
     * @param max - max number to be generated
     * @return - random number of type int in given scope
     */
    public static int getRandomNum(int min, int max) {
        return (int)(Math.random() * (max - min)) + min;
    }

    public static void printRandomNumForUserInput() {
        int min = getIntValueFromUserInput("Podaj wartosc MIN: ");
        int max = getIntValueFromUserInput("Podaj wartosc MAX: ");
        int randomNum = getRandomNum(min, max);
        System.out.println(String.format("rand(%d, %d) = %d", min, max, randomNum));
    }

    public static int getIntValueFromUserInput(String text) {
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
