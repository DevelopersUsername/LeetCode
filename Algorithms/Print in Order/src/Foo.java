import java.util.concurrent.Semaphore;

class Foo {

    private Semaphore sem1;
    private Semaphore sem2;

    public Foo() {
        this.sem1 = new Semaphore(0);
        this.sem2 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        printFirst.run();
        this.sem1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        this.sem1.acquire();
        printSecond.run();
        this.sem1.release();
        this.sem2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        this.sem2.acquire();
        printThird.run();
        this.sem1.release();
    }
}