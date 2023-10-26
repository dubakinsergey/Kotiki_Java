package model;

public class Kotik {
    public static int currentCreatedKotik;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    private int satiety = 0;
    public Kotik(){
        currentCreatedKotik++;
    };

    public Kotik(int prettiness, String name, int weight, String meow, int satiety) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
        currentCreatedKotik++;
    }

    public int getCurrentCreatedKotik() {
        System.out.println("Количесво созданных котиков " + currentCreatedKotik);
        return currentCreatedKotik;
    }

    public int getPrettiness() {
        System.out.println("Миловидность " + prettiness);
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public String getName() {
        System.out.println("Имя " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        System.out.println("Вес " + weight);
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMeow() {
        System.out.println("Мяучит " + meow);
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public int getSatiety() {
        System.out.println("Сытость " + satiety);
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

//////////////////////Методы////////////////////

    public boolean play() {
        if (satiety > 0) {
            System.out.println("Котик играет");
            satiety--;
            return true;
        } else
            System.out.println("Котик не может играть, он голоден! Покорми котика!");
        eat();
        return false;
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        } else
            System.out.println("Котик не может спать, он голоден! Покорми котика!");
        eat();
        return false;
    }

    public boolean chaseMouse() {
        if (satiety > 0) {
            System.out.println("Котик ловит мышку");
            satiety--;
            return true;
        } else
            System.out.println("Котик не может ловить мышку, он голоден! Покорми котика!");
        eat();
        return false;
    }

    public boolean eat(int countFood) {
        satiety += countFood;
        System.out.println("Покормили котика первым методом из перегрузки ");
        return true;
    }

    public boolean eat(int countFood, String nameFood) {
        satiety += countFood;
        System.out.println("Покормили котика вторым методом из перегрузки ");
        return true;
    }

    public boolean eat() {
        eat(3, "Корм");
        System.out.println("Покормили котика третьим методом из перегрузки ");
        return true;
    }


    public boolean sharpensHisClaws() {
        if (satiety > 0) {
            System.out.println("Котик точит когти");
            satiety--;
            return true;
        } else
            System.out.println("Котик не точит когти, он голоден! Покорми котика!");
        eat();
        return false;
    }

    @Override
    public String toString() {
        return "Kotik{" +
                "prettiness=" + prettiness +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", meow='" + meow + '\'' +
                ", satiety=" + satiety +
                '}';
    }

    public void liveAnotherDay() {
        for (int i = 1; i < 25; i++) {
            int randomValue = (int) ((Math.random() * 5) + 1);
            switch (randomValue) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    eat();
                    break;
                case 5:
                    sharpensHisClaws();
                    break;
            }
        }
    }
}