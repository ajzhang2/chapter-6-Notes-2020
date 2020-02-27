//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

public class Address implements Comparable
{
   private String streetAddress, city, state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }

   public int compareTo(Object other)
   {
	   Address obj = (Address) other;





	   return 0;

   }

 	/**
 		creates a hash number
 		array size must be size of hash table
	*/
      public int hashCode ( )

      {
		  int hash_num = 0;

		  for (int i = 0; i<streetAddress.length(); i++)
		  {
			  hash_num += streetAddress.charAt(i);

		  }

		  int factor = 31;

		  int hashCity = city.hashCode();
		  hash_num += hashCity;

		hash_num *= factor;

		return hash_num;
      }
      
      /**
       * setAddress - takes a String to replace the streetAddress
       * @param - a new streetAddress String
       */
      public void setAddress(String address)
      {
          streetAddress = address;
      }




   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
