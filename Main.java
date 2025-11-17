import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.println("EVEN OR ODD VERIFIER");
        System.out.println();
        
        boolean shouldContinue = false;
        do {
            int myNum;
            String fakeNum = "";
            while(true) {
                try {
                    while(fakeNum.isEmpty()) {
                        System.out.print("Enter a number: ");
                        fakeNum = input.nextLine().trim();

                        if(fakeNum.isEmpty()) {
                            System.out.println();
                            System.out.println("Please, make sure to digit something.");
                            System.out.println();
                        } 
                    }
                
                    myNum = Integer.parseInt(fakeNum);
                    break;
                } catch(NumberFormatException e) {
                    System.out.println();
                    System.out.println("Please, make sure to digit only numbers.");
                    System.out.println();
                    fakeNum = "";
                    continue;
                }
            }
            

            if(myNum % 2 == 0) {
                System.out.println(myNum + " is EVEN");
            } else {
                System.out.println(myNum + " is ODD");
            }

            while(true) {
                System.out.print("Do you want to continue? [S/N] ");
                String answer = input.nextLine().trim();
                System.out.println();
                if(answer.equalsIgnoreCase("s")) {
                    shouldContinue = true;
                    break;
                } else if(answer.equalsIgnoreCase("n")) {
                    shouldContinue = false;
                    System.out.print("Program finished. Thanks for playing!");
                    System.out.println();
                    break;
                } else {
                    System.out.println("Invalid input. Please, follow the rules.");
                }
            }    
        } while(shouldContinue);    
    }
}