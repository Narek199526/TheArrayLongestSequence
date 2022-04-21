public class ArrayTheLongistSequense {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 28, 93, 94, 95, 96, 97, 98, 99, 100, 110, 120, 130, 1463, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -216, 0, 58, 59};
        int firstAscendingSequence = 0;
        int secondAscendingSequence = 0;
        int countUntilFirstSequence = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            firstAscendingSequence = i + 1 - countUntilFirstSequence;
            if (array[i] > array[i + 1]) {
                countUntilFirstSequence = i + 1;
            }
            if (firstAscendingSequence > secondAscendingSequence) {
                secondAscendingSequence = firstAscendingSequence;
                firstIndex = i + 1 - secondAscendingSequence;
                lastIndex = i;
            }
        }
        if (secondAscendingSequence == array.length - 1 - countUntilFirstSequence) {
            secondAscendingSequence = secondAscendingSequence + 1;
            firstIndex = array.length - 1 - secondAscendingSequence;
            lastIndex = array.length - 1;
        }
        System.out.println("The sequence length = " + secondAscendingSequence);
        System.out.println("The sequence first index  = " + firstIndex);
        System.out.println("The sequence last index = " + lastIndex);
    }
}
