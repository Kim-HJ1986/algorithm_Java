package GenericPrinter;

// 다이아몬드 연산자에 T를 extends로 제한하기. T에는 Material의 자식 클래스만 올 수 있다.
public class GenericPrinter <T extends Material>{
    private T material;

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing(){
        // Material을 상속받기 때문에 Material의 메서드를 사용 가능한 것.
        material.doPrinting();
    }

}
