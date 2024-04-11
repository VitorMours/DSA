package DSA;


public class List{

	private int size;
	private String name;
	private int median;
	/** 
	* Create the class
	* @param None
	* @return The List class instance
	*/
	public List(){
			System.out.println("Sendo Criada uma lista");
	}
	
	
	
	
	
	
		
	public String doc(){
		StringBuilder builder = new StringBuilder();
		builder.append("Documentação de como usar uma lista");
		return builder.toString();
	}

}
