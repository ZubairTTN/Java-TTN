package MultiThreading2.Synchronization;

public class Counter1 {
    private int count = 0;

    // when multiple threads access the same shared recource then it is known as
    // race condition
    public void increment() {
        // when we use synchronization then it is known as mutual exclusion which
        // ensures that no threads can access the same resource at the same time
        synchronized (this) {
            count++;
        }

    }

    public int getCount() {
        return count;
    }
}

/*
 * There exists two types of lock that a Thread performs over a resource during
 * its execution:
 * 1. Intrinsic: These are built into every object in java. When we use a
 * synchronized keyword, we are using these automatic locks
 * 
 * 2. Explicit: These are more advanced locks and we can control using the lock
 * class.
 * Lock lock = new ReentrantLock(); // object instance 
 * lock.tryLock() it acquires lock only if it is free at the time of imvocation, if the lock is not available then it will return with the value false
 * lock.tryLock(3000) this method Acquires the lock if it is free within the given waiting time(here 3 seconds) and the current Thread has not been interrupted, if the lock is avaliable it will return with value true else false
 * 
 *lock.unlock() this method is used to release the acquired lock and it is always written in finally block as in finally block we release the resources
 try{
 }
 catch(Exception e)
 {

 }
 finally{
 lock.unlock();
 }

 lock.lock(); if a thread encounters this method then it will kwwp on waiting untill it acquires the lock 
 */  

