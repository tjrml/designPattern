package command.code.light;

import command.code.Command;

/**
 * ConcreteCommand 클래스 정의 - 명령을 구체적으로 구현
 */
public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
