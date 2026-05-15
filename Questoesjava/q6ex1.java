package Questoesjava;

/*public class q6ex1 {
    public static void main(String[] args) {
        int a = 0;
int b = 1;

for (; a <= 100;) {
    System.out.println(a);

    int proximo = a + b;
    a = b;
    b = proximo;
}
    }
} */

    public class q6ex1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        while (a <= 100) {
            System.out.println(a);

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    } 
}
