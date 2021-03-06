import java.util.ArrayList;



public class TestOrders {

    public static void main(String[] args) {


    
        // Menu items
        Item item1 = new Item("mocha", 5.75);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("drip coffee", 1.0);
        Item item4 = new Item("cappuccino", 4.25);
    


       // Create 2 orders for unspecified guests (without specifying a name)
        Order order1 = new Order("Unspecified ");
        Order order2 = new Order("Unspecified ");

       // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("James \n");
        Order order4 = new Order("April ");
        Order order5 = new Order("Kate ");

       // Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item4);

       // Implement the getStatusMessage method within the Order class
        System.out.println(order5.getStatusMessage());

       //Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        //Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order3.getOrderTotal());

        // Finally, call the display method on all of your orders, like so: order3.display();
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        
    }
}