package compareToTest;

import java.util.Arrays;

public class OOCompareTo{  
	   public static void main(String []args){  
	    Person p[] = new Person[5];  
	    p[0] = new Person("���� ",23,96);  
	    p[1] = new Person("����2",24,96);  
	    p[2] = new Person("����3",21,94);  
	    p[3] = new Person("����4",22,98);  
	    p[4] = new Person("����5",20,89);  

	    Arrays.sort(p);                 //������p�ڵ�Ԫ�ؽ����˱������������� Ĭ�ϵķ�����compareTo  
	    for(int x=0;x<p.length;x++){  
	     System.out.println(p[x]);           //�������Ԫ��ʱĬ�ϵ���toString��������  
	     }     
	    }
	   
	   } 
