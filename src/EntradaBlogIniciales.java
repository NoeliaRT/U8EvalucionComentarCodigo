

	/**Clase para manejar las entradas de un blog.
	 * @author Noelia 
	 * @version 2.3 18/02/2022
	 */
	public class EntradaBlogIniciales {
	   
		/**
	         * SEPARADOR es el carácter que separa ENTRADA DE del
	         * nombre del autor
	         */
		public static char SEPARADOR=':';
		private int id;
		private String texto;
		private String autor;
			
	        /**
	         * Constructor
	         * @param id recibe el número de la entrada
	         * @param autor recibe el autor de la entrada
	         * @param texto recibe el texto que contiene la entrada
	         * @throws IllegalArgumentException se lanza si id es negativo
	         */
		public EntradaBlogIniciales(int id,String autor,String texto)throws IllegalArgumentException{
	                     
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
	        
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+SEPARADOR+autor+
	                     "\n "+texto;
			return cad;
		}
		
		/**
	         * Devuelve el número de la entrada
	         * @return id
	         */
		public int getId(){
			return this.id;
		}
		
		/**
	         * Devuelve el texto completo de la entrada
	         * @return Texto
	         */
		public String getTexto(){
			return this.texto;
		}
		
		/**
	         * Devuelve el nombre del autor de la entrada en mayúsculas
	         * @return Autor 
	         */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		/**
	         * Método que no se usa.Utilizamos getAutor() 
	         * @return autor 
	         */
		public String devuelveAutor(){ 
	            return this.autor;
		}
		
		
		 
		/**
		 * @param args
		 */
		public static void main(String[] args) {
	       try{ 
	            EntradaBlogIniciales e1=new EntradaBlogIniciales (-3,"Noelia",
	                    "Últimas noticias, está disponible BixBy 2.3");
		          System.out.println(e1);
	       }catch (IllegalArgumentException e){
	            System.out.println(e.getMessage());
	       }
	   } 
}
