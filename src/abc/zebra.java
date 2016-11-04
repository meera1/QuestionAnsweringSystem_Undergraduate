/***
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
public class zebra {

    /**
     * @param args the command line arguments
     */
    static boolean flag=false;
static boolean flag1=false;
static int temp,q=0,counter=0,temp1=0,counter1=0,c6=0,counter4=0,l=0,count6,counter2,counter3,counter8,c9,r1=0,r2=0,r3=0;
static int index1[];
           static String arr[][],verb1[]=new String[1000];
        static int x = 0,max=0,g=0;
       static String copy = null;

    public void words() throws Exception
    {
        // TODO code application logic here
        MaxentTagger tagger = new MaxentTagger("D:\\final yr proj\\taggers\\wsj-0-18-left3words.tagger");
         // The sample string
        
        File f = new File("D:\\TGMC DVD2\\honest.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String arr1[][];
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
 char res1,res2,res3;
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
              //System.out.print(tagged);
              StringTokenizer st1 = new StringTokenizer(tagged, "_", false); //tokenizes every sentence
              a1=st1.nextToken();
              //System.out.print(a1);
               
               b1=st1.nextToken();
               //System.out.print(b1);
               // System.out.println();
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
      
      String verb[][]=new String[y1][5];
      File f1=new File("D:\\final yr proj\\irregular.txt");
BufferedReader br1=new BufferedReader(new FileReader(f1));
 String s1;
int x12=0;
String v1,v2;
int hell1=0;
String copy= null;

int i1 =0;

String a12[]=new String[3200];
while((s1=br1.readLine())!=null)
{

a12[i1]=s1; //all the sentences of each line stored in a[]


i1++; //final value of i will be equal to number of sentences
}

g=i1;
arr1 = new String[i1][4]; //creates 2-d array with rows-no.of sentences col-max sp


for(int j4=0;j4<i1;j4++)
{

StringTokenizer st=new StringTokenizer(a12[j4], " ", false);
int sp=st.countTokens();

for(int q=0;q<sp;q++)
{
arr1[j4][q]=st.nextToken(); //stores every word of the passage in arr[][]
}
}     
    for(int m=0;m<i1;m++)
{
for(int n=0;n<4;n++)
{
if(arr1[m][n]!=null)
System.out.print(arr1[m][n]+" "); //prints the passage

}
System.out.println();

}  
  int hell[] = new int[y1];
  for(int u=0;u<y1;u++)
      hell[u]=-1;
for(int j=0;j<y1;j++)
{
    for(int m=0;m<i1;m++)

{
for(int n=0;n<4;n++)    
    {
        if(verb2[j].equalsIgnoreCase(arr1[m][n]))
           hell[j]=m; 
    }
}
}   
    for(int j=0;j<y1;j++)
    {
        System.out.println(hell[j]);
    }
      
     for(int j=0;j<y1;j++)
     { if(hell[j]==-1)
         {
            v1=verb2[j];
          res3= v1.charAt(v1.length()-1);
          res2 = v1.charAt(v1.length()-2);
          res1 = v1.charAt(v1.length()-3);
          if(res3=='d'&& res2=='e')
              
          {
              verb[hell1][1]=v1;
              verb[hell1][0]=v1.substring(0, v1.length()-2);
              verb[hell1][2]="will "+v1.substring(0, v1.length()-2);
              verb[hell1][3]=v1.substring(0, v1.length()-2)+"ing";
              hell1++;
          }
          
          else if(res3=='g'&& res2=='n' && res1=='i' )
           {
               verb[hell1][3]=v1;
              verb[hell1][0]=v1.substring(0, v1.length()-3);
              verb[hell1][2]="will "+v1.substring(0, v1.length()-3);
              verb[hell1][1]=v1.substring(0, v1.length()-2)+"ed";
              hell1++;
           }
          else if(res3=='e')
          {
              verb[hell1][0]=v1;
              verb[hell1][1]=v1+"d";
              verb[hell1][2]="will "+v1;
              v2=v1.substring(0,v1.length()-2);
              verb[hell1][1]=v2+"ing";
              hell1++; 
          }
                  
          else
          {
              verb[hell1][0]=v1;
              verb[hell1][1]=v1+"ed";
              verb[hell1][2]="will "+v1;
              verb[hell1][1]=v1+"ing";
              hell1++;
          }
           }
             
            else 
      {
        verb[hell1][0]=arr1[hell[j]][0];
        verb[hell1][1]=arr1[hell[j]][1];
        verb[hell1][2]="will "+arr1[hell[j]][0];
        verb[hell1][3]=arr1[hell[j]][3];
        hell1++;
        
    }
         }
   
    
    for(int u=0;u<hell1;u++)
    {
        for(int r=0;r<5;r++)
            System.out.print(verb[u][r]+" ");
            System.out.println();       
    }
    System.out.println();
    
    
    
    
    
    
    

}
    
public static void main(String args[]) throws Exception
  {
      zebra z= new zebra();
      z.words();
  }
}
