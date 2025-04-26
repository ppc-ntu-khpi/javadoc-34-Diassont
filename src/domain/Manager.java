package domain;

/**
 * Клас Manager представляє співробітника, який є менеджером.
 * Він успадковує властивості та методи від класу Employee і додає власні властивості та методи для роботи з підлеглими співробітниками.
 *
 * @author Ярослав Пічугін
 */
public class Manager extends Employee {

    /**
     * Створює нового менеджера з заданими підлеглими співробітниками, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees масив підлеглих співробітників
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ, в якому працює менеджер
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Створює нового менеджера з заданими підлеглими співробітниками.
     * Ім'я, посада, рівень та відділ будуть встановлені за замовчуванням.
     *
     * @param employees масив підлеглих співробітників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Створює нового менеджера без підлеглих співробітників.
     * Ім'я, посада, рівень та відділ будуть встановлені за замовчуванням.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає рядок, що представляє менеджера, включаючи його підлеглих співробітників.
     *
     * @return рядок, що представляє менеджера
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    private Employee[] employees;

    /**
     * Повертає рядок, що містить імена всіх підлеглих співробітників, розділені комами.
     *
     * @return рядок з іменами підлеглих співробітників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            if (e != null) {
                s = s + e.getName() + ", ";
            }
        }
        if (s.length() > 2) {
            s = s.substring(0, s.length() - 2);
        }
        return s;
    }

    /**
     * Встановлює новий масив підлеглих співробітників для менеджера.
     *
     * @param employees новий масив підлеглих співробітників
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих співробітників менеджера.
     *
     * @return масив підлеглих співробітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
