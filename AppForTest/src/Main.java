public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
           for (int i= 10; i>0; --i) {
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println(i);
           }
        });

        System.out.println("Пожалуйста, дождитесь окончания таймера");
        thread.start();
        thread.join();

        System.out.println("Ваши данные скомпрометированы, вы мамонт");
        Thread.sleep(5000);
    }
}