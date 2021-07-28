package HomeAssignments;

public class SwitchCaseHW {

	public static void main(String[] args) {
		int a=2;
		int b=3;
        String input = "Add";
        
        
		switch (input) {
		case "Add": System.out.println(a+b);
		break;
		case "Sub": System.out.println(a-b);
		break;
		case "Mult": System.out.println(a*b);
		break;
		case "Div": System.out.println(a/b);
		break;
	    default:System.out.println(a%b);
		}

	}

}
