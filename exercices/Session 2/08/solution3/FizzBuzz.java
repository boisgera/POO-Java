public class FizzBuzz {
    public static void showSequence(int i) throws SaisieErroneeException{
        if (i<=0)
            throw new SaisieErroneeException("i has to be greater than zero");
        String s = "";
        for (int k=1 ; k<=i ; k++){
            if (k%3==0)
                s+="Fizz";
            else if (k%5==0)
                s+="Buzz";
            else if (k%15 ==0)
                s+="Fizz Buzz";
            else{
                Integer k2 = k; // Pour pouvoir utiliser "toString()"
                s+=k2.toString();
            }
            if (k<i)
                s+=", ";
        }
        if (s!="")
            System.out.println(s);
    }
}