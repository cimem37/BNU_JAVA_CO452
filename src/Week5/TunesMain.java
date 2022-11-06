package Week5;
import java.util.ArrayList;

import helpers.InputReader;
;

public class TunesMain 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        Songs ABC = new Songs("Bohemian Rhapsody", "Queen", 49000000);
        Songs DEF = new Songs("Bella Ciao - ORIGINALE ","Italians",96000000);
        Songs GHI = new Songs("Zemër","Dhurata Dora ft. Soolking",737000000);
        Songs JKL = new Songs("Habibi","Ricky Rich, Dardan & DJ Gimi-O ",66000000);
        Songs MNO = new Songs ("Danza Kuduro (Official Extended Remix)","Don Omar ft. Lucenzo, Daddy Yankee & Arcángel",309000000);
        Songs PQR = new Songs ("Georgian Gandagana","Georgian people",8100000);
        Songs STU = new Songs ("Way Down We Go","KALEO",495000000);
        Songs VWX = new Songs ("In The End","Linkin Park",1400000000);
        Songs YZ1 = new Songs ("Du hast","Rammstein" ,464000000);
        Songs YZ2 = new Songs ("Eins Zwei Polizei","Mo-Do",47741420);
        Songs YZ3 = new Songs ("The Final Countdown","europathebandtv",1000000000);

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
        String opening = InputReader.getString( "Would you like to check BNUbeta's latest top tunes ? ").toLowerCase();
        if (opening.equals("y") || opening.equals("yes"))
        {
            for(Songs tuneSongs : songs )
            {
                tuneSongs.print();
            }
        }

        //Adding song
        String yesOrNO = InputReader.getString("New Song? ").toLowerCase();
        if (yesOrNO.equals("y") || yesOrNO.equals("yes"))
        {
            String name = InputReader.getString("Enter the name: ");
            String artistname = InputReader.getString("Enter the artist: ");
            int plays = InputReader.getInt("Enter the plays: ");

            Songs newsong = new Songs(name, artistname, plays); 
            songs.add(newsong);

            for(Songs tuneSongs : songs )
            {
            tuneSongs.print();
            }
        }

        // Romove a song
        String yesOrNo2 = InputReader.getString("Would you like to remove a Song ? ").toLowerCase();
        if (yesOrNo2.equals("y") || yesOrNo2.equals("yes"))
        {
            String name = InputReader.getString("Which song do you want to delete ? ").toLowerCase();
            for(Songs tuneSongs : songs)
            {
            
                if (name.equals(tuneSongs.getTunes().toLowerCase()))
                {
                    songs.remove(tuneSongs);
                    System.out.println("The song you selected has been succesfully deleted! ");
                }
            }
        }

        for(Songs tuneSongs : songs )
        {
            tuneSongs.print();
        }
        
        //Print a list of songs over a given number of plays
        String yesOrNO3 = InputReader.getString("Would you want to filter the songs over a defined playcount ?  ").toLowerCase();

        if (yesOrNO.equals("y") || yesOrNO.equals("yes"))
        {
            int minimumCount = InputReader.getInt("Whats the minimum playcount number ?");
            for(Songs tuneSongs : songs )
            {
                if (tuneSongs.getCount() >= minimumCount)
                {
                    tuneSongs.print();                                    
                }
            }

        }



            
        
    }
}



