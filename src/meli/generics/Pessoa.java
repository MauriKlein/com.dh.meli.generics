package meli.generics;

public class Pessoa implements Precedente<Pessoa>
{
	private int dni;
	private String nome;
	
	public Pessoa(int d, String n){this.dni=d;this.nome =n;}
	
	public int getDni()
	{
		return dni;
	}
	public void setDni(int dni)
	{
		this.dni=dni;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	@Override
	public int precedeA(Pessoa t)
	{
		return this.nome.compareTo(t.nome);
	}
	
	@Override
	public String toString()
	{
		return dni+","+ nome;
	}
}
