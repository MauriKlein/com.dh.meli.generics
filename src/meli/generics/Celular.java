package meli.generics;

public class Celular implements Precedente<Celular>
{
	private String numero;
	private String titular;
	
	public Celular(String nro,String tit){this.numero=nro;this.titular=tit;}
	
	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		this.numero=numero;
	}

	public String getTitular()
	{
		return titular;
	}

	public void setTitular(String titular)
	{
		this.titular=titular;
	}

	@Override
	public String toString()
	{
		return numero+","+titular;
	}
	
	@Override
	public int precedeA(Celular t)
	{
		return this.numero.compareTo(t.numero);
	}	
}
