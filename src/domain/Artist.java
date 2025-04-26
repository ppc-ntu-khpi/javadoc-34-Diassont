package domain;

/**
 * Клас Artist представляє співробітника, який є художником.
 * Він успадковує властивості та методи від класу Employee і додає власні властивості та методи для роботи з навичками.
 *
 * @author Ярослав Пічугін
 */
public class Artist extends Employee {

    /**
     * Створює нового художника з заданими навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param skiils масив навичок художника
     * @param name ім'я художника
     * @param jobTitle посада художника
     * @param level рівень художника
     * @param dept відділ, в якому працює художник
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює нового художника з заданими навичками.
     * Ім'я, посада, рівень та відділ будуть встановлені за замовчуванням.
     *
     * @param skiils масив навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Створює нового художника без навичок.
     * Ім'я, посада, рівень та відділ будуть встановлені за замовчуванням.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядок, що представляє художника, включаючи його навички.
     *
     * @return рядок, що представляє художника
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    private String[] skiils;

    /**
     * Повертає рядок, що містить всі навички художника, розділені комами.
     *
     * @return рядок з навичками художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює нові навички для художника.
     *
     * @param skills масив нових навичок художника
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок художника.
     *
     * @return масив навичок художника
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
