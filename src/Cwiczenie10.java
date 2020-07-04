/* Napisz metode max3, która sposrod 3 przekazanych jej argumentow typu int wybiera najwieksza liczbe.
Nastepnie utwórz tablice zawierajaca 9 elementow i wykorzystaj petle for oraz zdefiniowane wlasnie metody statyczne aby
wyznaczyc najwieksz element tej tablicy
*/

public class Cwiczenie10 {
    public static void main(String[] args) {
        int[] tab = new int[9];
        for (int i = 0; i < tab.length; i++) {
            //zawolanie metody statycznej zdefiniowanej w innej klasie
            tab[i] = pl.sda.javawwa30.StworzenieMetody.getRandomNum(-1000, 1000);
        }
        System.out.println("Elementy tabeli: ");
        for (int e : tab)
            System.out.print(e + ", ");

        System.out.println();
        int[] maxOfMax = new int[3];
        for (int i = 0; i < tab.length; i += 3) { // i = 0, 3, 6
            maxOfMax[i / 3] = max3(tab[i], tab[i + 1], tab[i + 2]);  // 0 _>0, 3->1, 6 ->2
        }

        System.out.println("Max value = " + max3(maxOfMax[0], maxOfMax[1], maxOfMax[2]));
    }

    // ternary operator (warunek) ? true : false
    public static int max3(int a, int b, int c) {
        int temp = a > b ? a : b;
        return c > temp ? c : temp;
    }
}
