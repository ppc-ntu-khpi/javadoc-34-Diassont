package domain;

/**
 * Клас Editor представляє співробітника, який є редактором.
 * Він успадковує властивості та методи від класу Artist і додає власні властивості та методи для роботи з електронним редагуванням.
 *
 * @author Ярослав Пічугін
 */
public class Editor extends Artist {

    /**
     * Створює нового редактора з заданими навичками, ім'ям, посадою, рівнем, відділом та вподобаннями щодо редагування.
     *
     * @param electronicEditing чи редактор віддає перевагу електронному редагуванню
     * @param skiils масив навичок редактора
     * @param name ім'я редактора
     * @param jobTitle посада редактора
     * @param level рівень редактора
     * @param dept відділ, в якому працює редактор
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора з заданими навичками та вподобаннями щодо редагування.
     * Ім'я, посада, рівень та відділ будуть встановлені за замовчуванням.
     *
     * @param electronicEditing чи редактор віддає перевагу електронному редагуванню
     * @param skiils масив навичок редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора з заданими вподобаннями щодо редагування.
     * Ім'я, посада, рівень, відділ та навички будуть встановлені за замовчуванням.
     *
     * @param electronicEditing чи редактор віддає перевагу електронному редагуванню
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора з вподобаннями щодо електронного редагування за замовчуванням (true).
     * Ім'я, посада, рівень, відділ та навички будуть встановлені за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядок, що представляє редактора, включаючи його вподобання щодо редагування.
     *
     * @return рядок, що представляє редактора
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає вподобання редактора щодо редагування.
     *
     * @return true, якщо редактор віддає перевагу електронному редагуванню, інакше false
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює нові вподобання редактора щодо редагування.
     *
     * @param electronic чи редактор віддає перевагу електронному редагуванню
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
