
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
    int [][]counts;
    final int COUNTRIES = 5;
    final int MEDALS = 3;

    /**
     * Constructor for objects of class Array2D
     */
    public Array2D()
    {
        this.counts = new int[COUNTRIES][MEDALS];
        /*
         * Anoterh way to create a 2D array witha nested for loop to initialize
         */
        for ( int row = 0; row < COUNTRIES; row++)
        {
            for (int col = 0 ; col < MEDALS ; col++)
            {
                this.counts[row][col] = (col+row+1)*10;
            }
        }
    }
    
    public static void main (String[] args)
   {
       /*
        * creates a 2D array with an initializer list
        * must use: curly brackets, when you create
        */
       int [][] scores = {  {1,2,3},
                            {2,2,3},
                            {3,2,3},
                            {4,2,3}
                         };
                         
       Array2D util = new Array2D();
       util.printTable();
       System.out.println(util.sumMedalforCountry(1));
       System.out.println(util.sumMedals(1));
       
       
   }
   
   public void printTable()
   {
       /*
        * OK way to access an array
        */
       for ( int row = 0; row < COUNTRIES; row++)
        {
            //better way to access an array
            //for (int col = 0 ; col < counts[0].length ; col++)
            //best way to access an array
            for (int col = 0 ; col < counts[row].length ; col++)
            {
                System.out.print(this.counts[row][col]+",");
            }
            System.out.print("\n");
        }
       
   }
   
   /**
    * Sums the Medal count for Country for specified indes(ie. the specified row)
    * @param CountryIndes - teh index of the Country in the Table
    * @return the sum of the medal for the specified index
    */
   public int sumMedalforCountry(int countryIndex)
   {
       int sum = 0;
       
       for (int col = 0; col < this.counts[countryIndex].length;col++)
       {
           sum += this.counts[countryIndex][col];
        }
        
        return sum;
    }
   /**
    * sum the col
    */
   public int sumMedals(int medalIndex)
   {
       return 0;
   }
   
   
   
   

   
}
