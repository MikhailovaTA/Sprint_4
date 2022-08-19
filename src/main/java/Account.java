public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        char someChar = ' ';
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == someChar) {
                count++;
            }
            if (count > 1){
                return false;
            }
        }

        return (name.length() >= 3 && name.length() <= 19) && (count > 0) && !(name.startsWith(" ") || name.endsWith(" "));

    }
}
