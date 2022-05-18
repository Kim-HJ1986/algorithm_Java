package GenericPrinter;

public class Plastic extends Material{
    @Override
    public void doPrinting() {
        System.out.println("GenericPrinter.Plastic 재료로 출력합니다~");
    }


    public String toString(){
        return "재료는 GenericPrinter.Plastic 입니다.";
    }
}
