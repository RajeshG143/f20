import java.util.*;
public class A1
{
public static void main(String args[])
{
Map<String,Integer> m=new HashMap<String,Integer>();
Scanner sc =new Scanner(System.in);
int sum =0;

for(int i=0;i<=10;i++)
{
    System.out.println("Enter key in string");
    String key =sc.next();
    System.out.println("Enter value in key");
    int value= sc.nextInt();
    m.put(key,value);
}

System.out.println("map contains "+ m);

for(Map.Entry<String,Integer> e: m.entrySet())
{
sum=sum+e.getValue();
}
System.out.println("sum of the values is "+ sum);

}
}
