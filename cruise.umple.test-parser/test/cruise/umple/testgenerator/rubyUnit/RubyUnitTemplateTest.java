package cruise.umple.testgenerator.rubyUnit;

import java.io.File;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import cruise.umple.implementation.TemplateTest;
import cruise.umple.testgenerator.UnitTemplateTest;
import cruise.umple.util.SampleFileWriter;



public class RubyUnitTemplateTest extends UnitTemplateTest{
	
	
	TemplateTest templateTest = new TemplateTest();

	  @Before
	  public void setUp()
	  {
	super.setUp();
		language = "RubyUnit";
    	languagePath = "RubyUnit";
    	
    	
	  }
	  
	  @After
	  public void tearDown()
	  {
	    super.tearDown();
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/DependTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/GenerateTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/TestcaseTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/SubOptionTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/AssertionTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/ActionTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/InLineCommentsTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/MultilineCommentsTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/TestcaseMultilineCommentsTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/TestcaseInlineCommentsTest.rb");
	    SampleFileWriter.destroy(pathToInput + "/rubyunit/TestcaseInlineBetweenCommentsTest.rb");
	    //SampleFileWriter.destroy(pathToInput + "/test/Test.umpt");
	    //SampleFileWriter.destroy(pathToInput + "/test/test");
	    //SampleFileWriter.destroy(pathToInput + "/junit/DependTest.java");
	    //SampleFileWriter.destroy(pathToInput + "/junit/GenerateTest.java");
	    
	  }
	  
	  
	  @Test 
	  public void TestGenerate()
	  {
		//language = "Java";
		//createUmpleSystem(languagePath, "/testGenerator_rubyunit_testGenerate.ump");
		
		language = "RubyUnit";
	    System.out.println(pathToInput);    	    
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyunit_testGenerate.umpt");
	    System.out.println(pathToInput);
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/GenerateTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/rubyunit/GenerateTest.rb")).exists());
	    
	    
	  }
	  
	  @Test 
	  public void depends()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_RubyUnit_depend.umpt");
	    //assertUmpleTemplateFor("RubyUnit/testGenerate_model.umpt","RubyUnit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/DependTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/RubyUnit/DependTest.rb")).exists());
	  }
	  
	  @Test 
	  public void subOption()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_RubyUnit_subOption.umpt");
	    //assertUmpleTemplateFor("RubyUnit/testGenerate_model.umpt","RubyUnit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/SubOptionTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/RubyUnit/SubOptionTest.rb")).exists());
	  }
	  
	  @Test 
	  public void action()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyUnit_testcase_action.umpt");
	    //assertUmpleTemplateFor("junit/testGenerate_model.umpt","junit/Testgenerate_model.java");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/ActionTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/rubyunit/ActionTest.rb")).exists());
	  }
	  
	  @Test 
	  public void testCase()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_RubyUnit_testcase.umpt");
	    //assertUmpleTemplateFor("RubyUnit/testGenerate_model.umpt","RubyUnit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/TestcaseTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/RubyUnit/TestcaseTest.rb")).exists());
	  }
	  
	  @Test 
	  public void inLineComments()
	  {
	    language = "rubyunit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyunit_inlineComments.umpt");
	    //assertUmpleTemplateFor("rubyunit/testGenerate_model.umpt","rubyunit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/InlineCommentsTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/rubyunit/InlineCommentsTest.rb")).exists());
	  }
	  
	  @Test 
	  public void multilineComments()
	  {
	    language = "rubyunit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyunit_multilineComments.umpt");
	    //assertUmpleTemplateFor("rubyunit/testGenerate_model.umpt","rubyunit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/MultilineCommentsTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/rubyunit/MultilineCommentsTest.rb")).exists());
	  }
	  
	  @Test 
	  public void testcaseMultilineComments()
	  {
	    language = "rubyunit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyunit_testcase_multilineComments.umpt");
	    //assertUmpleTemplateFor("rubyunit/testGenerate_model.umpt","rubyunit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/TestcaseMultilineCommentsTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/rubyunit/TestcaseMultilineCommentsTest.rb")).exists());
	  }
	  
	  @Test 
	  public void testcaseInlineComments()
	  {
	    language = "rubyunit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyunit_testcase_inlineComments.umpt");
	    //assertUmpleTemplateFor("rubyunit/testGenerate_model.umpt","rubyunit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/TestcaseInlineCommentsTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/rubyunit/TestcaseInlineCommentsTest.rb")).exists());
	  }
	  
	  @Test 
	  public void testcaseInlineBetweenComments()
	  {
	    language = "rubyunit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyunit_testcase_inlineCommentsBetween.umpt");
	    //assertUmpleTemplateFor("rubyunit/testGenerate_model.umpt","rubyunit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/TestcaseInlineBetweenCommentsTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/rubyunit/TestcaseInlineBetweenCommentsTest.rb")).exists());
	  }
	  
	  
	  @Test 
	  public void testCase_assertion()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_rubyunit_testcase_assertion.umpt");
	    //assertUmpleTemplateFor("RubyUnit/testGenerate_model.umpt","RubyUnit/Testgenerate_model.rb");
	    assertGeneratedCodeEquals(pathToInput, "/rubyunit/AssertionTest.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/RubyUnit/AssertionTest.rb")).exists());
	  }
	  
	  @Test 
	  public void testCase_assertionTrue()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_RubyUnit_depend.umpt");
	    //assertUmpleTemplateFor("RubyUnit/testGenerate_model.umpt","RubyUnit/Testgenerate_model.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/RubyUnit/DependTest.rb")).exists());
	  }
	  
	  @Test 
	  public void testCase_assertionFalse()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_RubyUnit_depend.umpt");
	    //assertUmpleTemplateFor("RubyUnit/testGenerate_model.umpt","RubyUnit/Testgenerate_model.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/RubyUnit/DependTest.rb")).exists());
	  }
	  
	  @Test 
	  public void testCase_assertioneEqual()
	  {
	    language = "RubyUnit";
	    //System.out.println(languagePath);
	    createUmpleTestSystem(languagePath, "/testGenerator_RubyUnit_depend.umpt");
	    //assertUmpleTemplateFor("RubyUnit/testGenerate_model.umpt","RubyUnit/Testgenerate_model.rb");
	    Assert.assertEquals(true, (new File(pathToInput + "/RubyUnit/DependTest.rb")).exists());
	  }
}
