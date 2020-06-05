public class FizzBuzz {
    public static void showSequence(int i){
        for (int k=1 ; k<=i ; k++){
            if (k%3==0)
                System.out.print("Fizz");
            else if (k%5==0)
                System.out.print("Buzz");
            else if (k%15 ==0)
                System.out.print("Fizz Buzz");
            else
                System.out.print(k);
            if (k!=i)
                System.out.print(", ");
            else
                System.out.println("");
        }
    }
}