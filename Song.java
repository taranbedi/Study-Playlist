//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (P07 Study Playlist)
// Files: (Song.java, DoublyLinkedNode.java, SongCollection.java, Playlist.java,
//////////////////// ReversePlaylist.java)
//////////////////// LinkedListMegaBlock.java))
// Course: (Fall 2019 CS 300)
//
// Author: (Taran Bedi)
// Email: (tbedi@wisc.edu email address)
// Lecturer's Name: (Mouna Kacem)
//

//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: (None)
// Online Sources: (None)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
public class Song {
  private String title; // private data field for title of song
  private String artist; // private data field for artist of the song

  /**
   * Initializes a new song with the specified information.
   * 
   * @param title  - or name of this new song
   * @param artist - or musician who performs this song
   */
  public Song(String title, String artist) {
    // initializes data fields with arguments
    this.title = title;
    this.artist = artist;
  }

  /**
   * Returns a string representation of this song. This string should be formatted as follows:
   * "TITLE by ARTIST", where this song's title and artist are used in place of the TITLE and ARTIST
   * place holders.
   * 
   * @Overrides toString in class Object
   * @return string representation of this song
   */
  public String toString() {
    String x = title + " by " + artist;
    return x;
  }

  /**
   * Returns true when this song's title and artist strings contain the same contents as the other
   * song's title and artist strings, and false otherwise. Note that this method takes an Object
   * rather than a Song argument, so that it Overrides Object.equals(Object). If an object that is
   * not an instance of Song is ever passed to this method, it should return false.
   * 
   * @Overrides equals in class java.lang.Object
   * @return true when the two songs have matching title and artist
   */
  public boolean equals(Object other) {
    // checks if Objects equal each other when the method toString is called
    if (other.toString().equals(toString())) {
      return true;
    } else {
      return false;
    }
  }

}
