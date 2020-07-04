/* Napisz metode getLongestName(String...), ktora jako parametr przyjmuje dowolny zbior nazw reprezentowanych
przez obiekty typu String i zwraca najdluzsza sposrod nich.
Co sie stanie jesli zmienisz sygnature metody, zmieniajac typ jej parametru na String[]?
*/

public class Cwiczenie11 {

        public static void main(String[] args) {
            String text = "WIELKI RENESANS  to rewelacyjne studium  na temat Quo Vadis Sina? Bogdan Góralczyk " +
                    "prezentuje  motywy i aspiracje przywódców  Chin w dążeniu do odzyskania  „niekwestionowanej i " +
                    "należnej” pozycji   pierwszego  mocarstwa globu. Wnikliwie omawia ich strategię i taktykę  z " +
                    "określeniem głównych symbolicznych jej  etapów:  2021, 2035 i  docelowego osiągnięcia celu w 2049r." +
                    " Wyjątkową wartością  są niezwykle bogate oryginalne źródła chińskie. Są one  przedmiotem" +
                    " głębokiej, krytycznej  analizy tego wybitnego  politologa i sinologa, potrafiącego trafnie " +
                    "odczytać wieloznaczny sens słów, pojęć i określeń  powszechnie tam używanych. Atutem  tej pracy " +
                    " jest konfrontacja  prezentowanych chińskich ocen z opiniami najwybitniejszych światowych  " +
                    " badaczy. Cechą całego wywodu";
            System.out.println(getLongestName(text.split(" ")));
        }

        public static String getLongestName(String... names) {
            int[] namesLen = new int[names.length];
            for(int i = 0; i < names.length; i++) {
                namesLen[i] = names[i].length();
            }

            int longestIdx = getMaxIndex(namesLen);
            return names[longestIdx];
        }

        public static int getMaxIndex(int... vals) {
            int idx = 0;
            int temp = vals[0];
            for(int i = 1; i < vals.length; i++) {
                if(temp < vals[i]) {
                    idx = i;
                    temp = vals[i];
                }
            }
            return idx;
        }

        public static int getMax(int[] nums) {
            int max = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if(max < nums[i]) {
                    max = nums[i];
                }
            }
            return max;
        }
}