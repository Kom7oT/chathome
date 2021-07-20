package HomeWork1;

public class Human implements JumpableRunnable {
    String name;
    int maxJump;
    int maxRun;

    public Human(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public Human(String name) {
        this.name = name;
    }


    @Override
    public void jump(String name) {
        System.out.println("Human" + name + "jump!");
    }

    @Override
    public int getMaxHeight() {
        return maxJump;
    }

    @Override
    public void run(String name) {
        System.out.println("Human" + name + "run!");
    }

    @Override
    public int getMaxLength() {
        return maxRun;
    }

    @Override
    public String toString() {
        return "Человек " + name;
    }
}
