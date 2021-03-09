package sec01.verify.exam05;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListner(new BackgroundChangeListener());
		checkBox.select();
	}

}
