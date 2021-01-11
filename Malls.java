class Malls
{
static int noOfShopes=12;
public static String[] shopNames={"AllenSolly","Forever21","Peterland","zara"};
public static void main(String a[])
{
System.out.println(shopNames.length);
getShopNames();
}
static void getShopNames()
{
	for(int i=0;i<shopNames.length;i++)
	{
		
System.out.println(shopNames[i]);

}
}
}
