import java.util.Scanner;
/** This program will ask the user for their number grade and then give them a letter grade
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
   public static void examGrade(){
     Scanner input = new Scanner (System.in);
    System.out.println("Please enter your number grade");
    int grade = input.nextInt(); 
    if (grade <= 50){
      System.out.println("F");
    } else if (grade <= 59){
      System.out.println("D");
    } else if (grade <= 69){
      System.out.println("C");
    } else if (grade <= 79){
     System.out.println ("B");
    } else if (grade <=100){
      System.out.println("A");
    }
       
       }
     
   


  public static void main(String[] args) {
    // TODO code application logic here
     
   examGrade();
  }
}