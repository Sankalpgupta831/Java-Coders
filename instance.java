class aa{}
class ab extends aa
{
public static void main(String[] arg)
{
ab b=new ab();
System.out.println(b instanceof ab);
System.out.println(b instanceof aa);
}
}