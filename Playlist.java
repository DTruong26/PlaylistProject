import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    
     ArrayList<Song> mySongs;


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

      public Playlist()
      {
      mySongs = new ArrayList<Song>();
      }
      
      public void addSong(String name, String artist, String dur, boolean liked)
      {
        Song track = new Song(name, artist, dur, liked);
        mySongs.add(track);
        System.out.println("");
      }

      public ArrayList<Song> likedSongs()
      {
        ArrayList<Song> goodSongs = new ArrayList<Song>();
        for(int i = 0; i < mySongs.size(); i++)
        {
            if(mySongs.get(i).isLiked())
            {
                goodSongs.add(mySongs.get(i));
            }
        }
        return goodSongs;
      }

      public void like(String name)
      {
        for(int i = 0; i < mySongs.size(); i++)
        {
            if(mySongs.get(i).isLiked() == false && mySongs.get(i).getName().equals(name))
            {
                mySongs.get(i).like();
            }
        }
      } 

      public void removeSong(String name)
      {
        for(int i = mySongs.size() - 1; i >= 0; i--) 
        {
            if(mySongs.get(i).getName().equals(name))
            {
                mySongs.remove(i);
            }
        }
      }

    

      public double totalDuration()
      {
        double sum = 0;
        for(int i = 0; i < mySongs.size(); i++)
        {
            sum += mySongs.get(i).calcDuration();
        }
        return (sum / 60);
      }
      
      

      public void removeUnliked()
      {
        for(int i = 0; i < mySongs.size(); i++)
        {
          if(mySongs.get(i).isLiked() == false)
          {
            mySongs.remove(i);
          }
        }
      }

      public String allSongs()
      {
        String list = "";
        for(int i = 0; i < mySongs.size(); i++)
        {
          list += mySongs.get(i).getName() + ", ";
        }
        return list;
      }
      
      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
}
