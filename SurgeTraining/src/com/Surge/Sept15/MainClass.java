package com.Surge.Sept15;

import java.util.HashMap;
import java.util.Map.Entry;


class Semester {
    private HashMap<String, Integer> subjectMarks;

    public HashMap<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(HashMap<String, Integer> subjectMarks) {
        this.subjectMarks = subjectMarks;
    }
}

class Student {
    private HashMap<String, Semester> sem;

    public HashMap<String, Semester> getSem() {
        return sem;
    }

    public void setSem(HashMap<String, Semester> sem) {
        this.sem = sem;
    }
}

public class MainClass {
    public static void main(String[] args) {
    	//====================For Student-1============================

        //====================For Sem-1===============================
        HashMap<String,Integer> marksMap = new HashMap<>();
        HashMap<String,Semester> semMap = new HashMap<>();
        //Marks added into marks map
        marksMap.put("Maths-1",90);
        marksMap.put("Physics",85);
        marksMap.put("Chemistry",80);
        marksMap.put("English",75);
        //set value of semester and add semester to sem map
        Semester sem1 = new Semester();
        sem1.setSubjectMarks(marksMap);
        semMap.put("Sem1 Marks",sem1);

        //====================For Sem-2===============================
        //Marks added into marks map
        HashMap<String,Integer> marksMap2 = new HashMap<>();
        marksMap2.put("Maths-2",70);
        marksMap2.put("SS",85);
        marksMap2.put("STLD",80);
        marksMap2.put("EDC",90);
        //set value of semester and add semester to sem map
        Semester sem2 = new Semester();
        sem2.setSubjectMarks(marksMap2);
        semMap.put("Sem2 Marks",sem2);

        //====================For Student-2============================

        //====================For Sem-1===============================
        HashMap<String,Integer> marksMap_2 = new HashMap<>();
        HashMap<String,Semester> semMap2 = new HashMap<>();
        //Marks added into marks map
        marksMap_2.put("Maths-1",45);
        marksMap_2.put("Physics",60);
        marksMap_2.put("Chemistry",70);
        marksMap_2.put("English",74);
        //set value of semester and add semester to sem map
        sem1 = new Semester();
        sem1.setSubjectMarks(marksMap_2);
        semMap2.put("Sem1 Marks",sem1);

        //====================For Sem-2===============================
        //Marks added into marks map
        HashMap<String,Integer> marksMap2_2 = new HashMap<>();
        marksMap2_2.put("Maths-2",76);
        marksMap2_2.put("SS",66);
        marksMap2_2.put("STLD",78);
        marksMap2_2.put("EDC",73);
        //set value of semester and add semester to sem map
        sem2 = new Semester();
        sem2.setSubjectMarks(marksMap2_2);
        semMap2.put("Sem2 Marks",sem2);

        //================== Adding both semesters to student map and setting student object
        HashMap<String, Student> studentMap = new HashMap<>();
        Student s1 = new Student();
        s1.setSem(semMap);
        studentMap.put("Akhila",s1);

        Student s2 = new Student();
        s2.setSem(semMap2);
        studentMap.put("AkhilaK",s2);

        for (Entry<String,Student> entry : studentMap.entrySet()){
            System.out.println("--------------Student Name :"+entry.getKey()+"---------------");
            for (Entry<String,Semester> entry1 : entry.getValue().getSem().entrySet()){
                System.out.println("----------------"+entry1.getKey()+"-------------------");
                for (Entry<String,Integer> entry2 : entry1.getValue().getSubjectMarks().entrySet()){
                    System.out.println(entry2.getKey()+" "+entry2.getValue());
                }
            }
        }
    }
}

