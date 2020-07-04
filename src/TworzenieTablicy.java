public class TworzenieTablicy {
    public static void main(String[] args) {
        int[] tabA = {1, 2, 3, 4, 5};
        int[] tabB = {10, 20, 30, 40, 50};

        //zamienic miejscami
        for (int i = 0; i < tabA.length; i++) {
            int temp = tabA[i];
            tabA[i] = tabB[i];
            tabB[i] = temp;
        }
            System.out.println("Elementy tabA po zamianie: ");
        for(int a : tabA) {
            System.out.println(a);
        }
        System.out.println("Elementy tabB po zmanie: ");
        for(int a : tabB){
            System.out.println(a);
        }
        int[] tabC = new int[10];
        //utworzyc tablice zbiorcza - prosty sposob i czytelny
        for(int i =0; i <tabA.length; i++){
            tabC[i*2] = tabB[i]; // 0, 2,4,6,8
            tabC[i*2 +1] =  tabA[i]; // 1,3,5,7,9
        }
    }
}
