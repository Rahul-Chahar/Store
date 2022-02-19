/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 19/02/2022
 */

package customer;

import member.Member;

public class Customer implements Member
{
    String name;
   public Customer(String n)
    {
        name = n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit, " + name);
    }

}