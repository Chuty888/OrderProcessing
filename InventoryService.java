/** Observer (Part 5): ตัดสต๊อกเมื่อมีคำสั่งซื้อใหม่ */
public class InventoryService implements OrderObserver { //เป็นObserver ต้องมีอัปเดตด้วย
    @Override public void update(Order order) {
        // TODO (5a): พิมพ์ "Inventory updated for order <orderId>"
        //   hint: System.out.println("Inventory updated for order " + order.orderId());
        System.out.println("Inventory updated for order " + order.orderId()); 
        /* ====== fill in 1 line here ====== */
        //เชื่อมดาต้าเบสในฟังก์ชันนี้
    }
}
