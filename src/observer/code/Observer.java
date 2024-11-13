package observer.code;

public interface Observer {
    /**
     * 기상 정보가 변경 되었을 때 옵저버에게 전달하는 메소드
     * observer 인터페이스는 모든 옵저버 클래스에서 구현해야 한다.
     * 따라서 모든 옵저버는 update() 메소드를 구현해야 한다.
     */
//    void update(float temp, float humidity, float pressure);

    void update();
}
