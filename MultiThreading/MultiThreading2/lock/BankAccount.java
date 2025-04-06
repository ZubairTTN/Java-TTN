package MultiThreading2.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    /*
     * here we will be using Lock methods instead of sunchronization
     * Lock is an interface class with overriden methods 1. lock.lock(), 2.
     * lock.trylock(), lock.unlock()
     */
    /* ReentrantLock is a class that is implementing the Lock Interface */
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
        try {
            lock.lock();
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal ");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println(e.getMessage());
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(
                            Thread.currentThread().getName() + " Completed withdrawal, remaining balance: " + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient Balance");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

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

