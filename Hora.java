class Hora{
    //Atributos de instancia 
    private int hor;
    private int min;
    
    //Constructor 
    public Hora(int h,int m){ 
        hor=h;
        min=m;
    } 
    
    //Comandos 
    public void establecerHora(int c){ 
        hora=c;
    } 
    
    public void establecerMinutos(int c){ 
        minutos=c;
    } 
    
    public void copy(Hora c){ 
         hor=c; 
         min=c; 
        } 
    
    //Consultas 
    public int obtenerHora(){ 
        return hor;} 
    
    public int obtenerMinutos(){ 
        return min; 
    } 
    
    public boolean equals(Hora c){ 
        return (hor==c.obtenerHora()) && (min==c.obtenerMinutos()); 
    } 
    
    public Hora clone(){ 
        return Hora h=new Hora(hor,min);
    } 
    
    public int diferenciaMinutos(Hora c){ 
        int minm= hor*60+min; 
        