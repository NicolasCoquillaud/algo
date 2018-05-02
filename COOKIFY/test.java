import java.util.Scanner;

public class test {
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);
    String name;
    char reponse;

    do{
      System.out.println("Whats your name ?");
      name = keyboard.nextLine();
      System.out.println("Hello"+name+", how is going ?");
      System.out.println("Try again ? (Y/N)");
      reponse = keyboard.nextLine().charAt(0);
    }while (reponse == 'Y');
    System.out.println("Au revoir !");
  }
}
