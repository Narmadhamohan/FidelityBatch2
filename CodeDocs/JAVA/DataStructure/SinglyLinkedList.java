class Node {
    String name;
    Node next;

    // Constructor to create a new node
    Node(String name) {
        this.name = name;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node leader; // Renaming head to leader

    // Insert a new node at the end of the list
    public void insert(String name) {
        Node newNode = new Node(name);
        if (leader == null) {
            leader = newNode;
        } else {
            Node current = leader;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        if (leader == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = leader;
        while (current != null) {
            System.out.print(current.name + " -> ");
            current = current.next;
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
            return;
        }

        Node current = leader;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Name not found");
        } else {
            current.next = current.next.next; // Skip the node to delete
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert elements
        list.insert("Dijo");
        list.insert("Jose");
        list.insert("Anto");
        list.insert("Supriya");
        list.display();

        // Delete an element
        list.delete("Jose");
        list.display();
    }
}
