//algorytm liczacy pierwsze n liczb pierwszych
public class pierwsze
{
	public static void main(String[] args)
	{
		
		int n=100; //ile program ma wyliczyc liczb pierwszych
		int tab[]=new int[n];
		int licznik=0; //licznik znalezionych liczb pierwszych
		int sprawdzana=2; //aktualnie sprawdzana liczba
		int dzielnik=2;
		boolean x;
		
		while(licznik<n)
		{
			x=true;
			for(dzielnik=2;dzielnik<sprawdzana;dzielnik++)
			{
				if(sprawdzana%dzielnik==0)
				{
					x=false;
					break;
				}
			}
			if(x==true)
			{
				tab[licznik]=sprawdzana;
				licznik++;
			}
			sprawdzana++;
		}
		for(int i=0;i<tab.length;i++)
		{
			System.out.println(tab[i]);
		}
	}
}