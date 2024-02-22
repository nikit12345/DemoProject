package javaPrograms;

import java.util.Arrays;
import java.util.Optional;

interface urserrepo extends jpa {
	void findbyname();
    // additional methods specific to urserrepo, if any
}

interface jpa {
    void show();
}

class jpaimpl implements urserrepo { // Now implements urserrepo
    @Override
    public void show() {
        System.out.println("showingggg");
    }
    // Implement other methods from urserrepo, if any

	@Override
	public void findbyname() {
		// TODO Auto-generated method stub
		
	}
}

public class StringProgram {
	
    public static void main(String[] args) {
    	Integer i1 = 200;
		Integer i2 = 200;
		
		
		if(i1==i2) {
			System.out.println("true");
		}
		else {
			System.out.println("fasle");
		}
		
    }
}

