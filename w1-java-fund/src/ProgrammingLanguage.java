public class ProgrammingLanguage {

    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;

    }

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public String getCreator() {
        return creator;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ProgrammingLanguage myProgrammingLanguage = new ProgrammingLanguage("Kate", 2023, "Universe");
        System.out.println(
                myProgrammingLanguage.getCreator()
        );
        System.out.println(
                myProgrammingLanguage.yearOfCreation
        );

        System.out.println(
                myProgrammingLanguage.getName()
        );
    }
}
