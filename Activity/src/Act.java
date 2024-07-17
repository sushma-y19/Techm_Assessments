import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public class SeasonalActivityOrganizer {

    private EnumMap<Season, EnumSet<Activity>> activitiesBySeason;

    public SeasonalActivityOrganizer() {
        activitiesBySeason = new EnumMap<>(Season.class);
        for (Season season : Season.values()) {
            activitiesBySeason.put(season, EnumSet.noneOf(Activity.class));
        }
    }

    public void addActivityForSeason(Activity activity, Season season) {
        if (activitiesBySeason.containsKey(season)) {
            activitiesBySeason.get(season).add(activity);
        } else {
            System.out.println("Unknown season: " + season);
        }
    }

    public void removeActivityFromAllSeasons(Activity activity) {
        for (EnumSet<Activity> activities : activitiesBySeason.values()) {
            activities.remove(activity);
        }
    }

    public Set<Activity> getActivitiesForSeason(Season season) {
        if (activitiesBySeason.containsKey(season)) {
            return activitiesBySeason.get(season);
        } else {
            System.out.println("Unknown season: " + season);
            return EnumSet.noneOf(Activity.class);
        }
    }

    public Set<Activity> getAllActivities() {
        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
        for (EnumSet<Activity> activities : activitiesBySeason.values()) {
            allActivities.addAll(activities);
        }
        return allActivities;
    }

    public static void main(String[] args) {
        SeasonalActivityOrganizer organizer = new SeasonalActivityOrganizer();

        // Add activities for different seasons
        organizer.addActivityForSeason(Activity.HIKING, Season.SPRING);
        organizer.addActivityForSeason(Activity.SWIMMING, Season.SUMMER);
        organizer.addActivityForSeason(Activity.SKIING, Season.WINTER);

        // Print all activities
        System.out.println(organizer.getAllActivities());

        // Print activities for specific seasons
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
        System.out.println(organizer.getActivitiesForSeason(Season.SUMMER));
        System.out.println(organizer.getActivitiesForSeason(Season.WINTER));

        // Remove an activity and print activities for spring again
        organizer.removeActivityFromAllSeasons(Activity.HIKING);
        System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
    }
}
