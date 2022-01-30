package tenoserve;
import java.util.*;
public class Array {

	public static void main(String[] args) 
	{
		  int i,size,key,flag=0;
          Scanner sc=new Scanner(System.in);
          size=sc.nextInt();
           int arr[]=new int[size];
           System.out.println("Enter the element :");
           for( i=0;i<size;i++)
            arr[i]=sc.nextInt();
            key=sc.nextInt();
           for( i=0;i<size;i++)
           {
             if(arr[i]==key)
             {
            	 flag=1;
            	 break;
             }
           }
           if(flag==1)
           {
                System.out.printf("\nSearch element is %d at position %d",key,i);
           }
           else
           {
        	   System.out.printf("\nElement is not found:",key);
           }
	}

}
