package GenericPrinter;

public class Powder extends Material{
    @Override
    public void doPrinting() {
        System.out.println("GenericPrinter.Powder 재료로 출력합니다~");
    }

    public String toString(){
        return "재료는 GenericPrinter.Powder 입니다.";
    }
}
