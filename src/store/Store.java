/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 19/02/2022
 */

package store;


import member.Member;

public class Store
{
    Member member[] = new Member[10];
    int count = 0;

public void register(Member m)
{
    member[count++] = m;
}
public void inviteSale()
{
    for(int i = 0; i<count; i++)
        member[i].callback();
}
}