/**
 * Class {@link Main}. Initial class that responsible for transfer initial data to class {@link Solution}.
 *
 * @author DmitrySheyko
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countSubarrays(new int[]{1, 3, 5, 2, 7, 5}, 1, 5));
    }

}