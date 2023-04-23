package Curs12Homework.java;

import java.util.*;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class DaySchedule {
    private Day day;
    private List<String> activities;

    public DaySchedule(Day day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public Day getDay() {
        return day;
    }

    public void addActivity(String activity) {
        if (activity == null) {
            throw new NoActivityException();
        }
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        if (!activities.remove(activity)) {
            throw new NoActivityException();
        }
    }

    public List<String> getActivities() {
        return activities;
    }
}

class DailyPlanner {
    private List<DaySchedule> schedules;

    public DailyPlanner() {
        schedules = new ArrayList<>();
        for (Day day : Day.values()) {
            schedules.add(new DaySchedule(day));
        }
    }

    public void addActivity(Day day, String activity) {
        schedules.stream()
                .filter(schedule -> schedule.getDay() == day)
                .findFirst()
                .orElseThrow(NoActivitiesForDayException::new)
                .addActivity(activity);
    }

    public void removeActivity(Day day, String activity) {
        schedules.stream()
                .filter(schedule -> schedule.getDay() == day)
                .findFirst()
                .orElseThrow(NoActivitiesForDayException::new)
                .removeActivity(activity);
    }

    public List<String> getActivities(Day day) {
        return schedules.stream()
                .filter(schedule -> schedule.getDay() == day)
                .findFirst()
                .orElseThrow(NoActivitiesForDayException::new)
                .getActivities();
    }

    public Map<Day, List<String>> endPlanning() {
        Map<Day, List<String>> result = new HashMap<>();
        for (DaySchedule schedule : schedules) {
            List<String> activities = schedule.getActivities();
            if (activities.isEmpty()) {
                throw new NoActivitiesForDayException();
            }
            result.put(schedule.getDay(), activities);
        }
        return result;
    }
}