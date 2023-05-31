public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    Customer(String firstName, String lastName, String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String toString(){
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocSecurityNum(){return socSecurityNum;}

    public String getbillingAddress(){return billingAddress.getAddress();}

    public String getbillingAddressCity(){return billingAddress.getCity();}
    public String getshippingAddress(){return shippingAddress.getAddress();}

    public void setFirstName(String fn){firstName = fn;}
    public void setLastName(String ln){lastName = ln;}
    public void setSocSecurityNum(String ssn){socSecurityNum = ssn;}

    public void setBillingAddress(Address a){billingAddress = a;}
    public void setShippingAddress(Address b){shippingAddress = b;}

}
