package Loops;

import org.apache.commons.el.AndOperator;
import org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression;

public class whiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int x=0;
		
		while(i<=10)
			while(x<=9)
		{
			System.out.println(i +"  "+ x);
			i=i+2;
			x=x+1;
			
		}

	}

}
