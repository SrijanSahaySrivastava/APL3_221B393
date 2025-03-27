/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class SingleTon
{
    private static SingleTon uniqueObj;
    private SingleTon {}{}
    
    public static SingleTon getInstance(){
        if(uniqueObj == null)
        {
            uniqueObj = new SingleTon();
            return uniqueObj;
        }
    }
    
    
	public static void main(String[] args) {
	    SingleTon st = SingleTon.getInstance();
	    
		System.out.println("Hello World");
	}
}
