public class StringPlayground {

    public static void main(String[] args) {
        String s = new String();    //""
        char[] chars = {'O', 'l', 'i', 'w', 'i', 'a'};
        String s1 = new String(chars);  //"Oliwia"
        String s2 = "Przemek";
        String s3 = new String(s2); //"Przemek"
        s2 = s2.replace('P', 'Z');
        System.out.println(s2 + " vs " + s3);

        String someSentence = "Lubie jesc frytki z McD";
        boolean containsMcD = someSentence.contains("McD");
        System.out.println(containsMcD);
        String companyName = someSentence.substring(20);
        System.out.println(companyName);
        System.out.println(someSentence.toUpperCase());

        //comparison - porownanie
        System.out.println("Ada".compareTo("Ewa"));
        //-1 -> "Ada" < "Ewa" ---> ten wynik
        //0 -> ==
        //1 -> "Ada" > "Ewa"

        //StringBuilder dla optymalizacji
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            stringBuilder.append(i);
            //someSentence += i
        }
        System.out.println(stringBuilder.toString());
    }

}

