package cruise.umple.testgenerator.jUnit;

import java.io.File;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import cruise.umple.implementation.TemplateTest;
import cruise.umple.testgenerator.UnitTemplateTest;
import cruise.umple.util.SampleFileWriter;



public class JUnitTemplateTest extends UnitTemplateTest{
	
	
	TemplateTest templateTest = new TemplateTest();

	  @Before
	  public void setUp()
	  {
	super.setUp();
		language = "JUnit";
    	languagePath = "JUnit";
    	
    	
	  }
	  
	  @After
	  public void tearDown()
	  {
	    super.tearDown();
	    
	    //SampleFileWriter.destroy(pathToInput + "/test/Test.umpt");
	    //SampleFileWriter.destroy(pathToInput + "/test/test");
	    SampleFileWriter.destroy(pathToInput + "/junit/DependTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/GenerateTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/TestcaseTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/SubOptionTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/AssertionTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/InLineCommentsTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/MultilineCommentsTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/TestcaseMultilineCommentsTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/TestcaseInlineCommentsTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/TestcaseInlineBetweenCommentsTest.java");
	    SampleFileWriter.destroy(pathToInput + "/junit/ActionTest.java");
	    
	  }
	  
	  
	  @Test 
	  public void TestGenerate()
	  {
		//language = "Java";
		//createUmpleSystem(languagePath, "/testGenerator_jUnit_testGenerate.ump");
		
		language = "JUnit";
	    System.out.println(pathToInput);    	    
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_testGenerate.umpt");
	    System.out.println(pathToInput);
	    assertGeneratedCodeEquals(pathToInput, "/junit/GenerateTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/GenerateTest.java")).exists());
	    
	    
	  }
	  
	  @Test 
	  public void depends()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_depend.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/DependTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/DependTest.java")).exists());
	  }
	  
	  @Test 
	  public void action()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_testcase_action.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/ActionTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/ActionTest.java")).exists());
	  }
	  
	  @Test 
	  public void inLineComments()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_inlineComments.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/InlineCommentsTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/InlineCommentsTest.java")).exists());
	  }
	  
	  @Test 
	  public void multilineComments()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_multilineComments.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/MultilineCommentsTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/MultilineCommentsTest.java")).exists());
	  }
	  
	  @Test 
	  public void testcaseMultilineComments()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_testcase_multilineComments.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/TestcaseMultilineCommentsTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/TestcaseMultilineCommentsTest.java")).exists());
	  }
	  
	  @Test 
	  public void testcaseInlineComments()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_testcase_inlineComments.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/TestcaseInlineCommentsTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/TestcaseInlineCommentsTest.java")).exists());
	  }
	  
	  @Test 
	  public void testcaseInlineBetweenComments()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_testcase_inlineCommentsBetween.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/TestcaseInlineBetweenCommentsTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/TestcaseInlineBetweenCommentsTest.java")).exists());
	  }
	  
	  
	  @Test 
	  public void subOption()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_subOption.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/SubOptionTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/SubOptionTest.java")).exists());
	  }
	  
	  @Test 
	  public void testCase()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_testcase.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/TestcaseTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/TestcaseTest.java")).exists());
	  }
	  
	  @Test 
	  public void testCase_assertion()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_testcase_assertion.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/junit/AssertionTest.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/AssertionTest.java")).exists());
	  }
	  
	  @Test 
	  public void testCase_assertionTrue()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_depend.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/DependTest.java")).exists());
	  }
	  
	  @Test 
	  public void testCase_assertionFalse()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_depend.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/DependTest.java")).exists());
	  }
	  
	  @Test 
	  public void testCase_assertioneEqual()
	  {
	    language = "JUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_jUnit_depend.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    Assert.assertEquals(true, (new File(pathToInput + "/junit/DependTest.java")).exists());
	  }
}
