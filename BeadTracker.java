public class BeadTracker {

 public static void main(String[] args){
     int P=Integer.parseInt(args[1]);
     double tue=Integer.parseInt(args[1]);
     double delta=Integer.parseInt(args[2]);
     Picture p1;
     Picture p2;



     for (int i = 3; i < args.length-1 ; i++) {
         p1=new Picture(args[i]);
         p2=new Picture(args[i+1]);
         BeadFinder find1=new BeadFinder(p1,tue);
          BeadFinder find2=new BeadFinder(p2,tue);
         Blob[] blob1=find1.getBeads(25);
         Blob[] blob2=find2.getBeads(25);
         for (int j = 0; j < blob1.length; j++) {
             double least=0;
             boolean first=true;
             for (int k = 0; k < blob2.length; k++){
                 double distance=blob2[k].distinceTo(blob1[j]);
                 if (distance<=delta&&first){
                     least=distance;
                     first=false;
                 } else if (distance <= delta && distance < least) {
                     least=distance;
                 }
             }
             if (least>0){
                 System.out.format("%.4f\n",least);
             }
         }






















     }





 }


}
