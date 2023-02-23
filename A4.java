
import java.util.*;
public class A2
 {

	public static void main(String[] args) 
{
		ArrayList<String> ls1=new ArrayList<String>();
              ls1.add("raj");
              ls1.add("habib");
              ls1.add("sam");
              ls1.add("suba");
              ls1.add("shyam");
              ls1.add("priya");
              ls1.add("alis");
              ls1.add("shiba");
              ls1.add("ranjith");
              ls1.add("vignesh");
              
ArrayList<String> ls2=new ArrayList<String>();
             ls2.add("subashini");
             ls2.add("ram");
             ls2.add("tim");
             ls2.add("hari");
             ls2.add("mani");
             ls2.add("priyanka");
             ls2.add("abhi");
             ls2.add("pazhini");
             ls2.add("zara");
             ls2.add("sai");
             
             ls1.addAll(ls2);
             System.out.println(ls1);

	}

}
