package technoservec2tc;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;



public class singleton {
	private static singleton instance;

	private  singleton() {}
	public  String str;
	public static singleton getsingleinstance()
	{
		if(instance==null)
		{
		instance=new singleton();
	}
	return instance;
}
}




