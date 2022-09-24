import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fordit ff = new Fordit();

        System.out.println("Choose between HUN/ESP/JAP languages! (Default is Hungarian)");
        ff.nyelv = scanner.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("Nev: ");
        ff.nev = scanner.nextLine();

        ff.fordit();

    }
}
