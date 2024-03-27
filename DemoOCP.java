package week8;
import java.util.Scanner;
interface OrderDelivery 
{
    void deliverOrder();
}

class Swiggy implements OrderDelivery
{
    String custName;
    byte orderID;

    Swiggy() {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter the Customer Name...");
        custName = inScanner.next();
        System.out.println("Enter the order ID...");
        orderID = inScanner.nextByte();
    }

    public void deliverOrder() 
    {
        System.out.println("Delivering food order of Ms. " + custName + " with order number " + orderID + ".");
    }
}

class SwiggyInstamart implements OrderDelivery 
{
    String custName;
    byte orderID;
    int productQty;

    SwiggyInstamart() {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter the Customer Name...");
        custName = inScanner.next();
        System.out.println("Enter the order ID...");
        orderID = inScanner.nextByte();
        System.out.println("Enter the product quantity...");
        productQty = inScanner.nextInt();
    }

    public void deliverOrder()
    {
        System.out.println("Delivering Grocery order of Mr. " + custName + " with order number " + orderID + ".\nThe total number of products delivered are " + productQty);
    }
}

class Delivery 
{
    public void deliverToCustomer(OrderDelivery od) 
    {
        od.deliverOrder();
    }
}

public class DemoOCP 
{
    public static void main(String[] args) 
    {
        Delivery order = new Delivery();
        Swiggy sw = new Swiggy();
        order.deliverToCustomer(sw);
        SwiggyInstamart insta = new SwiggyInstamart();
        order.deliverToCustomer(insta);
    }
}
