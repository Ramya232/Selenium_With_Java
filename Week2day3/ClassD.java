package Week2day3;

class A {
	   void funcA() {
	      System.out.println("This is class A");
	   }
	}

	class B extends A {
	   void funcB() {
	      System.out.println("This is class B");
	   }
	}

	class C extends B {
	   void funcC() {
	      System.out.println("This is class C");
	   }
	}
	class D extends C {
	   void funcD() {
	      System.out.println("This is class D");
	   }
	}

	public class ClassD {
	   public static void main(String args[]) {
	      D obj = new D ();
	      obj.funcA();
	      obj.funcB();
	      obj.funcC();
	      obj.funcD();
	      
	   }
	}
