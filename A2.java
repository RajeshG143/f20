
import java.io.*;
import java.util.*;
public class A2
{
public static void main(String args[])
{
List<String> ll=new LinkedList<String>();
try
{
File f=new File("/home/rajesh/java/MVI/f20/names.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String s;
while((s=br.readLine())!=null)
{
ll.add(s);
}
br.close();
}
catch(Exception e)
{
System.out.println(e);
}

for(String s:ll)
{
StringBuffer sb=new StringBuffer(s);
sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
sb.setCharAt(sb.length()-1,Character.toLowerCase(sb.charAt(sb.length()-1)));
System.out.println(sb);
}
}
}
