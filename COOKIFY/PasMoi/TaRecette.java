import java.util.Scanner;

public class TaRecette {
public static void main( String[] args ) {

	Scanner keyboard = new Scanner(System.in);
	int NombreIngr ;
	int NombreEtapes ;
	int TotalCalories = 0 ;
	

	System.out.print( "Combien d'ingrédients différents ? : " );
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

}
}