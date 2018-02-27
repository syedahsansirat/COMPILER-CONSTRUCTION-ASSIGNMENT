/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sirat
 */
public class JavaMethodsExample {

    /**
     * @Sirat
     */
    public void formatMethod() {//Similiar to Printf Method in C  
        String name = "This is Example of Format Method";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %.12f", 32.33434);

        System.out.println(name);
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }

    public void trimMethod()//to remove spaces before and after this string
    {
        String s1 = "  hello world   ";
        System.out.println("(" + s1 + ")without trim()");//without trim()  
        System.out.println("(" + s1.trim() + ")with trim()");//with trim()  
    }

    public void concatMethod() {  //to joint 2 string
        String s1 = "Hello Sir,";
        s1 = s1.concat(" How are you?");
        System.out.println(s1);
    }

    public void replaceMethod() {
        String s1 = "This is compiler task";
        String replaceString = s1.replace('i', 'o');//replaces  
        System.out.println(replaceString);
    }

    public void replaceAllMethod() {
        String s1 = "This is compiler task";
        String replaceString = s1.replaceAll("i", "o");//replaces all 
        System.out.println(replaceString);
    }

    public void toStringMethod() {
        Integer x = 5;
        String str = x.toString();
        System.out.println(str);
    }

    public void subStringMethod() {
        String str = "hello World";
        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(2));
    }

    public void containsMethod() {
        String name = "what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));
    }
    public void splitMethod(){  //Reference : I Have Collected code of this method and understood.
		String s1="compiler assignment is very good task";  
		String[] words=s1.split("\\s");//splits the string with space  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
			System.out.println(w);  
		}
		
		
		s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
		System.out.println(w);  
		}   
	}
    public static void main(String args[]){  
		JavaMethodsExample object= new JavaMethodsExample();
                
                object.formatMethod();
                object.trimMethod();
                object.concatMethod();
                object.replaceMethod();
                object.replaceAllMethod();
                object.toString();
                object.subStringMethod();
                object.containsMethod();
                object.splitMethod();
                        
	}

}
