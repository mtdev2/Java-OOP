
public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int length;
	
	public SinglyLinkedList() {
	   this.head = null;
	}
	
	// SLL methods go here. As a starter, we will show you how to add a node to the list.
	public void add(int value) {
		Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
		this.length++;
	}    
	
	
	public void remove(int value) {
		Node runner = head;
		Node previous = runner;
		
		while (runner.value != value) {
			previous = runner;
			runner = runner.next;
		}
		previous.next = runner.next;
		runner.next = null;
	}
	
	public void removeAt(int index) {
		Node runner = head;
		Node previous = runner;
		int counter=0;
		
		while (counter != index) {
			previous = runner;
			runner = runner.next;
		}
		previous.next = runner.next;
		runner.next = null;
	}
	
	public Integer find(int value) {
		Node runner = head;
		int counter=1;
		
		while (runner.value != value) {
			runner = runner.next;
			counter++;
			if(runner.next == null && runner.value != value) {
				System.out.print("No such node with given value");
			}
		}
		return runner.value;
	}
	
	public void printValues () {
		Node runner = head;
		while (runner.next != null) {
			System.out.printf(runner.value + "->");
			runner = runner.next;
			
			if (runner.next == null) {
				System.out.print(runner.value);
			}
		}
	}
}
