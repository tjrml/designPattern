package command.code;

/**
 * Command 인터페이스 정의
 */
public interface Command {
    void execute();
    void undo();
}

