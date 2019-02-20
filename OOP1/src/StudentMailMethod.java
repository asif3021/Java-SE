public class StudentMailMethod {
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();


        //Students[] s = new Students[5];
        /*
        Students student3 = new Students();
*/

        student1.CreateList(
                "Asif Ahmed",
                "CSE",
                24,
                "Male",
                "Dhaka",
                "01751048671"
        );


        student2.CreateList(
                "Tabassum",
                "BBA",
                21,
                "Female",
                "kollayanpur",
                "01826102698"
        );

        student1.DisplayList("Asif");
        student2.DisplayList("");




        /*
        s[0].CreateList(
                "Ahmed Asif",
                "CSE",
                22,
                "Male",
                "Dhanmondi-32",
                "01850747353"
        );


        s[0].DisplayList();
*/



    }

}
