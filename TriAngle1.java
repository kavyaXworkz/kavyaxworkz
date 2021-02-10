class TriAngle1{

	public static void main(String a[]){
		
	 TriAngle1 triangle=new TriAngle1();
	 triangle.drawTriangle(5);
}


	void drawTriangle(int n){
	
		
			for(int i=0; i<n;i++){
				for(int j=0;j<n;j++){
					if(i==2 || i+j==2 ||j-i==2){
							System.out.print(i+""+j+" ");
						}else{
						System.out.print("   ");//we have to give 3 spaces
					 }
				}System.out.println("");
			}
		}
}

