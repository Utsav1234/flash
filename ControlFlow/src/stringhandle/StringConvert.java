package stringhandle;

public class StringConvert {
public static void main(String[] args) {
	String str="121asdsadas2n24n2kdasadsa4n214124243";
	str=conver(str);
	System.out.println(str);
}

private static String conver(String str) {
	StringBuffer sb=new StringBuffer(str);
	for(int i=0;i<sb.length();i++)
	{
		if(sb.charAt(i)<48||sb.charAt(i)>57){
			sb.deleteCharAt(i);
			i--;
		}
	}
	return sb.toString();
}
}
