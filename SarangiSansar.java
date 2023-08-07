//importing java packages 
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

import java.util.List;
import java.util.Objects;

public class SarangiSansar implements ActionListener{
    //this is ActionListener class.this is the GUI of courseWork1 
    //Initilize all the variable or object

    static String[] months = {"Jan","Feb","Mar","April","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
    static String[] year ={"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028"};
    static String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    ArrayList<Instrument> instruments = new ArrayList<Instrument>();

    public JFrame  f;
    private JTabbedPane tabPane;
    private JLabel lblInstrumentName,lblChargePerDay,lblNoOfDays,lblCustomerName,lblPanNo,lblCustomerPhone,lblReturnInstrumentName, lblInstrumentPrice,
    lblSellCustomerName,lblSellPhoneNumber;
    private JLabel lblSellPanNumber,lblSellDate,lblSellDiscountPercentage,lblSellDisplayCustomerName,lblSellInstrumentName,lblDateOfRent,
    lblDateOfReturn,lblRentInstrumentName;
    private JTextField txtInstrumentName,txtChargePerDay,txtNoOfDays,txtCustomerName,txtPanNo,txtCustomerPhone,txtReturnInstrumentName,
    txtInstrumentPrice,txtSellCustomerName,txtSellPhoneNumber,txtSellPanNumber,txtSellDiscountPercentage,txtSellDisplayCustomerName,
    txtSellInstrumentName,txtRentInstrumentName;
    private JPanel panelInstrumentToSell, panelInstrumentToRent;
    private JButton btnInstrumentToAdd, btnInstrumentRent,btnInstrumentReturn,btnInstrumentToSellAdd,btnSellInstrument,btnDisplayInstrument,
    btnClear,btnClearRent,btnRentDisplay;
    private JComboBox<String>  cmbSellDate,cmbSellMonth,cmbSellYear,cmbDate,cmbMonth,cmbYear,cmbReturnDate,cmbReturnYear,cmbReturnMonth;

    public SarangiSansar(){
        /**this is constructer of SarangiSansar where Frame is made 
         * and all the method is called here
         * 
        */
        f = new JFrame("Sarangi Sansar");
        f.setResizable(false);
        lblInstrumentName = new JLabel("Instrument Name");
        txtInstrumentName = new JTextField();
        f.pack();

        lblInstrumentName.setBounds(20,10,200,30);
        txtInstrumentName.setBounds(230, 10, 400, 30);

        f.add(txtInstrumentName);
        f.add(lblInstrumentName);
        this.panels();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnInstrumentToAdd.addActionListener(this);
        btnInstrumentRent.addActionListener(this);
        btnInstrumentReturn.addActionListener(this);
        btnInstrumentToSellAdd.addActionListener(this);
        btnSellInstrument.addActionListener(this);
        btnDisplayInstrument.addActionListener(this);
        btnClear.addActionListener(this);
        btnRentDisplay.addActionListener(this);

        f.setLayout(null);//use manual layout
        f.setSize(980, 710);//set size of Frame
        f.setVisible(true);//makes frame visible
    }

    private  JPanel instrumentToRentPanel(){

        panelInstrumentToRent = new JPanel();
        JLabel lblInstrumentReturnDivider = new JLabel("_________________________________________________________________Return Instrument________________________________________________________________________");
        JLabel lblInstrumentAddDivider = new JLabel("_________________________________________________________________Rent Instrument________________________________________________________________________");

        lblChargePerDay = new JLabel("Charge Per Day");
        lblNoOfDays = new JLabel("No Of Days");
        lblPanNo = new JLabel("Pan No");
        lblCustomerPhone = new JLabel("Customer Phone No");
        lblCustomerName = new JLabel("Customer Name");
        btnInstrumentToAdd = new JButton("Add instrument");
        btnInstrumentRent = new JButton("Rent Instrument");
        btnInstrumentReturn = new JButton("Return Instrument");
        lblReturnInstrumentName = new JLabel("Instrument Name");
        lblDateOfRent = new JLabel("Date Of Rent");
        lblDateOfReturn = new JLabel("Date of Return");
        lblRentInstrumentName = new JLabel("Instrument to rent");
        btnRentDisplay = new JButton("Display");
        btnClearRent = new JButton("Clear");

        txtRentInstrumentName = new JTextField();
        cmbDate = new JComboBox<String>(date);
        cmbMonth = new JComboBox<String>(months);
        cmbYear = new JComboBox<String>(year);
        cmbReturnDate = new JComboBox<String>(date);
        cmbReturnMonth = new JComboBox<String>(months);
        cmbReturnYear = new JComboBox<String>(year);

        txtReturnInstrumentName = new JTextField();

        txtChargePerDay = new JTextField();
        txtNoOfDays = new JTextField();
        txtPanNo = new JTextField();
        txtChargePerDay = new JTextField();
        txtCustomerPhone = new JTextField();
        txtCustomerName = new JTextField();
        lblChargePerDay.setBounds(10,10,150,30);
        txtChargePerDay.setBounds(170, 10, 300, 30);

        btnInstrumentToAdd.setBounds(630,10,300,30);

        lblInstrumentAddDivider.setBounds(0,80,960,40);

        txtNoOfDays.setBounds(170,120,300,30);
        lblNoOfDays.setBounds(10,120,150,30);

        txtPanNo.setBounds(630,120,300,30);
        lblPanNo.setBounds(480,120,150,30);

        txtCustomerName.setBounds(170,200,300,30);
        lblCustomerName.setBounds(10,200,150,30);

        txtRentInstrumentName.setBounds(630,200,300,30);
        lblRentInstrumentName.setBounds(480,200,150,30);

        txtCustomerPhone.setBounds(630,270,300,30);
        lblCustomerPhone.setBounds(480,270,150,30);

        txtCustomerPhone.setBounds(170,270,300,30);
        lblCustomerPhone.setBounds(10,270,150,30);

        lblDateOfRent.setBounds(480,270,150,30);
        cmbDate.setBounds(630,270,50,30);
        cmbYear.setBounds(690,270,90,30);
        cmbMonth.setBounds(790,270,90,30);

        lblDateOfReturn.setBounds(10,320,150,30);
        cmbReturnDate.setBounds(170,320,50,30);
        cmbReturnYear.setBounds(230,320,90,30);
        cmbReturnMonth.setBounds(340,320,90,30);

        btnInstrumentRent.setBounds(630,320,150,30);
        lblInstrumentReturnDivider.setBounds(0,380,960,30);
        txtReturnInstrumentName.setBounds(170,430,300,30);
        lblReturnInstrumentName.setBounds(10,430,150,30);

        btnInstrumentReturn.setBounds(630,430,180,30);
        btnClearRent.setBounds(450, 490, 180, 30);
        btnRentDisplay.setBounds(230,490,180,30);

        panelInstrumentToRent.add(btnClearRent);
        panelInstrumentToRent.add(btnRentDisplay);
        panelInstrumentToRent.add(lblDateOfReturn);
        panelInstrumentToRent.add(cmbReturnMonth);
        panelInstrumentToRent.add(cmbReturnYear);
        panelInstrumentToRent.add(cmbReturnDate);

        panelInstrumentToRent.add(lblDateOfRent);

        panelInstrumentToRent.add(cmbDate);
        panelInstrumentToRent.add(cmbYear);
        panelInstrumentToRent.add(cmbMonth);

        panelInstrumentToRent.add( btnInstrumentReturn);
        panelInstrumentToRent.add(txtReturnInstrumentName);
        panelInstrumentToRent.add(lblReturnInstrumentName);

        panelInstrumentToRent.add(btnInstrumentRent);

        panelInstrumentToRent.add(txtRentInstrumentName);
        panelInstrumentToRent.add(lblRentInstrumentName);
        panelInstrumentToRent.add(lblInstrumentReturnDivider);
        panelInstrumentToRent.add(lblInstrumentAddDivider);

        panelInstrumentToRent.add(btnInstrumentToAdd);
        panelInstrumentToRent.add(txtCustomerPhone);
        panelInstrumentToRent.add(lblCustomerPhone);

        panelInstrumentToRent.add(lblCustomerName);
        panelInstrumentToRent.add(txtCustomerName);

        panelInstrumentToRent.add(lblPanNo);
        panelInstrumentToRent.add(txtPanNo);
        panelInstrumentToRent.add(txtNoOfDays);
        panelInstrumentToRent.add(lblNoOfDays);
        panelInstrumentToRent.add(lblChargePerDay);
        panelInstrumentToRent.add(txtChargePerDay);
        panelInstrumentToRent.setBackground(Color.getColor("#89c499"));
        panelInstrumentToRent.setLayout(null);
        panelInstrumentToRent.setBounds(10,70,960,590);
        return panelInstrumentToRent;
    }

    //setting the position of all the required variables
    private JPanel instrumentToSell(){
        panelInstrumentToSell = new JPanel();
        JLabel lblInstrumentAddDivider = new JLabel("_________________________________________________________________Sell Instrument________________________________________________________________________");
        JLabel lblDisplayInstrumentDivider = new JLabel("_________________________________________________________________Display Instrument________________________________________________________________________");

        lblInstrumentPrice = new JLabel("Instrument Price");
        txtInstrumentPrice = new JTextField();
        btnInstrumentToSellAdd = new JButton("Add Instrument To Sell");
        lblSellCustomerName = new JLabel("Customer Name");
        lblSellDate = new JLabel("Sell Date");
        lblSellDiscountPercentage = new JLabel("Discount Percentage");
        lblSellPanNumber = new JLabel("Pan No");
        lblSellPhoneNumber = new JLabel("Phone Number");
        lblSellDisplayCustomerName = new JLabel("Instrument Name");
        lblSellInstrumentName = new JLabel("Instrument Name");
        btnClear = new JButton("Clear");

        txtSellInstrumentName = new JTextField();
        cmbSellDate = new JComboBox<String>(date);
        cmbSellYear = new JComboBox<String>(year);
        cmbSellMonth = new JComboBox<String>(months);

        txtSellDisplayCustomerName = new JTextField();
        txtSellCustomerName = new JTextField();
        txtSellDiscountPercentage = new JTextField();
        txtSellPanNumber = new JTextField();
        txtSellPhoneNumber = new JTextField();

        btnSellInstrument = new JButton("Sell Instrument");
        btnDisplayInstrument = new JButton("Display Instrument");

        txtInstrumentPrice.setBounds(10,10,150,30);
        lblInstrumentPrice.setBounds(170, 10, 300, 30);

        btnInstrumentToSellAdd.setBounds(630,10,300,30);
        lblInstrumentAddDivider.setBounds(0,80,960,40);

        txtSellCustomerName.setBounds(170,120,300,30);
        lblSellCustomerName.setBounds(10,120,150,30);

        txtSellPhoneNumber.setBounds(630,120,300,30);
        lblSellPhoneNumber.setBounds(480,120,150,30);

        //        txtSellDate.setBounds(170,200,300,30);
        cmbSellDate.setBounds(170,200,50,30);
        cmbSellYear.setBounds(230,200,90,30);
        cmbSellMonth.setBounds(330,200,90,30);

        lblSellDate.setBounds(10,200,150,30);

        txtSellPanNumber.setBounds(630,200,300,30);
        lblSellPanNumber.setBounds(480,200,150,30);

        txtSellDiscountPercentage.setBounds(170,270,300,30);
        lblSellDiscountPercentage.setBounds(10,270,150,30);

        btnSellInstrument.setBounds(10,330,300,30);
        txtSellInstrumentName.setBounds(630,270,300,30);
        lblSellInstrumentName.setBounds(480,270,150,30);
        lblDisplayInstrumentDivider.setBounds(0,380,960,30);
        txtSellDisplayCustomerName.setBounds(170,430,440,30);
        lblSellDisplayCustomerName.setBounds(10,430,150,30);

        btnDisplayInstrument.setBounds(630,430,300,30);
        btnClear.setBounds(450, 490, 180, 30);

        panelInstrumentToSell.add(btnClear);

        panelInstrumentToSell.add(txtSellInstrumentName);
        panelInstrumentToSell.add(lblSellInstrumentName);

        panelInstrumentToSell.add(txtSellDisplayCustomerName);
        panelInstrumentToSell.add(lblSellDisplayCustomerName);
        panelInstrumentToSell.add(btnDisplayInstrument);
        panelInstrumentToSell.add(lblDisplayInstrumentDivider);
        panelInstrumentToSell.add(txtSellPhoneNumber);
        panelInstrumentToSell.add(lblSellPhoneNumber);
        panelInstrumentToSell.add(lblSellCustomerName);
        panelInstrumentToSell.add(txtSellCustomerName);
        panelInstrumentToSell.add(lblSellDate);

        panelInstrumentToSell.add(cmbSellDate);
        panelInstrumentToSell.add(cmbSellMonth);
        panelInstrumentToSell.add(cmbSellYear);

        panelInstrumentToSell.add(lblSellDiscountPercentage);
        panelInstrumentToSell.add(txtSellDiscountPercentage);
        panelInstrumentToSell.add(lblSellPanNumber);
        panelInstrumentToSell.add(txtSellPanNumber);
        panelInstrumentToSell.add(btnSellInstrument);

        panelInstrumentToSell.add(lblInstrumentPrice);
        panelInstrumentToSell.add(txtInstrumentPrice);
        panelInstrumentToSell.add(btnInstrumentToSellAdd);
        panelInstrumentToSell.add(lblInstrumentAddDivider);
        panelInstrumentToSell.setBackground(Color.getHSBColor(177,100,100));
        panelInstrumentToSell.setLayout(null);
        panelInstrumentToSell.setBounds(10,70,960,590);
        return panelInstrumentToSell;
    }

    //creating a panel method
    private void panels(){
        tabPane = new JTabbedPane();
        tabPane.add("Instrument to Rent", instrumentToRentPanel());
        tabPane.add("Instrument to Sell", instrumentToSell());
        f.add(tabPane);
        tabPane.setBounds(10,70,960,590);
        tabPane.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        tabPane.setVisible(true);
    }

    //actionPerformed method
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnInstrumentToAdd) {
            addInstrumentRent();
        }
        else if(e.getSource() == btnInstrumentToSellAdd){
            addInstrumentToSell();
        }
        else if(e.getSource() == btnClear){
            clearTextFields();
        }
        else if(e.getSource() == btnInstrumentRent){
            rentInstrument();
        }
        else if (e.getSource()==btnSellInstrument){
            sellInstrument();
        } else if (e.getSource()==btnInstrumentReturn) {
            returnInstrument();
        } 
        else if(e.getSource() == btnDisplayInstrument){
            displayInstrumentToSell();

        }
        else if(e.getSource() == btnRentDisplay){
            displayInstrumentToRent();
        }
    }

    //addInstrumentToSell method
    private void addInstrumentToSell(){
        String error = null;
        String instrumentName = txtInstrumentName.getText().trim();
        String instrumentPrice = txtInstrumentPrice.getText().trim();
        int instrumentPriceNumber=0;
        if (instrumentName.isBlank() || instrumentName.isEmpty()) {

            error = "Instrument Name is required";
        }
        if(instrumentPrice.isEmpty()||instrumentPrice.isBlank()){
            error =  "Instrument Price is required";
        }else{
            try{
                instrumentPriceNumber = Integer.parseInt(instrumentPrice);
            }catch(Exception ex){
                error = "Charge per day is not valid";
            }}

        if(error!=null){
            JOptionPane.showMessageDialog(f,error,"Alert",JOptionPane.WARNING_MESSAGE);
        }
        else {
            InstrumentToSell instrument = null;
            for (Instrument i:instruments){

                if(Objects.equals(i.getInstrumentName(), instrumentName) && i instanceof InstrumentToSell) {
                    instrument = (InstrumentToSell) i;
                }
            }
            if(instrument==null){
                InstrumentToSell instrumentRent = new InstrumentToSell(instrumentName,instrumentPriceNumber);
                instruments.add(instrumentRent);
                JOptionPane.showMessageDialog(f,"Instrument Instrument added successfully","Alert",JOptionPane.PLAIN_MESSAGE);
                clearTextFields();
            }else{
                JOptionPane.showMessageDialog(f,"Instrument with this name already exists","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    //addInstrumenRent method
    private void addInstrumentRent(){
        String error = null;
        String instrumentName = txtInstrumentName.getText();
        String chargePerDay = txtChargePerDay.getText();
        int chargePerDayNumber=0;
        if(instrumentName.isBlank()  || instrumentName.isEmpty()){
            error = "Instrument Name is required";
        }
        if(chargePerDay.isEmpty()||chargePerDay.isBlank()){
            error = "Charge per day is required";
        }else{
            try{
                chargePerDayNumber = Integer.parseInt(chargePerDay);
            }catch(Exception ex){
                error = "Charge per day is not valid";
            }}

        if(error!=null){
            JOptionPane.showMessageDialog(f,error,"Alert",JOptionPane.WARNING_MESSAGE);
        }
        else {
            InstrumentToRent instrument = null;
            for (Instrument i:instruments){

                if(Objects.equals(i.getInstrumentName(), instrumentName) && i instanceof InstrumentToRent) {
                    instrument = (InstrumentToRent) i;
                }
            }
            if(instrument==null){
                InstrumentToRent instrumentRent = new InstrumentToRent(instrumentName,chargePerDayNumber);
                instruments.add(instrumentRent);
                JOptionPane.showMessageDialog(f,"Instrument Instrument added successfully","Alert",JOptionPane.PLAIN_MESSAGE);
                clearTextFields();
            }else{
                JOptionPane.showMessageDialog(f,"Instrument with this name already exists","Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
    }
    //sellInstrument method
    private void sellInstrument(){
        String error = null;
        String customerName = txtSellCustomerName.getText();
        String phoneNumber = txtSellPhoneNumber.getText();
        String panNo = txtSellPanNumber.getText();
        String sellDate = cmbSellDate.getSelectedItem()+" " +cmbSellYear.getSelectedItem()+" "+cmbSellMonth.getSelectedItem() ;
        String instrumentName = txtSellInstrumentName.getText();
        String discountPercentage = txtSellDiscountPercentage.getText();
        int panNoNumber = 0;

        double discountPercentageNumber = 0.0;
        if(instrumentName.isBlank() || instrumentName.isEmpty()){
            error ="Instrument Name is required";
        }

        if(customerName.isEmpty() || customerName.isBlank()){
            error = "Customer Name is required";

        }
        if(phoneNumber.isBlank() || phoneNumber.isEmpty()){
            error =  "Phone Number is required";

        }
        if(panNo.isEmpty() || panNo.isBlank()){
            error = "Pan no is required";
        }else{
            try{
                panNoNumber = Integer.parseInt(panNo);
            }catch(Error e){
                error = "Pan number must be integer";
            }
        }
        if(sellDate.isBlank()|| sellDate.isEmpty()){
            error = "Sell Date is required";
        }
        if(discountPercentage.isEmpty() || discountPercentage.isBlank()){
            error="Discount percentage is required";
        }else{
            try{
                discountPercentageNumber = Double.parseDouble(discountPercentage);
            }catch(Error e){
                error = "Discount percentage must be decimal";
            }
        }

        if(error!=null){
            JOptionPane.showMessageDialog(f,error,"Alert",JOptionPane.WARNING_MESSAGE);
        }
        else {
            InstrumentToSell instrument = null;
            for (Instrument i:instruments){

                if(Objects.equals(i.getInstrumentName(), instrumentName) && i instanceof InstrumentToSell) {
                    instrument = (InstrumentToSell) i;
                }
            }
            if(instrument == null){
                JOptionPane.showMessageDialog(f,"No Instrument with this name added","Alert",JOptionPane.WARNING_MESSAGE);
            }else if(instrument.getIsSold()) {
                JOptionPane.showMessageDialog(f,"Instrument is already sold","Alert",JOptionPane.WARNING_MESSAGE);

            }else{
                instrument.sellInstrument(customerName,phoneNumber,panNoNumber,sellDate,discountPercentageNumber);
                JOptionPane.showMessageDialog(f,"Successfully sold instrument","Success",JOptionPane.PLAIN_MESSAGE);
            }
        }

    }

    //return Instrumentrent
    private void returnInstrument(){
        String instrumentName = txtReturnInstrumentName.getText();
        InstrumentToRent instrument = null;
        for (Instrument i:instruments){

            if(Objects.equals(i.getInstrumentName(), instrumentName) && i instanceof InstrumentToRent) {
                instrument = (InstrumentToRent) i;
            }
        }
        if(instrument == null){
            JOptionPane.showMessageDialog(f,"No Instrument with this name added","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(instrument.getIsRented()) {
            instrument.instrument_return();
            JOptionPane.showMessageDialog(f,"Instrument successfully  returned","Alert",JOptionPane.PLAIN_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(f,"Instrument is not rented","Alert",JOptionPane.WARNING_MESSAGE);

        }
    }

    //clear TextFields
    private void clearTextFields() {
        txtInstrumentName.setText("");
        txtChargePerDay.setText("");
        txtNoOfDays.setText("");
        txtPanNo.setText("");
        txtCustomerName.setText("");
        txtCustomerPhone.setText("");
        txtReturnInstrumentName.setText("");
        txtInstrumentPrice.setText("");
        txtSellCustomerName.setText("");
        txtSellPhoneNumber.setText("");
        txtSellPanNumber.setText("");
        txtSellDiscountPercentage.setText("");
        txtSellDisplayCustomerName.setText("");
    }

    //rentInstrument
    private void rentInstrument(){
        String customerName = txtCustomerName.getText();
        String phoneNumber = txtCustomerPhone.getText();
        String panNo = txtPanNo.getText();
        String dateOfRent = cmbDate.getSelectedItem()+" " +cmbYear.getSelectedItem()+" "+cmbMonth.getSelectedItem();
        String dateOfReturn = cmbReturnDate.getSelectedItem()+" " +cmbReturnYear.getSelectedItem()+" "+cmbReturnMonth.getSelectedItem();
        String noOfDays = txtNoOfDays.getText();
        String instrumentName = txtRentInstrumentName.getText();
        String error =  null;
        int noOfDaysNumber = 0;
        int panNoNumber = 0;
        if(instrumentName.isBlank() || instrumentName.isEmpty()){
            error = "Instrument name should not be empty";
        }
        if(customerName.isEmpty() || customerName.isBlank()){
            error = "Customer Name is required";
        }
        if(phoneNumber.isBlank() || phoneNumber.isEmpty()){
            error = "Phone number is required";
        }

        if(panNo.isEmpty() || panNo.isBlank()){
            error="Pan Number is required";
        }else{
            try{
                panNoNumber =Integer.parseInt(panNo);
            }catch(Error e){
                error = "Pan number must be decimal";
            }
        }
        if(noOfDays.isEmpty() || noOfDays.isBlank()){
            error="No Of  days is required";
        }else{
            try{
                noOfDaysNumber = Integer.parseInt(noOfDays);
            }catch(Error e){
                error = "No Of days must be integer";
            }
        }

        if(error!=null){
            JOptionPane.showMessageDialog(f,error,"Alert",JOptionPane.WARNING_MESSAGE);
        }
        else {
            InstrumentToRent instrument = null;
            for (Instrument i:instruments){

                if(Objects.equals(i.getInstrumentName(), instrumentName) && i instanceof InstrumentToRent) {
                    instrument = (InstrumentToRent) i;
                }
            }
            if(instrument == null){
                JOptionPane.showMessageDialog(f,"No Instrument with this name added","Alert",JOptionPane.WARNING_MESSAGE);
            }else if(instrument.getIsRented()) {
                JOptionPane.showMessageDialog(f,"Instrument is already rented","Alert",JOptionPane.WARNING_MESSAGE);

            }else{
                instrument.rentInstrument(customerName,phoneNumber,panNoNumber,dateOfRent,dateOfReturn,noOfDaysNumber);
                JOptionPane.showMessageDialog(f,"Successfully rented instrument","Success",JOptionPane.PLAIN_MESSAGE);
            }
        }

    }

    //display
    private void displayInstrumentToSell(){
        String instrumentName = txtSellDisplayCustomerName.getText();
        InstrumentToSell instrument = null;
        for (Instrument i:instruments){

            if(Objects.equals(i.getInstrumentName(), instrumentName) && i instanceof InstrumentToSell) {
                instrument = (InstrumentToSell) i;
            }
        }
        if(instrument == null){
            JOptionPane.showMessageDialog(f,"No Instrument with this name added","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            instrument.display();
        }

    }
    //display
    private  void displayInstrumentToRent(){
        String instrumentName = txtReturnInstrumentName.getText();
        InstrumentToRent instrument = null;
        for (Instrument i:instruments){

            if(Objects.equals(i.getInstrumentName(), instrumentName) && i instanceof InstrumentToRent) {
                instrument = (InstrumentToRent) i;
            }
        }
        if(instrument == null){
            JOptionPane.showMessageDialog(f,"No Instrument with this name added","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            instrument.display();
        }
    }

    public static  void main(String[] arg){
        new SarangiSansar();
    }
}