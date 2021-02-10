package Lab8;

import java.util.List;

public class Macro implements Command {

    List<Command> commands;

    public Macro(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).execute();
        }
    }
}
