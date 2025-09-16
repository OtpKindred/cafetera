public class Cafetera {
    String marca="Melita";
    protected int cantidadAguaMililitros;
    protected int cantidadLecheMlilitros;
    protected int cantidadCafeGramos;
    protected int capacidadAgua;
    protected int capacidadLeche;
    protected int capacidadCafe;
    boolean encendida;
    public Cafetera(String marca,int CA,int CL,int CC){
        this.marca=marca;
        this.capacidadAgua=CA;
        this.capacidadLeche=CL;
        this.capacidadCafe=CC;
        this.cantidadAguaMililitros=0;
        this.cantidadLecheMlilitros=0;
        this.cantidadCafeGramos=0;
        this.encendida=false;
    }
    public void prender(){
        encendida=true;
        System.out.println("la cafetera esta encendida");
    }
    public void apagar(){
        encendida=false;
        System.out.println("la cafetera esta apagada");
    }
    public void recargarAgua(int capacidadAgua){
        if(!encendida){
            cantidadAguaMililitros=Math.min(cantidadAguaMililitros+capacidadAgua, capacidadAgua);
            System.out.println("la cafetera se recargo con"+capacidadAgua+" mililitros de agua");
        }
        else{
            System.out.println("la cafetera esta encendida, debe apagarla para recargar el Agua de la cafetera");
        }
    }
    public void recargarLeche(int capacidadLeche){
        if(!encendida){
            cantidadLecheMlilitros=Math.min(cantidadLecheMlilitros+capacidadLeche, capacidadLeche);
            System.out.println("la cafetera recargo"+capacidadLeche+" mililitros de Leche");
        }
        else{
            System.out.println("la cafetera esta encendida, debe apagarla para recargar la Leche");
        }
    }
    public void recargarCafe(int capacidadCafe){
        if(!encendida){
            cantidadCafeGramos=Math.min(cantidadCafeGramos+capacidadCafe, capacidadCafe);
            System.out.println("la cafetera recargo"+capacidadCafe+" mililitros de Cafe");
        }
        else{
            System.out.println("la cafetera esta encendida, debe apagarla para recargar el Cafe");
        }
    }
    public void prepararCafe(){
        preparaBebida(10,100,0,"cafe");
    }
    public void prepararLatte(){
        preparaBebida(5,100,120,"latte");
    }
    public void prepararCapuchino(){
        preparaBebida(8,140,100,"capuchino");
    }
    public void preparaBebida(int cafe,int leche ,int agua,String marca){
        if(!encendida){
            System.out.println("encienda la cafetera para preparar la bebida");
            return;
        }
        if (cantidadCafeGramos >= cafe &&   cantidadLecheMlilitros >=leche && cantidadAguaMililitros >= agua ){
            cantidadCafeGramos-=cafe;
            cantidadLecheMlilitros-=leche;
            cantidadAguaMililitros-=agua;
            System.out.println("la cafetera preparara la bebida en un momento....");
            System.out.println("bebida lista.");
        }
        else {
            System.out.println("no hay suficiente capacidad necesaria para preparar la bebida");
        }
    }


    public void mostrarInfo(){
        System.out.println("marca: "+marca);
        if(encendida){
            System.out.println("Estado: encendida");
        }
        else{
            System.out.println("Estado: apagada");
        }
        System.out.println("cafe: "+cantidadCafeGramos+"/"+capacidadCafe+" gramos");
        System.out.println("Agua: "+cantidadAguaMililitros+"/"+capacidadAgua+" mililitros");
        System.out.println("Leche: "+cantidadLecheMlilitros+"/"+capacidadLeche+" mililitros");
    }
}
