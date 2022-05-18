package GenericPoint;

// 자료형 매개변수를 여러 개 사용하는 제네릭 메서드 예제
public class Point<T, V> {
    T x;
    V y;

    Point(T x, V y){
        this.x =x;
        this.y =y;
    }

    public T getX(){
        return x;
    }
    public V getY(){
        return y;
    }
}
