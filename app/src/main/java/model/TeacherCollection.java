package model;

import com.example.homework_helper.R;

import java.util.ArrayList;
import java.util.List;

public class TeacherCollection {
    public static List<Teacher> getTeachers(){
        List<Teacher> teacherList = new ArrayList<>();

        Teacher Ayeza = new Teacher(1, R.drawable.ayeza, 4, "Ayeza", "I have been teaching since 2010."+"\n"+ " My field of specialization is 'Mathematics'."+"\n"+
                "So I can teach all type of Math related subjects "+"\n"+
                       "like calculus , business math.", "Math", "English", "Science");
        teacherList.add(Ayeza);

        Teacher Gohar = new Teacher(1, R.drawable.gohar, 4, "Gohar", "I have been teaching since 2010." +
                " My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects "+
                "like calculus , business math. If you will join me I shall make you the best student of Math", "Accounting",
                "Calculus", "Business");
        teacherList.add(Gohar);

        Teacher Hina = new Teacher(1, R.drawable.hina, 4, "Hina", "I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",

                          "History",
                "Urdu", "Geogrphy");
        teacherList.add(Hina);

        Teacher Saba = new Teacher(1,R.drawable.saba, 4, "Saba", "I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math","modeling","Music","Fashion");
        teacherList.add(Saba);

        Teacher Nouman = new Teacher(1,R.drawable.nouman, 4,"Nouman" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(Nouman);

        Teacher aa = new Teacher(1,R.drawable.aa, 4,"AAAA" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(aa);

        Teacher amir = new Teacher(1,R.drawable.amir, 4,"Amir Khan" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(amir);

        Teacher ayesha = new Teacher(1,R.drawable.ayesha, 4,"Ayesha khan" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(ayesha);

        Teacher sabap = new Teacher(1,R.drawable.sabap, 4,"Saba Hameed" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(sabap);

        Teacher urwa = new Teacher(1,R.drawable.urwa, 4,"Urwa" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(urwa);

        Teacher sara = new Teacher(1,R.drawable.sara, 4,"Sara khan" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(sara);

        Teacher danish = new Teacher(1,R.drawable.danish, 4,"Danish Taimur" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(danish);

        Teacher samina = new Teacher(1,R.drawable.samina, 4,"Samina Peerzada" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(samina);

        Teacher hira = new Teacher(1,R.drawable.hira, 4,"Hira Mani" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(hira);

        Teacher adnan = new Teacher(1,R.drawable.adnan, 4,"Adnan Siddiqui" ,"I have been teaching since 2010. My field of specialization is 'Mathematics'. So I can teach all type of Math related subjects like calculus , business math. If you will join me I shall make you the best student of Math",  "Production",
                "Film", "Drama");
        teacherList.add(adnan);








        return teacherList;
    }
}
