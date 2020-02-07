import java.util.ArrayList; //don't forget!
/**
 * Write a description of class ArrayListNotes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListNotes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ArrayListNotes
     */
    public ArrayListNotes()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static void main (String[] args)
    {
        /* The ArrayList class is a Java Generic.
         * 
         * we have to specify the type of elemnts in the list int angle brackets <>
         * after every ArrayList identifier.
         * 
         * Primitives (int,double, boolean) are not classes and thus cannot be a specified
         * type of elements in a Generic. Use the corresponding Wrapper Class
         * (Integer, Double,Boolean)
         */
        //ArrayList oldwayList; // ArrayList of Objects
        ArrayList<Integer> myList;
        myList = randomIntegerList(10,20);
        
        System.out.println(myList);
        System.out.println(sumList(myList));
        removeEvens(myList);
        System.out.println(myList);
        
        
    }
    
    /**
     * Creates and returns a reference to an ArrayList of specified number of Integers
     * each element is equal to a random value
     * @param size      the number of Integers to add to the list
     * @param range     the range of random values to assign to each element
     * @return a reference to a newly created and initialized list
     */
    public static ArrayList<Integer> randomIntegerList(int size, int range)
    {
        //list size is 0
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < size; i++)
        {
            int value = (int)(Math.random() * range) +1;
            /*
             * The add method adds the object to the end of the list
             * 
             * Autoboxing:
             *  Primitive values are automatically converted to their wrapper class.
             *  Type promotion does not occur.
             */
            list.add(value);
        }
        
        return list;
    }
    
    public static int sumList(ArrayList <Integer> list)
    {
        /*
         * Enhanced ofr loop support interating throught ArrayList
         * 
         * Like arrays you cannot modify the list itself in Enhanced for
         * If your a ConcurrentModificationException will be generated
         */
        int sum = 0;
        for(int value: list)
        {
            sum+=value;
            
            //list.add(7);
        }
        
        return sum;
    }
    /**
     * Removes even number form the specified list
     * @param list      the list of numbers to potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
        /*
         * The method return the number of elements in the list
         */
        int size = list.size();
        for(int i = 0; i < list.size();i++ )//as you loop it call .size()
        {
            /*
             * The get method return the element at the spcified index
             */
            int value = list.get(i);
            
            if (value %2 == 0)
            {
                /*
                 * remove method deletes the element at the spcified index
                 */
                list.remove(i);
                i--;// back the index up
            }
            /*
             * must also not i++ in the for loop header
             */
            //else
            //{
            //    i++;
            //}
        }
        
    }
    
    public static void removeEvensAlt(ArrayList<Integer> list)
    {
        for( int i =list.size() -1; i >= 0; i--)
        {
            if (list.get(i) %2 ==0)
            {
                list.remove(i);
            }
        }
        
    }

}









