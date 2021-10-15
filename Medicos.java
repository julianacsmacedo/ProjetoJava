package ProjetoJava;

//import java.util.ArrayList;
//import java.util.List;

public class Medicos extends Cadastro{
	
	private String crm;
	private int especialidade;
			
	public Medicos (String nome, String sobrenome, int regiao, int especialidade, String crm, 
			String telefone)
	{
		super (nome, sobrenome, regiao, telefone);
		this.crm = crm;
		this.especialidade = especialidade;
	}
	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public int getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}
	
	public void listaMedicos() //Lista pr�-determinada
	{
		if(especialidade == 1 &&  getRegiao() == 1)
		{
			System.out.println("Dr. Andr� Mendes \nCl�nico Geral \nCentro \nContato: 4658-3922 \nCRM: 773946/SP");
		}
		else if(especialidade == 1 && getRegiao() == 2)
		{
			System.out.println("Dr. Silvana Bezerra \nCl�nico Geral \nZona Norte \nContato: 4658-3922 \nCRM: 773432/SP");
		}
		else if(especialidade == 1 && getRegiao() == 3)
		{
			System.out.println("Dr. Tais Matos \nCl�nico Geral \nZona Sul \nContato: 9999-3922 \nCRM: 982946/SP");
		}
		else if(especialidade == 1 && getRegiao() == 4)
		{
			System.out.println("Dr. Luis Guerreiro \nCl�nico Geral \nZona Leste \nContato: 9999-3922 \nCRM: 82928/SP");
		}
		else if(especialidade == 1 && getRegiao() == 5)
		{
			System.out.println("Dr. Luis Guerreiro \nCl�nico Geral \nZona Oeste \nContato: 9999-3922 \nCRM: 82928/SP");
		}
		else if(especialidade == 1 && getRegiao() == 6)
		{
			System.out.println("Dr. Luis Guerreiro \nCl�nico Geral \nRegi�o Metropolitana \nContato: 9999-3922 \nCRM: 82928/SP");
		}
		
		
		
		
		
		
		
		
		
		
		//ArrayList<Medicos> listamed = new ArrayList<Medicos>();
		
		//listamed.add(new Medicos(getNome(), getSobrenome(), getRegiao(), especialidade, getTelefone(), crm));
		//System.out.println(listamed);
		
	}
	
	/*public void adicionar(Medicos cm) //cm = cadastro m�dicos
	{
	    medicos.add(cm);
	}

	public void listaM�dicos() //vai exibir m�dico cadastrado
	{
	    medicos.forEach((p) -> 
	    {
	        System.out.println("\nNome: " + p.getNome()+ " "+ p.getSobrenome()+ "\nCl�nico Geral" + "\nCRM: " + crm + "Centro");
		    System.out.println("\nCADASTRO REALIZADO COM SUCESSO");
	    });
	}
	*/

	

}
