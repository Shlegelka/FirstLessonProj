        public class Employee {
            String fullName;
            String position;
            String email;
            String phoneNumber;
            float salary;
            int age;

            Employee(String fullName,
                     String position,
                     String email,
                     String phoneNumber,
                     float salary,
                     int age) {
                this.fullName = fullName;
                this.position = position;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.salary = salary;
                this.age = age;
            }

            void printInfo() {
                System.out.println("ФИО: " + fullName);
                System.out.println("Должность: " + position);
                System.out.println("e-mail: " + email);
                System.out.println("Тел.: " + phoneNumber);
                System.out.println("ЗП: " + salary);
                System.out.println("Возраст: " + age);
            }
        }
        public class Main
        {
            public static void main(String[] args)
            {
                Employee[] employees = {
                        new Employee(
                                "Ivanov Ivan Ivanovich",
                    "Programmer",
                    "One@mail.ry",
                    "+7-111-111-11-11",
                    100000,
                    40),
                new Employee(
                        "Sidorov Sidor Sidorovich",
                    "Administration",
                    "Two@mail.ry",
                    "+7-222-222-22-22",
                    80000,
                    45),
                new Employee(
                        "Petrov Petr Petrovich",
                    "Secretary",
                    "Three@mail.ry",
                    "+7-333-333-33-33",
                    50000,
                    25),
                new Employee(
                        "Belov Anton Antonovich",
                    "Programmer",
                    "Four@mail.ry",
                    "+7-444-444-44-44",
                    100000,
                    47),
                new Employee(
                        "Kirillov Semen Semenovich",
                    "Programmer",
                    "Five@mail.ry",
                    "+7-555-555-55-55",
                    110000,
                    25)
                };

                int minAge = 40;
                for (Employee employee : employees)
                {
                    if (employee.age > minAge)
                    {
                        employee.printInfo();
                        System.out.println();
                    }
                }
            }
        }


