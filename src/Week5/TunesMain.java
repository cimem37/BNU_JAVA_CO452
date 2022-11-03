package Week5;
import java.util.ArrayList;

import helpers.InputReader;
;

public class TunesMain 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {

        
       
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
        Songs YZ3 = new Songs ("28","29",30);

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
        songs.add(YZ3);

        //PrintList(Songs);
        System.out.println(CONSOLE_CLEAR);
        String opening = InputReader.getString( "Would you like to check BNUbeta's latest top tunes ? ");
        opening.toLowerCase();
        if (opening.equals("y") || opening.equals("yes"))
        {
        for(Songs tuneSongs : songs )
        {
            tuneSongs.print();
        }

        String yesOrNO = InputReader.getString("New Song? ");

        String name = InputReader.getString("Enter the name: ");
        String artistname = InputReader.getString("Enter the artist: ");
        int plays = InputReader.getInt("Enter the plays: ");

        Songs newsong = new Songs(name, artistname, plays); 
        songs.add(newsong);

        for(Songs tuneSongs : songs )
        {
            tuneSongs.print();
        }

    }}
}
