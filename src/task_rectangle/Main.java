package com.oop.first.task_rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle side1 = new Rectangle();
        Rectangle side2 = new Rectangle();
        Rectangle perimeter = new Rectangle();
        Rectangle area = new Rectangle();

        System.out.println("Введіть першу сторону прямокутника: ");
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();
        System.out.println("Введіть другу сторону прямокутника: ");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner2.nextDouble();

        side1.setSide1(a);
        side2.setSide2(b);

        System.out.println("Периметр прямокутника дорівнює: " + perimeter.perimeterCalculator(side1.getSide1(), side2.getSide2()));
        System.out.println("Площа прямокутника дорівнює: " + area.areaCalculator(side1.getSide1(), side2.getSide2()));

    }
}
