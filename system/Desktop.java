package org.system;

public class Desktop extends Computer {
 public void desktopSize() {
	 System.out.println("desktop size: 19.5 inches");
 }
 
 public static void main(String[] args) {
	Desktop obj=new Desktop();
	obj.desktopSize();
	obj.computerModel();
}
 
}
