package oopsDemos;

public class ClsFunctions extends ClsMathFunctions
						  implements IStringFunctions
{

	@Override
	public String strReverse(String str)
	{
		String strRev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			strRev=strRev+str.charAt(i);
		}
		
		return strRev;
	}

}
