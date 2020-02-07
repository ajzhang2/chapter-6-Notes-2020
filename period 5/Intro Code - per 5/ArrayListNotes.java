import java.util.ArrayList;//don't forget
/**
 * Write a description of class ArrayListNotes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListNotes
{
   

    /**
     * Constructor for objects of class ArrayListNotes
     */
    public ArrayListNotes()
    {
        // initialise instance variables
        //x = 0;
    }
    
    public static void main(String[] args)
    {
        /*
         * The ArrayList class is Java Generic.
         * 
         * We khave to specify the type of elements in the list int angle brackets <>
         * after every ArrayList identifier
         * 
         * Primitives (double, int, char) are not classes and cannot be 
         * specified as the type of the elements in a Generic.
         * We use th Wrapper Class(Double, Integer)
         */
        //ArrayList myList; - held a list of Objects
        //cannot use primitive ArrayList <int> myList;
        
        ArrayList<Integer> myList;
        myList = randomIntegerList(10,20);
        
        System.out.println(myList);
        System.out.println("The sum is: " + sumList(myList));
        
        removeEvens(myList);
        System.out.println(myList);
        
        
    }
    
    /**
     * Creates and returns a reference to any ArrayList of specified number
     * of Integers where each element is assigned a random value
     * @param
     * @return
     */
    
    public static ArrayList<Integer> randomIntegerList(int size, int range)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //int size = list.size();
        
        /*
         * The add method adds the specified object to the end of the list
         * 
         * Autoboxing:
         *      Primitve values are automatically converted to the 
         *      wrapper class. However, the type promotion
         *      does not occur.
         */
        for (int i = 0; i<size; i++)
        {
            int value = (int)(Math.random() * range) +1;
            list.add(value);
        }
        
        return list;
    }
    
    public static int sumList(ArrayList<Integer> list)
    {
        /*
         * Enhanced for loops support iterating through ArrayList
         * 
         * Like arrays, you cannot modify the list itself in the context of the
         *      enhanced for loop - generates ConcurrentModificationException
         */
        int sum = 0;
        for (int value: list)
        {
         
            sum+=value;
            
            //list.add(7);
        }
        
        return sum;
    }
    
    /**
     * Revoves even number form the spcified list
     * 
     * @pram list   the list of number to potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
        /*
         * size method returns the number of elements in the list
         */
        //int size = list.size();//valid way to ge the size
        
        for(int i = 0; i < list.size(); )
        {
            /*
             * get method return the value of the elemtne at the index
             * list get smaller, elements are "shifted left"
             */
            int value = list.get(i);
            if( value %2 == 0)
            {
                /*
                 * remove method deletes the element at the specified index
                 */
                list.remove(i);
                //i--;// if remove move index back one to compensate
            }
            else//only increase i if you don't remove
            {
                i++;
            }
        }
    }
    public static void removeEnensAlt(ArryayList<Integer> list)
    {
        for(int i = list.size() -1; i>=0; i--)
        {
            if (list.get(i) % 2 == 0
            {
                list.remove(i);
            }
        }
    }

}













