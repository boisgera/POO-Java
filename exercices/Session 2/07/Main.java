public class Main{
    public static void main(String[] args){

        String grade1 = Grade.gradeToLetter(18);
        String grade2 = Grade.gradeToLetter(16.5);
        String grade3 = Grade.gradeToLetter(14);
        String grade4 = Grade.gradeToLetter(12.4);
        String grade5 = Grade.gradeToLetter(9.5);
        String grade6 = Grade.gradeToLetter(7);
        String grade7 = Grade.gradeToLetter(2);
        System.out.println("Note 1 : "+grade1);
        System.out.println("Note 2 : "+grade2);
        System.out.println("Note 3 : "+grade3);
        System.out.println("Note 4 : "+grade4);
        System.out.println("Note 5 : "+grade5);
        System.out.println("Note 6 : "+grade6);
        System.out.println("Note 6 : "+grade7);
    }   
}