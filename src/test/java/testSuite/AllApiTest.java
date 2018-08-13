package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import apiTests.Interface_1;
import apiTests.Interface_2;
import apiTests.Interface_3;


 
 
@RunWith(Suite.class)
@SuiteClasses({
        Interface_1.class,
        Interface_2.class,
        Interface_3.class,
})


public class AllApiTest
{
	

}
