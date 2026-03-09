package utils;

public class IdGenerator {
    private static int taskId = 1;
    private static int categoryId = 1;

    public static int generateTaskId() {
        return taskId++;
    }

    public static int generateCategoryId() {
        return categoryId++;
    }
}
