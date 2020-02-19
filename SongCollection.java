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

public class SongCollection {
  private DoublyLinkedNode<Song> head; // creates a new DoublyLinkedNode referencing the song at the
                                       // front of the list
  private DoublyLinkedNode<Song> tail; // creates a new DoublyLinkedNode referencing the song at the
                                       // end of the list
  private boolean playDirectionForward; // a boolean value that determines the direction to traverse
                                        // the list

  /**
   * Initializes a new list of songs
   */
  public SongCollection() {
    // initializes all the data fields
    head = null;
    tail = null;
    playDirectionForward = true;
  }


  /**
   * adds song to the end/tail of this doubly linked list
   * 
   * @param song - song that will be added to the list
   * @throws a NullPointerException when song is null
   */
  public void add(Song song) {
    // checks if song is valid
    if (song == null) {
      throw new NullPointerException();
    } else if (head == null) {
      // adds song to an empty list
      head = new DoublyLinkedNode<Song>(null, song, null);
      tail = head;
    } else {
      // adds song to a non-empty list
      DoublyLinkedNode temp = tail;
      tail = new DoublyLinkedNode<Song>(tail, song, null);
      temp.setNext(tail);
    }
  }


  /**
   * removes and returns song from the front/head of this list
   * 
   * @return song that is at the head of the list
   */
  public Song remove() {
    // checks to see if list is capable of removing an item
    if (head == null) {
      throw new NoSuchElementException();
    } else {
      // removes song at the head of the list
      Song temp = head.getData();
      // changes head to the next node
      head = head.getNext();
      return temp;
    }
  }

  //
  /**
   * boolean method to determine whether to play the direction forward or back
   * 
   * @param isForward - shows the direction to traverse the list
   * @return true when traversing through the playlist in a forward direction, else false.
   */
  public void setPlayDirection(boolean isForward) {
    playDirectionForward = isForward;
  }

  /**
   * Checks whether to call the reverse playlist or playlist based on PlayDirection
   * 
   * @returns ReversePlaylist if play direction is false, else returns Playlist
   */
  public Iterator<Song> iterator() {
    // returns playlist if playDirection is true
    if (playDirectionForward == true) {
      return new Playlist(head);
    } else {
      // returns reversePlaylist if playDirection is false
      return new ReversePlaylist(tail);
    }

  }

  /////////////////////////////////////////////////////////////////////////////////// // For each of
  /////////////////////////////////////////////////////////////////////////////////// the following
  /////////////////////////////////////////////////////////////////////////////////// big-O time
  /////////////////////////////////////////////////////////////////////////////////// complexity
  /////////////////////////////////////////////////////////////////////////////////// analyses,
  /////////////////////////////////////////////////////////////////////////////////// consider the
  /////////////////////////////////////////////////////////////////////////////////// problem //
  /////////////////////////////////////////////////////////////////////////////////// size to be the
  /////////////////////////////////////////////////////////////////////////////////// number of
  /////////////////////////////////////////////////////////////////////////////////// Songs that are
  /////////////////////////////////////////////////////////////////////////////////// stored within
  /////////////////////////////////////////////////////////////////////////////////// the argument
  /////////////////////////////////////////////////////////////////////////////////// songs, when //
  /////////////////////////////////////////////////////////////////////////////////// the method is
  /////////////////////////////////////////////////////////////////////////////////// first called.
  //
  // For analysisMethodA, the big-O time complexity is _____0(1)_______. //
  // For analysisMethodB, the big-O time complexity is _____0(n)_______. //
  // For analysisMethodC, the big-O time complexity is ______0(1)______.
  /////////////////////////////////////////////////////////////////////////////////////
}
