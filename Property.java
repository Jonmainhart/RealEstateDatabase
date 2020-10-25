/* Property.java
 * Jonathan Mainhart - CMIS 242
 * 09 October 2020
 *
 * Defines a Property Object which implements the StateChangeable interface. The
 * property object contains properties describing the address, number of bedrooms,
 * square footage, price, and an enumerated Status indicating whether it is for sale,
 * under contract, or sold. The class implements the interface method to change the
 * status of the property as well as an overridden toString() method. 
 * The default status of a property object is FOR_SALE.
 *
 */
package mainhart;

/**
 *
 * @author jonmainhart
 */
public class Property implements StateChangeable<Status> {

    private final String propertyAddress;
    private final int bedrooms;
    private final int sqFeet;
    private final int price;
    private Status status;

    public Property(String address, int bedrooms, int sqFt, int price) {
        // create an instance of Property and set the home characteristics
        this.propertyAddress = address;
        this.bedrooms = bedrooms;
        this.sqFeet = sqFt;
        this.price = price;
        this.status = Status.FOR_SALE; // default FOR_SALE
    }

    /**
     *
     * @param status
     */
    @Override
    public void changeState(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ("Address: " + this.propertyAddress + "\n"
                + "Bedrooms: " + this.bedrooms + "\n"
                + "Square Footage: " + this.sqFeet + "\n"
                + "Price: $" + String.format("%,d", this.price) + "\n"
                + "Status: " + this.status + "\n");
    }

}
