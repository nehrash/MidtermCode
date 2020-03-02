package midtermreview;

/**
 * A class that models vending machine items.
 * Items have a name and a price. The possible items are listed in the
 * array called Candies. Use this code to answer questions
 * B.1 and B.2 in the midterm review.
 * @author dancye, 2019
 */
public class VendingMachineItem {

	public double price;
	public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public VendingMachineItem() {
		// TODO - implement VendingMachineItem.VendingMachineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * A method to ask the user to select am item from the vending machine.
	 * @param args - not used
	 */
	public static void main(String[] args) {
		// TODO - implement VendingMachineItem.main
		throw new UnsupportedOperationException();
	}

}