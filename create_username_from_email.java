/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 */


//METHOD 1


import java.util.*;
public class create_username_from_email
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String original= "arnab.lalaofficial@gmail.com" ;
        String  revstr1= "",revstr2="";

        String newwstr="";
        
        for(int i=original.length()-1;i>=0;i--)

            revstr1+=original.charAt(i);

        //moc.liamg@avaJegelloCanpa
        
        newwstr=revstr1.substring(10);

        for(int i=newwstr.length()-1;i>=0;i--)
            revstr2+=newwstr.charAt(i);

        System.out.println(revstr2);
        sc.close();
    }
}

 

//METHOD 2

 
/*

import java.util.*;


public class create_username_from_email {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     String email = sc.next();
     String userName = "";


     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }


     System.out.println(userName);
   }
}

*/