package test2_1;

/**
 * comments
 *
 * @author qiongwei.cai 2020.01.19
 */
public class MyTestBean {
	private String testStr = "testStr";

	public MyTestBean(){
		System.out.println("初始化了111111!");
	}

	public MyTestBean(String testStr) {
		System.out.println("初始化了22222222!");
		this.testStr = testStr;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
}