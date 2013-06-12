import java.io.Console;
import java.util.*;

public class Iloczyn {

    public static void main(String[] args) {
        int x, i, e, a;
        Scanner sc = new Scanner(System.in);
        List<Integer> liczby = new ArrayList<Integer>();
        List<Integer> nowaLiczba = new ArrayList<Integer>();

//pobierz wartosc od uzytkownika
        System.out.println("Podaj wartosc x");
        x = Integer.parseInt(sc.next());


//rozloz na czynniki pierwsze
        System.out.print("Czynniki pierwsze liczby " + x + " to:");
        i = 2;
        e = (int)(Math.sqrt(x));
        while (i <= e) {
            while ((x % i) == 0) {
                x /= i;
                e = (int)(Math.sqrt(x));
                System.out.print(" " + i);
                liczby.add(i);
            }
            i++;
        }
        if (x > 1) System.out.print(" " + x);
        liczby.add(x);
//        System.out.println("czynników jest " + liczby.size());

        a=0;
        while (a <= 9){

          }
        }
}
