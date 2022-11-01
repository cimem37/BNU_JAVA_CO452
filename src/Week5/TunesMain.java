package Week5;
import java.util.ArrayList;
;

public class TunesMain {
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {

        System.out.println("Hello");

        Songs ABC = new Songs("f", "G", 123);
        Songs DEF = new Songs("A","B",3);
        Songs GHI = new Songs("4","5",6);
        Songs JKL = new Songs("7","8",9);
        Songs MNO = new Songs ("10","11",2);
        Songs PQR = new Songs ("13","14",15);
        Songs STU = new Songs ("16","17",18);
        Songs VWX = new Songs ("19","20",21);
        Songs YZ1 = new Songs ("22","23",24);
        Songs YZ2 = new Songs ("25","26",27);

        ArrayList<Songs> songs = new ArrayList<Songs>();
     
        songs.add(ABC); 
        songs.add(DEF);
        songs.add(GHI);
        songs.add(JKL);
        songs.add(MNO);
        songs.add(PQR);
        songs.add(STU);
        songs.add(VWX);
        songs.add(YZ1);
        songs.add(YZ2);

        for (Songs current: songs)
        {
            current.print();
        }
    }



}
