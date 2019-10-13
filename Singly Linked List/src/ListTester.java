public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.add(18);
        sll.remove(4);
        sll.remove(5);
        
        
        
        sll.printValues();
        
        int found;
        found= sll.find(18);
        
//        sll.removeAt(2);
        System.out.print("\nFound the given value: " + found);
    }
}