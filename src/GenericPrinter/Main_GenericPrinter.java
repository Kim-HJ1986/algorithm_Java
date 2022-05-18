package GenericPrinter;

public class Main_GenericPrinter {
    public static void main(String[ ] args){
        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<Plastic>();
        GenericPrinter<Powder> powderGenericPrinter= new GenericPrinter<Powder>();

        plasticGenericPrinter.setMaterial(new Plastic());
        System.out.println(plasticGenericPrinter.getMaterial().getClass());
        System.out.println(plasticGenericPrinter);
        plasticGenericPrinter.printing();

        System.out.println("======================================");

        powderGenericPrinter.setMaterial(new Powder());
        System.out.println(powderGenericPrinter.getMaterial().getClass());
        System.out.println(powderGenericPrinter.toString());
        powderGenericPrinter.printing();

    }
}
