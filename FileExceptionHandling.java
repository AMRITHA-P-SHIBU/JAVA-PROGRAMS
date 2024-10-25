package lab24;

import java.util.*;

import java.io.*;

public class FileExceptionHandling {

public static void main(String[] args)throws IOException {
Scanner sc=new Scanner(System.in);
try {
File f1=new File("numbers.txt");
f1.createNewFile();
System.out.println(f1.getName()+" created\n");
File f2=new File("even.txt");
f2.createNewFile();
System.out.println(f2.getName()+" created\n");
File f3=new File("odd.txt");
System.out.println(f3.getName()+" created\n");
System.out.println("Enter the number of elements you want to store:");
int n=sc.nextInt();
FileOutputStream fout=new FileOutputStream(f1);
System.out.println("Enter the elements:");
for(int i=0;i<n;i++) {
int num=sc.nextInt();
fout.write(num);
}
fout.close();
System.out.println("Data added");
FileInputStream fin=new FileInputStream(f1);
FileOutputStream fout1=new FileOutputStream(f2);
FileOutputStream fout2=new FileOutputStream(f3);
int i;
while((i=fin.read())!=-1) {
if(i%2==0) {
fout1.write(i);
}
else {
fout2.write(i);
}
}
fin.close();
fout1.close();
fout2.close();
FileInputStream fin3=new FileInputStream(f1);
FileInputStream fin1=new FileInputStream(f2);
FileInputStream fin2=new FileInputStream(f3);
System.out.println("\nContents of numbers.txt:");
while((i=fin3.read())!=-1) {
System.out.print(i+"\n");
}
fin3.close();
System.out.println("Even and odd numbers have been seperated into even.txt and odd.txt.");
System.out.println("\nContents of even.txt is:");
while((i=fin1.read())!=-1) {
System.out.print(i+"\n");
}
fin1.close();
System.out.println("Contents of odd.txt");
while((i=fin2.read())!=-1) {
System.out.print(i+"\n");
}
fin2.close();
}catch(IOException e) {
System.out.println(e.getMessage());
}
}
}