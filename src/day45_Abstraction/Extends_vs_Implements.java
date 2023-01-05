package day45_Abstraction;
/*
extends vs implements: both are used for inheritance

		extends:
				class extends class
				interface extends interface(s)

		implements:
				class implements interface(s)


		extends & implements:
				extends first then implements
 */

//extends:

class A{

}

class B extends A{

}
interface Z{

}


interface X{

}

interface Y extends X,Z{

}



//implements
class D implements X,Y,Z{

}

public class Extends_vs_Implements extends A implements X,Z,Y{

}
