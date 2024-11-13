package command;

import command.code.*;
import command.code.garageDoor.GarageDoor;
import command.code.garageDoor.GarageDoorCloseCommand;
import command.code.garageDoor.GarageDoorOpenCommand;
import command.code.light.Light;
import command.code.light.LightOffCommand;
import command.code.light.LightOnCommand;

/**
 * Client 코드 - 실행을 위한 설정
 */
public class CommandMain {
    public static void main(String[] args) {
        // 수신자 객체 생성
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // ConcreteCommand 객체 생성
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        // Invoker 객체 생성
        RemoteControl remote = new RemoteControl();

        // 켜기 명령 실행
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, garageDoorOpen, garageDoorClose);

        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        System.out.println(remote);

    }
}
