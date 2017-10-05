package be.vdab;
public class Coordinaat {
    private final double xCoordinaat;
    private final double yCoordinaat;
    private final double zCoordinaat;
    
    private Coordinaat(double xCoordinaat, double yCoordinaat,
            double zCoordinaat){
        this.xCoordinaat = xCoordinaat;
        this.yCoordinaat = yCoordinaat;
        this.zCoordinaat = zCoordinaat;
    }
    
    @Override
    public String toString(){
        return xCoordinaat + ", " + yCoordinaat + ", " + zCoordinaat;
    }
    
    public static class CoordinaatBuilder {
        private double xCoordinaat;
        private double yCoordinaat;
        private double zCoordinaat;
        
        public CoordinaatBuilder metXCoordinaat(double xCoordinaat){
            this.xCoordinaat = xCoordinaat;
            return this;
        }
        
        public CoordinaatBuilder metYCoordinaat(double yCoordinaat){
            this.yCoordinaat = yCoordinaat;
            return this;
        }
        
        public CoordinaatBuilder metZCoordinaat(double zCoordinaat){
            this.zCoordinaat = zCoordinaat;
            return this;
        }
        
        public Coordinaat maakCoordinaat(){
            return new Coordinaat(xCoordinaat, yCoordinaat, zCoordinaat);
        }
    } 
}
