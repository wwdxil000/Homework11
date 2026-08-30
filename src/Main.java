import java.time.LocalDate;

public class Main {
    public static void isLeap(int year){
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " год — високосный год");
        }
        else{
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void updatingPhone(int model, int year){
        int currentYear = LocalDate.now().getYear();
        if ((model == 0) && (year < currentYear)){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ((model == 0) && (year > currentYear)) {
            System.out.println("Установите новую версию приложения для iOS по ссылке");
        } else if ((model == 1) && (year < currentYear)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Установите новую версию приложения для Android по ссылке");
        }

    }
    public static int getDeliveryDays(int distance) {
        int category;
        if (distance <= 20) {
            category = 0;
        } else if (distance <= 60) {
            category = 1;
        } else if (distance <= 100) {
            category = 2;
        } else {
            category = 3;
        }
        switch (category) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        // 1
        int chekYear = 2008;
        isLeap(chekYear);
        chekYear = 2009;
        isLeap(chekYear);
        // 2
        int modelPhone = 0;
        int year1 = 2009;
        updatingPhone(modelPhone, year1);
        modelPhone = 0;
        year1 = 2027;
        updatingPhone(modelPhone, year1);
        modelPhone = 1;
        year1 = 2009;
        updatingPhone(modelPhone, year1);
        modelPhone = 1;
        year1 = 2027;
        updatingPhone(modelPhone, year1);
        // 3
        int deliveryDistance = 95;
        int days = getDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}