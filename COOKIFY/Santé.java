import java.util.Scanner;

public class Santé {
  public static void main(String[]args){
    Scanner keyboard = new Scanner(System.in);

    double Poids, Taille, BMI;

    System.out.println("\n\n\nCOOKIFY\n\n");
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
  }
}
