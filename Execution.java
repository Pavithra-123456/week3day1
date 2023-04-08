
public  class Execution extends MultipleLanguage implements Language,TestTool {

	public void Automation() {
		System.out.println("Automate all"); 
	}
	
		public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("java language");
		
	}

	@Override
	public void python() {
		System.out.println("python language");
		
	}
	public static void main(String[] args) {
		Execution exe=new Execution();
		exe.Automation();
		exe.python();
		exe.ruby();
		exe.Selenium();
		exe.Java();
	}	
	
}
