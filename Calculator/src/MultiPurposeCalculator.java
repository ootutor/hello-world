public class MultiPurposeCalculator {

	public int gcd(int a,int b)	{
		if(a%b==0) return b;
		else if (b%a==0) return a;
		else{
			if(a>b){
				int c=a/b;
				return gcd(b,a-b*c);
			}
			else{
				int c=b/a;
				return gcd(a,b-a*c);
			}
		}
	}
}

