
import java.util.*;
public class DecToBin {

    
    public static void main(String[] args) {
        int decNum;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        decNum = x.nextInt();
        int rem;
        String bin = "";
        if(decNum==0){
            bin=String.valueOf(decNum);
        }
        while(decNum>0){
            rem = decNum %2;
            bin = rem+bin;
            decNum = decNum / 2;
            
            
        }
        System.out.println("The number in binary coding is: " + bin);
        
        
        
        
        
        
        
        
    }
    
}
