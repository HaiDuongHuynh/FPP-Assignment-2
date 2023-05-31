public class Main {
    public static void main(String[] args) {
        Address bAdress1 = new Address("1000 N 4th", "Fairfield", "IA", "52551");
        Address bAdress2 = new Address("3506 Hawaii Dr", "Garland", "TX", "75044");
        Address bAdress3 = new Address("1201 Wesleyan St", "Chicago", "IL", "61201");

        Address sAddress1 = new Address("1000 N 4th", "Fairfield", "IA", "52551");
        Address sAddress2 = new Address("700 North", "Toronto", "TO", "6AN21");
        Address sAddress3 = new Address("3001 Saigon", "Houston", "TX", "77701");

        Customer customer1 = new Customer("Hai", "Huynh", "112233");
        Customer customer2 = new Customer("Tom", "Roger", "223344");
        Customer customer3 = new Customer("Chris", "Evan", "334455");

        customer1.setBillingAddress(bAdress3);
        customer1.setShippingAddress(sAddress2);

        customer2.setBillingAddress(bAdress1);
        customer2.setShippingAddress(sAddress1);

        customer3.setBillingAddress(bAdress3);
        customer3.setShippingAddress(sAddress3);

        Customer[] record = {customer1, customer2, customer3};

        for(Customer a:record){
            if(a.getbillingAddressCity() == "Chicago"){
                System.out.println(a.toString());
            }
        }
    }
}