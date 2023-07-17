/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int isPrime(int input1){
  int count=0;
 for(int i=2;i<=Math.sqrt(input1);i++)
{
 if(input1%i==0)
     count++;
}
if(count==0)
 return 2;
 else
return 1;
 }
}