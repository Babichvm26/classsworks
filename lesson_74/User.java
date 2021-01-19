package lesson_74;

public class User {

      String name;
      String surname;

       public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
       }

        @Override
        public boolean equals(Object o) {
            boolean result;
            if (this.name.equals(((User) o).name) == true) {
                if (this.surname == ((User) o).surname) {

                    result = true;

                } else {
                    result = false;


                }
            } else {
                result = false;
            }
            return result;
        }
    }

