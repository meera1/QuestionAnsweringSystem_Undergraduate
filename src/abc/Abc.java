/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;
import java.io.*;
import java.util.*;

 
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
/**
 *
 * @author Vaibhav
 */
public class Abc {

    /**
     * @param args the command line arguments
     */
           static String temp,arr[][],verb1[]=new String[1000];
        static int x = 0,max=0,g=0;
       static String copy = null;

    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        MaxentTagger tagger = new MaxentTagger("D:\\final yr proj\\taggers\\wsj-0-18-left3words.tagger");
         // The sample string
        
        File f = new File("D:\\final yr proj\\honest.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));

        int i = 0;
        String s;
        String a[] = new String[320];
        while ((s = br.readLine()) != null) {

            a[i] = s; //all the sentences of each line stored in a[]


            i++; //final value of i will be equal to number of sentences
        }

        for (int j = 0; j < i; j++) {

            StringTokenizer st = new StringTokenizer(a[j], " ", false); //tokenizes every sentence
            int sp = st.countTokens(); //sp is total no. of tokens in every sentence

            if (max < sp) {
                max = sp; //finds max of all the sps
            }
        }
        g = i;
        arr = new String[i][max]; //creates 2-d array with rows-no.of sentences col-max sp
        for (int j = 0; j < i; j++) {

            StringTokenizer st = new StringTokenizer(a[j], " ", false);
            int sp = st.countTokens();
            for (int q = 0; q < sp; q++) {
                arr[j][q] = st.nextToken(); //stores every word of the passage in arr[][]
            }
        }
        int i7=0;
        
 String a1,b1;
 boolean flag44=false;
 int x=0,x1=0,flag7=0,count22=0;
        // The tagged string
  for(int e=0;e<g;e++)
        {
            for(int t=0;t<max;t++)
            {
                c: if(arr[e][t]!=null)
                {
              String tagged = tagger.tagString(arr[e][t]);
              //System.out.print(tagged+" ");
              StringTokenizer st1 = new StringTokenizer(tagged, "_", false); //tokenizes every sentence
              a1=st1.nextToken();
              System.out.print(a1+" ");
               
               b1=st1.nextToken();
               System.out.print(b1);
               System.out.println();
               if(b1.equalsIgnoreCase("VB ")||b1.equalsIgnoreCase("VBG ")||b1.equalsIgnoreCase("VBD ")||b1.equalsIgnoreCase("VBn ")||b1.equalsIgnoreCase("VBz ")||b1.equalsIgnoreCase("VBp "))
               {
                   
                   
                   verb1[x1]=a1;
                   x1++;
                   
                   
                 /* //System.out.print(a1);
                 // System.out.println(b1);
                   if(flag7==0)
                   {
                       //System.out.println(a1);
                      verb1[x1]=a1;
                      System.out.println(verb1[x1]);
                      flag7=3;
                      x1++; 
                      break c;
                   }
                   for(int m=0;m<x1;m++)
                   {
                       if(verb1[m].equalsIgnoreCase(a1))
                       {   // System.out.println("hahahaha");
                       flag44=true;
                   }
                   }
                   if(!flag44 && flag7==3)
                   {
                      //System.out.println("hahahaha");
                      verb1[x1]=a1;
                      System.out.println(verb1[x1]);
                      //System.out.println(e);
                      
                      x1++;
                   }
                   
              */ }

             
                }
               
            }
             
        }
 // System.out.println(g);
                      
    /*  for(int w=0;w<x1;w++)
            
        System.out.println(verb1[w]);
      */
      for(int y=0;y<verb1.length;y++)
      {
          for(int r=y+1;r<verb1.length;r++)
          {
              if(verb1[r]!=null)
              if(verb1[y].equalsIgnoreCase(verb1[r]))
              {
                  verb1[r]="zz";
                  count22++;
              }
          }
          
      }
      int count33=x1-count22;
      String verb2[]=new String[1000];
      
      //System.out.println("hahahaha");
      
      // for(int w=0;w<x1;w++)
            
       // System.out.println(verb1[w]);
       
      int y1=0;
      for(int u=0;u<x1;u++)
      {
          if(!verb1[u].equals("zz"))
      {
          verb2[y1]=verb1[u];
          y1++;
      }
          
      }
      
      
      for(int w=0;w<y1;w++)
            
        System.out.println(verb2[w]);
       
        /*
        for(int i1=0;i1<x;i1++)
        {
            
        //System.out.print(a1[i1]+" "+b1[i1]);
   if(b1[i1].equalsIgnoreCase("VB ")||b1[i1].equalsIgnoreCase("VBN ")||b1[i1].equalsIgnoreCase("VBZ ")||b1[i1].equalsIgnoreCase("VBP ")||b1[i1].equalsIgnoreCase("VBG ")||b1[i1].equalsIgnoreCase("VBD "))
    {
        System.out.println("defrgtyhuj");
        if(i7==0)
            {
                System.out.println("ggggg");
                verb1[x1]=a1[i1];
                x1++;
                flag44=true;
                i7=3;
            }
            
        AB:   for(int a3=0;a3<x1;a3++)
        {
            if(verb1[a3].equalsIgnoreCase(a1[i1]))
            {
               flag44=true; 
               break AB;
            }       
        }
        if(flag44!=true)
        {
                 verb1[x1]=a1[i1];
                 System.out.println(verb1[x1]);
                x1++;
                 }      
    }
        }
        
        
        for(int w=0;w<x1;x1++)
            
        System.out.println(verb1[x1]);
        */
        
    }
}
