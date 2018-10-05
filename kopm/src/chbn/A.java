package chbn;

public class A {

	public static void main(String[] args) {
		String v="WELCOME";
		String rev="";
		System.out.println(v.length());
		for(int i=v.length()-1;i>=0;i--){
			rev=rev+v.charAt(i);
		}
		System.out.println("<><><><><><><><>");
		System.out.println(rev);

	}

}
