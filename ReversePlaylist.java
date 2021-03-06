
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
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversePlaylist implements Iterator {

  private DoublyLinkedNode<Song> tail; // creates a new DoublyLinkedNode referencing the song at the
  // end of the list

  /**
   * initializes a playList that takes a node at the end of the list
   * 
   * @param head - node that is inserted at the end of the list
   */
  public ReversePlaylist(DoublyLinkedNode<Song> tail) {
    // assigns data field to argument
    this.tail = tail;
  }

  /**
   * Returns true if current node exists else false
   * 
   * @returns true when node isn't empty, else false
   * @Overrides hasNext in Iterator
   */
  public boolean hasNext() {
    // checks to see if tail is empty
    if (tail == null) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Returns current node and sets the tail to the previous node
   * 
   * @return current node
   * @throws NoSuchElement exception if current node is empty
   * @Overrides next in Iterator
   */
  public Song next() {
    // checks to see if current node is empty
    if (tail == null) {
      throw new NoSuchElementException();
    } else {
      // returns the tail and assigns the tail to the previous node
      DoublyLinkedNode<Song> temp = tail;
      tail = tail.getPrevious();
      return temp.getData();
    }

  }
}
