package task_computer;

public class Computer {

    int index;

    public Computer (int index) {
        this.index = index;
    }

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        computers[0] = new Computer(2);
        computers[1] = new Computer(4);
        computers[2] = new Computer(6);
        computers[3] = new Computer(8);
        computers[4] = new Computer(10);

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].index);
        }
    }
}
