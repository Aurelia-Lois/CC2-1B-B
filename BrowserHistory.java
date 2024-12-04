
/*Angwani,Aurelia Lois
CC2 1B
Final Challenge 4

*/

public class BrowserHistory{

    private Node current;

    // Node class for the doubly linked list
    private class Node {
        String page;
        Node prev;
        Node next;

        Node(String page) {
            this.page = page;
        }
    }

    // Constructor
    public BrowserHistory() {
        current = null;
    }

    // Visit a new page
    public void visitPage(String page) {
        Node newNode = new Node(page);

        // If there's a current page, link it to the new node
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;  // Move to the new page
    }

    // Go back to the previous page
    public void goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // Go forward to the next page
    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Get the current page
    public String getCurrentPage() {
        return (current != null) ? current.page : null;
    }

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        history.visitPage("github.com");
        history.visitPage("canvas.com");
        history.visitPage("tiktok.com");

        System.out.println("Current page: " + history.getCurrentPage()); // amazon.com
        history.goBack();
        System.out.println("Current page: " + history.getCurrentPage()); // facebook.com
        history.goBack();
        System.out.println("Current page: " + history.getCurrentPage()); // google.com

        history.visitPage("youtube.com");  // Clears forward history
        System.out.println("Current page: " + history.getCurrentPage()); // youtube.com
        history.goForward();  // No effect, as forward history was cleared
        System.out.println("Current page: " + history.getCurrentPage()); // youtube.com
    }
}