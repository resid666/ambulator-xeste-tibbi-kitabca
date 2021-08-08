import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TibbiKitabca tibbiKitabca = new TibbiKitabca();
        
        Entity entity = new Entity();

        entity.setBTKM("BTKM");
        entity.setM0374("M0374");
        entity.setKimden("Ad Soyad Ata adi");
        entity.setNeUcun("ne ucun mezmunu.....");
        entity.setMebleg(99.99f);

        tibbiKitabca.createMexaricPdf(entity);
    }
}
