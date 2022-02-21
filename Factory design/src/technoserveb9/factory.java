package technoserveb9;
import java.util.*;
import java.security.*;
public class factory {

    public static void main(String args[]) {
        
        
            try
            {
            Scanner sc = new Scanner(System.in);
            foodfactory ff = new foodfactory();
             Food f = ff.getFood(sc.nextLine());
            System.out.println("The factory returned " + f.getClass());
            System.out.println(f.getType());
      
        }
            catch(NullPointerException e)
            {
            System.out.println("doesnot exists");
    }
    }


}
