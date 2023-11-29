public class Main {

    /*
     ***********************************************
     * This is the driver code. Don't change it!!!
     * *********************************************
     */
    public static void main(String[] args){
        for (String cmd : args) {
            handle(cmd);
        }
    }

    /*
     * Edit this to start handling the commands.
     */
    private static void handle(String cmdLine) {
        System.out.println(cmdLine);

        String[] cmd = cmdLine.trim().split(" ");
        String cmdName = cmd[0];

        ContactManager manager = new ContactManager();
        switch (cmdName) {
            case "ADD":
                manager.addContact(new Contact(cmd[1], cmd[2]));
                break;
            default:
                break;
        }
    }
}