/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 import java.io.*;
import  java.util.*;
class UserMainCode
{
 public long nthFibonacci(int input1){
 if(input1==1)
 return 0;
if(input1==2)
 return 1;
 else
 return nthFibonacci(input1-1)+nthFibonacci(input1-2);
 }
}