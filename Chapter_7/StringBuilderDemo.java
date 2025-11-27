public class StringBuilderDemo {

    public static void main(String[] args) {

        // Create StringBuilder objects
        StringBuilder nameString = new StringBuilder("Barbara");
        StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");

        // Display original strings and capacities
        System.out.println("(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());

        // Modify the length using setLength()
        nameString.setLength(20);
        addressString.setLength(20);

        // Display results after changing length
        System.out.println("(Length set to 20 for StringBuilder 1) The name is "
                + nameString + " end");

        System.out.println("(Length set to 20 for StringBuilder 2) The address is "
                + addressString);
    }
}
