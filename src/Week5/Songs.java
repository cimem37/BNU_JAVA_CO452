package Week5;
import java.util.ArrayList;

public class Songs
{

  private String tunes;
  private String artist;
  private int playcount;
 
  //Constructor
  public Songs(String tunes, String artist, int playcount)
  {
      this.tunes= tunes;
      this.artist= artist;
      this.playcount = playcount;
  }

      //print method
      public void print()
      {     

      System.out.print("Track: "+ this.tunes + "\t");
      System.out.print("Artist: " + this.artist + "\t");
      System.out.println("Playcount: " + this.playcount +"\t"); 

      }

}













