package test_Cases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args) 
	{
		String name= "1Govinda2Malhari3%$9#@C8havha7n";
	
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>=48&&name.charAt(i)<=57)
			{
				System.out.print(name.charAt(i)+" ");
			}
			
		}
	}
	}
		


