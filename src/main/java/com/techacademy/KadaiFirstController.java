package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{day}")
    public String dispDayOfWeek(@PathVariable String day) {
        String result = null;
        Calendar cal = Calendar.getInstance();
        int year = Integer.parseInt(day.substring(0, 4));
        int month = Integer.parseInt(day.substring(4, 6)) -1;
        int date = Integer.parseInt(day.substring(6, 8));

        cal.set(year, month, date);
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY:
            result = "Sunday";
            break;
        case Calendar.MONDAY:
            result = "Monday";
            break;
        case Calendar.TUESDAY:
            result = "Tuesday";
            break;
        case Calendar.WEDNESDAY:
            result = "Wednesday";
            break;
        case Calendar.THURSDAY:
            result = "Thursday";
            break;
        case Calendar.FRIDAY:
            result = "Friday";
            break;
        case Calendar.SATURDAY:
            result = "Saturday";
            break;
        default:
            throw new IllegalStateException();
        }

        return result;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String Divide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "" + res;
    }
}
