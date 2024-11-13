package command.code;

import java.util.Arrays;

/**
 * Invoker 클래스 정의 - Command를 실행하는 클래스
 */
public class RemoteControl {
    private static final int SLOT_SIZE = 5;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[SLOT_SIZE];
        offCommands = new Command[SLOT_SIZE];

        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOT_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        // 다른 버튼을 한번도 누르지 않은 상태에서 undo 버튼을 눌렀을 때 실행
        undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("-------Remote Control-------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append(" ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }
        return builder.append("[undo]")
                .append("   ")
                .append(undoCommand.getClass().getSimpleName())
                .toString();
    }
}
