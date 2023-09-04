//ООП Концепции: Создайте класс Person, который имеет атрибуты name,
//age и метод introduce(), выводящий информацию о человеке.
//Создайте несколько объектов этого класса и вызовите метод introduce()
//для каждого из них.

public class concepts {
    public static void main(String[] args) {
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

                public String introduce() {
                    return "Name: " + name + ", Age: " + age + " year";
                }
        }

        Person person1 = new Person("Kuzya", 326);
        Person person2 = new Person("Barmaley", 45);
        Person person3 = new Person("Duremar", 37);
        Person person4 = new Person("Karabas", 62);
        Person person5 = new Person("Vasilisa", 24);

        System.out.println(person1.introduce());
        System.out.println(person2.introduce());
        System.out.println(person3.introduce());
        System.out.println(person4.introduce());
        System.out.println(person5.introduce());
    }
}
