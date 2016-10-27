public class Main{
	public static void main(String[] argv){
		/*int i=20;
		double j;
		j=25.5;
		i+=j;
		System.out.println(""+i+" "+j);*/
		String str1="Name";
		String str2="Name";
		System.out.println("Str1 : "+str1+"\nStr2 : "+str2);		
		str2+="Hi";
		System.out.println("Str1 : "+str1+"\nStr2 : "+str2);
		String str3=new String("Name");
		String str4=new String("Another Name");
		System.out.println("Str3 : "+str3+"\nStr4 : "+str4);
		str4=str3;
		str3+="Hi";
		System.out.println("Str3 : "+str3+"\nStr4 : "+str4);
		
	}
}
