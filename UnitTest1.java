/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.test1;
import java.util.*;

/**
 *
 * @author Vignesha Masanan
 */
public class UnitTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("array queuq test\n");
        System.out.println("enter size");
        int n=scan.nextInt();
        arrayqueue q=new arrayqueue(n);
        char ch;
        do{
            System.out.println("\nqueue operations");
             System.out.println("1.insert");
              System.out.println("2.remove");
               System.out.println("3.peek");
                System.out.println("4.check empty");
                 System.out.println("5.check full");
                  System.out.println("6.size");
        }
    }
    
}
class arrayqueue
{
    protected int queue[];
    protected int front,rear,size,len;
    public arrayqueue(int n){
        size=n;
        len=0;queue=new int[size];
        front=-1;
        rear=-1;

}
    public boolean isempty()
    {
        return front==-1;
    }
    public int getsize()
    {
        return len;
    }
    public void insert(int i)
    {
        if(rear==-1)
        {
            front=0;
            rear=0;
            queue[rear]=i;
        }
        else if(rear+1>=size)
            throw new IndexOutOfBoundsExpectation("Overflow Expectation");
        else if(rear+1<size)
            queue[++rear]=i;
        len++;
        
    }
    public int remove()
    {
        if(isempty())
            throw new nosuchelementexception("underflow exception");
        else
        {
            len--;
            int ele=queue[front];
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else
                front++;
            return ele;
        }
    }
    public void display()
    {
        System.out.print("\nqueue=");
        if(len==0)
        {
            System.out.print("empty\n");
            return;
        }
        for(int i=front;i<=rear;i++)
            System.out.print(queue[i]+" ");
        System.out.println();
    }
}
