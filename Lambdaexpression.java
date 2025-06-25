package xyz;

interface message{
	void say();
}
public class Lambdaexpression {

	public static void main(String[] args) {
		message hellomessage = () ->System.out.println("This is lambda example");
		hellomessage.say();

	}

}