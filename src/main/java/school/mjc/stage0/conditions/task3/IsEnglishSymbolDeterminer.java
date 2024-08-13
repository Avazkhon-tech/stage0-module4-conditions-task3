package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int sym = symbol;
        if (sym >= 0 && sym <= 127) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
