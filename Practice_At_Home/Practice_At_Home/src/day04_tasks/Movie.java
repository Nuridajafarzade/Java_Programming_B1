package day04_tasks;

public class Movie {
    public static void main(String[] args) {
  String name= "The Prestige" ;
  String genre = "Science fiction";
String duration= "2h 10m";
int releaseData =2006;
boolean isASequelsOrNot= false;
int rottentomTomatoesRating=76;
boolean isOnDvd= true;
double rating = 8.5;
System.out.println("\t\t\t-----Welcome to the Cinema-----");
System.out.println("Tonight we are streaming "+"\""+name+"\""+" which was released " +releaseData+".");
System.out.println("This "+genre+ " movie got a " +rottentomTomatoesRating+"% rating on Rotten Tomatoes.");
System.out.println("The rating is "+rating+ " and it runs for "+duration+ " hours.");
System.out.println("This is a sequel "+ isASequelsOrNot +" and is on dvd " +isOnDvd+".");

System.out.println();




    }




}
