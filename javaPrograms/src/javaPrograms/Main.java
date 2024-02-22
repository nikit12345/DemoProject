package javaPrograms;

  abstract class show{
	  public abstract double calculateArea();
  }
  
  class circle extends show{
	  
	  String title;
		String auther;
	
		circle(){
			this.title="story";
			this.auther="nik";
			
		}
	  double radious;
	  circle(double radious){
		  this.radious=radious;
	  }

	@Override
	public double calculateArea() {
	
		return radious*radious;
	}
	
	
	  
  }

public  class Main {
     public static void main(String[] args) {
		circle cc = new circle(9);
		System.out.println(cc.calculateArea());
		System.out.println(cc);
		
		
		
	}
}
