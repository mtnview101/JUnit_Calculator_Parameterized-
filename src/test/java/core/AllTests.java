package core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ParameterizedTestAdd.class, ParameterizedTestDiv.class, ParameterizedTestMul.class,
		ParameterizedTestSub.class })
public class AllTests {

}
