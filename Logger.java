//Шаблон Singleton: Реализуйте паттерн Singleton на языке Python для класса
//Logger, который будет использоваться для логирования информации в приложении.
//Гарантируйте, что только один экземпляр класса Logger будет создан.
    
    public class Logger {
        private static Logger instance;
        private Logger() {

        }
        public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void main(String[] args) {
        Logger a1 = Logger.getInstance();
        Logger a2 = Logger.getInstance();
        if (a1 == a2) {
            System.out.print("Объект а1 и а2 один и тот же");
        } else {
            System.out.print("Объекты а1 и а2 разные");
        }
    }
}
