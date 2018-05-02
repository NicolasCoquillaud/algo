import java.util.Scanner;
public class Listeomelette {
	public static void main( String[] args ) {


String[] Ingredients = {"oeufs","verre de lait","truffe","pincée de sel"};
float[] Quantité ={8,1,1,1};
float QuantitéTotal = 0;
double[] Prix = {2,1,1,1};
double PrixTotal = 0;

System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCOOKIFY\nVotre chef personel\n\n-=-=-=-=-=-Omelette aux truffes-=-=-=-=-=-\n");


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

		System.out.println("1. Battre les oeufs et ajouter le "+Ingredients[1]);
		System.out.println("2. Dans une grande poêle antiadhésive verser la  "+Ingredients[3]+"et laisser chauffer à feu moyen");
		System.out.println("3. Ajouter la "+Ingredients[2]+" et la "+Ingredients[3]+"et laisser mijoter à feu doux encore 5mn");
		System.out.println("\n\t\t\tVoilà c'est prêt !");

		System.out.println("\n\t\t\t\t\tAppuyez sur ENTRER pour continuer...");try{System.in.read();}catch(Exception e){}

	}
}
