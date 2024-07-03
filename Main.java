package org.example;

import java.util.Scanner;

class Main{
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        int now = 2024;
        String name;
        int age;
        double height;
        double mass;
        System.out.print("Ваше имя: ");
        name = input.nextLine();
        System.out.print("Ваш возраст: ");
        age = input.nextInt();
        System.out.println("Ваш рост (в метрах): ");
        height = input.nextDouble();
        System.out.print("Масса тела (в килограммах): ");
        mass = input.nextDouble();
        double bmi = mass/height/height;
        System.out.println("Здравствуйте,"+ name + "!");
        System.out.println("Вы родились" + (now-age) + "году.");
        System.out.printf("Ваш индекс массы тела: %3.2f\n",bmi);

    }
}