
public  class Maruti extends Car {
	Maruti(int regnum){
		super(regnum);
	}
	void streeng(int direction){
		System.out.println("regnum of maruti=" +regnum);
		System.out.println("maruti uses manual steering" +direction);
		System.out.println("please drive the car");
	}
	void breaking (int force){
		System.out.println("breaking of maruti=" +force);
		System.out.println("maruti use hydrualic breaks");
		System.out.println("apply breaks stop the car");
	}
	@Override
	void steering(int direction) {
		// TODO Auto-generated method stub
		
	}

}
