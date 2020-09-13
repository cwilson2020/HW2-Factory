package pkg;

public class interior_package_factory {
	
	interior_package_factory(){}
	

	public interior_package createInterior(int t)
	{
		interior_package temp = null;

		switch(t) {

		case 1: temp = new Interior_pkg1();
		break;

		case 2: temp = new Interior_pkg2();
		break;

		case 3: temp = new Interior_pkg3();
		break; 

		case 4: temp = new Interior_pkg4();
		break; 

		default: temp = new Interior_pkg1();

		
		}
return temp;
	}
}
