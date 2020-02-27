package test;

public class Sortname {
    public static void pai(Person[] person){
        for(int i = 0;i<person.length-1;i++){
            for (int j = i+1;j<person.length;j++){
                if (person[i].getName().charAt(0)>person[j].getName().charAt(0)){
                    Person p = person[i];
                    person[i] = person[j];
                    person[j] = p;
                }
            }
        }
        for (int i=0; i<person.length;i++) {
            System.out.println(person[i].getName()+","+person[i].getAge());
        }
    }
}
