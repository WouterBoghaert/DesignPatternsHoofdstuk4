package be.vdab;
public class Main {
    public static void main(String[] args) {
        Inwoner.InwonerBuilder builder = new Inwoner.InwonerBuilder();
        Inwoner inwoner = builder.metVoornaam("Olivier")
                                .metFamilienaam("Gerard")
                                .metAantalKinderen(1)
                                .metAantalKerenVerhuisd(3)
                                .metGehuwd(true)
                                .metGescheiden(false)
                                .maakInwoner();
        System.out.println(inwoner);
    }
    
}
