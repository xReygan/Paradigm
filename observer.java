//Шаблон Наблюдатель: Реализуйте паттерн Наблюдатель на языке Python
//для системы уведомлений. Создайте класс NotificationSystem (наблюдаемый
//объект), который будет иметь методы для добавления наблюдателей и уведомления
//о событиях. Создайте несколько наблюдателей, реагирующих на уведомления.

import java.util.List;
import java.util.ArrayList;

class Observer {
    void update(String message) {
        System.out.println("Received message: " + message);
    }
}
  
class NotificationSystem {
    static List<Observer> observers = new ArrayList<>();
  
    // уведомление о событиях
    public void notifyObservers(String message) {
        for (Observer observer : observers)
           observer.update(message);
    }

    // добавить наблюдателя
    public static void addObserver(Observer observer) {
        observers.add(observer);
    }
  
    public static void main(String[] args) {
        String message = "Срочная новость!!!";
        NotificationSystem observedObject = new NotificationSystem(); //создаем объект наблюдения
        Observer observer1 = new Observer();
        Observer observer2 = new Observer();
        Observer observer3 = new Observer();

        addObserver(observer1);
        addObserver(observer2);
        addObserver(observer3);
        observedObject.notifyObservers(message);
    }
}