
/**
 * Write a description of class Array2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2D
{
    // instance variables - replace the example below with your own
    private int x;
    final int student = 5;
    final int test =3;
    int [][] scores;

    /**
     * Constructor for objects of class Array2D
     */
    public Array2D()
    {
        /*
         * Another way to create a 2D array with a nexted for lopp to initialize
         * row major
         */
        this.scores = new int[student][test];
        for (int row = 0; row < student; row ++)
        {
            for(int col = 0 ; col < test; col++)
            {
                this.scores [row][col] =(col+row+1)*10;
            }
        }
        
    }
    
    public static void main (String[] args)
   {
       /*
        * make a 2d array with an initalizer list
        * use an initalizer list you must do it at create time
        */
       int [][] scores = {  {1,2,3},
                            {2,2,3},
                            {3,2,3},
                            {4,2,3}
                          };
       
       Array2D test = new Array2D();
       test.printTable();
       System.out.print(test.sumScoresforStudent(1));
       System.out.print(test.sumTestScores(1));
       
    }
    
    /**
     * Display the array using nested loops
     */
    public void printTable()
    {
        // Ok to go thru an array
        for (int row = 0; row < student; row ++)
        {
            //better way to go thru an array
            //for(int col = 0 ; col < this.scores[0].length; col++)
            //the best way to access an array
            for(int col = 0 ; col < this.scores[row].length; col++)
            {
                System.out.print(this.scores [row][col]+",");
            }
            System.out.print("\n");
        }
        
    }
    
    /**
     * Sums the scores for specified Student for the specified index (ie the row)
     * @param studentIndex - the index of the stdent in the table
     * @retrun the sum of the scores for the specified index
     */
    public int sumScoresforStudent( int studentIndex)
    {
        int sum = 0;
        for( int col = 0; col < this.scores[studentIndex].length; col++)
        {
            sum += this.scores[studentIndex][col];
        }
        
        return sum;        
    }
    
    public int sumTestScores(int testScores)
    {
        return 1;
    }

}







