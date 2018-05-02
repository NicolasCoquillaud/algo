/*
Sarah BONOSE
Jérémy QUINTON
Nicolas COQUILLAUD
*/

import java.util.Scanner;
public class Menu {


              //Tartare
              public static void Tartare(){
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
                int maxLengthItem = 0; //Alignement des Ingredients/Quantités/Prix
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
                System.out.println("\n\t\t\t\t\tAppuyez sur ENTRER pour continuer...");try{System.in.read();}catch(Exception e){}
              }

              //Paella
              public static void Paella() {
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

              System.out.println("\n\t\t\t\t\tAppuyez sur ENTRER pour continuer...");try{System.in.read();}catch(Exception e){}

              }

              //Omelette
              public static void Omelette() {


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

              //Créer recettes
              public static void Créateur() {

              	Scanner keyboard = new Scanner(System.in);
              	int NombreIngr ;
              	int NombreEtapes ;
              	int TotalCalories = 0 ;


              	System.out.print( "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCombien d'ingrédients différents ? : " );
              	NombreIngr = keyboard.nextInt();

              	String[] Ingr = new String [NombreIngr];
              	int[] IngrQ = new int [NombreIngr];
              	int[] IngrK = new int [NombreIngr];

               	for(int i=0; i < NombreIngr; i++){
               		System.out.println();

              		System.out.print( "Ingrédients "+(i+1)+" : " );
              		keyboard.nextLine();
              		String IngrEnter = keyboard.nextLine();
              		Ingr[i] = IngrEnter ;
              		System.out.print( "Calories de l'ingrédients : " );
              		IngrK[i] = keyboard.nextInt();
              		System.out.print( "Quantité : " );
              		IngrQ[i] = keyboard.nextInt();
              	}
              	System.out.println();
              	System.out.println();



              	System.out.print( "Combien d'Étapes pour votre recette ? : " );
              	NombreEtapes = keyboard.nextInt();
              	keyboard.nextLine();

              	String[] Etape = new String [NombreEtapes] ;

              	for(int i=0; i < NombreEtapes; i++){
               		System.out.println();

               		System.out.print( "Étape "+(i+1)+" : " );
              		String EtapesEnter = keyboard.nextLine();
              		Etape[i] = EtapesEnter ;
               	}
              	System.out.println();
              	System.out.println();

                System.out.println("~~~~ Ingrédients ~~~~") ;
              	for(int i=0; i < NombreIngr; i++){
              		System.out.println(IngrQ[i]+" x "+Ingr[i]);
              		TotalCalories = TotalCalories+IngrK[i]*IngrQ[i] ;
              	}
              	System.out.println();
              	System.out.println("~~~~ Recette ~~~~") ;
              	for(int i=0; i < NombreEtapes; i++){
              		System.out.println((i+1)+") "+Etape[i]);
              	}



              	System.out.println();
              	System.out.println("Calories du plat : "+TotalCalories);
              	System.out.println();
              	if (TotalCalories < 500) {System.out.println("Vous risquer d'avoir faim après ce repas");}
              	if (TotalCalories > 500 && TotalCalories < 1000) {System.out.println("c'est un bon repas");}
              	if (TotalCalories > 1000) {System.out.println("c'est beaucoup, attention aux yeux plus gros que le ventre");}
              	System.out.println();

                System.out.println("\n\t\t\t\t\tAppuyez sur ENTRER pour continuer...");try{System.in.read();}catch(Exception e){}

              }




  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);

    int loop = 1;
    int choix;

    while(loop == 1){ //Menu principal
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCOOKIFY\nVotre chef personel\n\n-=-=-=-=-=-Menu principal-=-=-=-=-=-\n");
      System.out.println("1. Recettes du chef\n2. Mes recettes (NON FAIT)\n3. Créer une nouvelle recette\n4. Calculer mon indice de santé\n0. Quitter\n");
      System.out.print("Choix : ");
      choix = keyboard.nextInt();
      switch (choix){
        case 0: //Quitter
        loop = 0;
        break;
        case 1: //Aller à "Recette du chef"
        loop = 11;
        while(loop == 11){ //Recette du chef
          System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCOOKIFY\nVotre chef personel\n\n-=-=-=-=-=-Recette du chef-=-=-=-=-=-\n");
          System.out.println("1. Tartare\n2. Paella\n3. Omelette aux truffes\n0. Revenir au menu principal\n");
          System.out.print("Choix : ");
          choix = keyboard.nextInt();
          switch (choix){
            case 0: //Revenir
            loop = 1;
            break;
            case 1: //Aller à "Tartare"
            Tartare();
            loop = 1;
            break;
            case 2: //Aller à "Paella"
            Paella();
            loop = 1;
            break;
            case 3: //Aller à "Omelette aux truffe"
            Omelette();
            loop = 1;
            break;
          }
        }
        break;
        case 2: //Aller à "Mes recettes"
        System.out.print("2");
        break;
        case 3: //Aller à "Créer une nouvelle recette"
        Créateur();
        break;
        case 4: //Aller à "Calculer mon indice de santé"
        double Poids, Taille, BMI;
        String C;

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCOOKIFY\nVotre chef personel\n\n-=-=-=-=-=-Menu principal-=-=-=-=-=-\n");
        System.out.print("Quel est votre poids (en kilogramme) ? ");
        Poids = keyboard.nextDouble();
        System.out.print("Quelle est votre taille (en mètre) ? ");
        Taille = keyboard.nextDouble();

        BMI = Poids / Math.pow(Taille,2);

        System.out.println("\nVotre indice de santé est de : "+BMI);

        if (BMI < 16.5){
          System.out.println("Vous êtes en sous-nutrition\n");
        }
        if ((16.5 <= BMI) && (BMI < 18.5)){
          System.out.println("Vous êtes mince\n");
        }
        if ((18.5 <= BMI) && (BMI < 25)){
          System.out.println("Vous avez une corpulence normale\n");
        }
        if ((25 <= BMI) && (BMI < 30)){
          System.out.println("Vous êtes en surpoids\n");
        }
        if ((30 <= BMI) && (BMI < 35)){
          System.out.println("Vous êtes en surpoids modéré\n");
        }
        if ((35 <= BMI) && (BMI < 40)){
          System.out.println("Vous êtes en surpoids sévère\n");
        }
        if (40 <= BMI){
          System.out.println("Vous avez une obésité morbide\n");
        }
        System.out.println("\t\t\t\t\tAppuyez sur ENTRER pour continuer...");try{System.in.read();}catch(Exception e){}
        break;
      }
    }
  }
}
