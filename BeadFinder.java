import java.awt.*;
public class BeadFinder {

    private Picture image;
    private double tau;

   

    public   BeadFinder(Picture picture, double tau) {
        image=picture;
        this.tau=tau;
Blob[] bolb=new Blob[20];


    }

    public static void Finder( int x , int y,Picture picture) {
        int conter=0;
        double avgX = 0;
        double avgY = 0;
        double[] xx = new double[20];
        double[] yy = new double[29];
        Blob[] blob = new Blob[conter];

            xx[conter] = x;
            yy[conter] = y;
            conter++;

            picture.set(x,y,Color.black);

        if (x != 639&&y != 479&&y != 0&&x != 0 && picture.get(x+1, y).equals(Color.white)) {
            Finder(  x + 1, y,picture);
        }
        if (y != 479 &&x != 639&&y != 0&&x != 0&& picture.get(x, y+1).equals(Color.white)) {
            Finder(  x, y + 1,picture);
        }
        if (y != 0 &&y != 479&&x != 639&&x != 0&& picture.get(x, y-1).equals(Color.white)) {
            Finder(  x, y - 1,picture);
        }
        if (x != 0&&y != 479 &&x != 639&&y != 0&& picture.get(x-1, y).equals(Color.white)) {
            Finder(  x - 1, y,picture);
        }
        if (x != 0&&y != 479 &&x != 639&&y != 0&& picture.get(x+1, y+1).equals(Color.white)) {
            Finder(  x +1 , y+1,picture);
        }
        if (x != 0&&y != 479 &&x != 639&&y != 0&&picture.get(x-1, y+1).equals(Color.white)) {
            Finder(  x - 1, y+1,picture);
        }
        if (x != 0&&y != 479 &&x != 639&&y != 0&& picture.get(x+1, y-1).equals(Color.white)) {
            Finder(x + 1, y - 1, picture);
        }
        if (x != 0&&y != 479 &&x != 639&&y != 0&& picture.get(x-1, y-1).equals(Color.white)) {
                Finder(x - 1, y - 1, picture);

        }





    }






    public Blob[] getBeads(int min) {
        Blob[] Blob=new Blob[10];
        int[] aa = new int[10];
        min=25;
        for (int i = 0; i < 10; i++) {
          if(  aa[i]>=25){

          }
        }



        return Blob;
    }







    public static void main(String[] args) {
        String file;
        int conter = 0;
        double avgX = 0;
        double avgY = 0;
        double[] xx = new double[conter];
        double[] yy = new double[conter];

        for (int m = 0; m < 199; m++) {
            if (m >= 0 && m <= 9)
                file = "frame0000" + m + ".jpg";
            if (m >= 10 && m <= 99)
                file = "frame000" + m + ".jpg";
            if (m >= 100 && m <= 199)
                file = "frame00" + m + ".jpg";

        }
            Picture picture = new Picture("frame00000.jpg");


            for (int i = 0; i < picture.width(); i++) {
                for (int j = 0; j < picture.height(); j++) {
                    if (picture.get(i, j).getBlue() > 180) {
                        picture.set(i, j, Color.white);

                    } else {
                        picture.set(i, j, Color.black);
                    }

                }
            }

            Blob[] blob = new Blob[conter];
            for (int i = 0; i < picture.width(); i++) {
                for (int j = 0; j < picture.height(); j++) {
                    if (picture.get(i, j).equals(Color.white)) {

                        Finder ( i, j,picture);

                        }
                }
           }








        }


    }
        


