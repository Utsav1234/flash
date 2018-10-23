package cloning;

public class CopyObject implements Cloneable{
	public static void main(String[] args) {
		// ShallowCloning
		Cloning shallowCloning = new Cloning();
		shallowCloning.i=5;
		shallowCloning.j=6;
		Cloning sCloning = shallowCloning;
		System.out.println("first obj ="+shallowCloning.i+" "+shallowCloning.j+"  \nsecond obj ="+sCloning.i+" "+sCloning.j);
		// DeepCloing
		Cloning deepCloning=new Cloning();
		deepCloning.i=5;
		deepCloning.j=6;
		Cloning deep2=new Cloning();
		deep2.i=deepCloning.i;
		deep2.j=deepCloning.j;
		System.out.println(deepCloning.i+""+deepCloning.j+""+deep2.i+""+deep2.j);
		//Cloning
		Cloning cloning=new Cloning();
		cloning.i=5;
		cloning.j=6;
		
	}
}

class Cloning implements Cloneable {
	int i ;
	int j ;
}