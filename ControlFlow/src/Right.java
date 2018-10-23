public interface Right
{
int x=8;
}
interface Left
{
int x=10;	
}
class Imp implements Right,Left{

	
public static void main(String[] args) {
	System.out.println(10/0);
}
	
	
}