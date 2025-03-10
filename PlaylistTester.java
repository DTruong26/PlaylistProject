/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        System.out.println("Added \"%s\" by %s ( %s)".formatted("Scarlet Begonias", "Sublime", "3:32"));
        p.addSong("Scarlet Begonias", "Sublime", "3:32", true);
        p.addSong("Let You Go", "Diplo", "3:54", false);
        p.addSong("This Old Heart Of Mine", "The Isley Brothers", "2:52", true);
        p.addSong("Get It Together", "Drake", "4:10", false);
        p.addSong("Last Nite", "The Strokes", "3:12", false);
        
        
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        
        for (int i = 0; i < p.mySongs.size(); i++)
        {
            System.out.println("%s by %s (%s)".formatted(p.mySongs.get(i).getName(), p.mySongs.get(i).getArtist(), p.mySongs.get(i).songDur()));
        }
        

        System.out.println("\nLiking the songs in position 1, 3, 4\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.like(p.mySongs.get(0).getName());
        p.like(p.mySongs.get(2).getName());
        p.like(p.mySongs.get(3).getName());

        System.out.println("Printing the songs...\n");
        
         for (int i = 0; i < p.mySongs.size(); i++)
        {
            if (p.mySongs.get(i).isLiked())
            {
                System.out.println("%s by %s (%s) --liked".formatted(p.mySongs.get(i).getName(), p.mySongs.get(i).getArtist(), p.mySongs.get(i).songDur()) );
            }
            else 
            {

            System.out.println("%s by %s (%s)".formatted(p.mySongs.get(i).getName(), p.mySongs.get(i).getArtist(), p.mySongs.get(i).songDur()));
            }
        }

        System.out.println("\nRemoving the song in position 1 and 3\n");

        p.removeSong(p.mySongs.get(1).getName());
        p.removeSong(p.mySongs.get(3).getName());

        System.out.println("Printing the songs...\n");
        
         for (int i = 0; i < p.mySongs.size(); i++)
        {
            if (p.mySongs.get(i).isLiked())
            {
                System.out.println("%s by %s (%s) --liked".formatted(p.mySongs.get(i).getName(), p.mySongs.get(i).getArtist(), p.mySongs.get(i).songDur()) );
            }
            else 
            {

            System.out.println("%s by %s (%s)".formatted(p.mySongs.get(i).getName(), p.mySongs.get(i).getArtist(), p.mySongs.get(i).songDur()));
            }
        }
        

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!

        for (int i = 0; i < p.mySongs.size(); i++)
        {
            if (p.mySongs.get(i).isLiked())
            {
                System.out.println("%s by %s (%s) --liked".formatted(p.mySongs.get(i).getName(), p.mySongs.get(i).getArtist(), p.mySongs.get(i).songDur()) );
            }
        }
        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        
        int intPart = (int) (p.totalDuration());
        System.out.println(intPart+ ":"+ (int) ((p.totalDuration() - intPart) * 60));

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        
        

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
    }
}
