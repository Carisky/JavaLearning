package src.practice2;

class User {
    private final String name;
    private final int age;
    private final String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age &&
                name.equals(user.name) &&
                phone.equals(user.phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
