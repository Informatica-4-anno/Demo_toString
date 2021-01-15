
public class Principale {

	public static void main(String[] args) {
	
		MiaClasse o=new MiaClasse();
		MiaClasse b=new MiaClasse();
				
		b.x=5;
		b.y=8;
	
	    o.x =120;
		o.y =45;
		
		MiaClasse[] vet =new MiaClasse[1000];
		
		for (int i=0;i<1000;i++) {
			vet[i]=new MiaClasse();
			vet[i].x=(int)(Math.random()*100);
			vet[i].y=(int)(1000+Math.random()*1000);
			vet[i].z=6;
		}
		
		MiaClasse.setOutputTypeHtml(true);
		
		System.out.println("<html><body><table>");
		System.out.println("<tr><th>x</th>,<th>y</<th></tr>");
		for (int i=0;i<10;i++) {
			
			System.out.println("<tr>");
			System.out.println(vet[i]);
			System.out.println("</tr>");
		}		
		System.out.println("</table></body></html>");
		
		
		System.out.println("Adesso stampo in formato testo");
        MiaClasse.setOutputTypeHtml(false);
		
		for (int i=0;i<10;i++) {
			System.out.println(vet[i]);
		}		
		
		System.out.println("Adesso stampo in formato testo e come separatore uso |");
        MiaClasse.setOutputTypeHtml(false);
        MiaClasse.setSep('|');
		
		for (int i=0;i<10;i++) {
			System.out.println(vet[i]);
		}		
			
		//MiaClasse.o
		

	}

}
