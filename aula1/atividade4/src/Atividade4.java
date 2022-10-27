importar  java . útil . Scanner ;

 classe  pública atividade4 {

	public  static  void  main ( String [] args ) {
		
		Scanner  leia = new  Scanner ( System . in );
			
		int  numero1 , numero2 , numero3 , numero4 ;
		
		Sistema . fora . println ( "Digite o primeiro numero: " );
		numero1 = leia . nextInt ();
		Sistema . fora . println ( "Digite o segundo numero: " );
		numero2 = leia . nextInt ();
		Sistema . fora . println ( "Digite o terceiro numero: " );
		numero3 = leia . nextInt ();
		Sistema . fora . println ( "Digite o quarto número: " );
		numero4 = leia . nextInt ();	
		
		Sistema . fora . println ( "A diferença do produto entre " + numero1 + " e " + numero2 + " pelo produto entre " + numero3 + " e " + numero4 + " é = " + (( numero1 * numero2 )-( numero3 * numero4 )) );

	}

}