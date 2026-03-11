package prog5121.icetask.pkg1;
import javax.swing.JOptionPane;

class Order {
    String item;
    int quantity;
    double price;
}

 public class PROG5121ICETASK1 {
     
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter customer name:");
        String studentNumber = JOptionPane.showInputDialog("Enter student number:");
        
        Order order = new Order();
        
        order.item = JOptionPane.showInputDialog("Enter item ordered:");
        order.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
        order.price = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item"));
        System.out.println("Order noted");
      
    }
    
}
