
public class MiaClasse
{
	 static String nomeClasse="MiaClasse";    
	 private static boolean outputTypeHTML=false;  // flg che controlla il tipo di output
 	 private static char sep=';';                  // flg che definisce il separatore
     public int x;
     public int y;
     public int z;
     
     /*
      * Metodo statico per impostare il tipo di output (text o html)
      */
    public static void setOutputTypeHtml(boolean mode) {
    	 outputTypeHTML=mode;
    }
     /*
      * Metodo statico per impostare il carattere separatore in text output
      */
    public static void setSep(char sep) {
    	 MiaClasse.sep=sep;
    }
     
    public void mioMetodo( ) {
      System.out.println("Ciao sono mioMetodo di "+nomeClasse+" e x vale: "+x);
    }
    
     
	public String toString() {
	    if (outputTypeHTML)
		     return "<td>"+x+"</td><td>"+y+"</td><td>"+z+"</td>";
	    else
	          return ""+x+sep+y+sep+z;
	} 
}
