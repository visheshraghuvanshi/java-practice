class Product {
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public final String getItemNo() {
        return itemNo;
    }
    public void setItemNo(String str) {
        itemNo = str;
    }

    public String getName() {
        return name;
    }
    public void setName(String str) {
        name = str;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double x) {
        price = x;
    }

    public short getQty() {
        return qty;
    }
    public void setQty(short q) {
        qty = q;
    }

    public Product(String i, String n) {
        setItemNo(i);
        setName(n);
        setQty((short)0);
        setPrice(0);
    }

    public String toString() {
        return "Item Number: " + getItemNo() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nQuantity: " + getQty() +"\n";
    }
}
public class Main {
    public static void main(String[] args) {
        Product p = new Product("A1","Diary");
        System.out.println(p);
    }
}