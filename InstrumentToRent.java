
/**
 * @inheritDoc Instrunment
 * @ this rent instrument
 * @author (Pratima Ghimire)
 * @version (17.0.1)
 */
public class InstrumentToRent extends Instrument{ 
    //encapsulating  variables
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;

    //creating constructer
    //only construction has pascale case
    public InstrumentToRent(String instrumentName, int chargePerDay){
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays= 0;
        this.isRented = false;
    }

    //setter method for charge per day
    public void setChargePerDays(int chargePerDay){
        this.chargePerDay = chargePerDay;

    }
    //setter method for date of rent
    public void setDateOfRented(String dateOfRent){
        this.dateOfRent = dateOfRent;
    }
    //setter method for date of return
    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn= dateOfReturn;  
    }

    //setter method for no of days
    public void setNoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }

    //setter method for rented
    public void setIsRented(boolean isRented){
        this.isRented= isRented;
    }

    //getter method for chargeforday
    public int getChargePerDay(){
        return this.chargePerDay;
    }

    //getter method for dateofrent
    public String getDateOfRented(){
        return this.dateOfRent;
    }

    //getter method for date of return
    public String getDateOfReturn(){
        return this.dateOfReturn;
    }

    //getter method for noofdays
    public int getNoOfDays(){
        return this.noOfDays;
    }

    //getter method for isrented
    public boolean getIsRented(){
        return this.isRented;
    }

    //The method which stores the insturment wheather the instrument is rented
    /**
     * this methods is used to rent instrument 
     * if instrument is rented it will displays message 
     * else it will rent instrunment for that customer
     * @returns nothing
     * @param customerName takes name of customer
     * @params phoneNumber takes phone number of customer 
     * @params panNo takes Personal indenification Nuimber of customer
     * @params dateOfRent takes instrumented rented date
     * @params dateOfReturn takes date of return of instrument 
     * @params noOfDays takes no of das instrument is rented for 
     */
    public void rentInstrument (String customerName,String phoneNumber,int panNo,String dateOfRent,String dateOfReturn,int noOfDays){
        //if the instrument is not available the message is shown
        if (this.isRented == true){
            System.out.println ("Instrument is already rented by\t"+this.getCustomerName()+ "\nMobile Number:\t"+ getCustomerMobileNumber()+"\nPan Number:\t"+getPan());
        }
        else {
            this.setCustomerName(customerName);
            this.setCustomerMobileNumber(phoneNumber);
            this.setPAN(panNo);
            this.setDateOfRented(dateOfRent);
            this.setNoOfDays(noOfDays);
            this.setDateOfReturn(dateOfReturn);
            this.isRented = true;
            int totalCharge = this.noOfDays * this.chargePerDay;
            System.out.println("Customer Name:\t"+this.getCustomerName() );
            System.out.println("Customer Mobile Number:\t"+this.getCustomerMobileNumber());
            System.out.println("Customer Pan Number:\t"+this.getPan());
            System.out.println("Date of rent:\t"+this.getDateOfRented());
            System.out.println("Return Date:\t"+this.getDateOfReturn());
            System.out.println("Rented for:\t"+this.getNoOfDays()+" days");
            /*System.out.println takes only string as aggument but we have passwd integer
             * integer is converted (parse) to string when concat with string
             */
            System.out.println("Total Charge\t"+totalCharge);
        }
    }
    //method to register returned instruments 
    public void instrument_return(){
        if (this.isRented == false){
            System.out.println("this instrument is not in rent");
        }
        else if (this.isRented == true){
            this.setCustomerName("");
            this.setCustomerMobileNumber("");
            this.setPAN(0);
            this.setDateOfRented("");
            this.setDateOfReturn("");
            this.setNoOfDays(0);
            this.setIsRented(false);
        }

    }
    //method to display the required details
    public void display(){
        super.display();
        if (this.isRented == true){
            System.out.println("Rented by:" + this.getCustomerName());
            System.out.println("mobilenumber info of the customer:"+ this.getCustomerMobileNumber());
            System.out.println("PAN of the customer:"+this.getPan());
            System.out.println("Date of the instrument rented is:" + this.getDateOfRented());
            System.out.println("Date of the instrument returned is:" + this.getDateOfReturn());
        }
    }  
}

