import java.util.Scanner;

public class Tartare {
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);

    String ingredient1="Steak haché";
    int ingredient1_Q=1;
    String ingredient2="Échalote";
    int ingredient2_Q=2;
    String ingredient3="Cornichon";
    int ingredient3_Q=5;
    String ingredient4="Jaune d'œuf";
    int ingredient4_Q=1;
    String ingredient5="Cuillère à café de moutarde";
    int ingredient5_Q=1;
    String ingredient6="Cuillère à soupe d'huile d'olive";
    int ingredient6_Q=3;
    String ingredient7="Trait de sauce Worcestershire";
    int ingredient7_Q=1;
    String ingredient8="Cuillère à soupe de ketchup";
    int ingredient8_Q=1;
    String ingredient9="Cuillère à café de Tabasco";
    int ingredient9_Q=1;
    String ingredient10="Pincée de sel";
    int ingredient10_Q=2;
    String ingredient11="Pincée de poivre";
    int ingredient11_Q=1;

    System.out.println("\n\n\nCOOKIFY\n\n");
    System.out.println("Recette : \"Tartare\" pour 1 personne\n");
    System.out.println("Ingredients :\n");
    System.out.println("* "+ingredient1+"                        x"+ingredient1_Q);
    System.out.println("* "+ingredient2+"                           x"+ingredient2_Q);
    System.out.println("* "+ingredient3+"                          x"+ingredient3_Q);
    System.out.println("* "+ingredient4+"                        x"+ingredient4_Q);
    System.out.println("* "+ingredient5+"        x"+ingredient5_Q);
    System.out.println("* "+ingredient6+"   x"+ingredient6_Q);
    System.out.println("* "+ingredient7+"      x"+ingredient7_Q);
    System.out.println("* "+ingredient8+"        x"+ingredient8_Q);
    System.out.println("* "+ingredient9+"         x"+ingredient9_Q);
    System.out.println("* "+ingredient10+"                      x"+ingredient10_Q);
    System.out.println("* "+ingredient11+"                   x"+ingredient11_Q);
  }
}
