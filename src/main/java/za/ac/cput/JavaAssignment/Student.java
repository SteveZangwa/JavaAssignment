    package za.ac.cput.JavaAssignment;


import java.util.Objects;

    public class Student {


        private String name;
        private int age;

        private Student() {
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Student(Builder builder){


            this.name = builder.name;
            this.age = builder.age;

        }

        public static class Builder{


            private String name;
            private int age;


            public Builder name(String nm) {
                this.name = nm;
                return this;
            }

            public Builder  age(int  age) {
                this.age = age;
                return this;
            }
            public Student build(){
                return new Student(this);
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student )) return false;
            Student std = (Student ) o;
            return Objects.equals(getName(),std.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName());
        }
    }

