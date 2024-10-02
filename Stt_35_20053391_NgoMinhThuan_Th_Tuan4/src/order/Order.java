package order;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Order {
	private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItems;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
    }

    public void addLineItem(Product product, int quantity) {
        if (lineItems.size() < 20) {
            lineItems.add(new OrderDetail(product, quantity));
        } else {
            System.out.println("Số lượng sản phẩm trong hóa đơn đã đạt tối đa (20). Không thể thêm sản phẩm mới.");
        }
    }

    public double calcTotalCharge() {
        double totalCharge = 0;
		/*
		 * for (OrderDetail item : lineItems) { totalCharge +=
		 * item.product.calcTotalPrice(item.quantity); }
		 */
        return totalCharge;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + "]";
    }
	    
}
