import javax.swing.JFrame;
import java.util.Scanner;
class Runner {
  public static void main(String[] args) {
    int skyChoice = 0, selection = 0;
    //takes in user selection of which sky and season.
    Scanner input = new Scanner(System.in);
    System.out.println("What sky would you like\n1.Morning\n2.Night");
    skyChoice = input.nextInt();
    System.out.println("What season would you like\n1.Winter\n2.Fall\n3.Spring/Summer");
    selection = input.nextInt();
    
    MyPanel c = new MyPanel(skyChoice, selection);
    JFrame frame = new JFrame("Thing");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(c);
    frame.pack();        
    frame.setVisible(true);	
   	
  }
}
