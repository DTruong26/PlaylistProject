/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String songName;
    private String songDur;
    private boolean liked;
    private String artist;
    

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String songName, String artist, String songDur, boolean liked)
    {
        this.songName = songName;
        this.songDur = songDur;
        this.liked = false;
        this.artist = artist;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
      public String getName()
      {
            return songName;  
      }
      public String getArtist()
      {
          return artist;
      }
      public String songDur()
      {
          return songDur;
      }
      public boolean isLiked()
      {
          return liked;
      }
      public void like()
      {
          liked = true;
      }
      public void unlike()
      {
          liked = false;
      }
      public double calcDuration()
      {
          double sec = 0;
          String min = songDur.substring(0, songDur.indexOf(":"));
          sec += Integer.parseInt(min) * 60;
          String secPart = songDur.substring(songDur.indexOf(":") + 1, songDur.length());
          //String secPart = songDur.substring(0, songDur.indexOf(":") + 1);
          sec += Integer.parseInt(secPart);
          return sec;
      }
  }
