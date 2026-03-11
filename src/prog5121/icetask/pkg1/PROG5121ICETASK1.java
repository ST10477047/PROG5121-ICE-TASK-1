package prog5121.icetask.pkg1;
import javax.swing.JOptionPane;

class Order {
    String item;
    int quantity;
    double price;
    final double VAT_RATE = 0.15;
    
    public Order(String Item, int quantity, double price) {
        this.item= item;
        this.quantity = quantity;
        this.price = price;
        
    }
    
    public double getSubtotal(){
        return quantity * price;
    }
    
    public double getVAT(){
        return getSubtotal() * VAT_RATE;
    }
    
    public double getTotal() {
        return getSubtotal() + getVAT();
    }
}

 public class PROG5121ICETASK1 {
     
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
                +"Item Ordered: " + order.item + "\n"
                +"Quantity: " + order.quantity + "\n"
                +"Price per Item: R" +String.format("%.2f", order.price) + "\n\n"
                +"Subtotal: R" + String.format("%.2f", order.getSubtotal()) + "\n"
                + "VAT (15%): R" + String.format("%.2f", order.getVAT()) + "\n"
                + "Total: R" + String.format("%.2f", order.getTotal()) + "\n\n"
                + "Thank you for your order!\n"
                + "------------------------------";
                
        System.out.println(receipt);
        JOptionPane.showMessageDialog(null, receipt);
    }
    
}
