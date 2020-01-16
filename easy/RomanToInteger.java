package easy;

public class RomanToInteger 
{
	public int romanToInt(String s) {
        int sum=0;int prevNum=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int num=0;
            char c=s.charAt(i);
            switch (c)
            {
                case 'I':num=1;
                         break;
                case 'V':num=5;
                        break;
                case 'X':num=10;
                        break;
                case 'L':num=50;
                        break;
                case 'C':num=100;
                        break;
                case 'D':num=500;
                        break;
                case 'M':num=1000;
                        break;
            }
            if(num>=prevNum)
                sum=sum+num;
            else
                sum=sum-num;
            prevNum=num;
        }
        return sum;
    }

	public static void main(String[] args) 
	{
		RomanToInteger roman = new RomanToInteger();
		roman.romanToInt("IV");
	}

}
