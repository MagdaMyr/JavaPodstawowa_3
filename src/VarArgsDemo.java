import java.util.Scanner;

public class VarArgsDemo {
    public static void main(String[] args) {
        System.out.println("Podaj po przecinku zbior liczb, dla ktorych chcesz wyznaczyc srednia artymetyczna: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //"100,200,7,9" -> ["100", "200", "7", "9"]
        String[] numbersStr = input.split(",");
        double[] numbers = new double[numbersStr.length];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(numbersStr[i]);
        }

        double avg = calcAvg(numbers);  //mogloby byc: calcAvg(17.5, 50.0, 67.75) itd.
        System.out.println("Srednia dla podanych liczb wynosi: " + avg);
        //calcAvg(4.5, 5.0, 3.5);
        //dlugosc Stringa
        String name = "Przemek";
        int nameLen = name.length();
    }

    //Metoda liczy srednia artymetyczna dla zadanych liczb
    public static double calcAvg(double... args) {  //varargs to po prostu tablica
        double sum = 0.0;
        for(double d : args)
            sum += d;

        return sum/args.length;
    }
}
