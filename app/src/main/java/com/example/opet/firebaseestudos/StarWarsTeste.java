package com.example.opet.firebaseestudos;

import com.google.gson.annotations.SerializedName;

/**
 * Created by opet on 25/03/2019.
 */

public class StarWarsTeste {
    @SerializedName("id")
    private long episode_id;
    private String title;
    private String director;

    public StarWarsTeste() {
    }

    public StarWarsTeste(long episode_id, String title, String director) {
        this.episode_id = episode_id;
        this.title = title;
        this.director = director;
    }

    public long getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(long episode_id) {
        this.episode_id = episode_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "StarWarsTeste{" +
                "episode_id=" + episode_id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
