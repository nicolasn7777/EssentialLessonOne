package task_address;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex("01001");
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Vadyma Getmana st.");
        address.setHouse(10);
        address.setApartment(5);

        System.out.println("Поштовий індекс: " + address.getIndex());
        System.out.println("Країна: " + address.getCountry());
        System.out.println("Місто: " + address.getCity());
        System.out.println("Вулиця: " + address.getStreet());
        System.out.println("Будинок: " + address.getHouse());
        System.out.println("Квартира: " + address.getApartment());
    }
}
