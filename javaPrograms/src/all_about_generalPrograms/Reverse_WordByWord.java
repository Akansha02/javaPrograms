package all_about_generalPrograms;

public class Reverse_WordByWord {

	public static void main(String[] args) {
		
		String s = "akansha bansal";
		
		String[] a = s.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=(a[i].length()-1);j>=0;j--)
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}
			
	}

}
