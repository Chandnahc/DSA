class Foo {
    private CountDownLatch r1 = new CountDownLatch(1);
    private CountDownLatch r2 = new CountDownLatch(1);
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        r1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        r1.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        r2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        r2.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}