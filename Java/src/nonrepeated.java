import java.util.*;
public class nonrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String x = sc.next();
		
		char ch;
		boolean unique=true;
		int count=0;
		int valid=0;
		for(int i=0;i<x.length();i++) {

			for(int j=i+1;i<x.length()-j;j++) {
				if(x.charAt(i)==x.charAt(j)) {
					unique=false;
				}
			for(j=0;j<i;j++) {
					unique=false;
				}
			if(unique) {
				System.out.println(x.charAt(j));
			}
				}
			}
		}
	}

