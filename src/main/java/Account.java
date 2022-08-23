public class Account {

    public final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null){
            return false;
        }
        int spaceIndex = name.indexOf(' ');

        boolean isLengthValid = name.length() <= 19 && name.length() >= 3;
        boolean isSpaceOne = spaceIndex == name.lastIndexOf(' ');
        boolean isEndSpacesNotExist = spaceIndex > 0 && spaceIndex + 1 != name.length();
        return isLengthValid && isSpaceOne && isEndSpacesNotExist;
    }
}
