package day33_a_static;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Arrays;

public class UsingSong {
    public static void main(String[] args) {

        Song song1 = new Song("Waka Waka",3.5);
        Song song2 = new Song("yesterday",3.2,"Beatles");
        Song song3 = new Song("Here without you",3.0,"Ruslan","rock");

        ArrayList<Song>songArrayList = new ArrayList<>(Arrays.asList(song1,song2,song3));

        System.out.println(songArrayList);
        System.out.println("---------------------");

        for (Song each: songArrayList){
            System.out.println("---------------------");
            System.out.println(each);
        }
        System.out.println("=============================");
        // can you remove the object which does not have genre
        songArrayList.removeIf(each -> each.genre== null);
        System.out.println(songArrayList);
        System.out.println("****************");
        songArrayList.add(song1);
        songArrayList.add(song2);
        // can you remove the object which has length longer than 3.1
        songArrayList.removeIf(each->each.length>3.1);
        System.out.println(songArrayList);




    }
}
