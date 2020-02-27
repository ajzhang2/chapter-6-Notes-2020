
/**
 * Write a description of class hashNotes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hashNotes
{
       public static void main (String[] args)
   {


       //Address [] contacts = new Address [10];
        Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
        Address rHome = new Address ("4 Privet Drive", "Lynchburg","OH",60123);
        Address mHome = new Address ("1203 Main Street", "Euclid", "OH",60156);
        Address ken   = new Address ("915 Elm Street", "Homewood", "IL", 60424);
        Address dj   = new Address ("915 Maple Ave", "Homewood", "IL", 60518);
        Address Homes   = new Address ("221 B Baker Street", "London", "UK", 60518);
        Address Bob   = new Address ("124 Conch Street", "Bikini Bottom", "US", 61245);
        Address Ned   = new Address ("740 Evergreen Terrace", "Springfield", "US", 78204);
        Address Ed   = new Address ("9764 Jeopardy Lane","Chicago", "IL", 60678);
        Address Tom   = new Address ("916 Elm Street","Flossmoor", "IL", 60148) ;


        /*
         * curly brackets to ini a list of Objects
         * size will be how many object you put in the ini list
         */
       Address [] contacts = {school,rHome,mHome,dj,ken,Homes,Bob,Ned,Ed,Tom};
       
       // hash Array to be 2 * the size of the original Array
       Address[] hashcontacts = new Address[contacts.length *2];
       
       String letters = "this is a test";
       System.out.println(letters.hashCode());
       
       for( Address s : contacts)
       {
           System.out.print(s.hashCode());
           System.out.println("-"+s.hashCode()%20);
           
           
       }
       
       for (int i = 0; i < contacts.length; i++)
       {
           hashcontacts [ Math.abs(contacts[i].hashCode()%20)] = contacts[i];
       }
       
       for(Address s: hashcontacts)
       {
           System.out.println(s);
       }
       
    }
}




