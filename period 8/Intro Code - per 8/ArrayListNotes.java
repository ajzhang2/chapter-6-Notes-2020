import java.util.ArrayList;//don't forget me
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
    public static void main(String [] args)
    {
        /*
         * The ArrayList class is a Java Generic
         * 
         * We hae to specify the type of the elements in the list in angle brackets <>
         * after every ArrayList identifier
         * 
         * Primitives(int,double) are NOT classes and cannot be specified as the type
         * in a Generic, So. . .  we use the Wrapper Class(Integer,Double)
         */
        //ArrayList theOldWay;//made an ArrayList Objects
        ArrayList<Integer> myList;
        myList = randomIntegerList(10, 20);
        System.out.println(myList);
        System.out.println(sumList(myList));
        removeEvens(myList);
        System.out.println(myList);
        
        
    }
    /**
     * Creates and returns a reference to an ArrayList of the spcified number of Integers
     * where each element is assigned a random value
     * 
     * @pram size   the number of Integers to add to the list
     * @pram range  the range of random values
     * @return  a reference to a newly created list
     */
    
    public static ArrayList<Integer> randomIntegerList(int size, int range)
    {
        // we have created a list of size 0
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < size; i++)
        {
            int value = (int)(Math.random()*range)+1;
            /*
             * The add method adds the object to the end of the list
             * Atuoboxing
             *  Privitive values are automatically coverted to the wrapper class
             *  However, type promotion does not occur
             */
            list.add(value);
        }
        
        return list;
        
    }
    public static int sumList(ArrayList<Integer> list)
    {
        /*
         * Enhanced for loops support iterating throught ArrayLists.
         * 
         * Similarly to arrays, you cannot modify the list in the context of the loop
         * if you do: a ConcurrentModificationException is generated
         */
        int sum = 0;
        for(int value:list)
        {
            sum += value;
            
            //list.add(5);
        }
        
        return sum;
    }
    /**
     * Removes even numbers from the specified list
     * @param list      the list of numbers to potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
        /*
         * size method return the number of elements
         */
        int size = list.size();
        for (int i = 0; i <list.size(); i++)//loops calls the .size()
        {
            /*
             * return the the element at the specified index
             */
            int value = list.get(i);
            
            if(value %2 ==0)//while (value %2 ==0) valu.get(i);
            {
                /*
                 * remove method deletes the element at the index
                 */
                list.remove(i);
                i--;
            }//else
            //{
                //i++;//remove i++ from the loop header
            //}
        }
    }
    
    public static void removeEvensAlt(ArrayList <Integer> list)
    {
        for(int i = list.size()-1; i>= 0;i--)
        {
            if(list.get(i) %2 ==0)
            {
                list.remove(i);
            }
        }
    }

}












