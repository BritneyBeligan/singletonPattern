package singletonPattern;

public class HelpDeskStation {
    // includes a method for serving customers and an additional method for resetting the queue number
    private QueueManager queueManager;

    public HelpDeskStation(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public void serveCustomer() {
        int queueNumber = queueManager.generateQueueNumber();
        System.out.println("Now serving customer with queue number: " + queueNumber);
    }

    public void resetQueueNumber(int newQueueNumber) {
        queueManager.resetQueueNumber(newQueueNumber);
    }
}
