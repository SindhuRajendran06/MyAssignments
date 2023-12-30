package week3.day1assignment;

public class Execution extends Button {

	public static void main(String[] args) {
	Execution ex=new Execution();
	ex.click();
	ex.setText(null);
	ex.submit();
	
	TextField te=new TextField();
	te.getText();
	te.click();
	te.setText(null);
	
	RadioButton r=new RadioButton();
	r.selectRadioButton();
	r.submit();
	r.click();
	r.setText(null);
	
	CheckBoxButton c=new CheckBoxButton();
	c.clickCheckButton();
	c.submit();
	c.click();
	c.setText(null);
	}

}
