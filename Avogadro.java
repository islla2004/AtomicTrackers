public class Avogadro {



    public static void main (String[] args){




        double P=0.5e-6;
        double R=8.31457;
        double N=9.135e-4;

        double[] r= StdIn.readAllDoubles();
        double sum=0;
        double D=0;
        double T=297;
        double count=0;
        for (int i = 0; i < r.length; i++) {
            sum+=Math.pow(r[i]*0.175-6,2);
            count++;
        }
        D=sum/(2*count);
        double botzman=(6*3.1415*D*N*P)/T;
        double avogadro=R/botzman;
        System.out.println("botzman = "+botzman);
        System.out.println("avogadro = "+avogadro);
    }
}
