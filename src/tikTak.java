import java.util.Scanner;

public class tikTak {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Joueur 1 veuillez rentrez votre nom/speudo :");
    String Pla = sc.nextLine();
    System.out.println("Bienvenu " + Pla);
    System.out.println("Joueur 2 veuillez rentrez votre nom/speudo :");
    String Plb = sc.nextLine();
    System.out.println("Bienvenu " + Plb + "vous affronterez :" + Pla);


}
}
