package HomeWork1;

public class Cat implements JumpableRunnable {
    String name;
    int maxJump;
    int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int getMaxHeight() {
        return maxJump;
    }

    @Override
    public void jump(String name) {
        System.out.println("Cat" + name + "jump!");
    }

    @Override
    public int getMaxLength() {
        return maxRun;
    }

    @Override
    public void run(String name) {
        System.out.println("Cat" + name + "run!");
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}
