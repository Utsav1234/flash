package exception;

class ReturnVsFinally
{
public static void main(String[] args)
{
System.out.println(methodOne());
}
public static int methodOne(){
try
{
System.out.println(10/0);
return 777;
}
catch(ArithmeticException e)
{
return 888;
}
finally{
return 999;
}
}
}

