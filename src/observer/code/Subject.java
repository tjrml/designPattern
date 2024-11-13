package observer.code;

public interface Subject {
    /**
     * 옵저버를 등록하고 제거하는 메서드
     */
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    /**
     * 주체의 상태가 변경 되었을 때 모든 업저버에게 변경 내용을 알리는 메서드
     */
    void notifyObserver();
}
