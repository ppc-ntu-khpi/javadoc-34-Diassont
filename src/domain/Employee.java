package domain;

/**
 * Клас Employee представляє співробітника з базовими властивостями, такими як ім'я, посада, рівень та відділ.
 *
 * @author Ярослав Пічугін
 */
public class Employee {

    /**
     * Повертає рядок, що представляє співробітника.
     *
     * @return рядок, що містить інформацію про співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    /**
     * Створює нового співробітника з заданими ім'ям, посадою, рівнем та відділом.
     *
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень співробітника (1, 2 або 3)
     * @param dept відділ, в якому працює співробітник
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Створює нового співробітника з випадковим ID.
     */
    public Employee() {
        ID = (int) (Math.random() * 1000);
    }

    /**
     * Встановлює нову посаду для співробітника.
     *
     * @param job нова посада співробітника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду співробітника.
     *
     * @return посада співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника.
     *
     * @return ім'я співробітника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює новий рівень для співробітника.
     * Рівень має бути 1, 2 або 3. Якщо вказано інше значення, рівень буде встановлено на 1.
     *
     * @param level новий рівень співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень співробітника.
     *
     * @return рівень співробітника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ, в якому працює співробітник.
     *
     * @return відділ співробітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює новий відділ для співробітника.
     *
     * @param dept новий відділ співробітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює нове ім'я для співробітника.
     * Ім'я має містити лише літери та деякі спеціальні символи. Якщо ім'я не відповідає вимогам, буде встановлено "John Doe".
     *
     * @param name нове ім'я співробітника
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
