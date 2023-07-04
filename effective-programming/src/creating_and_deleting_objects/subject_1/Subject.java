/*
Subject 1: Creating static factory methods instead of constructors.

The best known method of providing objects of a certain type is to create a public constructor.
There is also a lesser known technique that should be used more widely by developers.
A class can contain a public static factory method, which is just a regular static method.
 */

package creating_and_deleting_objects.subject_1;

import java.util.Random;

class Foo {
    /*
    This is a static factory method that converts a simple boolean value to a Boolean object.
     */
    public static Boolean valueOf(boolean b) {
        return (b ? Boolean.TRUE : Boolean.FALSE);
    }
}

/*
    A class can offer a static factory method in place of or in addition to constructors
    There are pros and cons to using static factory methods instead of public constructors
*/

/*
    First advantage:
    static factory method have names, constructors don't
 */
class BigInteger {
    int i,y;
    Random r;
    BigInteger(){}
    BigInteger(int i, int y, Random r) {
        this.i = i;
        this.y = y;
        this.r = r;
    }
    BigInteger(int i, Random r, int y) {
        this.i = i;
        this.y = y;
        this.r = r;
    }
    /*
        When a class requires several constructors with the same type signature,
        you should consider replacing some of the constructors
        with static factory methods whose names clearly reflect the differences in behavior.
    */
    public static BigInteger probablePrime(int i, int y, Random r) {
        BigInteger bigInteger = new BigInteger();
        /*
        code
         */
        return bigInteger;
    }
    public static void main(String[] args) {
        Random r = new Random();
        BigInteger f1 = new BigInteger(1,1,r);
        BigInteger f2 = new BigInteger(1,r,1);
        BigInteger f3 = BigInteger.probablePrime(1,1,r);
    }
}

