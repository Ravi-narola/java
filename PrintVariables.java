public class PrintVariables {
    public static void main(String[] args){

        // (+) used in String concatenation 
            String firstName = "John ";
            String lastName = "Doe";
            String fullName = firstName + lastName;
            System.out.println(fullName);

        // (+) used in numeric addition 
            int x = 5;
            int y = 6;
            System.out.println(x + y); 

        // Mixing Text and Numbers
            int a = 5;
            int b = 6;
            System.out.println("The sum of a and b is: " + a + b); // The sum of a and b is: 56
            System.out.println("The sum of a and b is: " + (a + b)); // The sum of a and b is: 11
    }
}
