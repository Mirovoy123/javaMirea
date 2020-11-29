package part20;

public class ex2 {
    private class CustomArray<T> {
        private T[] array;

        public CustomArray(T[] array) {
            this.array = array;
        }

        public T get(int index) {
            return array[index];
        }

        public void set(int index, T value) {
            array[index] = value;
        }
    }
}