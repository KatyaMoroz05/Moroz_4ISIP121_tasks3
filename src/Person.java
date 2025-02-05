public class Person
{
    protected String name;
    protected int age;
    protected Gender gender;

    Person(String name, int age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void print()
    {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
    }

    public void agePlus()
    {
        age++;
    }

    public void nameChange(String name)
    {
        this.name = name;
    }
}

enum Gender
{
    Мужской,
    Женский
}