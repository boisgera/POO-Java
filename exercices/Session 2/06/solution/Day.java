public class Day {
    public static String numberToDay(int x){
        String dayString ; 
        switch(x){
         case 1 : dayString = "Lundi" ; break ;
         case 2 : dayString = "Mardi"; break ;
         case 3 : dayString = "Mercredi"; break ;
         case 4 : dayString = "Jeudi"; break ;
         case 5 : dayString = "Vendredi"; break ;
         case 6 : dayString = "Samedi"; break ;
         case 7 : dayString = "Dimanche"; break ;
         default: dayString = "Vendremanche";
       }
       return dayString ;
    }
}