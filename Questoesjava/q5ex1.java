package Questoesjava;

/*public class q5ex1 {
    public static void main(String[] args) {
       for (int i = 1; i <= 20; i++) {
    long fatorial = 1;

    for (int j = 1; j <= i; j++) {
        fatorial *= j;
    }

    System.out.println(i + "! = " + fatorial);
        }
    }
} */

public class q5ex1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            long fatorial = 1;
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
