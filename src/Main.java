import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Initialize arrays for later use
            String[] row1 = {"N", "10*N", "100*N", "1000*N"};
            String[] row2 = {"1", "10", "100", "1000"};
            String[] row3 = {"2", "20", "200", "2000"};
            String[] row4 = {"3", "30", "300", "3000"};
            String[] row5 = {"4", "40", "400", "4000"};
            String[] row6 = {"5", "50", "500", "5000"};
            //Initialize List of String[] arrays
            ArrayList<String[]> tableToBeTranslated = new ArrayList<>();
            //Add row arrays to the list
            tableToBeTranslated.add(row1);
            tableToBeTranslated.add(row2);
            tableToBeTranslated.add(row3);
            tableToBeTranslated.add(row4);
            tableToBeTranslated.add(row5);
            tableToBeTranslated.add(row6);
            //Begin to iterate through the list
            for(String[] row : tableToBeTranslated){
                //Iterate through the row array
                for(int i = 0; i < row.length; i++){
                    //Print the contents of the row at that index
                    System.out.print(row[i]);
                    System.out.print(" | ");
                }
                System.out.println();
            }
    }
}