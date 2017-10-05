package be.vdab;
public class CoordinaatMain {
    public static void main(String[] args) {
        Coordinaat.CoordinaatBuilder builder = new Coordinaat.CoordinaatBuilder();
        Coordinaat coordinaat = builder.metXCoordinaat(3)
                                        .metYCoordinaat(5)
                                        .metZCoordinaat(-2)
                                        .maakCoordinaat();
        System.out.println(coordinaat);
    }
    
}
