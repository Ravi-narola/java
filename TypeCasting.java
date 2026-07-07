public class TypeCasting {
    public static void main(String[] args){
        
            // Implicit Casting (automatically) - converting a smaller type to a larger type size

                int myInt = 9;
                double myDouble = myInt; // Automatic casting: int to double

                System.out.println(myInt);      // Outputs 9
                System.out.println(myDouble);   // Outputs 9.0

        // Narrowing Casting

            double myDouble2 = 9.78d;
            int myInt2 = (int) myDouble2; // Manual casting: double to int

            System.out.println(myDouble2);  // Outputs 9.78
            System.out.println(myInt2);     // Outputs 9

            // Narrowing Casting Example

                int maxScore = 500;
                int  userScore = 450;

                double percentage = (double) userScore / maxScore * 100.0d;
                System.out.println("User Percentage: " + percentage + "%"); 
    }
}
