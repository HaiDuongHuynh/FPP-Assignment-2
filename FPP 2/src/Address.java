public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public void setStreet(String str){street = str;}
    public void setCity(String c){city = c;}
    public void setState(String st){state = st;}
    public void setZip(String z){zip = z;}
    public String getAddress(){
        return street + ", " + city + ", " + state + ", " + zip;
    }

    public String getCity(){return city;}
}
