package meli.generics;

public class Main
{
	public static void main(String[] args)
	{
		Pessoa[] aPer={new Pessoa(1,"Mauri")
				      ,new Pessoa(2,"Joice")
				      ,new Pessoa(3,"Kenyo")
				      ,new Pessoa(4,"Michelle")};
		
		SortUtil.ordenar(aPer);
		
		for(Pessoa p:aPer)
		{
			System.out.println(p);
		}
		
		Celular[] aCel={new Celular("1133423142","Mauri")
			      ,new Celular("1166453723","Joice")
			      ,new Celular("1142355362","Kenyo")
			      ,new Celular("1133636241","Michelle")};
	
		SortUtil.ordenar(aCel);
		
		for(Celular c:aCel)
		{
			System.out.println(c);
		}
	}
}
