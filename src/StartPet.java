import animals.Animal;

import java.util.Scanner;

public class StartPet {
    ChoiceUser action = new ChoiceUser();
    Animal animal;
    Scanner scanner = new Scanner(System.in);
    Integer tmp;

    //запуск программы
    public void start() {
        Navigation.showStartNavigation();
        this.tmp = scanner.nextInt();
        //сценарий выбора с защитой
        this.checkChoise(this.tmp, 1);
        if (this.tmp == 1) {
            this.actionChoisAnimal();
        }
        //сценарий выбора "завершить работу"
        if (tmp == 0) {
            System.out.println("вы завершили работу, до свидания");
            System.exit(0);
        }
    }

    //выбор животного
    private void actionChoisAnimal() {
        Navigation.animalSelection();
        this.tmp = scanner.nextInt();
        this.checkChoise(tmp, 3);
        if (tmp >= 1 && tmp <= 3) {
            this.animal = action.getAnimal(tmp);
            this.animal.getStatusAnimal(animal);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            actionChoiceComand();
        }
        if (tmp == 0) {
            System.out.println("вы завершили работу, до свидания");
            System.exit(0);
        }
    }

    //выбор команды
    private void actionChoiceComand() {
        Navigation.actionSelection();
        tmp = scanner.nextInt();
        if (tmp == 9) {
            actionChoisAnimal();
        }
        this.checkChoise(tmp, 4);
        while (tmp != 9) {
            if (tmp >= 1 && tmp <= 4) {
                action.getAction(animal, tmp);
                System.out.println(" ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(" ");
                }
            }
            if (tmp == 0) {
                System.out.println("вы завершили работу, до свидания");
                System.exit(0);
            }
            actionChoiceComand();
        }
    }

    //проверка ввода
    private void checkChoise(int tmp, int last) {
        while (tmp < 0 || tmp > last) {
            System.out.println("вы ввели несоответствующий номер пункта. Попробуйте еще раз");
            tmp = scanner.nextInt();
        }
        this.tmp = tmp;
    }
}