import java.util.*;
import java.lang.*;
import java.io.*;
public class Assignment01C {
    public static void main(String[] args) {
        double home,about,product,link,review_A,review_B,review_C,review_D;
        //Initial PageRank=1.0
        about=1.0;
        home=1.0;
        product=1.0;
        link=1.0;
        review_A=1.0;
        review_B=1.0;
        review_C=1.0;
        review_D=1.0;
        for(int i=1;i<=40;i++)
        {
            double pr1=(0.15+(0.85*((about/1.0)+(home/1.0)+(product/1.0)+(link/9.0)+(review_A)/1.0+(review_B/1.0)+(review_C/1.0)+(review_D/1.0))));
            double pr2=(0.15+(0.85*((pr1/3.0))));
            about=pr2;
            double pr3=(0.15+(0.85*((pr1/3.0))));
            product=pr3;
            double pr4=(0.15+(0.85*((pr1/3.0))));
            link=pr4;
            double pr5=(0.15+(0.85*((pr4)/9.0)));
            review_A=pr5;
            double pr6=(0.15+(0.85*((pr4)/9.0)));
            review_B=pr6;
            double pr7=(0.15+(0.85*((pr4)/9.0)));
            review_C=pr7;
            double pr8=(0.15+(0.85*((pr4)/9.0)));
            review_D=pr8;
            double pr9=(0.15+(0.85*((pr4)/9.0)));
            double pr10=(0.15+(0.85*((pr4)/9.0)));
            double pr11=(0.15+(0.85*((pr4)/9.0)));
            double pr12=(0.15+(0.85*((pr4)/9.0)));
            System.out.print("Iterator "+i+"--> Home PR="+pr1+"| About PR="+pr2+"| Product PR="+pr3+"| Link PR="+pr4+"| ReviewA PR="+pr5+"| ReviewB PR="+pr6+"| ReviewC PR="+pr7+"| ReviewD PR="+pr8+"| ExternalSiteA PR= "+pr9+"| ExternalSiteB PR= "+pr10+"| ExternalSiteC PR= "+pr11+"| ExternalSiteD PR= "+pr12);
            System.out.println();

        }

    }
}
