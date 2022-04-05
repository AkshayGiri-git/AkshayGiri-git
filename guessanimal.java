import java.util.*;
import java.io.*;
public class guessanimal {
    static Scanner s;
    static PrintWriter pw;
    public static void main(String args[]){
        try{
            s = new Scanner(new File("guess.in"));
            pw = new PrintWriter(new FileWriter("guess.out"));
        }catch(Exception e){

        }
        int animals = Integer.parseInt(s.nextLine());



        for(int i = 0;i<animals;i++){
            String[] line = s.nextLine().split(" ");

        }
    }
}
