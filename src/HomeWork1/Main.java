package HomeWork1;

/**
 * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
 * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны
 * выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
 * (успешно пробежал, не смог пробежать и т.д.).
 * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 * 4.* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 **/
public class Main {
    public static void main(String[] args) {
        JumpableRunnable[] members = {
                new Human("Vasya", 16, 14),
                new Human("Masha", 10, 6),
                new Cat("Barsik", 5, 5),
                new Cat("Murzik", 4, 4),
                new Robot("Destructor", 2, 4),
                new Robot("Terminator", 13, 6)
        };

        Obstaclable[] obstacles = {
                new Wall(1),
                new Wall(8),
                new RunningTrack(12),
                new RunningTrack(7)
        };

        for (JumpableRunnable member : members) {
            boolean winner = true;
            System.out.println("К прохождению препятствий подходит: " + member);
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует преодолеть: " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("Не вышло");
                    break;
                }
            }

            if (winner) {
                System.out.println(member + " прошел все препятствия!!!");
            }
            else System.out.println(member + " выбыл из гонки(((");
            System.out.println();
        }
    }
}
