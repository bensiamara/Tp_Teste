package JunitTpTest;

import JunitTp.classTp;
import JunitTp.classexo2;
import junit.framework.TestCase;
public class classtptest extends TestCase{
	
	public void testCalculer() throws Exception {
		
		assertEquals("lyazidbensiamara",classexo2.concate("lyazid","bensiamara"));
	}

}
