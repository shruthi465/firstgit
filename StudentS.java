class StudentS
{
static int rno=9;
static String name="SHRUTHI";
static String clg="cvr";
void display()
{
System.out.println("student rno:"+rno);
System.out.println("student name:"+name);
System.out.println("student clg:"+clg);
}
public static void main(String args[])
{
StudentS s1=new StudentS();
s1.display();
StudentS s2=new StudentS();
s2.clg="gnit";
//s2.display();
}
}