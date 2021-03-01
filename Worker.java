package java_core_block.homeWork1.task_2;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i == 33) {
                errorCallback.onError("Error! Task " + i + " not complete");
            }
            else {
                callback.onDone("Task " + i + " complete");
            }
        }
    }
}
