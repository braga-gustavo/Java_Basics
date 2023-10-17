package flowControl.conditionalStatements.continueStatement;

public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i <=5; i++){
            if( i == 3){
                break;
            }
            System.out.println(i);

            /* Output: 1, 2 */
        } 
        for(int i = 0; i <=5; i++){
            if( i == 3){
                continue;
            }
            System.out.println(i);

            /* Output: 1, 2, 4, 5  */
        }
    }
    
}
