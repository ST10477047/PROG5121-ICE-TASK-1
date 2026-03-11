package prog5121.icetask.pkg1;
import javax.swing.JOptionPane;

class Order {
   private String item;
   private int quantity;
   private double price;
    final double VAT_RATE = 0.15;
    final double DISCOUNT_RATE = 0.10;
    
    public Order(String Item, int quantity, double price) {
        this.item= item;
        this.quantity = quantity;
        this.price = price;
        
    }
    
    public String getItem() {
        return item;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getPrice(){
        return price;
    }
    public double getSubtotal(){
        return quantity * price;
    }
    
    public double getDiscount() {
        if (quantity > 3) {
            return getSubtotal() * DISCOUNT_RATE;
        } else {
            return 0;
        }
    }
        
    public double getVAT(){
        return (getSubtotal() - getDiscount()) * VAT_RATE;
    }
    
    public double getTotal() {
        return (getSubtotal() - getDiscount()) + getVAT();
    }
}

 public class QuickServeApp {
     
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter customer name:");
        String studentNumber = JOptionPane.showInputDialog("Enter student number:");
        
        String item = JOptionPane.showInputDialog("Enter item ordered:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item"));
        
        Order order = new Order(item, quantity, price);
        
        String receipt = "---- CAMPUS QUICKSERVE----\n"
                +"Customer: " + name + "\n"
                +"Student Number: " + studentNumber + "\n\n"
                +"Item Ordered: " + order.getItem() + "\n"
                +"Quantity: " + order.getQuantity() + "\n"
                +"Price per Item: R" +String.format("%.2f", order.getPrice()) + "\n\n"
                +"Subtotal: R" + String.format("%.2f", order.getSubtotal()) + "\n"
                +"Discount Applied: R" + String.format("%.2f", order.getDiscount()) + "\n"
                +"VAT (15%): R" + String.format("%.2f", order.getVAT()) + "\n"
                +"Total: R" + String.format("%.2f", order.getTotal()) + "\n\n"
                +"Thank you for your order!\n"
                +"----------------------------------";
                
        System.out.println(receipt);
        JOptionPane.showMessageDialog(null, receipt);
    }
    
}
