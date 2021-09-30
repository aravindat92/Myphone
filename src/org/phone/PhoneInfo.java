package org.phone;

public class PhoneInfo { // class
	public void phoneName() { // method
		System.out.println ("PhoneName");
	}
	public void phoneMieiNum () { // method
		System.out.println ("PhoneMieiNum");
	}
	public void camera () { // method
		System.out.println ("Camera");
	}
	public void storage() { // method
		System.out.println ("Storage");
	}
	public void osName () { // method
		System.out.println ("OsName");
	}	
	public static void main(String[] args) { //java.exe
		// object creation
		// syntax
		// Classname c = new Classname();
		PhoneInfo c = new PhoneInfo();
		c.phoneName();
		c.phoneMieiNum();
		c.camera();
		c.storage();
		c.osName();
		}
	  }

