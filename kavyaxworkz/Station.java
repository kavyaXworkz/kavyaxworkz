
class Station
{
static String address="Majestic";
static String platforms[]={"platform1","platform2","platform3","platform4","platform5"};
public static void main(String a[])
{
System.out.println(platforms.length);
getPlatforms();
}
public static void getPlatforms()
{
for(int i=0;i<platforms.length;i++)
{
	System.out.println(platforms[i]);
}
}
}
