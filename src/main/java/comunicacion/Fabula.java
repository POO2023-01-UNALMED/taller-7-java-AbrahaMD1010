package comunicacion;

public class Fabula extends Escrito{
    //atributos
    private String ensenanza;
    private String interpretacion;
    private static int factor=1;

    //constructor
    public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza,String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;

    }
    

    //methods
    public String getEnsenanza() {
        return ensenanza;
    }

    //getters and setters
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }


    public String getInterpretacion() {
        return interpretacion;
    }


    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //methods
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina*factor*this.getPaginas();

    }

    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen()+ "\n"+
        this.getTitulo()+ "\n"+
        this.getAutor()+ "\n"+
        this.getPaginas()+ "\n"+
        this.getEnsenanza();

    }

}
