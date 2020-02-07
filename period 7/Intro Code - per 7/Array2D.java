
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
    final int TEST = 3;
    
    int[] [] scores;

    /**
     * Constructor for objects of class Array2D
     */
    public Array2D()
    {
        /*
         * Another way to create a 2D array with a neested for loop to initialize
         */
        this.scores = new int[student][TEST];
        
        for (int row = 0; row < student; row++)
        {
            for(int col = 0; col< TEST  ; col++)
            {
                this.scores[row][col] = (col+row+1) *10;
            }
            
        }
        
    }
    
     public static void main (String[] args)
   {
       /*
        * make a 2D array with an initalizer list
        * row major - [row][col]
        */
       int[] [] scores = {  {1,2,3},
                            {2,2,3},
                            {3,2,3},
                            {4,2,3},
                            {5,3,1}
                        };
       
       Array2D util = new Array2D();
       util.printTable();
       System.out.println(util.sumScoresforStudent(1));
       
       
       
   }
   
   public void printTable()
   {    // this is an OK way to access an array
       for (int row = 0; row < student; row++)
        {
            //better way to access an array
            //for(int col = 0; col< this.scores[0].length  ; col++)
            //this is the best way to access an array
            for(int col = 0; col< this.scores[row].length  ; col++)
            {
                System.out.print(this.scores[row][col]+",");
            }
            
            System.out.print("\n");
        }
       
       
   }
   
   /**
    * Sums the scors of a Student for the specified index(ie . . the specified row)
    * @pram studentIndex - the index of the student in the table
    * @return the sum of the scores for the specified index
    */
   public int sumScoresforStudent(int studentIndex)
   {
       int sum = 0;
       
       for(int col = 0; col < this.scores[studentIndex].length; col++)
       {
           sum += this.scores[studentIndex][col];
       }
       
       return sum;
   }
   /**
    * Sums the scores for specified Test at the specified index(ie the specified col)
    * 
    */
   public int sumTest( int testIndex)
   {
       
   }
    

}








