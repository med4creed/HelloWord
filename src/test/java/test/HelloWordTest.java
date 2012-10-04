/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
 
import org.junit.Assert;
import org.junit.Test;
import prog.HelloWord;

/**
 *
 * @author matailia
 */
public class HelloWordTest {
       @Test
       public void testSayHello(){
       String result = HelloWord.sayHello("bonne nuit");
       System.out.print(result);
       Assert.assertEquals("bonne nuit",result);
       }


}
