package Questoesjava;

/*public class q4ex1 {
    public static void main(String[] args) {
       for (int i = 1; i <= 10; i++) {
    int fatorial = 1;

    for (int j = 1; j <= i; j++) {
        fatorial *= j;
    }

    System.out.println(i + "! = " + fatorial);
        }
    }
}*/

public class q4ex1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int fatorial = 1;
            int j = 1;

            while (j <= i) {
                fatorial *= j;
                j++;
            }

            System.out.println(i + "! = " + fatorial);
            i++;
        }
    }
}   
