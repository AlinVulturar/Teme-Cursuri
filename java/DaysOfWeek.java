package curs11Teme.java;

import java.util.List;
    public enum DaysOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
        private DaysOfWeek day;
        private List<String> activities;

        public DaySchedule(DaysOfWeek day, List<String> activities) {
            this.day = day;
            this.activities = activities;
        }

        public DaysOfWeek getDay() {
            return day;
        }

        public List<String> getActivities() {
            return activities;
        }

        public void setActivities(List<String> activities) {
            this.activities = activities;
        }
    }
}
