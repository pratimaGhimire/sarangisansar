/**this class is used to store the details of instrument along with its chargeperday ,date of rent, return and no of ays rented and stating boolean value wheather 
 * instrument is rented or not
 *
 * @author (Pratima Ghimire)
 * @version (17.0.1)
 */
public class Instrument{
    //Encapsulation

    // variable name must be camale case 
    private static int instrumentId=0;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int pan;

    //Constructor
    public Instrument(String instrumentName){
        this.instrumentId++;
        this.instrumentName  = instrumentName;
        this.customerName ="";
        this.customerMobileNumber = "";
        this.pan = 0;   
    }

    //setter of the variable InstrumentId 
    public void setInstrumentId(int instrumentId){
        this.instrumentId =instrumentId;
    }
    //setter of the varaiable InstrumentName
    public void setInstrumentName(String instrumentName){
        this.instrumentName = instrumentName;
    }
    //setter of the variable customerName
    public void setCustomerName (String customerName){
        this.customerName = customerName;
    }
    //setter of the variable customerMobilenumber
    public void setCustomerMobileNumber (String customerMobileNumber){
        this.customerMobileNumber = customerMobileNumber;

    }

    //setter of the varaiable PAN
    public void setPAN (int pan){
        this.pan= pan;
    }

    //Getter
    public int getInstrumentId (){
        return this.instrumentId;
    }

    public String getInstrumentName (){
        return this.instrumentName;
    }

    public String getCustomerName (){
        return this.customerName;
    }

    public String getCustomerMobileNumber (){
        return this.customerMobileNumber;
    }

    public int getPan(){
        return this.pan;
    }

    /*
     * if there is no same name variable on function its not necessary to write this in variable name
     * this indicate this class this.variable indicated global variable 
     * if there is no variable on function scope then its fine to write variable without this
     */
    public void display(){
        //displays the output of the instrumentId
        System.out.println("Value of Instrument_id is:"+ instrumentId);

        //display the output of the instrumentname
        System.out.println("Name of the instrument is:"+ instrumentName);

        //prints the customer name if the value is not empty
        if(this.getCustomerName().equals("") && this.getCustomerMobileNumber().equals("") && this.getPan() ==0){
            System.out.println("Please enter values for customer Name, Mobile Number and Pan Number");
        }else{
            System.out.println("Customername is : " + customerName);
            System.out.println("Customercontact is : " + customerMobileNumber);
            System.out.println("PAN is:" + pan);
        }

    }
}

