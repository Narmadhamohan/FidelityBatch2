class DoublyNode {
    String name;
    DoublyNode prev, next;

    // Constructor to create a new node
    DoublyNode(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    DoublyNode leader; // Renaming head to leader

    // Insert a new node at the end of the list
    public void insert(String name) {
        DoublyNode newNode = new DoublyNode(name);
        if (leader == null) {
            leader = newNode;
        } else {
            DoublyNode current = leader;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Display the linked list from the leader to the tail
    public void displayForward() {
        if (leader == null) {
            System.out.println("List is empty");
            return;
        }
        DoublyNode current = leader;
        while (current != null) {
            System.out.print(current.name + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display the linked list from the tail to the leader
    public void displayBackward() {
        if (leader == null) {
            System.out.println("List is empty");
            return;
        }

        DoublyNode current = leader;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.name + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Delete a node by its name
    public void delete(String name) {
        if (leader == null) {
            System.out.println("List is empty");
            return;
        }

        if (leader.name.equals(name)) {
            leader = leader.next; // Remove leader node
            if (leader != null) leader.prev = null;
            return;
        }

        DoublyNode current = leader;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Name not found");
        } else {
            if (current.next != null) current.next.prev = current.prev;
            if (current.prev != null) current.prev.next = current.next;
        }
    }
}

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert elements
        list.insert("Dijo");
        list.insert("Jose");
        list.insert("Anto");
        list.insert("Supriya");
        list.displayForward();

        // Display backward
        System.out.println("Displaying backward:");
        list.displayBackward();

        // Delete an element
        list.delete("Jose");
        list.displayForward();
    }
}
