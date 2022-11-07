import java.util.Calendar;

/**
 * problem_19
 */
public class Counting_Sundays {

    public static void main(String[] args) {
       
        Calendar startDate = Calendar.getInstance();
        startDate.set(1901, 1, 1);

        Calendar endDate = Calendar.getInstance();
        endDate.set(2000, 12, 31); // 2000, 12, 31

        int count = 0;
       // List<Integer> myDates = new ArrayList<Integer>();

        while (startDate.before(endDate)) {
            
            if ((startDate.get(Calendar.DAY_OF_WEEK) == 1) 
             && (startDate.get(Calendar.DAY_OF_MONTH) == 1)) {

                // System.out.println("Day: " + startDate.get(Calendar.DAY_OF_WEEK) + " of week: " + startDate.get(Calendar.WEEK_OF_YEAR));
                // System.out.println("Day: " + startDate.get(Calendar.DAY_OF_MONTH) + " of month: " + startDate.get(Calendar.MONTH));
                // System.out.println("Year: " + startDate.get(Calendar.YEAR));
                count++;
                startDate.add(Calendar.DATE, 1);
            } else {
                startDate.add(Calendar.DATE, 1);
            }
        }

        System.out.println(count);
    }
}