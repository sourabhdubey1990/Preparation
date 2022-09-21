package JavaPrograms;

 class Constructor {
	 
	 static int i;
	
	public Constructor() {
		// TODO Auto-generated constructor stub
		this(5);
		System.out.println("Inside the constructor");
		name();
		i++;
		
	}
	
		Constructor(int a) {
		System.out.println("Constructor Chaining" + a);
		
	}
	
		Constructor(int b,int c) {
		
	}
	private void name() {
		System.out.println("Private method");
		
	}
	
	public void print() {
		System.out.println("Number of Objects: " +i );
	}
}
