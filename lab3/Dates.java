class Dates
{
    // Contributers: Curtis McHenry, Brandon Bullough

    public static void main(String[] args) {
        // Declare variables
        String day = "Thursday";
        String month = "August";
        int date = 29;
        int year = 2013;
        printAmerican(date, year, day, month);
        printEuropean(date, year, day, month);
    }

    public static void printAmerican(int date, int year, String day, String month){
        System.out.print("\f");
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(int date, int year, String day, String month){
        System.out.print("\f");
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + ", " + year);
    }

}
