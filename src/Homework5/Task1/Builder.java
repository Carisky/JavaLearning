package src.Homework5.Task1;

class Builder extends Human {
    String constructionSkill;

    public Builder(String name, int age, String gender, String constructionSkill) {
        super(name, age, gender);
        this.constructionSkill = constructionSkill;
    }

    public void build() {
        System.out.println(name + " is a builder with the skill of " + constructionSkill + ". They are constructing something.");
    }
}
