public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter = 1;
    private Date mfcDate;
    Product(String name, double price, int quantity, Date mfcDate){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = counter++;
        this.mfcDate = mfcDate;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMfcDate(Date mfcDate) {
        this.mfcDate = mfcDate;
    }

    public Date getMfcDate() {
        return mfcDate;
    }



    public String toString(){
        String productDetails = String.format("%04d\t%-20s%,.2f\t%d\t%s",id,name,price,quantity,mfcDate);
        return productDetails;
    }
    public static Product getRecentdate(Product p1, Product p2){
        if(p1.mfcDate.getDate() > p2.mfcDate.getDate())
            return p1;
        else return p2;
    }
}
