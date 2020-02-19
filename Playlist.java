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

public class Playlist implements Iterator {

  private DoublyLinkedNode<Song> head; // creates a new DoublyLinkedNode referencing the song at the
                                       // front of the list

  /**
   * initializes a playList that takes a node at the front of the list
   * 
   * @param head - node that is inserted at the front of the list
   */
  public Playlist(DoublyLinkedNode<Song> head) {
    // assigns data field to argument
    this.head = head;
  }

  /**
   * Returns true if current node exists else false
   * 
   * @returns true when node isn't empty, else false
   * @Overrides hasNext in Iterator
   */
  public boolean hasNext() {
    // checks to see if current node is empty
    if (head == null) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Returns current node and sets the head to the next node
   * 
   * @return current node
   * @throws NoSuchElement exception if current node is empty
   * @Overrides next in Iterator
   */
  public Song next() {
    // checks to see if current node is empty
    if (head == null) {
      throw new NoSuchElementException();
    } else {
      // returns the initial head and changes the head to the next node
      DoublyLinkedNode<Song> temp = head;
      head = head.getNext();
      return temp.getData();
    }

  }
}
