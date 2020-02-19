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
public class DoublyLinkedNode<T> {

  private DoublyLinkedNode<T> next; // private node referencing the node after the current
  private DoublyLinkedNode<T> previous; // private node containing the data of the current
  private T data; // private node referencing the node before the current


  /**
   * Initializes a new node with the specified information.
   * 
   * @param previous - node, which comes before this node in a doubly linked list
   * @param data     - to be stored within this node
   * @param next     - node, which comes after this node in a doubly linked list
   * @throws java.lang.IllegalArgumentException - when data is a null reference
   */
  public DoublyLinkedNode(DoublyLinkedNode<T> previous, T data, DoublyLinkedNode<T> next) {
    // checks if argument is valid
    if (data == null) {
      throw new IllegalArgumentException();
    }
    // assigns data fields with arguments
    this.previous = previous;
    this.next = next;
    this.data = data;

  }

  /**
   * Initialize a new node with the specified data, and null next and previous reference.
   * 
   * @param data - to be stored within this node
   * @throws java.lang.IllegalArgumentException - when data is a null reference
   */
  public DoublyLinkedNode(T data) {
    // checks if argument is valid
    if (data == null) {
      throw new IllegalArgumentException();
    }
    this.data = data;
    next = null;
    previous = null;
  }

  /**
   * Accessor method for this node's data.
   * 
   * @return the data stored within this node.
   */
  public T getData() {
    return data;
  }

  /**
   * Mutator method for this node's next node reference.
   * 
   * @param next - node, which comes after this node in a doubly linked list
   */
  public void setNext(DoublyLinkedNode<T> next) {
    this.next = next;
  }

  /**
   * Accessor method for this node's next node reference.
   * 
   * @return reference to the node that comes after this one in the list, or null when this is the
   *         last node in that list
   */
  public DoublyLinkedNode<T> getNext() {
    return next;
  }

  /**
   * Accessor method for this node's previous node reference.
   * 
   * @return reference to the node that comes before this one in the list or null when this is the
   *         first node in that list
   */
  public DoublyLinkedNode<T> getPrevious() {
    return previous;
  }

  /**
   * Mutator method for this node's previous node reference.
   * 
   * @param previous - node, which comes before this node in a doubly linked list
   */
  public void setPrevious(DoublyLinkedNode<T> previous) {
    this.previous = previous;
  }


}


