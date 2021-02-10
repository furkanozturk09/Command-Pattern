package Lab8;


public class GamingKeyboard {
    Command[] macroKeys = new Command[5];

    public GamingKeyboard() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < macroKeys.length; i++) {
            macroKeys[i] = noCommand;
        }
    }

    public void assignMacro(int idx, Command command) {
        macroKeys[idx] = command;
    }

    public void pressMacroKey(int idx) {
        macroKeys[idx].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Macro Keys\n");

        for (int i = 0; i < macroKeys.length; i++) {
            sb.append(macroKeys[i].toString());
        }

        return sb.toString();
    }
}
