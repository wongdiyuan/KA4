import java.util.Scanner;
class kiragaji
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);

System.out.print("\nNama pekerja :");
String nama=input.next();

System.out.print("\nBilangan jam bekerja(sehari) :");
int jam=input.nextInt();
if(jam>9){
    System.out.print("\nBilangan jam sehari tidak boleh melebihi 9jam,sila masukkan bilangan jam yang betul:");
System.out.print("\nBilangan jam bekerja(sehari) :");
jam=input.nextInt();
}

System.out.println("\nBilangan hari bekerja :");
int hari=input.nextInt();

if(hari>30){
    System.out.println("\nBilangan hari bekerja tidak boleh melebihi 30 hari,sila masukkan bilangan hari yang betul:");
    System.out.println("\nBilangan hari bekerja:");
    hari=input.nextInt();
}
System.out.print("\nBilangan jam ot:");
int jamot=input.nextInt();

if(jamot>50){
    System.out.println("\nBilangan jam kerja lebih masa tidak boleh melebihi 50 jam,sila masukkan bilangan jam yang betul :");
    System.out.println("\nBilangan jam ot:");
    jamot=input.nextInt();
}


double gaji=(jam*hari*20)+(jamot*15);

    
System.out.print("\nRumusan gaji bulanan:"+nama);
System.out.print("\nJumlah jam bekerja:"+jam+"jam");
System.out.print("\nJumlah hari bekerja:"+hari+"hari");
System.out.print("\nJumlah jam lebih masa:"+jamot+"jam");
System.out.print("\nJUMLAH GAJI :RM"+gaji);

}
}
