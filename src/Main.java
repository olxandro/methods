public class Main {

    public static void main(String[] args) {
        //task1
        /*
        Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и
        выводит результат в консоль. Эту проверку вы уже реализовывали в задании по условным операторам. Теперь проверку
        нужно обернуть в метод и использовать год, который приходит в виде параметра.
        Результат программы выведите в консоль. Если год високосный, то должно быть выведено “номер года — високосный
        год”. Если год не високосный, то, соответственно: “номер года — не високосный год”.
         */
        findLeapYear(2021);

        //task2
        /*
        Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию
        приложения. Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android)
        и год выпуска устройства. Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную, введя в переменную числовое значение.
        В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения
        (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.
         */
        installSoftware(0, 2014);

        //task3
        /*
        Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты отбанка.
        Вернемся к делам банковским.
        Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое
        количество дней доставки.
         */

        deliverProduct(95);
        deliverProduct(95);
        deliverProduct(95);
    }


    public static void findLeapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0){
            System.out.println(leapYear + " год является високосным!");
        } else {
            System.out.println(leapYear + " год не является високосным.");
        }
    }

    public static void installSoftware(int clientOS, int prodactionYear) {
        String device = clientOS == 0 ? "iOS" : "Android";
        String version = prodactionYear < 2015 ? "облегченную" : "";
        System.out.printf("Установите %s версию приложения для %s по ссылке\n", version, device);

    }

    public static void deliverProduct(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays += 1;
            System.out.println("Для доставки банковского продукта потребуется " + deliveryDays + " дней!");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 2;
            System.out.println("Для доставки банковского продукта потребуется " + deliveryDays + " дней!");
        } else if (deliveryDistance >= 60 && deliveryDistance < 90) {
            deliveryDays += 3;
            System.out.println("Для доставки банковского продукта потребуется " + deliveryDays + " дней!");
        } else {
            deliveryDays += 4;
            System.out.println("Для доставки банковского продукта потребуется от " + deliveryDays + " дней! За " +
                    " подробной информацией обращайтесь по номеру телефона 888005555050.");
        }
    }
}
