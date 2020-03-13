package classexercisestart;

import java.util.Scanner;

public class ClassExerciseStartFinished {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******************************************");
        doConsole("            What is your name?");
        System.out.println("*******************************************");
        String userName = input.next();
        System.out.println("*******************************************");
        doConsole(userName + " what is your gender? Type M / F.");
        System.out.println("*******************************************");
        char gender = input.next().charAt(0);
        System.out.println("*******************************************");
        doConsole(userName + " what is your age?");
        System.out.println("*******************************************");
        int age = input.nextInt();
        System.out.println("*******************************************");
        ageOfUser(userName, age);
        ageDetails(age, userName);
        System.out.println("*******************************************");

        doConsole(userName + " in 2040, you will be " + ageIn2040(age));
        doConsole("What is your favorite season? Please type \nthe coresponding number.");
        System.out.println("*******************************************");
        System.out.println("1. Winter?\n2. Spring?\n3. Summer?\n4. Autumn?");
        int x = input.nextInt();
        preferableSeason(x);
        System.out.println("*******************************************");
        doConsole(userMbi(userName));
        System.out.println("*******************************************");
        doConsole("Now let's find your lucky day.");
        System.out.println(luckyDay(totalDays(age)));
        doConsole(userName + " now wants to go to a club. There is \na man in the entrance of the club. Only \npeople that their lucky day is Wednesday \ncan enter.");
        System.out.println(doEntrance(totalDays(age), age, userName, gender));
        System.out.println("*******************************************");
    }

    static void doConsole(String txt) {
        System.out.println(txt);
    }

    static int ageOfUser(String userName, int age) {

        if (age > 0 && age <= 5) {
            doConsole(userName + " you are too young for this app.");
            doConsole("Come back in " + ageDiff6(age) + "years when you will be a student.");
        } else if (age <= 6 && age >= 18) {
            doConsole(userName + " oh you are a student.");
            doConsole("Keep up... " + ageDiff10(age) + " more years left and afterwards you will make money.");
        } else if (age >= 19 && age <= 40) {
            doConsole(userName + " well, you must be employed.");
            doConsole("You finished school " + ageDiff25(age) + " years ago.");
        } else {
            doConsole(userName + " you are too old for this.");
        }
        return age;
    }

    static void ageDetails(int age, String userName) {
        if (age >= 40) {
            doConsole(userName + " you were " + totalAge(age) + " years old in 1980.");
        } else {
            doConsole(userName + " you were not born yet!");
        }

    }

    static int preferableSeason(int x) {
        if (x == 1) {
            System.out.println("It must be cold outside.");
        } else if (x == 2) {
            System.out.println("Ohh, flowers are very beautiful these days.");
        } else if (x == 3) {
            System.out.println("Lets fo swimming.");
        } else {
            System.out.println("The trees are full of brown leaves.");
        }
        return 0;
    }

    static String userMbi(String userName) {
        Scanner input = new Scanner(System.in);
        doConsole(userName + " what is your height?");
        double height = input.nextDouble();
        doConsole(userName + " what is your weight?");
        double weight = input.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Underweight.";
        } else if (bmi > 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi > 25 && bmi < 29.9) {
            return "Overweith";
        } else {
            return "Obesity.";
        }

    }

    /**
     * Προκαλεί stackoverflowerror 
     * static int totalDays(int num) { 
     * num = num * 365; 
     * int sum = 0;
     * while (num > 0) { 
     *  sum = sum + num % 10; 
     *  num = num / 10; 
     * }
     *
     * sum = (sum < 10) ? sum : totalDays(sum);
     *
     * return sum; 
     * }
     */
    static int totalDays(int num) {
        num = num * 365;
        int rem = 0;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem % 10;
            num = num / 10;
        }
        if (sum > 6) {

            sum = sum % 7;
        }
        return sum;
    }

    static String luckyDay(int y) {
        if (y == 0) {
            return "Your lucky day is Monday";
        } else if (y == 1) {
            return "Your lucky day is Tuesday";
        } else if (y == 2) {
            return "Your lucky day is Wednesday";
        } else if (y == 3) {
            return "Your lucky day is Thursday";
        } else if (y == 4) {
            return "Your lucky day is Friday";
        } else if (y == 5) {
            return "Your lucky day is Saturday";
        } else {
            return "Your lucky day is Sunday";
        }
    }

    static int ageDiff6(int age) {
        int ageD = 6 - age;
        return ageD;
    }

    static int ageDiff10(int age) {
        int ageD = 10 - age;
        return ageD;
    }

    static int ageDiff25(int age) {
        int ageD = age - 18;
        return ageD;
    }

    static int totalAge(int age) {
        int x = 2020 - age;
        int ageIn1980 = x - 1980;
        return x;
    }

    static int ageIn2040(int age) {
        int ageInFuture = age + 20;
        return ageInFuture;
    }

    static String doEntrance(int luckyDay, int age, String userName, char gender) {
        Scanner input = new Scanner(System.in);
        if (luckyDay == 2 && age >= 20 && age <= 40) {
            if (age >= 20 && age <= 25) {
                return "Welcome " + userName;
            }
            if (age >= 25 && gender == 'M') {
                return "Welcome Mr." + userName;
            }
            if (gender == 'F') {
                doConsole("Are you married?\n(y)for yes");
                char single = input.next().charAt(0);
                if (single == 'y') {
                    return "Welcome Mrs." + userName;
                } else {
                    return "Welcome Ms. " + userName;
                }
            }
            return "You can enter the club!";
        }
        return "Sorry, you cannot enter. Bammer..";
    }
}
