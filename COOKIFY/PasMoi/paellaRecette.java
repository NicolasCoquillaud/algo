public class paellaRecette {
public static void main( String[] args ) {
int peopleNumber = 4;
float totalQuantity = 0f;

String[] ingredient = {"le riz (500g)","les fruits de Mer (500g)","une cuisses de poulet","Le chorizo","les tomates","les Oignons","les gousses d'ails","les poivrons","Le boullion","Le safran"} ;
float[] ingredientQuantity = {1,2,2,1,4,2,2,2,1,1} ;
float[] prix = {5,10,7,3,2.5f,1.5f,0.9f,0.8f,2,4} ;
float PrixTotal = 0;

System.out.println(" ");
System.out.println("☞  PAELLA POUR 8 PERSONNES  ☜");
System.out.println(" ");
System.out.println(" ");
System.out.println("~~~~ Ingrédients ~~~~") ;
System.out.println(" ");

	int maxLengthItem = 0;
    boolean firstValue = true;
    for (String Ingredient : ingredient) {
        maxLengthItem = (firstValue) ? Ingredient.length() : Math.max(maxLengthItem, Ingredient.length());
        firstValue = false;
    }
    for (int i = 0; i < ingredient.length; i++) {
        String format1 = "%-" + Integer.toString(maxLengthItem) + "s \t\t x%1.0f %9.2f€\n";
        System.out.printf("* "+format1, ingredient[i], ingredientQuantity[i], prix[i]);
    }
    for(int i = 0; i < ingredient.length; i++) {
      PrixTotal = PrixTotal+ingredientQuantity[i]*prix[i];
    }
		String format2 = "%40.2f€\n";
    System.out.printf("Prix Total : "+format2, PrixTotal) ;

    System.out.println("\n\t\t\t\t\tAppuyez sur ENTRER pour continuer...");try{System.in.read();}catch(Exception e){}

System.out.println(" ");
System.out.println("~~~~ Recette ~~~~");
System.out.println(" ");

System.out.println("Faire revenir "+ingredient[0]+" avec "+ingredient[5]+" et "+ingredient[7]+" dans l'huile d'Olive.");
totalQuantity = totalQuantity+ingredientQuantity[5]+ingredientQuantity[7] ;

System.out.println("Faire revenir "+ingredient[2]+" et "+ingredient[3]+" pendant 10 min");
totalQuantity = totalQuantity+ingredientQuantity[2]+ingredientQuantity[3] ;

System.out.println("Rajouter "+ingredient[4]+" et laisser mijoter");
totalQuantity = totalQuantity+ingredientQuantity[4] ;

System.out.println("Mettre "+ingredient[2]+" et le faire revenir pendant 10 min");
totalQuantity = totalQuantity+ingredientQuantity[2] ;

System.out.println("Rajouter "+ingredient[8]+" et attendre 20 minutes à feu doux");
totalQuantity = totalQuantity+ingredientQuantity[8] ;

System.out.println(" ");
}
}
