package singletonPattern;

public class pagibigApp {
    public static void main(String[] args) {

        System.out.println("\nGood Day Customers! Welcome to Pag-ibig!\nPlease Get your Number and wait for your turn!");
        System.out.println();
        QueueManager queueManager = QueueManager.getInstance();

        HelpDeskStation helpDesk1 = new HelpDeskStation(queueManager);
        HelpDeskStation helpDesk2 = new HelpDeskStation(queueManager);

        // Generate queue numbers
        helpDesk1.serveCustomer(); // Queue number 1
        helpDesk2.serveCustomer(); // Queue number 2

        // Reset the queue number
        helpDesk1.resetQueueNumber(10);

        // Generate a new queue number after reset
        helpDesk1.serveCustomer(); // Queue number 10
        helpDesk2.serveCustomer(); // Queue number 11
    }
}
