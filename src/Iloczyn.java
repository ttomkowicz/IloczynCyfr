import java.util.*;

import static java.util.Collections.*;

public class Iloczyn {

    public static void main(String[] args) {
        int x, i, e;
        boolean dobraLiczba = true; // Liczba jest dobra, kiedy wszystkie czynnki są mniejsze lub równe 9
        Scanner sc = new Scanner(System.in);
        List<Integer> czynniki = new ArrayList<Integer>();
        List<Integer> nowaLiczba = new ArrayList<Integer>();

        System.out.println("Podaj wartosc x");
        x = Integer.parseInt(sc.next());

// Rozklad liczby na czynniki pierwsze
        System.out.print("Czynniki pierwsze liczby " + x + " to:");
        i = 2;
        e = (int)(Math.sqrt(x));
        while (i <= e) {
            while ((x % i) == 0) {
                x /= i;
                e = (int)(Math.sqrt(x));
                System.out.print(" " + i);
                czynniki.add(i);
            }
            i++;
        }
        if (x > 1) System.out.print(" " + x);
        czynniki.add(x);
// Testowe wypisanie zawartości tablicy czynników
        System.out.println();
        for (Integer inte : czynniki){
            System.out.print(" "+inte.toString());
        }
// Sprawdzenie, czy liczbę da się zabisać jako iloczyn cyfr (czy wszystkie czynniki sa mniejsze niż 9)
        for (int n=0; n < czynniki.size(); n++){
            if (czynniki.get(n) > (Integer)9) {
                dobraLiczba = false;
                break;
            }
        }
        System.out.println("\n" + dobraLiczba);
// Scalenie tablicy czynników
// Np. trzy czynniki 2, 2, 2 trzeba zapisać jako 8, bo 8 < 222
        if (dobraLiczba){
            int temp = czynniki.get(0);
            for (int y=0; y<czynniki.size()-2; y++){
                if (temp*czynniki.get(y+1) > 9){
                    nowaLiczba.add(temp);
                    temp = czynniki.get(y+1);
                    }
                else {
                    temp *= czynniki.get(y+1);
                }
            }
            nowaLiczba.add(temp);

            if (temp*czynniki.get(czynniki.size()-1) <= 9){
                nowaLiczba.set(nowaLiczba.size()-1, temp*czynniki.get(czynniki.size()-1));
            }
            else nowaLiczba.add(czynniki.get(czynniki.size()-1));

            sort(nowaLiczba);
            System.out.println();
            for (Integer inte : nowaLiczba){
                System.out.print(" "+inte.toString());
            }
        }
        else {
            System.out.println(0);
        }

    }
}
