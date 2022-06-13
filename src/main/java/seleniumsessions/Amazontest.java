package seleniumsessions;

public class Amazontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browserutil butil=new browserutil();
		butil.init_driver("Chrome");
		butil.launchurl("https://www.amazon.com/");
		String ptitle=butil.getpagetitle();
		System.out.println(ptitle);
		String purl=butil.getPageurl();
		System.out.println(purl);
		butil.closebrowser();
	}

}
