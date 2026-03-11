package prog5121.icetask.pkg1;
import javax.swing.JOptionPane;

class Order {
    String item;
    int quantity;
    double price;
    
    public double getSubtotal(){
        return quantity * price;
    }
    
    public double getVAT(){
        return getSubtotal() * 0.15;
    }
    
    public double getTotal() {
        return getSubtotal() + getVAT();
    }
}

 public class PROG5121ICETASK1 {
     
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter customer name:");
        String studentNumber = JOptionPane.showInputDialog("Enter student number:");
        
        Order order = new Order();
        
        order.item = JOptionPane.showInputDialog("Enter item ordered:");
        order.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
        order.price = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item"));
        
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
