package Arrays;

public class Multiexample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// datatye arrayname[][]= new dataype [2][3]
		
		String a[][] = new String [3][4];
		a[0][0] = "sri";
		a[0][1] = "max";
		a[1][1] = " luv";
		a[1][2] = "luck";
		a[2][1] = "ram";
		a[2][2] = "tan";
		a[2][3] = "rock";
				
				for ( int x =0; x< a.length;x++)
				{
					for ( int y= 0; y<a.length;y++)
					{
						System.out.println(a[x][y]);
					}
				}
				
				for(Object var:a)
					
				{
					System.out.println(var);
				}
				
	
		

	}

}
