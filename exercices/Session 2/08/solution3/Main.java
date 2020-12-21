public class Main{
    public static void main(String[] args) {
        try{
            FizzBuzz.showSequence(6);
            FizzBuzz.showSequence(20);
            FizzBuzz.showSequence(-20);
        }catch(SaisieErroneeException e)
        {
            String s = "\nUne exception de type SaisieErroneeException a été levée.\nLe message est : ";
            s = s + e.getMessage()+"\n";
            System.out.println(s);
            System.out.println("Ci-dessous la pile d'appels :");
            e.printStackTrace();
        }
    }   
}
