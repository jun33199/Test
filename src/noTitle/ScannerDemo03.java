package noTitle;

import java.util.Scanner;

public class ScannerDemo03{

     public static void main(String[] args){

          Scanner scan=new Scanner(System.in);

          boolean flag=true;

          int i=0;

          float f=0.0f;



          while(flag){

                System.out.println("��������:\n\n");

                if(scan.hasNextInt()){

                      i=scan.nextInt();

                      System.out.println("��������:"+i+"\n");

              
                      flag=false;


                }else{

                      System.out.println("����Ĳ���������\n");

                      flag=true;

                }

           }

          System.out.println("����С��:\n\n");

          if(scan.hasNextFloat()){

               f=scan.nextFloat();

               System.out.println("С������:"+f);


          }else{

               System.out.println("����Ĳ���С����");

          }


     }


}

