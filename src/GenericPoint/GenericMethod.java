package GenericPoint;

public class GenericMethod {
    // 제네릭 메서드
    // 형식: public_<자료형 매개변수>_반환형_메서드명_(자료형 매개변수){}
    public static <T, V> double makeRectangle(Point<T,V> p1, Point<T,V> p2){
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p2.getY()).doubleValue();
        double bottom = ((Number)p1.getY()).doubleValue();

        double width = right - left;
        double height = top - bottom;

        return width * height;
    }

    public static void main(String[ ] args){
        Point<Integer, Double> p1 = new Point<>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        // 제네릭 메서드를 호출할 때 p1, p2가 <Integer, Double>형으로 선언되어 유추 가능하기 때문에 자료형 유추 가능!
        double rect = GenericMethod.makeRectangle(p1, p2);
        double rect2 = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
        System.out.println(rect);
        System.out.println(rect2);
    }
}
