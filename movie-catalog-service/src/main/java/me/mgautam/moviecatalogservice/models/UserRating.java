package me.mgautam.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    private List<Rating> UserRating;

    public UserRating(List<Rating> userRating) {
        UserRating = userRating;
    }

    public UserRating() {
    }

    public List<Rating> getUserRating() {
        return UserRating;
    }

    public void setUserRating(List<Rating> userRating) {
        UserRating = userRating;
    }
    
}