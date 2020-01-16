package easy;
import java.util.*;

public class ValidParenthesis 
{
	public boolean isValid(String s)
	{
		Stack <Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='(')||(s.charAt(i)=='{')||(s.charAt(i)=='['))
				stack.push(s.charAt(i));
			else if(!stack.isEmpty())
			{
				if((s.charAt(i)==')')&&(stack.peek()=='('))
					stack.pop();
				else if ((s.charAt(i)=='}')&&(stack.peek()=='{'))
					stack.pop();
				else if((s.charAt(i)==']')&&(stack.peek()=='['))
					stack.pop();
				else
					return false;
			}	
			else
				return false;
		}
		if(stack.isEmpty())
			return true;
		else
		    return false;
		
	}

	public static void main(String[] args) 
	{
		ValidParenthesis vp = new ValidParenthesis();
		vp.isValid("]");
	}			

}
