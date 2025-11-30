package Q1;

public class Driver {
    public static void main(String[] args) {
        LibraryItem[] array = new LibraryItem[2];

        array[0] = new Book("A112", "John Smith", "Tree", 123);
        array[1] = new CD("F312", "The Band", "Rose", 3);

        for (int i = 0; i < array.length; i++) {
            LoanItem loanItem = (LoanItem) array[i];
            System.out.println("Price of " + array[i].getType() + " (ID: " + array[i].getID() + "): "
                    + loanItem.calculatePrice());
        }
    }
}