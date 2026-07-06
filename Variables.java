public class Variables {
    public static void main(String[] args){

        // String 
            String name = "Ravi";
            System.out.println("Hello " + name);

        // Integer
            int age = 20;
            System.out.println("My age is " + age);

            int myNum;
            myNum = 15;
            System.out.println(myNum);

            int Num = 15;
            Num = 20;  // overwrite 
            System.out.println(Num);

            final int Numm = 15; // use final keyword to declare a constant variable
            // Numm = 20; // This would cause a compile-time error
            System.out.println(Numm);


        // Other Types

        int number = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }
}
