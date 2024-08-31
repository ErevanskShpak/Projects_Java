package AbstractClassInterface;

//Задача:
//
//Напишите свой класс StringBuilder, с возможностью оповещения других объектов об изменении своего состояния.
// Для этого делегируйте все методы стандартному StringBuilder, а в собственном классе реализуйте
// шаблон проектирования «Наблюдатель».

public class Task5 {
    public static void main(String[] args) {
        MyListener listener = new MyListener();
        StatusStringBuilder str = new StatusStringBuilder();
        str.setListener(listener);

        str.append("Bebra");
    }
}

interface StringBuilderListener {
    void onChange(StatusStringBuilder s);
}

class StatusStringBuilder {
    private StringBuilder sb;
    private StringBuilderListener listener;

    StatusStringBuilder() {
        sb = new StringBuilder();
    }

    void setListener(StringBuilderListener listener) {
        this.listener = listener;
    }

    public void notifyChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    public void append(String s) {
        sb.append(s);
        notifyChange();
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}

class MyListener implements StringBuilderListener {

    @Override
    public void onChange(StatusStringBuilder s) {
        System.out.println("Changed= " + s);
    }
}