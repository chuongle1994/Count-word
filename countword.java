import java.util.Scanner;
public class countword {
    public static void main(String[] args){
        String str;
        try (Scanner count = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            str = count.nextLine();
        }
        int countword = str.split("\\s+").length;
        System.out.println("Word count: "  +countword);
        
    }

    
}
