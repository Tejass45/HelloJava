/*
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers.
 */

class Bikers {
    public static void main(String[] args)
    {
        float r1=200,r2=100,r3=150,r4=170,r5=120,avg;
        avg = (r1+r2+r3+r4+r5)/5;
        System.out.println("Average = "+avg);
        if(r1>avg)
            System.out.println("Racer R1 qualified");
        if(r2>avg)
            System.out.println("Racer R2 qualified");
        if(r3>avg)
            System.out.println("Racer R3 qualified");
        if(r4>avg)
            System.out.println("Racer R4 qualified");
        if(r5>avg)
            System.out.println("Racer R5 qualified");
    }
}