
/**
 * Write a description of class InstrumentToSell here.
 *
 * @author (Pratima Ghimire)
 * @version (17.0.1)
 */
public class InstrumentToSell extends Instrument{

    //Encapsulation
    private double price;
    private String sellDate;
    private double discountPercentage;
    private boolean isSold;

    //Constructor creation
    public InstrumentToSell(String instrumentName, int price){
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercentage = 0.0;
        this.isSold = false;    
    }

    //setter method for price
    public void setprice(double price){
        if(isSold == false){
            this.price = price;
        }
        else {
            System.out.println("It is not possible to change the price");
        }
    }

    //setter method for selling date
    public void setSellDate(String sellDate){
        this.sellDate = sellDate;
    }

    //setter method for discount percent
    public void setDiscountPercenatge( double Discount_percent){
        this.discountPercentage = discountPercentage;
    }

    //setter method for is sold
    public void setIsSold( boolean isSold){
        this.isSold = isSold;
    }

    //getter method for price
    public double getPrice(){
        return this.price;
    }

    //getter method for sell date
    public String getSellDate(){
        return this.sellDate;}

    //getter method for discount percent
    public double getDiscountPercentage(){
        return this.discountPercentage;
    }

    //getter method for is sold
    public boolean getIsSold(){
        return this.isSold;
    }

    //method storing when the instrument is sold
    public void sellInstrument(String customerName, String phoneNumber , int panNo , String sellDate, double discountPercentage){
        //if the instrument is sold 
        if(this.isSold == true){
            System.out.println("This instrunment is already sold");

        }
        //if the instrument is not sold
        else {
            this.setCustomerName(customerName);
            this.setCustomerMobileNumber(phoneNumber);
            this.setPAN(panNo);
            this.setSellDate(sellDate);
            this.setDiscountPercenatge(discountPercentage);
            this.setIsSold(true);
            this.setprice(this.price - ( discountPercentage / 100 * this.price));
        }
    }

    //display method to display the details of the instrument required
    public void display(){
        super.display();
        System.out.println("Price of the instrument is:" + this.getPrice());
        //Displays the output of the customer details, sold date when the instrument sold is true
        if(this.isSold == true){
            System.out.println("Name of the customer is:" + this.getCustomerName());
            System.out.println("Contact of the customer is:" + this.getCustomerMobileNumber());
            System.out.println("Pan no is:" + this.getPan());
            System.out.println("Sold date of the instrument to the customer is:"+ this.getSellDate());
        }  
    }
}
