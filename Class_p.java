import java.lang.reflect.*;
public class Class_p
{
 public static void main(String[] args)
	{
	Add nene = new Add();
     Add nuvvu = new Add();
           
		System.out.println("hai");
		System.out.println(nene.a);
		//System.out.println(nuvvu.a);
            nene.Naresh();
	}
}
class Add
{
     int a=90;
	int b=a+90;
 String str = "hyderabad";
 public static void Naresh()
{
System.out.println("Add Class Printing...");
}
public void seta(int a) {
    this.a = a;
  }
public int geta() {
    return this.a;
  }
  
}