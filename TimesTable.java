public class TimesTable {

    public static void main(String[] args) {
        int tableSize = 12;
        printTimesTable(tableSize);
    }

    public static void printTimesTable(int tableSize) {
        // first print the top header row using a for-loop
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (int i = 1; i <= 12; i++) {
            System.out.format(i + ":    ");
            for (int j = 1; j <= 12; j++) {
                System.out.format("%4d", (i*j));
            }
            System.out.println();
        }
        // create another for-loop to start building the rows
        // print left most column first

        // create another loop to fill in the multiplied columns

    }
}
