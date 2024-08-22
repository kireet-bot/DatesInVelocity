package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateTool {
    // Method to change date format
    // Method to change date format
    public String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    // Method to add days to the current date
    public Date addDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar.getTime();
    }

    // Method to convert date to a specific time zone
    public String convertTimeZone(Date date, String timeZoneId, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setTimeZone(TimeZone.getTimeZone(timeZoneId));
        return sdf.format(date);
    }

    // Method to get the start of the day (00:00:00)
    public Date getStartOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    // Method to get the end of the day (23:59:59)
    public Date getEndOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    // Method to calculate the difference between two dates in days
    public long getDaysDifference(Date startDate, Date endDate) {
        long diffInMillies = endDate.getTime() - startDate.getTime();
        return diffInMillies / (1000 * 60 * 60 * 24);
    }

    // Method to check if one date is before another
    public boolean isBefore(Date date1, Date date2) {
        return date1.before(date2);
    }

    // Method to check if one date is after another
    public boolean isAfter(Date date1, Date date2) {
        return date1.after(date2);
    }

    // Method to parse a date from a string
    public Date parseDate(String dateStr, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateStr);
    }
}
