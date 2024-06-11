/*Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
 */

import java.util.*;
public class original_old_string_change
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String original= "xyz" ;
        String neww="";

        for(int i=0;i<original.length();i++)
        {
            if(original.charAt(i)=='e')
            {
                neww= original.replace('e', 'i');
            }
            else 
            {
                neww =  original;
            }
        }
        System.err.println("new String is::"+neww);
        sc.close();
    }
}
