/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Juet
{
    private String name;
    private int age;
    
    public void setName(String name)
    {
        this.name = name;
    }
     
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void getName()
    {
        System.out.println(name);
    }
     
    public void getAge()
    {
        System.out.println(age);
    }
}

public class Main
{
	public static void main(String[] args) {
	   Juet obj = new Juet();
	   obj.setName("Srishti");
	   obj.setAge(20);
	   //obj.name = "Srishti";
	   //obj.age = 20;
	   obj.getName();
	   obj.getAge();
// 		System.out.println("Hello World");
    //     int x = Integer.parseInt(args[0]);
    //     for(int i = 1 ; i <= 10 ; i++ )
	   // {
	   //     System.out.println(x + " x " + i + " = " + x*i );
	   // }
	}
}