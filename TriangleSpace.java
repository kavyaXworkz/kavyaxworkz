class TriangleSpace{
	public static void main(String a[])
	//Triangle space given
		{
		int n=4;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(i==2 || i+j==2 || j-i==2){
					System.out.print(i+""+j+" ");
			}else{
				System.out.print("   ");
				}
			
			}System.out.println();
		
		}
	}	
}
		