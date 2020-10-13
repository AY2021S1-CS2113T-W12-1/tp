package seedu.messages;

import static seedu.font.Colors.ANSI_CYAN;
import static seedu.font.Colors.ANSI_RESET;
import static seedu.font.Colors.ANSI_YELLOW;


public class Messages {
    public static final String LS = System.lineSeparator();

    public static final String INVALID_PRIORITY = "Invalid priority!" + LS;
    public static final String INVALID_COMMAND = "Invalid command!" + LS;
    public static final String UNKNOWN_COMMAND = "Unknown command!" + LS;
    public static final String INVALID_TASK_NUMBER = "Invalid task number!" + LS;

    public static final String WELCOME_MESSAGE = ANSI_YELLOW + "Welcome to" + LS + ANSI_CYAN
            + "    ____  __      _   ____  _______" + LS
            + "   / __ \\/ /___ _/ | / / / / / ___/" + LS
            + "  / /_/ / / __ `/  |/ / / / /\\__ \\ " + LS
            + " / ____/ / /_/ / /|  / /_/ /___/ / " + LS
            + "/_/   /_/\\__,_/_/ |_/\\____//____/  "
            + "v1.0" + ANSI_RESET + LS;
    public static final String HELP_MESSAGE = "List of available commands:" + LS
            + "- help: show list of available commands" + LS
            + "- add: add a task" + LS
            + "- list: show list of tasks" + LS
            + "- bye: exit the program" + LS;
    public static final String BYE_MESSAGE = "Bye! See you again!";
    public static final String LIST_MESSAGE = "Here is your list of tasks:";
    public static final String ADD_MESSAGE = "Task added.";
    public static final String EDIT_MESSAGE = "Task edited.";
    public static final String CLEAR_MESSAGE = "All tasks cleared." + LS;
    public static final String DELETE_MESSAGE = "Task deleted." + LS;
    public static final String SEARCH_NOT_FOUND_MESSAGE = "No matched item found." + LS;
    public static final String SEARCH_FOUND_MESSAGE = "Here is your list of tasks"
            + " which contain the word/letters:";
}
