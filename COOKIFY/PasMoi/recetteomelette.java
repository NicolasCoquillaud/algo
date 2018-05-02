
public class recetteomelette {
	public static void main( String[] args ) {


System.out.println("🍲 Omelette à la truffe 🍲");

int ingredientNumber=4;
int peopleNumber=4;

int[] ingredientQ = new int [ingredientNumber] ;
String[] ingredient = new String [ingredientNumber] ;

 ingredientQ[0]=4;
 ingredient[0] = "oeufs(8)";

 ingredientQ[1]=2;
 ingredient[1] = "verre de lait(1)";

 ingredientQ[2]=1;
 ingredient[2] = "truffe(1)";

 ingredientQ[3]=1;
 ingredient[3] = "pincée de sel(1)";

for(int i=0 ; i<ingredientNumber ; i++ ) {
	System.out.println(ingredient[i]);
}
System.out.println(" ");
System.out.println("battre les oeufs et ajouter le "+ingredient[1]);
System.out.println("Dans une grande poêle antiadhésive verser la  "+ingredient[3]+"et laisser chauffer à feu moyen.");
System.out.println("ajouter la "+ingredient[2]+" et la "+ingredient[3]+"et laisser mijoter à feu doux encore 5mn.");
System.out.println("voilà c'est prêt");





}





}