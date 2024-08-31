package AbstractClassInterface;

//Задача:
//
//Напишите свой класс StringBuilder с поддержкой операции undo. Для этого делегируйте все методы стандартному
// StringBuilder, а в собственном классе храните список всех операций для выполнения undo(). Это будет реализацией
// шаблона «Команда».

import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        UndoStringBuilder str = new UndoStringBuilder();
        str.append("kakish");
        str.append("bebra");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.undo();
        System.out.println(str);
        str.undo();
        System.out.println(str);
        str.undo();
        System.out.println(str);
    }


}

class UndoStringBuilder {
    private interface Action {
        void undo();
    }

    private Stack<Action> actions = new Stack<Action>();
    private StringBuilder string;

    UndoStringBuilder() {
        string = new StringBuilder();
    }

    public void append(String str) {
        string.append(str);

        actions.push(new Action() {

            @Override
            public void undo() {
                string.delete(string.length() - str.length(), string.length());
            }
        });
    }

    public void reverse() {
        string.reverse();

        actions.push(new Action() {

            @Override
            public void undo() {
                string.reverse();
            }
        });
    }

    void undo() {
        if (!actions.empty()) {
            actions.pop().undo();
        }
    }

    @Override
    public String toString() {
        return string.toString();
    }
}
