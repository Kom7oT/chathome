package HomeWork1;

public class Robot implements JumpableRunnable {
    String name;
    int maxJump;
    int maxRun;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public int getMaxHeight() {
        return maxJump;
    }

    @Override
    public void jump(String name) {
        System.out.println("Robot" + name + "jump!");
    }

    @Override
    public int getMaxLength() {
        return maxRun;
    }

    @Override
    public void run(String name) {
        System.out.println("Robot" + name + "run!");
    }

    @Override
    public String toString() {
        return "Робот " + name;
    }
}
