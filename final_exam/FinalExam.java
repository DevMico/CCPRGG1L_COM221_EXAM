public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");
        System.out.println(" ");
        for (int row = 0; row < array.length; row++){
        
            for (int column = 0; column < array.length; column++){
                if (row == 2 && column < 9){
        
                    System.out.print(array[row][column]);
                    
                }
            }
        
        }
        System.out.println(" ");
 
        // =============================================================
        // FRAPPUCCINO - (10 points)
        System.out.println(" ");
        System.out.println("2. FRAPPUCCINO ");
        System.out.println(" ");

        for (int row = array.length; row >= 0; row--){
    
            for (int column = array.length; column >= 0; column--){
                if (row == 13 && column > 1 && column < 13){
        
                    System.out.print(array[row][column]);
                    
                }
            }
        
        }
        System.out.println(" ");
        // =============================================================
        // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");
        System.out.println(" ");
        for (int row = 0; row < array.length; row++){
        
            for (int column = 0; column < array.length; column++){
                if (row > 1 && row < 10 && column == 9){
        
                    System.out.print(array[row][column]);
                    
                }
            }
        
        }
        System.out.println(" ");
 

        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");
        System.out.println(" ");
        int incr = 0;
        for (int row = array.length; row >= 0; row--){
    
            for (int column = array.length; column >= 0; column--){
                if (row < 13 && row > 6 && column == 5){
        
                    System.out.print(array[row][column-incr]);
                    incr++;
                
                }
            }
        
        }
        incr = 0;
        System.out.println(" ");

        // =============================================================
        // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");
        System.out.println(" ");
        for (int row = array.length; row >= 0; row--){
    
            for (int column = array.length; column >= 0; column--){
                if (column == 0 && row < 13 && row > 4){
        
                    System.out.print(array[row][column+incr]);
                    incr++;
                
                }
            }
        
        }
        incr = 0;
        

        System.out.println(" ");
        // =============================================================
        // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");
        System.out.println(" ");
        for (int row = 0; row < array.length; row++){
        
            for (int column = 0; column < array.length; column++){
                if (row == 1 && column > 3 && column < 11){
        
                    System.out.print(array[row][column]);
                    
                }
            }
        
        }
        System.out.println(" ");

        // =============================================================
        // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");
        System.out.println(" ");

        for (int row = array.length; row >= 0; row--){
    
            for (int column = array.length; column >= 0; column--){
                if (row < 12 && row > 0 && column == 14){
        
                    System.out.print(array[row][column]);
                    
                }
            }
        
        }
        System.out.println(" ");

        // =============================================================
        // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");
        System.out.println(" ");
        for (int row = 0; row < array.length; row++){
        
            for (int column = 0; column < array.length; column++){
                if (column == 14 && row < 9){
        
                    System.out.print(array[row][column-incr]);
                    incr++;
                }
            }
        
        }
        incr = 0;
        System.out.println(" ");

        // =============================================================
        // LUNES - (10 points)
        System.out.println(" ");
        System.out.println("9. LUNES ");
        System.out.println(" ");

        for (int row = array.length; row >= 0; row--){
    
            for (int column = array.length; column >= 0; column--){
                if (row < 5 && column == 0){
        
                    System.out.print(array[row][column+incr]);
                    incr++;
                }
            }
        
        }
        incr = 0;
        System.out.println(" ");

        // =============================================================
        // SIOMAI - (10 points)
        System.out.println(" ");
        System.out.println("10. SIOMAI ");
        System.out.println(" ");
        for (int row = 0; row < array.length; row++){
        
            for (int column = 0; column < array.length; column++){
                if (row > 2 && row < 9 && column == 6)
                {
        
                    System.out.print(array[row][column+incr]);
                    incr++;
                }
            }
        
        }
        incr = 0;
        System.out.println(" ");

    }
}
