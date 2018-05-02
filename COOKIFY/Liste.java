import java.util.Scanner;

public class Liste {
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);

    String[] Ingredients = {"Steak haché","Cornichon","Jaune d'œuf","Moutarde","Huile d'olive","Worcestershire","sel","poivre"};
    double[] Prix = {3,2,2.5,1,5,2.4,0.6,3};
    double PrixTotal = 0;
    float[] Quantité = {1,5,1,1,1,1,1,1};
    int Temps = 20;
    int NombreIngredients = Ingredients.length;

    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCOOKIFY\nVotre chef personel\n\n-=-=-=-=-=-Tartare-=-=-=-=-=-\n");
    System.out.println("Nombre d'ingredients : " + NombreIngredients + "\nTemps de préparation : " + Temps);
    if ((Temps < 30) && (NombreIngredients < 5)){
      System.out.println("Difficulté : Facile\n");
    }
      else if ((Temps <= 60) && (NombreIngredients <= 10)){
        System.out.println("Difficulté : Moyenne\n");
      }
        else {
        System.out.println("Difficulté : Difficile\n");
        }
    int maxLengthItem = 0;
    boolean firstValue = true;
    for (String Ingredient : Ingredients) {
        maxLengthItem = (firstValue) ? Ingredient.length() : Math.max(maxLengthItem, Ingredient.length());
        firstValue = false;
    }
    for (int i = 0; i < Ingredients.length; i++) {
        String format1 = "%-" + Integer.toString(maxLengthItem) + "s \t\t x%1.0f %9.2f€\n";
        System.out.printf("* "+format1, Ingredients[i], Quantité[i], Prix[i]);
    }

    for(double i:Prix){
      PrixTotal += i;
    }
    String format2 = "%40.2f€\n";
    System.out.printf("TOTAL"+format2,PrixTotal);
    System.out.println("\n\t\t\t\t\tAppuyez sur ENTRER pour continuer...");try{System.in.read();}catch(Exception e){}
    System.out.println("1. Détailler le steak en morceaux et le passer au hachoir à viande\n2. Hacher finement quelques cornichons\n3. Dans un cul de poule, placer le jaune d'œuf\n4. Ajouter 1/2 cuillère à café de moutarde\n5. Saler et poivrer\n6. Ajouter 5cl d'huile d'olive et monter la préparation au fouet\n7. Ajouter le steak haché et les cornichons\n8. Ajouter la sauce Worcestershire et bien mélanger le tout");
  }
}
