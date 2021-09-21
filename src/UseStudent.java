class Student {
    double phy;
    double chem;
    double maths;
    double eng;
    double ele;
}

public class UseStudent {
    public static void main(String[] args)
    {
        //Creating object of class
        Student a = new Student();
        Student b = new Student();
        double avg1,avg2;

        //Assign Values
        a.phy = 81;
        a.chem = 78;
        a.maths = 85;
        a.eng = 76;
        a.ele = 88;

        b.phy = 82;
        b.chem = 83;
        b.maths = 89;
        b.eng = 87;
        b.ele = 82;

        avg1 = (a.phy+a.chem+a.maths+a.eng+a.ele)/5;
        avg2 = (b.phy+b.chem+b.maths+b.eng+b.ele)/5;

        System.out.println(" Average 1 = "+avg1);
        System.out.println(" Average 2 = "+avg2);
    }
}
