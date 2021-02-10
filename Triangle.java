class Triangle{
	//space taken right angle triangle
	public static void main(String[] a){ 
	
	for(int i=0;i<=4;i++){
		for(int j=0;j<=4;j++){
			if(i==4 || j==0 || i==j){
				
			System.out.print(i+""+j+" ");
			}else{
				System.out.print("   ");
			}
		}
	}System.out.println("   ");
  }
}