package compareToTest;


import java.util.*;  
class Person implements Comparable{    //ʵ����comparable�ӿڣ�������дcompareTo����������  
    private String name;  
    private int age;  
    private float score;  
      
    public Person(String name,int age,float score){  
       this.name=name;  
       this.age=age;  
       this.score=score;  
       }  
      
   public String toString(){  
    return "������"+this.name+", ���䣺"+this.age+", �ɼ���"+this.score;  
    }  
     
    public int compareTo(Object obj){   //compareTo������ʵ��  
     Person p = (Person)obj;  
                 if(p.score>this.score){  
                        return 1;  
                  }  
                  else if(p.score<this.score){  
                        return -1;  
                   }  
                   else{  
                        if(p.age>this.age){  
                         return 1;  
                        }  
                         else if(p.age<this.age){  
                         return -1;  
                         }  
                         else{  
                             return 0;  
                            }  
                    }  
     }                            //compareTo��������  
}                               //�����  
 

